package org.mondo.ifc.cstudy.metamodel;

import java.util.Map;
import java.util.Set;
import java.util.UUID;

import javax.activation.UnsupportedDataTypeException;

import org.bimserver.emf.IdEObject;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.mondo.collaboration.security.lens.correspondence.ComposableIDFunction;
import org.mondo.collaboration.security.lens.correspondence.DefaultEMFUniqueIDFunctions;
import org.mondo.collaboration.security.lens.correspondence.EObjectCorrespondence.UniqueIDScheme;
import org.mondo.collaboration.security.lens.correspondence.EObjectCorrespondence.UniqueIDSchemeFactory;

import com.google.common.collect.Maps;


public class IFCUniqueIdSchemeFactory implements UniqueIDSchemeFactory {
	
	@Override
	public UniqueIDScheme apply(URI input) {
		System.out.println(getClass().getSimpleName() + " on " + input);
		return ComposableIDFunction.dispatchTo(IFCUniqueID.INSTANCE, DefaultEMFUniqueIDFunctions.forBaseURI(input));
	}

	public static class IFCUniqueID extends ComposableIDFunction {
		
		private static IFCUniqueID INSTANCE = new IFCUniqueID();
		
		@Override
		public Object tryApply(EObject input) {
			if(input instanceof IdEObject) {
				IdEObject idEObject = (IdEObject) input;
				if(idEObject.getExpressId() == -1) {
					try {
						Entry entry = findUsage(idEObject);
						if (entry == null)
							return idEObject;
						String expressID = String.format(
								"(\"%s\":%s <-%s- %s)", 
								findValue(idEObject),
								idEObject.eClass().getName(),
								entry.feature.getName(),
								apply(entry.idEObject));
						return expressID;
					} catch (UnsupportedDataTypeException e) {
						e.printStackTrace();
					}
					
				}
				return idEObject.getExpressId();				
			}
			return null;
		}
		
		private String findValue(IdEObject idEObject) {
			EStructuralFeature feature = idEObject.eClass().getEStructuralFeature("wrappedValue");
			return idEObject.eGet(feature).toString();
		}

		Map<IdEObject, Entry> cacheParentMapping;
		private Entry findUsage(IdEObject obj) throws UnsupportedDataTypeException {
			if(cacheParentMapping == null) {
				buildParentMapping(obj.eResource().getResourceSet());
			}
			return cacheParentMapping.get(obj);
		}

		private void buildParentMapping(ResourceSet eResourceSet) {
			cacheParentMapping = Maps.newHashMap();
			TreeIterator<Notifier> iterator = eResourceSet.getAllContents();
			while(iterator.hasNext()) {
				Notifier next = iterator.next();
				if (next instanceof IdEObject) {
					IdEObject current = (IdEObject) next;
//					if(current.getExpressId() != -1) {
					EList<EReference> features = current.eClass().getEAllReferences();
					for (EReference feature : features) {
						if(feature.isMany()) {
							EList<?> eList = (EList<?>) current.eGet(feature);
							for (Object object : eList) {
								IdEObject value = (IdEObject) object;
								putParentMap(current, feature, value);
							}
						} else {
							putParentMap(current, feature, (IdEObject) current.eGet(feature));
						}
					}
//					}
				}
			}
		}

		private void putParentMap(IdEObject parent, EReference feature, IdEObject value) {
			if(value == null) {
				return;
			}
			if(value.getExpressId() == -1) {
				Entry entry = new Entry();
				entry.feature = feature;
				entry.idEObject = parent;
				
				cacheParentMapping.put(value, entry);
			}
		}

		public Object generateUniqueId(EObject input, Set<Object> reserved) {
			return UUID.randomUUID();
		}

		public void setUniqueId(EObject target, Object value) {
        	if(value == null || target == null || !(value instanceof String))  {
        		throw new IllegalArgumentException();
        	}
        	else
        		throw new IllegalArgumentException();
        }
    }
	
	public static class Entry {
		IdEObject idEObject;
		EStructuralFeature feature;
	}
}
