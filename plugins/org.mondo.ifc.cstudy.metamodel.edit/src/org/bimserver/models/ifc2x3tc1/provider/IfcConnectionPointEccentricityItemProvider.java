/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcConnectionPointEccentricity;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcConnectionPointEccentricity} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcConnectionPointEccentricityItemProvider extends IfcConnectionPointGeometryItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcConnectionPointEccentricityItemProvider(AdapterFactory adapterFactory) {
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

			addEccentricityInXPropertyDescriptor(object);
			addEccentricityInXAsStringPropertyDescriptor(object);
			addEccentricityInYPropertyDescriptor(object);
			addEccentricityInYAsStringPropertyDescriptor(object);
			addEccentricityInZPropertyDescriptor(object);
			addEccentricityInZAsStringPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Eccentricity In X feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEccentricityInXPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcConnectionPointEccentricity_EccentricityInX_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcConnectionPointEccentricity_EccentricityInX_feature", "_UI_IfcConnectionPointEccentricity_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcConnectionPointEccentricity_EccentricityInX(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Eccentricity In XAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEccentricityInXAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcConnectionPointEccentricity_EccentricityInXAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcConnectionPointEccentricity_EccentricityInXAsString_feature", "_UI_IfcConnectionPointEccentricity_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcConnectionPointEccentricity_EccentricityInXAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Eccentricity In Y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEccentricityInYPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcConnectionPointEccentricity_EccentricityInY_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcConnectionPointEccentricity_EccentricityInY_feature", "_UI_IfcConnectionPointEccentricity_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcConnectionPointEccentricity_EccentricityInY(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Eccentricity In YAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEccentricityInYAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcConnectionPointEccentricity_EccentricityInYAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcConnectionPointEccentricity_EccentricityInYAsString_feature", "_UI_IfcConnectionPointEccentricity_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcConnectionPointEccentricity_EccentricityInYAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Eccentricity In Z feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEccentricityInZPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcConnectionPointEccentricity_EccentricityInZ_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcConnectionPointEccentricity_EccentricityInZ_feature", "_UI_IfcConnectionPointEccentricity_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcConnectionPointEccentricity_EccentricityInZ(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Eccentricity In ZAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEccentricityInZAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcConnectionPointEccentricity_EccentricityInZAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcConnectionPointEccentricity_EccentricityInZAsString_feature", "_UI_IfcConnectionPointEccentricity_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcConnectionPointEccentricity_EccentricityInZAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcConnectionPointEccentricity.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcConnectionPointEccentricity"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		IfcConnectionPointEccentricity ifcConnectionPointEccentricity = (IfcConnectionPointEccentricity)object;
		return getString("_UI_IfcConnectionPointEccentricity_type") + " " + ifcConnectionPointEccentricity.getEccentricityInX();
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

		switch (notification.getFeatureID(IfcConnectionPointEccentricity.class)) {
			case Ifc2x3tc1Package.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_X:
			case Ifc2x3tc1Package.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_XAS_STRING:
			case Ifc2x3tc1Package.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_Y:
			case Ifc2x3tc1Package.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_YAS_STRING:
			case Ifc2x3tc1Package.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_Z:
			case Ifc2x3tc1Package.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_ZAS_STRING:
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
