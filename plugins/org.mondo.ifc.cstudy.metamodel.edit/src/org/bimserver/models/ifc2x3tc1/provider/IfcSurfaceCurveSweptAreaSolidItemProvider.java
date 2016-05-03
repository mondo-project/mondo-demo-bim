/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcSurfaceCurveSweptAreaSolid;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcSurfaceCurveSweptAreaSolid} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcSurfaceCurveSweptAreaSolidItemProvider extends IfcSweptAreaSolidItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSurfaceCurveSweptAreaSolidItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addDirectrixPropertyDescriptor(object);
			addStartParamPropertyDescriptor(object);
			addStartParamAsStringPropertyDescriptor(object);
			addEndParamPropertyDescriptor(object);
			addEndParamAsStringPropertyDescriptor(object);
			addReferenceSurfacePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Directrix feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDirectrixPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcSurfaceCurveSweptAreaSolid_Directrix_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcSurfaceCurveSweptAreaSolid_Directrix_feature", "_UI_IfcSurfaceCurveSweptAreaSolid_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcSurfaceCurveSweptAreaSolid_Directrix(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Start Param feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartParamPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcSurfaceCurveSweptAreaSolid_StartParam_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcSurfaceCurveSweptAreaSolid_StartParam_feature", "_UI_IfcSurfaceCurveSweptAreaSolid_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcSurfaceCurveSweptAreaSolid_StartParam(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Start Param As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartParamAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcSurfaceCurveSweptAreaSolid_StartParamAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcSurfaceCurveSweptAreaSolid_StartParamAsString_feature", "_UI_IfcSurfaceCurveSweptAreaSolid_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcSurfaceCurveSweptAreaSolid_StartParamAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the End Param feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEndParamPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcSurfaceCurveSweptAreaSolid_EndParam_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcSurfaceCurveSweptAreaSolid_EndParam_feature", "_UI_IfcSurfaceCurveSweptAreaSolid_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcSurfaceCurveSweptAreaSolid_EndParam(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the End Param As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEndParamAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcSurfaceCurveSweptAreaSolid_EndParamAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcSurfaceCurveSweptAreaSolid_EndParamAsString_feature", "_UI_IfcSurfaceCurveSweptAreaSolid_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcSurfaceCurveSweptAreaSolid_EndParamAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reference Surface feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReferenceSurfacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcSurfaceCurveSweptAreaSolid_ReferenceSurface_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcSurfaceCurveSweptAreaSolid_ReferenceSurface_feature", "_UI_IfcSurfaceCurveSweptAreaSolid_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcSurfaceCurveSweptAreaSolid_ReferenceSurface(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns IfcSurfaceCurveSweptAreaSolid.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcSurfaceCurveSweptAreaSolid"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		IfcSurfaceCurveSweptAreaSolid ifcSurfaceCurveSweptAreaSolid = (IfcSurfaceCurveSweptAreaSolid)object;
		return getString("_UI_IfcSurfaceCurveSweptAreaSolid_type") + " " + ifcSurfaceCurveSweptAreaSolid.getDim();
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(IfcSurfaceCurveSweptAreaSolid.class)) {
			case Ifc2x3tc1Package.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__START_PARAM:
			case Ifc2x3tc1Package.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__START_PARAM_AS_STRING:
			case Ifc2x3tc1Package.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__END_PARAM:
			case Ifc2x3tc1Package.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID__END_PARAM_AS_STRING:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
