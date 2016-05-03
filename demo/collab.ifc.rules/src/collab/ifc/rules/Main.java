package collab.ifc.rules;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.incquery.patternlanguage.emf.EMFPatternLanguageStandaloneSetup;
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

	public static final String EIQ_PATH = "/home/vialpando/Eclipse/MondoOnline/workspace/collab.ifc.rules/src/collab/ifc/rules/rules.eiq";
	public static final String MPBL_PATH = "/home/vialpando/Eclipse/MondoOnline/workspace/collab.ifc.rules/src/collab/ifc/rules/lock.mpbl";
	public static final String MACL_PATH = "/home/vialpando/Eclipse/MondoOnline/workspace/collab.ifc.rules/src/collab/ifc/rules/rules.macl";
	public static final String FILE_PATH = "/home/vialpando/Desktop/Arboleda_Bldg-Elect.ifc";
	public static final String FILE_PATH_FRONT = "/home/vialpando/Desktop/Arboleda_Bldg-Elect-front.ifc";
	
	public static void main(String[] args) throws Exception {
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ifc", new IFCResourceFactory());
		
		MACLRuleStandaloneSetup.doSetup();
		MondoPropertyBasedLockingStandaloneSetup.doSetup();
		AccessControlLanguageStandaloneSetup.doSetup();
		EMFPatternLanguageStandaloneSetup.doSetup();
		
		ResourceSet goldResourceSet = new ResourceSetImpl();
		URI goldConfinementUri = URI.createFileURI(FILE_PATH);
		IFCResource goldResource = (IFCResource) goldResourceSet.getResource(goldConfinementUri, true);
				
		ResourceSet frontResourceSet = new ResourceSetImpl();
		URI frontConfinementUri = URI.createFileURI(FILE_PATH_FRONT);
		IFCResource frontResource = (IFCResource) frontResourceSet.getResource(frontConfinementUri, true);
		
		ResourceSet policyResourceSet = new ResourceSetImpl();
		URI eiqConfinementUri = URI.createURI(EIQ_PATH);
		Resource eiq = policyResourceSet.getResource(eiqConfinementUri, true);
		URI maclConfinementUri = URI.createURI(MACL_PATH);
		Resource macl = policyResourceSet.getResource(maclConfinementUri, true);
		URI mpblConfinementUri = URI.createURI(MPBL_PATH);
		Resource mpbl = policyResourceSet.getResource(mpblConfinementUri, true);
		
		AccessControlModel accessControlModel = (AccessControlModel)macl.getContents().get(0);
		User user = SecurityArbiter.getUserByName(accessControlModel, "alice");
		
		OfflineCollaborationSession session = new OfflineCollaborationSession(
				goldConfinementUri, goldResourceSet, 
				frontConfinementUri, frontResourceSet,
				new IFCUniqueIdSchemeFactory(),
				accessControlModel.getPolicy(),
				user,
				(PropertyBasedLockingModel)mpbl.getContents().get(0),
				new StringObfuscator("seed", "salt")
				);

		session.doGetAndSave();
	}
}
