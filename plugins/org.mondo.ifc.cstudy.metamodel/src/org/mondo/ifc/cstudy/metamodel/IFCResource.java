package org.mondo.ifc.cstudy.metamodel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.stream.EventFilter;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import org.bimserver.emf.IdEObject;
import org.bimserver.emf.IdEObjectImpl;
import org.bimserver.emf.IfcModelInterface;
import org.bimserver.emf.IfcModelInterfaceException;
import org.bimserver.emf.MetaDataManager;
import org.bimserver.emf.PackageMetaData;
import org.bimserver.emf.Schema;
import org.bimserver.ifc.step.deserializer.Ifc2x3tc1StepDeserializer;
import org.bimserver.ifc.step.deserializer.Ifc4StepDeserializer;
import org.bimserver.ifc.step.serializer.Ifc2x3tc1StepSerializer;
import org.bimserver.ifc.step.serializer.Ifc4StepSerializer;
import org.bimserver.ifc.xml.deserializer.Ifc2x3tc1XmlDeserializer;
import org.bimserver.ifc.xml.deserializer.Ifc4XmlDeserializer;
import org.bimserver.ifc.xml.serializer.IfcXml2x3tc1Serializer;
import org.bimserver.ifc.xml.serializer.IfcXml4Serializer;
import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc4.Ifc4Package;
import org.bimserver.plugins.Plugin;
import org.bimserver.plugins.PluginDescriptor;
import org.bimserver.plugins.PluginImplementation;
import org.bimserver.plugins.PluginManager;
import org.bimserver.plugins.PluginSourceType;
import org.bimserver.plugins.deserializers.DeserializeException;
import org.bimserver.plugins.deserializers.Deserializer;
import org.bimserver.plugins.serializers.ProgressReporter;
import org.bimserver.plugins.serializers.Serializer;
import org.bimserver.shared.interfaces.async.AsyncSettingsInterface.IsGenerateGeometryOnCheckinCallback;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;
import org.eclipse.incquery.runtime.matchers.tuple.Tuple;
import org.mondo.collaboration.security.lens.context.MondoLensScope;
import org.mondo.collaboration.security.lens.context.keys.CorrespondenceKey;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.BiMap;

public class IFCResource extends ResourceImpl {

	private IFCModelType ifcModelType;
	private IfcModelInterface ifcModelInterface;
	private PluginManager bimPluginManager;
	private MetaDataManager bimMetaDataManager;
	private PackageMetaData packageMetaData;
	private File f;
	
	private MondoLensScope scope;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(IFCResourceFactory.class);
	private IFCModelType referenceModelType;
	private IfcModelInterface referencedInterface;
	
	public IFCResource(URI uri) {
		this.uri = uri;
		f = instantiateFile();
	}

	@Override
	public void save(Map<?, ?> options) throws IOException {
		if(options.containsKey(MondoLensScope.class)) {
			scope = (MondoLensScope) options.get(MondoLensScope.class);
			isGold = (boolean) options.get("isGold");
			if(isGold) { // We are going to save a "gold model"
				IFCResource frontResource = (IFCResource) scope.getFrontIndexer().getRoot().getResources().get(0);
				referencedInterface = frontResource.getIfcModelInterface();
				referencePackageMetaData = frontResource.getIfcModelInterface().getPackageMetaData();
				referenceModelType = frontResource.getIfcModelType();
			} else {
				IFCResource goldResource = (IFCResource) scope.getGoldIndexer().getRoot().getResources().get(0);
				referencedInterface = goldResource.getIfcModelInterface();
				referencePackageMetaData = goldResource.getIfcModelInterface().getPackageMetaData();
				referenceModelType = goldResource.getIfcModelType();
			}
		}
		
		try {
			if(!f.exists()) {
				f.createNewFile();
			}			
			Serializer serializer = createSerializer();			
			serializer.writeToFile(f, new ProgressReporter() {
				
				@Override
				public void update(long progress, long max) {
					
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void load(Map<?, ?> options) throws IOException {
		if(f.exists()) {
			calculateFormat(f);
			doLoad(f);
		}
	}
	
	private File instantiateFile() {
		File f;
		try {
			if((!uri.isRelative() && uri.isPlatform())) {
				f = createPlatformFile();
			} else if(uri.isFile()) {
				f = createFileBasedFile();
			} else {
				f = createSimpleFile();
			}
		} catch (Throwable e) { // Here comes the magic :D Never do that at home!
			f = createSimpleFile();
		}
		return f;
	}

	public IfcModelInterface getIfcModelInterface() {
		return ifcModelInterface;
	}
	
	public IFCModelType getIfcModelType() {
		return ifcModelType;
	}
	
	public void setIfcModelType(IFCModelType ifcModelType) {
		this.ifcModelType = ifcModelType;
	}
	
	public void setIfcModelInterface(IfcModelInterface ifcModelInterface) {
		this.ifcModelInterface = ifcModelInterface;
	}
	
	
	
	@SuppressWarnings("unchecked")
	private void doLoad(File f) {
		try {
			Deserializer d = createDeserializer();
			ifcModelInterface = readModel(d, f);
			for (IdEObject idEObject : ifcModelInterface.getValues()) {
				EList<EReference> references = idEObject.eClass().getEAllReferences();
				for (EReference eReference : references) {
					if(eReference.isMany()) {
						for (EObject eobject : (EList<EObject>)idEObject.eGet(eReference)) {
							addToResource(eobject);
						}
					} else {
						addToResource((EObject)idEObject.eGet(eReference));
					}
				}
				addToResource(idEObject);
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void addToResource(EObject obj) {
		if(obj == null) {
			return;
		}
		if(obj.eResource() == null && !this.getContents().contains(obj)) {
			this.getContents().add(obj);
		}
	}
	
	private void calculateFormat(File f) {
		try {
			final ZipFile zf = new ZipFile(f);
			final List<ZipEntry> candidates = getIFCFilesInZIP(zf);
			this.ifcModelType = getIFCZipModelType(f, zf, candidates);
		} catch (Exception e) {
			// this isn't a zip, go on
			LOGGER.debug("File {} is not a zipfile or failed to be read", f);
			this.ifcModelType = getIFCStepOrXMLModelType(new FileInputStreamFactory(f));
		}
	}

	private File createPlatformFile() {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		String osString = root.getFile(new Path(uri.toPlatformString(true))).getLocation().toOSString();
		return new File(osString);
	}

	private File createFileBasedFile() {
		String osString = uri.toFileString();
		return new File(osString);
	}
	
	private File createSimpleFile() {
		 return new File(uri.toString());
	}

	private static final class FileInputStreamFactory implements InputStreamFactory {
		private File file;

		public FileInputStreamFactory(File f) {
			this.file = f;
		}

		@Override
		public InputStream createStream() throws FileNotFoundException {
			return new FileInputStream(file);
		}
	}

	private interface InputStreamFactory {
		InputStream createStream() throws Exception;
	}
	
	static enum IFCModelType {
		IFC2X2_STEP,
		IFC2X2_XML,
		IFC2X3_STEP,
		IFC2X3_XML,
		IFC4_STEP,
		IFC4_XML,
		UNKNOWN
	}

	private static final Set<String> EXTENSIONS = new HashSet<String>(Arrays.asList(
			".ifc", ".ifcxml", ".ifc.txt", ".ifcxml.txt", ".ifc.zip", ".ifczip"
	));
	private Map<EObject,Long> map;
	private PackageMetaData referencePackageMetaData;
	private boolean isGold;
	
	IFCModelType getIFCModelType(File f) {
		final IFCModelType zipModelType = getIFCZipModelType(f);
		if (zipModelType != null) {
			return zipModelType;
		}
		return getIFCStepOrXMLModelType(new FileInputStreamFactory(f));
	}
	
	/**
	 * Returns the IFC model type contained in the <code>f</code> zipfile. If it
	 * is a zipfile but it doesn't have any recognizable IFC files in it, it
	 * returns {@link IFCModelType#UNKNOWN}. If it has more than one, it logs a
	 * warning and uses the type of the first one anyway. If it is not a
	 * zipfile, it returns <code>null</code>.
	 */
	private IFCModelType getIFCZipModelType(File f) {
		try (final ZipFile zf = new ZipFile(f)) {
			final List<ZipEntry> candidates = getIFCFilesInZIP(zf);
			return getIFCZipModelType(f, zf, candidates);
		} catch (IOException e) {
			LOGGER.debug("Could not parse {} as a zip file", f);
		}
		return null;
	}

	protected IFCModelType getIFCZipModelType(File f, final ZipFile zf,
			final List<ZipEntry> candidates) {
		if (!candidates.isEmpty()) {
			if (candidates.size() > 1) {
				LOGGER.warn("The ifcZIP file {} has more than one .ifc* file: {}. Will use the first one.", f, candidates);
			}
			final ZipEntry ifcEntry = candidates.get(0);
			return getIFCStepOrXMLModelType(new InputStreamFactory() {
				@Override
				public InputStream createStream() throws Exception {
					return zf.getInputStream(ifcEntry);
				}
			});
		} else {
			// it'ifcModelInterface a zip file but it doesn't contain any .ifc files.
			LOGGER.warn("The ifcZIP file {} has no .ifc* files", f);
			return IFCModelType.UNKNOWN;
		}
	}

	private List<ZipEntry> getIFCFilesInZIP(final ZipFile zf) {
		final Enumeration<? extends ZipEntry> entries = zf.entries();
		final List<ZipEntry> candidates = new ArrayList<>();
		while (entries.hasMoreElements()) {
			final ZipEntry ze = entries.nextElement();
			final String lowerCaseName = ze.getName().toLowerCase();
			for (String ext : EXTENSIONS) {
				if (!ext.contains("zip") && lowerCaseName.endsWith(ext)) {
					candidates.add(ze);
				}
			}
		}
		return candidates;
	}

	private IFCModelType getIFCStepOrXMLModelType(InputStreamFactory isf) {
		try {
			IFCModelType type = getIFCStepModelType(isf.createStream());
			if (type == IFCModelType.UNKNOWN) {
				type = getIFCXMLModelType(isf.createStream());
			}
			return type;
		} catch (Exception e) {
			LOGGER.error("Could not read the file", e);
			return IFCModelType.UNKNOWN;
		}
	}

	private IFCModelType getIFCXMLModelType(InputStream is) {
		try (final Reader fReader = new BufferedReader(new InputStreamReader(is))) {
			final XMLInputFactory factory = XMLInputFactory.newInstance();
			final XMLEventReader rawXmlReader = factory.createXMLEventReader(fReader);
			final XMLEventReader xmlReader = factory.createFilteredReader(rawXmlReader, new EventFilter() {
				@Override
				public boolean accept(XMLEvent event) {
					if (event.isStartElement()) {
						final StartElement e = event.asStartElement();
						final String localPart = e.getName().getLocalPart();
						return "ifcXML".equals(localPart) || "iso_10303_28".equals(localPart) || "uos".equals(localPart);
					}
					return false;
				}
			});

			XMLEvent mainTagEvent = xmlReader.nextTag();
			if (mainTagEvent != null) {
				final String mainTagLocalPart = mainTagEvent.asStartElement().getName().getLocalPart();
				if ("iso_10303_28".equals(mainTagLocalPart)) {
					// This is an IFC2x3 XML document: look for the <uos> element now
					XMLEvent uosEvent = xmlReader.nextTag();
					if (uosEvent != null) {
						final String configurationValue = uosEvent.asStartElement().getAttributeByName(new QName(null, "configuration")).getValue();
						if (configurationValue.contains("ifc2x3")) {
							return IFCModelType.IFC2X3_XML;
						} else if (configurationValue.contains("ifc2x2")) {
							return IFCModelType.IFC2X2_XML;
						}
					}
				}
				else if ("ifcXML".equals(mainTagLocalPart)) {
					return IFCModelType.IFC4_XML;
				}
			}

		} catch (XMLStreamException | FactoryConfigurationError | IOException e) {
			LOGGER.error("Could not parse as XML", e);
		}

		return IFCModelType.UNKNOWN;
	}

	private IFCModelType getIFCStepModelType(InputStream is) throws IOException {
		// Try first with the STEP-based formats
		try (final BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {
			// Read the first line to check if this is in STEP format
			String line = reader.readLine().trim();
			if ("ISO-10303-21;".equals(line)) {
				// This is in STEP format: now look for a FILE_SCHEMA line
				line = reader.readLine();
				while (line != null && !line.contains("ENDSEC;")) {
					if (line.startsWith("FILE_SCHEMA")) {
						if (line.contains("IFC2X3")) {
							return IFCModelType.IFC2X3_STEP;
						}
						else if (line.contains("IFC2X2")) {
							return IFCModelType.IFC2X2_STEP;
						}
						else if (line.contains("IFC4")) {
							return IFCModelType.IFC4_STEP;
						}
						else {
							return IFCModelType.UNKNOWN;
						}
					}
					line = reader.readLine();
				}
			}
		}
		return IFCModelType.UNKNOWN;
	}
	
	private Deserializer createDeserializer() throws Exception {

		Deserializer d;
		String packageLowerCaseName;

		switch (ifcModelType) {
		case IFC2X3_STEP:
			d = new Ifc2x3tc1StepDeserializer(Schema.IFC2X3TC1);
			packageLowerCaseName = Ifc2x3tc1Package.eINSTANCE.getName().toLowerCase();
			break;
		case IFC2X3_XML:
			d = new Ifc2x3tc1XmlDeserializer();
			packageLowerCaseName = Ifc2x3tc1Package.eINSTANCE.getName().toLowerCase();
			break;
		case IFC4_STEP:
			d = new Ifc4StepDeserializer(Schema.IFC4);
			packageLowerCaseName = Ifc4Package.eINSTANCE.getName().toLowerCase();
			break;
		case IFC4_XML:
			d = new Ifc4XmlDeserializer();
			packageLowerCaseName = Ifc4Package.eINSTANCE.getName().toLowerCase();
			break;
		default:
			throw new IllegalArgumentException("Unsupported IFC model type " + ifcModelType);
		}

		createPluginManager();
		createMetaDataManager();
		createPackageMetaData(packageLowerCaseName);
		d.init(packageMetaData);
		return d;
	}

	private void createPackageMetaData( String packageLowerCaseName) {
		packageMetaData = bimMetaDataManager.getPackageMetaData(packageLowerCaseName);		
	}

	private void createMetaDataManager() {
		bimMetaDataManager = new MetaDataManager(bimPluginManager);
		bimMetaDataManager.init();
	}
	
	private Serializer createSerializer() throws Exception {

		Serializer s;
		String packageLowerCaseName;

		if(ifcModelType == null) {
			ifcModelType = referenceModelType;
		}
		
		switch (ifcModelType) {
		case IFC2X3_STEP:
			s = new Ifc2x3tc1StepSerializer(null);
			packageLowerCaseName = Ifc2x3tc1Package.eINSTANCE.getName().toLowerCase();
			break;
		case IFC2X3_XML:
			s = new IfcXml2x3tc1Serializer();
			packageLowerCaseName = Ifc2x3tc1Package.eINSTANCE.getName().toLowerCase();
			break;
		case IFC4_STEP:
			s = new Ifc4StepSerializer(null);
			packageLowerCaseName = Ifc4Package.eINSTANCE.getName().toLowerCase();
			break;
		case IFC4_XML:
			s = new IfcXml4Serializer();
			packageLowerCaseName = Ifc4Package.eINSTANCE.getName().toLowerCase();
			break;
		default:
			throw new IllegalArgumentException("Unsupported IFC model type " + ifcModelType);
		}
		LOGGER.debug(packageLowerCaseName);
		
		createPluginManager();
		createMetaDataManager();
		createPackageMetaData(packageLowerCaseName);
		updateModelInterface();
		s.init(ifcModelInterface, null, bimPluginManager, null, packageMetaData, true);
		return s;
	}

	private void updateModelInterface() throws IfcModelInterfaceException {
		if(scope == null) {
			return;
		}
		
		if(ifcModelInterface == null) {
			ifcModelInterface = referencedInterface;
			ifcModelInterface.clear();
		}
		for (EObject object : getContents()) {
			IdEObjectImpl idEObject = (IdEObjectImpl) object;
			
			Object referenceObject;
			if(isGold) {
				Set<Tuple> correspondenceTuple = scope.getCorrespondenceTables().get(CorrespondenceKey.EOBJECT).getTuplesForSeed(new FlatTuple(object, null));
				if (correspondenceTuple.isEmpty())
					referenceObject = object;
				else
					referenceObject = correspondenceTuple.iterator().next().get(1);
			} else {
				referenceObject = scope.getCorrespondenceTables().get(CorrespondenceKey.EOBJECT).getTuplesForSeed(new FlatTuple(null, object)).iterator().next().get(0);
			}
			
			idEObject.setExpressId(((IdEObject) referenceObject).getExpressId());
			
			if(idEObject.getExpressId() != -1)
				ifcModelInterface.add(idEObject.getExpressId(), idEObject);
		}
	}

	@SuppressWarnings("unchecked")
	private void createPluginManager() throws Exception {
		bimPluginManager = new PluginManager();
		final InputStream isBIMPluginXML = IFCResourceFactory.class.getResourceAsStream("/plugin/plugin.xml");
		
		final PluginDescriptor desc = readPluginDescriptor(isBIMPluginXML);
		for (PluginImplementation impl : desc.getImplementations()) {
			final Class<? extends Plugin> interfaceClass = (Class<? extends Plugin>) Class.forName(impl.getInterfaceClass());
			final Class<?> implClass = Class.forName(impl.getImplementationClass());
			final Plugin plugin = (Plugin) implClass.newInstance();
			bimPluginManager.loadPlugin(interfaceClass, "", "", plugin,
					this.getClass().getClassLoader(),
					PluginSourceType.INTERNAL, impl);
		}
	}
	
	private PluginDescriptor readPluginDescriptor(InputStream is) throws JAXBException {
		JAXBContext ctx = JAXBContext.newInstance(PluginDescriptor.class);
		Unmarshaller unm = ctx.createUnmarshaller();
		return (PluginDescriptor) unm.unmarshal(is);
	}
	
	protected IfcModelInterface readModel(Deserializer d, File f) throws DeserializeException {
		return d.read(f);
	}	
}
