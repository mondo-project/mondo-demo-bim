/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcDoorLiningProperties;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcDoorLiningProperties} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcDoorLiningPropertiesItemProvider extends IfcPropertySetDefinitionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDoorLiningPropertiesItemProvider(AdapterFactory adapterFactory) {
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

			addLiningDepthPropertyDescriptor(object);
			addLiningDepthAsStringPropertyDescriptor(object);
			addLiningThicknessPropertyDescriptor(object);
			addLiningThicknessAsStringPropertyDescriptor(object);
			addThresholdDepthPropertyDescriptor(object);
			addThresholdDepthAsStringPropertyDescriptor(object);
			addThresholdThicknessPropertyDescriptor(object);
			addThresholdThicknessAsStringPropertyDescriptor(object);
			addTransomThicknessPropertyDescriptor(object);
			addTransomThicknessAsStringPropertyDescriptor(object);
			addTransomOffsetPropertyDescriptor(object);
			addTransomOffsetAsStringPropertyDescriptor(object);
			addLiningOffsetPropertyDescriptor(object);
			addLiningOffsetAsStringPropertyDescriptor(object);
			addThresholdOffsetPropertyDescriptor(object);
			addThresholdOffsetAsStringPropertyDescriptor(object);
			addCasingThicknessPropertyDescriptor(object);
			addCasingThicknessAsStringPropertyDescriptor(object);
			addCasingDepthPropertyDescriptor(object);
			addCasingDepthAsStringPropertyDescriptor(object);
			addShapeAspectStylePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Lining Depth feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLiningDepthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcDoorLiningProperties_LiningDepth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcDoorLiningProperties_LiningDepth_feature", "_UI_IfcDoorLiningProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcDoorLiningProperties_LiningDepth(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lining Depth As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLiningDepthAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcDoorLiningProperties_LiningDepthAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcDoorLiningProperties_LiningDepthAsString_feature", "_UI_IfcDoorLiningProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcDoorLiningProperties_LiningDepthAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lining Thickness feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLiningThicknessPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcDoorLiningProperties_LiningThickness_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcDoorLiningProperties_LiningThickness_feature", "_UI_IfcDoorLiningProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcDoorLiningProperties_LiningThickness(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lining Thickness As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLiningThicknessAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcDoorLiningProperties_LiningThicknessAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcDoorLiningProperties_LiningThicknessAsString_feature", "_UI_IfcDoorLiningProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcDoorLiningProperties_LiningThicknessAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Threshold Depth feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addThresholdDepthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcDoorLiningProperties_ThresholdDepth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcDoorLiningProperties_ThresholdDepth_feature", "_UI_IfcDoorLiningProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcDoorLiningProperties_ThresholdDepth(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Threshold Depth As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addThresholdDepthAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcDoorLiningProperties_ThresholdDepthAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcDoorLiningProperties_ThresholdDepthAsString_feature", "_UI_IfcDoorLiningProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcDoorLiningProperties_ThresholdDepthAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Threshold Thickness feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addThresholdThicknessPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcDoorLiningProperties_ThresholdThickness_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcDoorLiningProperties_ThresholdThickness_feature", "_UI_IfcDoorLiningProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcDoorLiningProperties_ThresholdThickness(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Threshold Thickness As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addThresholdThicknessAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcDoorLiningProperties_ThresholdThicknessAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcDoorLiningProperties_ThresholdThicknessAsString_feature", "_UI_IfcDoorLiningProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcDoorLiningProperties_ThresholdThicknessAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Transom Thickness feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransomThicknessPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcDoorLiningProperties_TransomThickness_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcDoorLiningProperties_TransomThickness_feature", "_UI_IfcDoorLiningProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcDoorLiningProperties_TransomThickness(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Transom Thickness As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransomThicknessAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcDoorLiningProperties_TransomThicknessAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcDoorLiningProperties_TransomThicknessAsString_feature", "_UI_IfcDoorLiningProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcDoorLiningProperties_TransomThicknessAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Transom Offset feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransomOffsetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcDoorLiningProperties_TransomOffset_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcDoorLiningProperties_TransomOffset_feature", "_UI_IfcDoorLiningProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcDoorLiningProperties_TransomOffset(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Transom Offset As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransomOffsetAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcDoorLiningProperties_TransomOffsetAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcDoorLiningProperties_TransomOffsetAsString_feature", "_UI_IfcDoorLiningProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcDoorLiningProperties_TransomOffsetAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lining Offset feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLiningOffsetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcDoorLiningProperties_LiningOffset_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcDoorLiningProperties_LiningOffset_feature", "_UI_IfcDoorLiningProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcDoorLiningProperties_LiningOffset(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lining Offset As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLiningOffsetAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcDoorLiningProperties_LiningOffsetAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcDoorLiningProperties_LiningOffsetAsString_feature", "_UI_IfcDoorLiningProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcDoorLiningProperties_LiningOffsetAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Threshold Offset feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addThresholdOffsetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcDoorLiningProperties_ThresholdOffset_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcDoorLiningProperties_ThresholdOffset_feature", "_UI_IfcDoorLiningProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcDoorLiningProperties_ThresholdOffset(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Threshold Offset As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addThresholdOffsetAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcDoorLiningProperties_ThresholdOffsetAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcDoorLiningProperties_ThresholdOffsetAsString_feature", "_UI_IfcDoorLiningProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcDoorLiningProperties_ThresholdOffsetAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Casing Thickness feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCasingThicknessPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcDoorLiningProperties_CasingThickness_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcDoorLiningProperties_CasingThickness_feature", "_UI_IfcDoorLiningProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcDoorLiningProperties_CasingThickness(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Casing Thickness As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCasingThicknessAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcDoorLiningProperties_CasingThicknessAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcDoorLiningProperties_CasingThicknessAsString_feature", "_UI_IfcDoorLiningProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcDoorLiningProperties_CasingThicknessAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Casing Depth feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCasingDepthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcDoorLiningProperties_CasingDepth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcDoorLiningProperties_CasingDepth_feature", "_UI_IfcDoorLiningProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcDoorLiningProperties_CasingDepth(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Casing Depth As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCasingDepthAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcDoorLiningProperties_CasingDepthAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcDoorLiningProperties_CasingDepthAsString_feature", "_UI_IfcDoorLiningProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcDoorLiningProperties_CasingDepthAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Shape Aspect Style feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShapeAspectStylePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcDoorLiningProperties_ShapeAspectStyle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcDoorLiningProperties_ShapeAspectStyle_feature", "_UI_IfcDoorLiningProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcDoorLiningProperties_ShapeAspectStyle(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns IfcDoorLiningProperties.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcDoorLiningProperties"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IfcDoorLiningProperties)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_IfcDoorLiningProperties_type") :
			getString("_UI_IfcDoorLiningProperties_type") + " " + label;
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

		switch (notification.getFeatureID(IfcDoorLiningProperties.class)) {
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__LINING_DEPTH:
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__LINING_DEPTH_AS_STRING:
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__LINING_THICKNESS:
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__LINING_THICKNESS_AS_STRING:
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__THRESHOLD_DEPTH:
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__THRESHOLD_DEPTH_AS_STRING:
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__THRESHOLD_THICKNESS:
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__THRESHOLD_THICKNESS_AS_STRING:
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__TRANSOM_THICKNESS:
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__TRANSOM_THICKNESS_AS_STRING:
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__TRANSOM_OFFSET:
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__TRANSOM_OFFSET_AS_STRING:
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__LINING_OFFSET:
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__LINING_OFFSET_AS_STRING:
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__THRESHOLD_OFFSET:
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__THRESHOLD_OFFSET_AS_STRING:
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__CASING_THICKNESS:
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__CASING_THICKNESS_AS_STRING:
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__CASING_DEPTH:
			case Ifc2x3tc1Package.IFC_DOOR_LINING_PROPERTIES__CASING_DEPTH_AS_STRING:
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
