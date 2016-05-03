/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcWindowLiningProperties;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcWindowLiningProperties} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcWindowLiningPropertiesItemProvider extends IfcPropertySetDefinitionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcWindowLiningPropertiesItemProvider(AdapterFactory adapterFactory) {
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
			addTransomThicknessPropertyDescriptor(object);
			addTransomThicknessAsStringPropertyDescriptor(object);
			addMullionThicknessPropertyDescriptor(object);
			addMullionThicknessAsStringPropertyDescriptor(object);
			addFirstTransomOffsetPropertyDescriptor(object);
			addFirstTransomOffsetAsStringPropertyDescriptor(object);
			addSecondTransomOffsetPropertyDescriptor(object);
			addSecondTransomOffsetAsStringPropertyDescriptor(object);
			addFirstMullionOffsetPropertyDescriptor(object);
			addFirstMullionOffsetAsStringPropertyDescriptor(object);
			addSecondMullionOffsetPropertyDescriptor(object);
			addSecondMullionOffsetAsStringPropertyDescriptor(object);
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
				 getString("_UI_IfcWindowLiningProperties_LiningDepth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcWindowLiningProperties_LiningDepth_feature", "_UI_IfcWindowLiningProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_LiningDepth(),
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
				 getString("_UI_IfcWindowLiningProperties_LiningDepthAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcWindowLiningProperties_LiningDepthAsString_feature", "_UI_IfcWindowLiningProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_LiningDepthAsString(),
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
				 getString("_UI_IfcWindowLiningProperties_LiningThickness_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcWindowLiningProperties_LiningThickness_feature", "_UI_IfcWindowLiningProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_LiningThickness(),
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
				 getString("_UI_IfcWindowLiningProperties_LiningThicknessAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcWindowLiningProperties_LiningThicknessAsString_feature", "_UI_IfcWindowLiningProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_LiningThicknessAsString(),
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
				 getString("_UI_IfcWindowLiningProperties_TransomThickness_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcWindowLiningProperties_TransomThickness_feature", "_UI_IfcWindowLiningProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_TransomThickness(),
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
				 getString("_UI_IfcWindowLiningProperties_TransomThicknessAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcWindowLiningProperties_TransomThicknessAsString_feature", "_UI_IfcWindowLiningProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_TransomThicknessAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mullion Thickness feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMullionThicknessPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcWindowLiningProperties_MullionThickness_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcWindowLiningProperties_MullionThickness_feature", "_UI_IfcWindowLiningProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_MullionThickness(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mullion Thickness As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMullionThicknessAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcWindowLiningProperties_MullionThicknessAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcWindowLiningProperties_MullionThicknessAsString_feature", "_UI_IfcWindowLiningProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_MullionThicknessAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the First Transom Offset feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFirstTransomOffsetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcWindowLiningProperties_FirstTransomOffset_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcWindowLiningProperties_FirstTransomOffset_feature", "_UI_IfcWindowLiningProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_FirstTransomOffset(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the First Transom Offset As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFirstTransomOffsetAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcWindowLiningProperties_FirstTransomOffsetAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcWindowLiningProperties_FirstTransomOffsetAsString_feature", "_UI_IfcWindowLiningProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_FirstTransomOffsetAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Second Transom Offset feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecondTransomOffsetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcWindowLiningProperties_SecondTransomOffset_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcWindowLiningProperties_SecondTransomOffset_feature", "_UI_IfcWindowLiningProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_SecondTransomOffset(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Second Transom Offset As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecondTransomOffsetAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcWindowLiningProperties_SecondTransomOffsetAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcWindowLiningProperties_SecondTransomOffsetAsString_feature", "_UI_IfcWindowLiningProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_SecondTransomOffsetAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the First Mullion Offset feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFirstMullionOffsetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcWindowLiningProperties_FirstMullionOffset_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcWindowLiningProperties_FirstMullionOffset_feature", "_UI_IfcWindowLiningProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_FirstMullionOffset(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the First Mullion Offset As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFirstMullionOffsetAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcWindowLiningProperties_FirstMullionOffsetAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcWindowLiningProperties_FirstMullionOffsetAsString_feature", "_UI_IfcWindowLiningProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_FirstMullionOffsetAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Second Mullion Offset feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecondMullionOffsetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcWindowLiningProperties_SecondMullionOffset_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcWindowLiningProperties_SecondMullionOffset_feature", "_UI_IfcWindowLiningProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_SecondMullionOffset(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Second Mullion Offset As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecondMullionOffsetAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcWindowLiningProperties_SecondMullionOffsetAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcWindowLiningProperties_SecondMullionOffsetAsString_feature", "_UI_IfcWindowLiningProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_SecondMullionOffsetAsString(),
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
				 getString("_UI_IfcWindowLiningProperties_ShapeAspectStyle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcWindowLiningProperties_ShapeAspectStyle_feature", "_UI_IfcWindowLiningProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcWindowLiningProperties_ShapeAspectStyle(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns IfcWindowLiningProperties.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcWindowLiningProperties"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IfcWindowLiningProperties)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_IfcWindowLiningProperties_type") :
			getString("_UI_IfcWindowLiningProperties_type") + " " + label;
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

		switch (notification.getFeatureID(IfcWindowLiningProperties.class)) {
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__LINING_DEPTH:
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__LINING_DEPTH_AS_STRING:
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__LINING_THICKNESS:
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__LINING_THICKNESS_AS_STRING:
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__TRANSOM_THICKNESS:
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__TRANSOM_THICKNESS_AS_STRING:
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__MULLION_THICKNESS:
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__MULLION_THICKNESS_AS_STRING:
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__FIRST_TRANSOM_OFFSET:
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__FIRST_TRANSOM_OFFSET_AS_STRING:
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__SECOND_TRANSOM_OFFSET:
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__SECOND_TRANSOM_OFFSET_AS_STRING:
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__FIRST_MULLION_OFFSET:
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__FIRST_MULLION_OFFSET_AS_STRING:
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__SECOND_MULLION_OFFSET:
			case Ifc2x3tc1Package.IFC_WINDOW_LINING_PROPERTIES__SECOND_MULLION_OFFSET_AS_STRING:
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
