/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcStructuralLoadPlanarForce;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcStructuralLoadPlanarForce} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcStructuralLoadPlanarForceItemProvider extends IfcStructuralLoadStaticItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralLoadPlanarForceItemProvider(AdapterFactory adapterFactory) {
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

			addPlanarForceXPropertyDescriptor(object);
			addPlanarForceXAsStringPropertyDescriptor(object);
			addPlanarForceYPropertyDescriptor(object);
			addPlanarForceYAsStringPropertyDescriptor(object);
			addPlanarForceZPropertyDescriptor(object);
			addPlanarForceZAsStringPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Planar Force X feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlanarForceXPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralLoadPlanarForce_PlanarForceX_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralLoadPlanarForce_PlanarForceX_feature", "_UI_IfcStructuralLoadPlanarForce_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadPlanarForce_PlanarForceX(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Planar Force XAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlanarForceXAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralLoadPlanarForce_PlanarForceXAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralLoadPlanarForce_PlanarForceXAsString_feature", "_UI_IfcStructuralLoadPlanarForce_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadPlanarForce_PlanarForceXAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Planar Force Y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlanarForceYPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralLoadPlanarForce_PlanarForceY_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralLoadPlanarForce_PlanarForceY_feature", "_UI_IfcStructuralLoadPlanarForce_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadPlanarForce_PlanarForceY(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Planar Force YAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlanarForceYAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralLoadPlanarForce_PlanarForceYAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralLoadPlanarForce_PlanarForceYAsString_feature", "_UI_IfcStructuralLoadPlanarForce_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadPlanarForce_PlanarForceYAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Planar Force Z feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlanarForceZPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralLoadPlanarForce_PlanarForceZ_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralLoadPlanarForce_PlanarForceZ_feature", "_UI_IfcStructuralLoadPlanarForce_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadPlanarForce_PlanarForceZ(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Planar Force ZAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlanarForceZAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralLoadPlanarForce_PlanarForceZAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralLoadPlanarForce_PlanarForceZAsString_feature", "_UI_IfcStructuralLoadPlanarForce_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadPlanarForce_PlanarForceZAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcStructuralLoadPlanarForce.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcStructuralLoadPlanarForce"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IfcStructuralLoadPlanarForce)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_IfcStructuralLoadPlanarForce_type") :
			getString("_UI_IfcStructuralLoadPlanarForce_type") + " " + label;
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

		switch (notification.getFeatureID(IfcStructuralLoadPlanarForce.class)) {
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_PLANAR_FORCE__PLANAR_FORCE_X:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_PLANAR_FORCE__PLANAR_FORCE_XAS_STRING:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_PLANAR_FORCE__PLANAR_FORCE_Y:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_PLANAR_FORCE__PLANAR_FORCE_YAS_STRING:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_PLANAR_FORCE__PLANAR_FORCE_Z:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_PLANAR_FORCE__PLANAR_FORCE_ZAS_STRING:
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
