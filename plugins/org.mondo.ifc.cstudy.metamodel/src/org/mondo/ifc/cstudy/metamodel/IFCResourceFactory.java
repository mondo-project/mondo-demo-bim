package org.mondo.ifc.cstudy.metamodel;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;


public class IFCResourceFactory implements Resource.Factory {

	@Override
	public Resource createResource(URI uri) {
		return new IFCResource(uri);
	}
}
