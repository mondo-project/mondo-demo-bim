/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcCartesianTransformationOperator;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcCartesianTransformationOperator} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcCartesianTransformationOperatorItemProvider extends IfcGeometricRepresentationItemItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCartesianTransformationOperatorItemProvider(AdapterFactory adapterFactory) {
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

			addAxis1PropertyDescriptor(object);
			addAxis2PropertyDescriptor(object);
			addLocalOriginPropertyDescriptor(object);
			addScalePropertyDescriptor(object);
			addScaleAsStringPropertyDescriptor(object);
			addDimPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Axis1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAxis1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcCartesianTransformationOperator_Axis1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCartesianTransformationOperator_Axis1_feature", "_UI_IfcCartesianTransformationOperator_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCartesianTransformationOperator_Axis1(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Axis2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAxis2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcCartesianTransformationOperator_Axis2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCartesianTransformationOperator_Axis2_feature", "_UI_IfcCartesianTransformationOperator_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCartesianTransformationOperator_Axis2(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Local Origin feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocalOriginPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcCartesianTransformationOperator_LocalOrigin_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCartesianTransformationOperator_LocalOrigin_feature", "_UI_IfcCartesianTransformationOperator_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCartesianTransformationOperator_LocalOrigin(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Scale feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScalePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcCartesianTransformationOperator_Scale_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCartesianTransformationOperator_Scale_feature", "_UI_IfcCartesianTransformationOperator_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCartesianTransformationOperator_Scale(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Scale As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScaleAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcCartesianTransformationOperator_ScaleAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCartesianTransformationOperator_ScaleAsString_feature", "_UI_IfcCartesianTransformationOperator_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCartesianTransformationOperator_ScaleAsString(),
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
				 getString("_UI_IfcCartesianTransformationOperator_Dim_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCartesianTransformationOperator_Dim_feature", "_UI_IfcCartesianTransformationOperator_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCartesianTransformationOperator_Dim(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcCartesianTransformationOperator.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcCartesianTransformationOperator"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		IfcCartesianTransformationOperator ifcCartesianTransformationOperator = (IfcCartesianTransformationOperator)object;
		return getString("_UI_IfcCartesianTransformationOperator_type") + " " + ifcCartesianTransformationOperator.getScale();
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

		switch (notification.getFeatureID(IfcCartesianTransformationOperator.class)) {
			case Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__SCALE:
			case Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__SCALE_AS_STRING:
			case Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__DIM:
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
