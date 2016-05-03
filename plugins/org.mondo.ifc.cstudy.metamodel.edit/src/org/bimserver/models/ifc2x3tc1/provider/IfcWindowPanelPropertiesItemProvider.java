/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcWindowPanelProperties;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcWindowPanelProperties} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcWindowPanelPropertiesItemProvider extends IfcPropertySetDefinitionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcWindowPanelPropertiesItemProvider(AdapterFactory adapterFactory) {
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

			addOperationTypePropertyDescriptor(object);
			addPanelPositionPropertyDescriptor(object);
			addFrameDepthPropertyDescriptor(object);
			addFrameDepthAsStringPropertyDescriptor(object);
			addFrameThicknessPropertyDescriptor(object);
			addFrameThicknessAsStringPropertyDescriptor(object);
			addShapeAspectStylePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Operation Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOperationTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcWindowPanelProperties_OperationType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcWindowPanelProperties_OperationType_feature", "_UI_IfcWindowPanelProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcWindowPanelProperties_OperationType(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Panel Position feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPanelPositionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcWindowPanelProperties_PanelPosition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcWindowPanelProperties_PanelPosition_feature", "_UI_IfcWindowPanelProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcWindowPanelProperties_PanelPosition(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Frame Depth feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFrameDepthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcWindowPanelProperties_FrameDepth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcWindowPanelProperties_FrameDepth_feature", "_UI_IfcWindowPanelProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcWindowPanelProperties_FrameDepth(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Frame Depth As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFrameDepthAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcWindowPanelProperties_FrameDepthAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcWindowPanelProperties_FrameDepthAsString_feature", "_UI_IfcWindowPanelProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcWindowPanelProperties_FrameDepthAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Frame Thickness feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFrameThicknessPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcWindowPanelProperties_FrameThickness_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcWindowPanelProperties_FrameThickness_feature", "_UI_IfcWindowPanelProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcWindowPanelProperties_FrameThickness(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Frame Thickness As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFrameThicknessAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcWindowPanelProperties_FrameThicknessAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcWindowPanelProperties_FrameThicknessAsString_feature", "_UI_IfcWindowPanelProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcWindowPanelProperties_FrameThicknessAsString(),
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
				 getString("_UI_IfcWindowPanelProperties_ShapeAspectStyle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcWindowPanelProperties_ShapeAspectStyle_feature", "_UI_IfcWindowPanelProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcWindowPanelProperties_ShapeAspectStyle(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns IfcWindowPanelProperties.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcWindowPanelProperties"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IfcWindowPanelProperties)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_IfcWindowPanelProperties_type") :
			getString("_UI_IfcWindowPanelProperties_type") + " " + label;
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

		switch (notification.getFeatureID(IfcWindowPanelProperties.class)) {
			case Ifc2x3tc1Package.IFC_WINDOW_PANEL_PROPERTIES__OPERATION_TYPE:
			case Ifc2x3tc1Package.IFC_WINDOW_PANEL_PROPERTIES__PANEL_POSITION:
			case Ifc2x3tc1Package.IFC_WINDOW_PANEL_PROPERTIES__FRAME_DEPTH:
			case Ifc2x3tc1Package.IFC_WINDOW_PANEL_PROPERTIES__FRAME_DEPTH_AS_STRING:
			case Ifc2x3tc1Package.IFC_WINDOW_PANEL_PROPERTIES__FRAME_THICKNESS:
			case Ifc2x3tc1Package.IFC_WINDOW_PANEL_PROPERTIES__FRAME_THICKNESS_AS_STRING:
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
