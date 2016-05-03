/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcBoundaryEdgeCondition;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcBoundaryEdgeCondition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcBoundaryEdgeConditionItemProvider extends IfcBoundaryConditionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBoundaryEdgeConditionItemProvider(AdapterFactory adapterFactory) {
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

			addLinearStiffnessByLengthXPropertyDescriptor(object);
			addLinearStiffnessByLengthXAsStringPropertyDescriptor(object);
			addLinearStiffnessByLengthYPropertyDescriptor(object);
			addLinearStiffnessByLengthYAsStringPropertyDescriptor(object);
			addLinearStiffnessByLengthZPropertyDescriptor(object);
			addLinearStiffnessByLengthZAsStringPropertyDescriptor(object);
			addRotationalStiffnessByLengthXPropertyDescriptor(object);
			addRotationalStiffnessByLengthXAsStringPropertyDescriptor(object);
			addRotationalStiffnessByLengthYPropertyDescriptor(object);
			addRotationalStiffnessByLengthYAsStringPropertyDescriptor(object);
			addRotationalStiffnessByLengthZPropertyDescriptor(object);
			addRotationalStiffnessByLengthZAsStringPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Linear Stiffness By Length X feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinearStiffnessByLengthXPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcBoundaryEdgeCondition_LinearStiffnessByLengthX_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcBoundaryEdgeCondition_LinearStiffnessByLengthX_feature", "_UI_IfcBoundaryEdgeCondition_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryEdgeCondition_LinearStiffnessByLengthX(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Linear Stiffness By Length XAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinearStiffnessByLengthXAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcBoundaryEdgeCondition_LinearStiffnessByLengthXAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcBoundaryEdgeCondition_LinearStiffnessByLengthXAsString_feature", "_UI_IfcBoundaryEdgeCondition_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryEdgeCondition_LinearStiffnessByLengthXAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Linear Stiffness By Length Y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinearStiffnessByLengthYPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcBoundaryEdgeCondition_LinearStiffnessByLengthY_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcBoundaryEdgeCondition_LinearStiffnessByLengthY_feature", "_UI_IfcBoundaryEdgeCondition_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryEdgeCondition_LinearStiffnessByLengthY(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Linear Stiffness By Length YAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinearStiffnessByLengthYAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcBoundaryEdgeCondition_LinearStiffnessByLengthYAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcBoundaryEdgeCondition_LinearStiffnessByLengthYAsString_feature", "_UI_IfcBoundaryEdgeCondition_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryEdgeCondition_LinearStiffnessByLengthYAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Linear Stiffness By Length Z feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinearStiffnessByLengthZPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcBoundaryEdgeCondition_LinearStiffnessByLengthZ_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcBoundaryEdgeCondition_LinearStiffnessByLengthZ_feature", "_UI_IfcBoundaryEdgeCondition_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryEdgeCondition_LinearStiffnessByLengthZ(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Linear Stiffness By Length ZAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinearStiffnessByLengthZAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcBoundaryEdgeCondition_LinearStiffnessByLengthZAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcBoundaryEdgeCondition_LinearStiffnessByLengthZAsString_feature", "_UI_IfcBoundaryEdgeCondition_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryEdgeCondition_LinearStiffnessByLengthZAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rotational Stiffness By Length X feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRotationalStiffnessByLengthXPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcBoundaryEdgeCondition_RotationalStiffnessByLengthX_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcBoundaryEdgeCondition_RotationalStiffnessByLengthX_feature", "_UI_IfcBoundaryEdgeCondition_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthX(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rotational Stiffness By Length XAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRotationalStiffnessByLengthXAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcBoundaryEdgeCondition_RotationalStiffnessByLengthXAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcBoundaryEdgeCondition_RotationalStiffnessByLengthXAsString_feature", "_UI_IfcBoundaryEdgeCondition_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthXAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rotational Stiffness By Length Y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRotationalStiffnessByLengthYPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcBoundaryEdgeCondition_RotationalStiffnessByLengthY_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcBoundaryEdgeCondition_RotationalStiffnessByLengthY_feature", "_UI_IfcBoundaryEdgeCondition_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthY(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rotational Stiffness By Length YAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRotationalStiffnessByLengthYAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcBoundaryEdgeCondition_RotationalStiffnessByLengthYAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcBoundaryEdgeCondition_RotationalStiffnessByLengthYAsString_feature", "_UI_IfcBoundaryEdgeCondition_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthYAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rotational Stiffness By Length Z feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRotationalStiffnessByLengthZPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcBoundaryEdgeCondition_RotationalStiffnessByLengthZ_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcBoundaryEdgeCondition_RotationalStiffnessByLengthZ_feature", "_UI_IfcBoundaryEdgeCondition_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthZ(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rotational Stiffness By Length ZAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRotationalStiffnessByLengthZAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcBoundaryEdgeCondition_RotationalStiffnessByLengthZAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcBoundaryEdgeCondition_RotationalStiffnessByLengthZAsString_feature", "_UI_IfcBoundaryEdgeCondition_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthZAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcBoundaryEdgeCondition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcBoundaryEdgeCondition"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IfcBoundaryEdgeCondition)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_IfcBoundaryEdgeCondition_type") :
			getString("_UI_IfcBoundaryEdgeCondition_type") + " " + label;
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

		switch (notification.getFeatureID(IfcBoundaryEdgeCondition.class)) {
			case Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__LINEAR_STIFFNESS_BY_LENGTH_X:
			case Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__LINEAR_STIFFNESS_BY_LENGTH_XAS_STRING:
			case Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__LINEAR_STIFFNESS_BY_LENGTH_Y:
			case Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__LINEAR_STIFFNESS_BY_LENGTH_YAS_STRING:
			case Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__LINEAR_STIFFNESS_BY_LENGTH_Z:
			case Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__LINEAR_STIFFNESS_BY_LENGTH_ZAS_STRING:
			case Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__ROTATIONAL_STIFFNESS_BY_LENGTH_X:
			case Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__ROTATIONAL_STIFFNESS_BY_LENGTH_XAS_STRING:
			case Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__ROTATIONAL_STIFFNESS_BY_LENGTH_Y:
			case Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__ROTATIONAL_STIFFNESS_BY_LENGTH_YAS_STRING:
			case Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__ROTATIONAL_STIFFNESS_BY_LENGTH_Z:
			case Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__ROTATIONAL_STIFFNESS_BY_LENGTH_ZAS_STRING:
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
