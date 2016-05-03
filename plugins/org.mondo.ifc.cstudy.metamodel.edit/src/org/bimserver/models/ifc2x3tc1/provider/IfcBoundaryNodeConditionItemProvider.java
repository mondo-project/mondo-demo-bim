/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcBoundaryNodeCondition;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcBoundaryNodeCondition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcBoundaryNodeConditionItemProvider extends IfcBoundaryConditionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBoundaryNodeConditionItemProvider(AdapterFactory adapterFactory) {
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

			addLinearStiffnessXPropertyDescriptor(object);
			addLinearStiffnessXAsStringPropertyDescriptor(object);
			addLinearStiffnessYPropertyDescriptor(object);
			addLinearStiffnessYAsStringPropertyDescriptor(object);
			addLinearStiffnessZPropertyDescriptor(object);
			addLinearStiffnessZAsStringPropertyDescriptor(object);
			addRotationalStiffnessXPropertyDescriptor(object);
			addRotationalStiffnessXAsStringPropertyDescriptor(object);
			addRotationalStiffnessYPropertyDescriptor(object);
			addRotationalStiffnessYAsStringPropertyDescriptor(object);
			addRotationalStiffnessZPropertyDescriptor(object);
			addRotationalStiffnessZAsStringPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Linear Stiffness X feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinearStiffnessXPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcBoundaryNodeCondition_LinearStiffnessX_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcBoundaryNodeCondition_LinearStiffnessX_feature", "_UI_IfcBoundaryNodeCondition_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryNodeCondition_LinearStiffnessX(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Linear Stiffness XAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinearStiffnessXAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcBoundaryNodeCondition_LinearStiffnessXAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcBoundaryNodeCondition_LinearStiffnessXAsString_feature", "_UI_IfcBoundaryNodeCondition_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryNodeCondition_LinearStiffnessXAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Linear Stiffness Y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinearStiffnessYPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcBoundaryNodeCondition_LinearStiffnessY_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcBoundaryNodeCondition_LinearStiffnessY_feature", "_UI_IfcBoundaryNodeCondition_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryNodeCondition_LinearStiffnessY(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Linear Stiffness YAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinearStiffnessYAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcBoundaryNodeCondition_LinearStiffnessYAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcBoundaryNodeCondition_LinearStiffnessYAsString_feature", "_UI_IfcBoundaryNodeCondition_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryNodeCondition_LinearStiffnessYAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Linear Stiffness Z feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinearStiffnessZPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcBoundaryNodeCondition_LinearStiffnessZ_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcBoundaryNodeCondition_LinearStiffnessZ_feature", "_UI_IfcBoundaryNodeCondition_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryNodeCondition_LinearStiffnessZ(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Linear Stiffness ZAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinearStiffnessZAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcBoundaryNodeCondition_LinearStiffnessZAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcBoundaryNodeCondition_LinearStiffnessZAsString_feature", "_UI_IfcBoundaryNodeCondition_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryNodeCondition_LinearStiffnessZAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rotational Stiffness X feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRotationalStiffnessXPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcBoundaryNodeCondition_RotationalStiffnessX_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcBoundaryNodeCondition_RotationalStiffnessX_feature", "_UI_IfcBoundaryNodeCondition_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryNodeCondition_RotationalStiffnessX(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rotational Stiffness XAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRotationalStiffnessXAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcBoundaryNodeCondition_RotationalStiffnessXAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcBoundaryNodeCondition_RotationalStiffnessXAsString_feature", "_UI_IfcBoundaryNodeCondition_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryNodeCondition_RotationalStiffnessXAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rotational Stiffness Y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRotationalStiffnessYPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcBoundaryNodeCondition_RotationalStiffnessY_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcBoundaryNodeCondition_RotationalStiffnessY_feature", "_UI_IfcBoundaryNodeCondition_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryNodeCondition_RotationalStiffnessY(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rotational Stiffness YAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRotationalStiffnessYAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcBoundaryNodeCondition_RotationalStiffnessYAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcBoundaryNodeCondition_RotationalStiffnessYAsString_feature", "_UI_IfcBoundaryNodeCondition_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryNodeCondition_RotationalStiffnessYAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rotational Stiffness Z feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRotationalStiffnessZPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcBoundaryNodeCondition_RotationalStiffnessZ_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcBoundaryNodeCondition_RotationalStiffnessZ_feature", "_UI_IfcBoundaryNodeCondition_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryNodeCondition_RotationalStiffnessZ(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rotational Stiffness ZAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRotationalStiffnessZAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcBoundaryNodeCondition_RotationalStiffnessZAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcBoundaryNodeCondition_RotationalStiffnessZAsString_feature", "_UI_IfcBoundaryNodeCondition_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryNodeCondition_RotationalStiffnessZAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcBoundaryNodeCondition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcBoundaryNodeCondition"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IfcBoundaryNodeCondition)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_IfcBoundaryNodeCondition_type") :
			getString("_UI_IfcBoundaryNodeCondition_type") + " " + label;
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

		switch (notification.getFeatureID(IfcBoundaryNodeCondition.class)) {
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_X:
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_XAS_STRING:
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_Y:
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_YAS_STRING:
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_Z:
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_ZAS_STRING:
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_X:
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_XAS_STRING:
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_Y:
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_YAS_STRING:
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_Z:
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_ZAS_STRING:
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
