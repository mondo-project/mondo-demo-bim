/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcBoundaryFaceCondition;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcBoundaryFaceCondition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcBoundaryFaceConditionItemProvider extends IfcBoundaryConditionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBoundaryFaceConditionItemProvider(AdapterFactory adapterFactory) {
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

			addLinearStiffnessByAreaXPropertyDescriptor(object);
			addLinearStiffnessByAreaXAsStringPropertyDescriptor(object);
			addLinearStiffnessByAreaYPropertyDescriptor(object);
			addLinearStiffnessByAreaYAsStringPropertyDescriptor(object);
			addLinearStiffnessByAreaZPropertyDescriptor(object);
			addLinearStiffnessByAreaZAsStringPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Linear Stiffness By Area X feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinearStiffnessByAreaXPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcBoundaryFaceCondition_LinearStiffnessByAreaX_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcBoundaryFaceCondition_LinearStiffnessByAreaX_feature", "_UI_IfcBoundaryFaceCondition_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryFaceCondition_LinearStiffnessByAreaX(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Linear Stiffness By Area XAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinearStiffnessByAreaXAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcBoundaryFaceCondition_LinearStiffnessByAreaXAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcBoundaryFaceCondition_LinearStiffnessByAreaXAsString_feature", "_UI_IfcBoundaryFaceCondition_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryFaceCondition_LinearStiffnessByAreaXAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Linear Stiffness By Area Y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinearStiffnessByAreaYPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcBoundaryFaceCondition_LinearStiffnessByAreaY_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcBoundaryFaceCondition_LinearStiffnessByAreaY_feature", "_UI_IfcBoundaryFaceCondition_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryFaceCondition_LinearStiffnessByAreaY(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Linear Stiffness By Area YAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinearStiffnessByAreaYAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcBoundaryFaceCondition_LinearStiffnessByAreaYAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcBoundaryFaceCondition_LinearStiffnessByAreaYAsString_feature", "_UI_IfcBoundaryFaceCondition_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryFaceCondition_LinearStiffnessByAreaYAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Linear Stiffness By Area Z feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinearStiffnessByAreaZPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcBoundaryFaceCondition_LinearStiffnessByAreaZ_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcBoundaryFaceCondition_LinearStiffnessByAreaZ_feature", "_UI_IfcBoundaryFaceCondition_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryFaceCondition_LinearStiffnessByAreaZ(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Linear Stiffness By Area ZAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinearStiffnessByAreaZAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcBoundaryFaceCondition_LinearStiffnessByAreaZAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcBoundaryFaceCondition_LinearStiffnessByAreaZAsString_feature", "_UI_IfcBoundaryFaceCondition_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryFaceCondition_LinearStiffnessByAreaZAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcBoundaryFaceCondition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcBoundaryFaceCondition"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IfcBoundaryFaceCondition)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_IfcBoundaryFaceCondition_type") :
			getString("_UI_IfcBoundaryFaceCondition_type") + " " + label;
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

		switch (notification.getFeatureID(IfcBoundaryFaceCondition.class)) {
			case Ifc2x3tc1Package.IFC_BOUNDARY_FACE_CONDITION__LINEAR_STIFFNESS_BY_AREA_X:
			case Ifc2x3tc1Package.IFC_BOUNDARY_FACE_CONDITION__LINEAR_STIFFNESS_BY_AREA_XAS_STRING:
			case Ifc2x3tc1Package.IFC_BOUNDARY_FACE_CONDITION__LINEAR_STIFFNESS_BY_AREA_Y:
			case Ifc2x3tc1Package.IFC_BOUNDARY_FACE_CONDITION__LINEAR_STIFFNESS_BY_AREA_YAS_STRING:
			case Ifc2x3tc1Package.IFC_BOUNDARY_FACE_CONDITION__LINEAR_STIFFNESS_BY_AREA_Z:
			case Ifc2x3tc1Package.IFC_BOUNDARY_FACE_CONDITION__LINEAR_STIFFNESS_BY_AREA_ZAS_STRING:
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
