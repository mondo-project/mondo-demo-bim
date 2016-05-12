package collab.ifc.rules;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.incquery.patternlanguage.emf.EMFPatternLanguageStandaloneSetup;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra.modelobfuscator.util.StringObfuscator;
import org.mondo.collaboration.security.lens.arbiter.SecurityArbiter;
import org.mondo.collaboration.security.lens.bx.offline.OfflineCollaborationSession;
import org.mondo.collaboration.security.macl.xtext.AccessControlLanguageStandaloneSetup;
import org.mondo.collaboration.security.macl.xtext.mondoAccessControlLanguage.AccessControlModel;
import org.mondo.collaboration.security.macl.xtext.rule.MACLRuleStandaloneSetup;
import org.mondo.collaboration.security.macl.xtext.rule.mACLRule.User;
import org.mondo.collaboration.security.mpbl.xtext.MondoPropertyBasedLockingStandaloneSetup;
import org.mondo.collaboration.security.mpbl.xtext.mondoPropertyBasedLocking.PropertyBasedLockingModel;
import org.mondo.ifc.cstudy.metamodel.IFCResource;
import org.mondo.ifc.cstudy.metamodel.IFCResourceFactory;
import org.mondo.ifc.cstudy.metamodel.IFCUniqueIdSchemeFactory;

public class Main {

	public static final String USER_NAME = "bob";
	public static final String ROOT_PATH = "/home/meres/git/mondo-demo-bim/demo/";
	
	public static final String EIQ_PATH = ROOT_PATH + "collab.ifc.rules/src/collab/ifc/rules/rules.eiq";
	public static final String MPBL_PATH = ROOT_PATH + "collab.ifc.rules/src/collab/ifc/rules/lock.mpbl";
	public static final String MACL_PATH = ROOT_PATH + "collab.ifc.rules/src/collab/ifc/rules/rules.macl";
	public static final String MODEL_STEM = ROOT_PATH + "collab.ifc.rules/model/Bien-Zenker_Jasmin-Sun-AC14-V2";
	
	public static final String MODEL_EXT = "ifc";
	public static final String FILE_PATH_GOLD = MODEL_STEM + "." + MODEL_EXT;
	public static final String FILE_PATH_FRONT = MODEL_STEM + "-" + USER_NAME + "." + MODEL_EXT;
	
	public static void main(String[] args) throws Exception {
		doTest();
	}

	public static void doTest() throws IncQueryException, IOException {
		long startTime = System.currentTimeMillis();
		long lastTime = startTime;
		long currentTime;
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(MODEL_EXT, new IFCResourceFactory());
		
		MACLRuleStandaloneSetup.doSetup();
		MondoPropertyBasedLockingStandaloneSetup.doSetup();
		AccessControlLanguageStandaloneSetup.doSetup();
		EMFPatternLanguageStandaloneSetup.doSetup();
		
		currentTime = System.currentTimeMillis();
		System.out.println("Static setup: " + (currentTime - lastTime) + " ms");
		lastTime = currentTime;
		
		//Ifc2x3tc1Factory.eINSTANCE.getEPackage();
		//EPackage.Registry.INSTANCE.put(org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package.eINSTANCE.getNsURI(), org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package.eINSTANCE);
		
		ResourceSet goldResourceSet = new ResourceSetImpl();
		URI goldConfinementUri = URI.createFileURI(FILE_PATH_GOLD);
		IFCResource goldResource = (IFCResource) goldResourceSet.getResource(goldConfinementUri, true);
				
		ResourceSet frontResourceSet = new ResourceSetImpl();
		URI frontConfinementUri = URI.createFileURI(FILE_PATH_FRONT);
		IFCResource frontResource = (IFCResource) frontResourceSet.getResource(frontConfinementUri, true);
		
		currentTime = System.currentTimeMillis();
		System.out.println("Opened instance models: " + (currentTime - lastTime) + " ms");
		lastTime = currentTime;
		
		ResourceSet policyResourceSet = new ResourceSetImpl();
		URI eiqConfinementUri = URI.createURI(EIQ_PATH);
		Resource eiq = policyResourceSet.getResource(eiqConfinementUri, true);
		URI maclConfinementUri = URI.createURI(MACL_PATH);
		Resource macl = policyResourceSet.getResource(maclConfinementUri, true);
		URI mpblConfinementUri = URI.createURI(MPBL_PATH);
		Resource mpbl = policyResourceSet.getResource(mpblConfinementUri, true);
		
		AccessControlModel accessControlModel = (AccessControlModel)macl.getContents().get(0);
		User user = SecurityArbiter.getUserByName(accessControlModel, USER_NAME);
		
		currentTime = System.currentTimeMillis();
		System.out.println("Policy setup: " + (currentTime - lastTime) + " ms");
		lastTime = currentTime;
		
		
		OfflineCollaborationSession session = new OfflineCollaborationSession(
				goldConfinementUri, goldResourceSet, 
				frontConfinementUri, frontResourceSet,
				new IFCUniqueIdSchemeFactory(),
				accessControlModel.getPolicy(),
				user,
				(PropertyBasedLockingModel)mpbl.getContents().get(0),
				new StringObfuscator("seed", "salt")
				);

		currentTime = System.currentTimeMillis();
		System.out.println("Session init: " + (currentTime - lastTime) + " ms");
		lastTime = currentTime;
		
		session.doPutbackAndSave(); //doGetAndSave();
		
		currentTime = System.currentTimeMillis();
		System.out.println("Transformation: " + (currentTime - lastTime) + " ms");
		lastTime = currentTime;
		
		System.out.println("Finished in " + (System.currentTimeMillis() - startTime) + " ms");
	}
}
