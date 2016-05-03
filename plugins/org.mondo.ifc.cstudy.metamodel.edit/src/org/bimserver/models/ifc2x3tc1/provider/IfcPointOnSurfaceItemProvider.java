/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcPointOnSurface;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcPointOnSurface} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcPointOnSurfaceItemProvider extends IfcPointItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPointOnSurfaceItemProvider(AdapterFactory adapterFactory) {
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

			addBasisSurfacePropertyDescriptor(object);
			addPointParameterUPropertyDescriptor(object);
			addPointParameterUAsStringPropertyDescriptor(object);
			addPointParameterVPropertyDescriptor(object);
			addPointParameterVAsStringPropertyDescriptor(object);
			addDimPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Basis Surface feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBasisSurfacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcPointOnSurface_BasisSurface_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcPointOnSurface_BasisSurface_feature", "_UI_IfcPointOnSurface_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcPointOnSurface_BasisSurface(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Point Parameter U feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPointParameterUPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcPointOnSurface_PointParameterU_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcPointOnSurface_PointParameterU_feature", "_UI_IfcPointOnSurface_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcPointOnSurface_PointParameterU(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Point Parameter UAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPointParameterUAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcPointOnSurface_PointParameterUAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcPointOnSurface_PointParameterUAsString_feature", "_UI_IfcPointOnSurface_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcPointOnSurface_PointParameterUAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Point Parameter V feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPointParameterVPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcPointOnSurface_PointParameterV_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcPointOnSurface_PointParameterV_feature", "_UI_IfcPointOnSurface_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcPointOnSurface_PointParameterV(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Point Parameter VAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPointParameterVAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcPointOnSurface_PointParameterVAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcPointOnSurface_PointParameterVAsString_feature", "_UI_IfcPointOnSurface_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcPointOnSurface_PointParameterVAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dim feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDimPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcPointOnSurface_Dim_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcPointOnSurface_Dim_feature", "_UI_IfcPointOnSurface_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcPointOnSurface_Dim(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcPointOnSurface.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcPointOnSurface"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		IfcPointOnSurface ifcPointOnSurface = (IfcPointOnSurface)object;
		return getString("_UI_IfcPointOnSurface_type") + " " + ifcPointOnSurface.getPointParameterU();
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

		switch (notification.getFeatureID(IfcPointOnSurface.class)) {
			case Ifc2x3tc1Package.IFC_POINT_ON_SURFACE__POINT_PARAMETER_U:
			case Ifc2x3tc1Package.IFC_POINT_ON_SURFACE__POINT_PARAMETER_UAS_STRING:
			case Ifc2x3tc1Package.IFC_POINT_ON_SURFACE__POINT_PARAMETER_V:
			case Ifc2x3tc1Package.IFC_POINT_ON_SURFACE__POINT_PARAMETER_VAS_STRING:
			case Ifc2x3tc1Package.IFC_POINT_ON_SURFACE__DIM:
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
