/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcStructuralLoadLinearForce;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcStructuralLoadLinearForce} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcStructuralLoadLinearForceItemProvider extends IfcStructuralLoadStaticItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralLoadLinearForceItemProvider(AdapterFactory adapterFactory) {
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

			addLinearForceXPropertyDescriptor(object);
			addLinearForceXAsStringPropertyDescriptor(object);
			addLinearForceYPropertyDescriptor(object);
			addLinearForceYAsStringPropertyDescriptor(object);
			addLinearForceZPropertyDescriptor(object);
			addLinearForceZAsStringPropertyDescriptor(object);
			addLinearMomentXPropertyDescriptor(object);
			addLinearMomentXAsStringPropertyDescriptor(object);
			addLinearMomentYPropertyDescriptor(object);
			addLinearMomentYAsStringPropertyDescriptor(object);
			addLinearMomentZPropertyDescriptor(object);
			addLinearMomentZAsStringPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Linear Force X feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinearForceXPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralLoadLinearForce_LinearForceX_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralLoadLinearForce_LinearForceX_feature", "_UI_IfcStructuralLoadLinearForce_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadLinearForce_LinearForceX(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Linear Force XAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinearForceXAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralLoadLinearForce_LinearForceXAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralLoadLinearForce_LinearForceXAsString_feature", "_UI_IfcStructuralLoadLinearForce_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadLinearForce_LinearForceXAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Linear Force Y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinearForceYPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralLoadLinearForce_LinearForceY_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralLoadLinearForce_LinearForceY_feature", "_UI_IfcStructuralLoadLinearForce_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadLinearForce_LinearForceY(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Linear Force YAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinearForceYAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralLoadLinearForce_LinearForceYAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralLoadLinearForce_LinearForceYAsString_feature", "_UI_IfcStructuralLoadLinearForce_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadLinearForce_LinearForceYAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Linear Force Z feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinearForceZPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralLoadLinearForce_LinearForceZ_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralLoadLinearForce_LinearForceZ_feature", "_UI_IfcStructuralLoadLinearForce_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadLinearForce_LinearForceZ(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Linear Force ZAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinearForceZAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralLoadLinearForce_LinearForceZAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralLoadLinearForce_LinearForceZAsString_feature", "_UI_IfcStructuralLoadLinearForce_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadLinearForce_LinearForceZAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Linear Moment X feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinearMomentXPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralLoadLinearForce_LinearMomentX_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralLoadLinearForce_LinearMomentX_feature", "_UI_IfcStructuralLoadLinearForce_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadLinearForce_LinearMomentX(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Linear Moment XAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinearMomentXAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralLoadLinearForce_LinearMomentXAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralLoadLinearForce_LinearMomentXAsString_feature", "_UI_IfcStructuralLoadLinearForce_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadLinearForce_LinearMomentXAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Linear Moment Y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinearMomentYPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralLoadLinearForce_LinearMomentY_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralLoadLinearForce_LinearMomentY_feature", "_UI_IfcStructuralLoadLinearForce_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadLinearForce_LinearMomentY(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Linear Moment YAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinearMomentYAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralLoadLinearForce_LinearMomentYAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralLoadLinearForce_LinearMomentYAsString_feature", "_UI_IfcStructuralLoadLinearForce_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadLinearForce_LinearMomentYAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Linear Moment Z feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinearMomentZPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralLoadLinearForce_LinearMomentZ_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralLoadLinearForce_LinearMomentZ_feature", "_UI_IfcStructuralLoadLinearForce_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadLinearForce_LinearMomentZ(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Linear Moment ZAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinearMomentZAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralLoadLinearForce_LinearMomentZAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralLoadLinearForce_LinearMomentZAsString_feature", "_UI_IfcStructuralLoadLinearForce_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadLinearForce_LinearMomentZAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcStructuralLoadLinearForce.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcStructuralLoadLinearForce"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IfcStructuralLoadLinearForce)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_IfcStructuralLoadLinearForce_type") :
			getString("_UI_IfcStructuralLoadLinearForce_type") + " " + label;
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

		switch (notification.getFeatureID(IfcStructuralLoadLinearForce.class)) {
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_FORCE_X:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_FORCE_XAS_STRING:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_FORCE_Y:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_FORCE_YAS_STRING:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_FORCE_Z:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_FORCE_ZAS_STRING:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_MOMENT_X:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_MOMENT_XAS_STRING:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_MOMENT_Y:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_MOMENT_YAS_STRING:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_MOMENT_Z:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_MOMENT_ZAS_STRING:
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
