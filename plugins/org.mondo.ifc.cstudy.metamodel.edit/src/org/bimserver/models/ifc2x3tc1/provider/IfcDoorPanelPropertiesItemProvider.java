/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcDoorPanelProperties;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcDoorPanelProperties} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcDoorPanelPropertiesItemProvider extends IfcPropertySetDefinitionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDoorPanelPropertiesItemProvider(AdapterFactory adapterFactory) {
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

			addPanelDepthPropertyDescriptor(object);
			addPanelDepthAsStringPropertyDescriptor(object);
			addPanelOperationPropertyDescriptor(object);
			addPanelWidthPropertyDescriptor(object);
			addPanelWidthAsStringPropertyDescriptor(object);
			addPanelPositionPropertyDescriptor(object);
			addShapeAspectStylePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Panel Depth feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPanelDepthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcDoorPanelProperties_PanelDepth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcDoorPanelProperties_PanelDepth_feature", "_UI_IfcDoorPanelProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcDoorPanelProperties_PanelDepth(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Panel Depth As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPanelDepthAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcDoorPanelProperties_PanelDepthAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcDoorPanelProperties_PanelDepthAsString_feature", "_UI_IfcDoorPanelProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcDoorPanelProperties_PanelDepthAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Panel Operation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPanelOperationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcDoorPanelProperties_PanelOperation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcDoorPanelProperties_PanelOperation_feature", "_UI_IfcDoorPanelProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcDoorPanelProperties_PanelOperation(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Panel Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPanelWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcDoorPanelProperties_PanelWidth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcDoorPanelProperties_PanelWidth_feature", "_UI_IfcDoorPanelProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcDoorPanelProperties_PanelWidth(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Panel Width As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPanelWidthAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcDoorPanelProperties_PanelWidthAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcDoorPanelProperties_PanelWidthAsString_feature", "_UI_IfcDoorPanelProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcDoorPanelProperties_PanelWidthAsString(),
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
				 getString("_UI_IfcDoorPanelProperties_PanelPosition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcDoorPanelProperties_PanelPosition_feature", "_UI_IfcDoorPanelProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcDoorPanelProperties_PanelPosition(),
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
				 getString("_UI_IfcDoorPanelProperties_ShapeAspectStyle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcDoorPanelProperties_ShapeAspectStyle_feature", "_UI_IfcDoorPanelProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcDoorPanelProperties_ShapeAspectStyle(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns IfcDoorPanelProperties.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcDoorPanelProperties"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IfcDoorPanelProperties)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_IfcDoorPanelProperties_type") :
			getString("_UI_IfcDoorPanelProperties_type") + " " + label;
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

		switch (notification.getFeatureID(IfcDoorPanelProperties.class)) {
			case Ifc2x3tc1Package.IFC_DOOR_PANEL_PROPERTIES__PANEL_DEPTH:
			case Ifc2x3tc1Package.IFC_DOOR_PANEL_PROPERTIES__PANEL_DEPTH_AS_STRING:
			case Ifc2x3tc1Package.IFC_DOOR_PANEL_PROPERTIES__PANEL_OPERATION:
			case Ifc2x3tc1Package.IFC_DOOR_PANEL_PROPERTIES__PANEL_WIDTH:
			case Ifc2x3tc1Package.IFC_DOOR_PANEL_PROPERTIES__PANEL_WIDTH_AS_STRING:
			case Ifc2x3tc1Package.IFC_DOOR_PANEL_PROPERTIES__PANEL_POSITION:
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
