/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcZShapeProfileDef;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcZShapeProfileDef} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcZShapeProfileDefItemProvider extends IfcParameterizedProfileDefItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcZShapeProfileDefItemProvider(AdapterFactory adapterFactory) {
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

			addDepthPropertyDescriptor(object);
			addDepthAsStringPropertyDescriptor(object);
			addFlangeWidthPropertyDescriptor(object);
			addFlangeWidthAsStringPropertyDescriptor(object);
			addWebThicknessPropertyDescriptor(object);
			addWebThicknessAsStringPropertyDescriptor(object);
			addFlangeThicknessPropertyDescriptor(object);
			addFlangeThicknessAsStringPropertyDescriptor(object);
			addFilletRadiusPropertyDescriptor(object);
			addFilletRadiusAsStringPropertyDescriptor(object);
			addEdgeRadiusPropertyDescriptor(object);
			addEdgeRadiusAsStringPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Depth feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDepthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcZShapeProfileDef_Depth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcZShapeProfileDef_Depth_feature", "_UI_IfcZShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcZShapeProfileDef_Depth(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Depth As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDepthAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcZShapeProfileDef_DepthAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcZShapeProfileDef_DepthAsString_feature", "_UI_IfcZShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcZShapeProfileDef_DepthAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Flange Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFlangeWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcZShapeProfileDef_FlangeWidth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcZShapeProfileDef_FlangeWidth_feature", "_UI_IfcZShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcZShapeProfileDef_FlangeWidth(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Flange Width As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFlangeWidthAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcZShapeProfileDef_FlangeWidthAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcZShapeProfileDef_FlangeWidthAsString_feature", "_UI_IfcZShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcZShapeProfileDef_FlangeWidthAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Web Thickness feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWebThicknessPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcZShapeProfileDef_WebThickness_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcZShapeProfileDef_WebThickness_feature", "_UI_IfcZShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcZShapeProfileDef_WebThickness(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Web Thickness As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWebThicknessAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcZShapeProfileDef_WebThicknessAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcZShapeProfileDef_WebThicknessAsString_feature", "_UI_IfcZShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcZShapeProfileDef_WebThicknessAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Flange Thickness feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFlangeThicknessPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcZShapeProfileDef_FlangeThickness_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcZShapeProfileDef_FlangeThickness_feature", "_UI_IfcZShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcZShapeProfileDef_FlangeThickness(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Flange Thickness As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFlangeThicknessAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcZShapeProfileDef_FlangeThicknessAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcZShapeProfileDef_FlangeThicknessAsString_feature", "_UI_IfcZShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcZShapeProfileDef_FlangeThicknessAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fillet Radius feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFilletRadiusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcZShapeProfileDef_FilletRadius_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcZShapeProfileDef_FilletRadius_feature", "_UI_IfcZShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcZShapeProfileDef_FilletRadius(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fillet Radius As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFilletRadiusAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcZShapeProfileDef_FilletRadiusAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcZShapeProfileDef_FilletRadiusAsString_feature", "_UI_IfcZShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcZShapeProfileDef_FilletRadiusAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Edge Radius feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEdgeRadiusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcZShapeProfileDef_EdgeRadius_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcZShapeProfileDef_EdgeRadius_feature", "_UI_IfcZShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcZShapeProfileDef_EdgeRadius(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Edge Radius As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEdgeRadiusAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcZShapeProfileDef_EdgeRadiusAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcZShapeProfileDef_EdgeRadiusAsString_feature", "_UI_IfcZShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcZShapeProfileDef_EdgeRadiusAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcZShapeProfileDef.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcZShapeProfileDef"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IfcZShapeProfileDef)object).getProfileName();
		return label == null || label.length() == 0 ?
			getString("_UI_IfcZShapeProfileDef_type") :
			getString("_UI_IfcZShapeProfileDef_type") + " " + label;
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

		switch (notification.getFeatureID(IfcZShapeProfileDef.class)) {
			case Ifc2x3tc1Package.IFC_ZSHAPE_PROFILE_DEF__DEPTH:
			case Ifc2x3tc1Package.IFC_ZSHAPE_PROFILE_DEF__DEPTH_AS_STRING:
			case Ifc2x3tc1Package.IFC_ZSHAPE_PROFILE_DEF__FLANGE_WIDTH:
			case Ifc2x3tc1Package.IFC_ZSHAPE_PROFILE_DEF__FLANGE_WIDTH_AS_STRING:
			case Ifc2x3tc1Package.IFC_ZSHAPE_PROFILE_DEF__WEB_THICKNESS:
			case Ifc2x3tc1Package.IFC_ZSHAPE_PROFILE_DEF__WEB_THICKNESS_AS_STRING:
			case Ifc2x3tc1Package.IFC_ZSHAPE_PROFILE_DEF__FLANGE_THICKNESS:
			case Ifc2x3tc1Package.IFC_ZSHAPE_PROFILE_DEF__FLANGE_THICKNESS_AS_STRING:
			case Ifc2x3tc1Package.IFC_ZSHAPE_PROFILE_DEF__FILLET_RADIUS:
			case Ifc2x3tc1Package.IFC_ZSHAPE_PROFILE_DEF__FILLET_RADIUS_AS_STRING:
			case Ifc2x3tc1Package.IFC_ZSHAPE_PROFILE_DEF__EDGE_RADIUS:
			case Ifc2x3tc1Package.IFC_ZSHAPE_PROFILE_DEF__EDGE_RADIUS_AS_STRING:
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
