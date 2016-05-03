/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcStructuralLoadSingleForce;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcStructuralLoadSingleForce} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcStructuralLoadSingleForceItemProvider extends IfcStructuralLoadStaticItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralLoadSingleForceItemProvider(AdapterFactory adapterFactory) {
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

			addForceXPropertyDescriptor(object);
			addForceXAsStringPropertyDescriptor(object);
			addForceYPropertyDescriptor(object);
			addForceYAsStringPropertyDescriptor(object);
			addForceZPropertyDescriptor(object);
			addForceZAsStringPropertyDescriptor(object);
			addMomentXPropertyDescriptor(object);
			addMomentXAsStringPropertyDescriptor(object);
			addMomentYPropertyDescriptor(object);
			addMomentYAsStringPropertyDescriptor(object);
			addMomentZPropertyDescriptor(object);
			addMomentZAsStringPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Force X feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addForceXPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralLoadSingleForce_ForceX_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralLoadSingleForce_ForceX_feature", "_UI_IfcStructuralLoadSingleForce_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadSingleForce_ForceX(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Force XAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addForceXAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralLoadSingleForce_ForceXAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralLoadSingleForce_ForceXAsString_feature", "_UI_IfcStructuralLoadSingleForce_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadSingleForce_ForceXAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Force Y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addForceYPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralLoadSingleForce_ForceY_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralLoadSingleForce_ForceY_feature", "_UI_IfcStructuralLoadSingleForce_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadSingleForce_ForceY(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Force YAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addForceYAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralLoadSingleForce_ForceYAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralLoadSingleForce_ForceYAsString_feature", "_UI_IfcStructuralLoadSingleForce_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadSingleForce_ForceYAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Force Z feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addForceZPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralLoadSingleForce_ForceZ_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralLoadSingleForce_ForceZ_feature", "_UI_IfcStructuralLoadSingleForce_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadSingleForce_ForceZ(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Force ZAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addForceZAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralLoadSingleForce_ForceZAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralLoadSingleForce_ForceZAsString_feature", "_UI_IfcStructuralLoadSingleForce_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadSingleForce_ForceZAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Moment X feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMomentXPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralLoadSingleForce_MomentX_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralLoadSingleForce_MomentX_feature", "_UI_IfcStructuralLoadSingleForce_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadSingleForce_MomentX(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Moment XAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMomentXAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralLoadSingleForce_MomentXAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralLoadSingleForce_MomentXAsString_feature", "_UI_IfcStructuralLoadSingleForce_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadSingleForce_MomentXAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Moment Y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMomentYPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralLoadSingleForce_MomentY_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralLoadSingleForce_MomentY_feature", "_UI_IfcStructuralLoadSingleForce_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadSingleForce_MomentY(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Moment YAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMomentYAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralLoadSingleForce_MomentYAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralLoadSingleForce_MomentYAsString_feature", "_UI_IfcStructuralLoadSingleForce_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadSingleForce_MomentYAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Moment Z feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMomentZPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralLoadSingleForce_MomentZ_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralLoadSingleForce_MomentZ_feature", "_UI_IfcStructuralLoadSingleForce_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadSingleForce_MomentZ(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Moment ZAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMomentZAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralLoadSingleForce_MomentZAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralLoadSingleForce_MomentZAsString_feature", "_UI_IfcStructuralLoadSingleForce_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadSingleForce_MomentZAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcStructuralLoadSingleForce.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcStructuralLoadSingleForce"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IfcStructuralLoadSingleForce)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_IfcStructuralLoadSingleForce_type") :
			getString("_UI_IfcStructuralLoadSingleForce_type") + " " + label;
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

		switch (notification.getFeatureID(IfcStructuralLoadSingleForce.class)) {
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__FORCE_X:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__FORCE_XAS_STRING:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__FORCE_Y:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__FORCE_YAS_STRING:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__FORCE_Z:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__FORCE_ZAS_STRING:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__MOMENT_X:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__MOMENT_XAS_STRING:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__MOMENT_Y:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__MOMENT_YAS_STRING:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__MOMENT_Z:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__MOMENT_ZAS_STRING:
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
