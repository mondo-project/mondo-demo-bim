/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcTShapeProfileDef;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcTShapeProfileDef} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcTShapeProfileDefItemProvider extends IfcParameterizedProfileDefItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTShapeProfileDefItemProvider(AdapterFactory adapterFactory) {
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
			addFlangeEdgeRadiusPropertyDescriptor(object);
			addFlangeEdgeRadiusAsStringPropertyDescriptor(object);
			addWebEdgeRadiusPropertyDescriptor(object);
			addWebEdgeRadiusAsStringPropertyDescriptor(object);
			addWebSlopePropertyDescriptor(object);
			addWebSlopeAsStringPropertyDescriptor(object);
			addFlangeSlopePropertyDescriptor(object);
			addFlangeSlopeAsStringPropertyDescriptor(object);
			addCentreOfGravityInYPropertyDescriptor(object);
			addCentreOfGravityInYAsStringPropertyDescriptor(object);
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
				 getString("_UI_IfcTShapeProfileDef_Depth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcTShapeProfileDef_Depth_feature", "_UI_IfcTShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcTShapeProfileDef_Depth(),
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
				 getString("_UI_IfcTShapeProfileDef_DepthAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcTShapeProfileDef_DepthAsString_feature", "_UI_IfcTShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcTShapeProfileDef_DepthAsString(),
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
				 getString("_UI_IfcTShapeProfileDef_FlangeWidth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcTShapeProfileDef_FlangeWidth_feature", "_UI_IfcTShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcTShapeProfileDef_FlangeWidth(),
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
				 getString("_UI_IfcTShapeProfileDef_FlangeWidthAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcTShapeProfileDef_FlangeWidthAsString_feature", "_UI_IfcTShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcTShapeProfileDef_FlangeWidthAsString(),
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
				 getString("_UI_IfcTShapeProfileDef_WebThickness_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcTShapeProfileDef_WebThickness_feature", "_UI_IfcTShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcTShapeProfileDef_WebThickness(),
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
				 getString("_UI_IfcTShapeProfileDef_WebThicknessAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcTShapeProfileDef_WebThicknessAsString_feature", "_UI_IfcTShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcTShapeProfileDef_WebThicknessAsString(),
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
				 getString("_UI_IfcTShapeProfileDef_FlangeThickness_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcTShapeProfileDef_FlangeThickness_feature", "_UI_IfcTShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcTShapeProfileDef_FlangeThickness(),
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
				 getString("_UI_IfcTShapeProfileDef_FlangeThicknessAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcTShapeProfileDef_FlangeThicknessAsString_feature", "_UI_IfcTShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcTShapeProfileDef_FlangeThicknessAsString(),
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
				 getString("_UI_IfcTShapeProfileDef_FilletRadius_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcTShapeProfileDef_FilletRadius_feature", "_UI_IfcTShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcTShapeProfileDef_FilletRadius(),
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
				 getString("_UI_IfcTShapeProfileDef_FilletRadiusAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcTShapeProfileDef_FilletRadiusAsString_feature", "_UI_IfcTShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcTShapeProfileDef_FilletRadiusAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Flange Edge Radius feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFlangeEdgeRadiusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcTShapeProfileDef_FlangeEdgeRadius_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcTShapeProfileDef_FlangeEdgeRadius_feature", "_UI_IfcTShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcTShapeProfileDef_FlangeEdgeRadius(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Flange Edge Radius As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFlangeEdgeRadiusAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcTShapeProfileDef_FlangeEdgeRadiusAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcTShapeProfileDef_FlangeEdgeRadiusAsString_feature", "_UI_IfcTShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcTShapeProfileDef_FlangeEdgeRadiusAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Web Edge Radius feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWebEdgeRadiusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcTShapeProfileDef_WebEdgeRadius_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcTShapeProfileDef_WebEdgeRadius_feature", "_UI_IfcTShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcTShapeProfileDef_WebEdgeRadius(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Web Edge Radius As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWebEdgeRadiusAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcTShapeProfileDef_WebEdgeRadiusAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcTShapeProfileDef_WebEdgeRadiusAsString_feature", "_UI_IfcTShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcTShapeProfileDef_WebEdgeRadiusAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Web Slope feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWebSlopePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcTShapeProfileDef_WebSlope_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcTShapeProfileDef_WebSlope_feature", "_UI_IfcTShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcTShapeProfileDef_WebSlope(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Web Slope As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWebSlopeAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcTShapeProfileDef_WebSlopeAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcTShapeProfileDef_WebSlopeAsString_feature", "_UI_IfcTShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcTShapeProfileDef_WebSlopeAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Flange Slope feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFlangeSlopePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcTShapeProfileDef_FlangeSlope_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcTShapeProfileDef_FlangeSlope_feature", "_UI_IfcTShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcTShapeProfileDef_FlangeSlope(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Flange Slope As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFlangeSlopeAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcTShapeProfileDef_FlangeSlopeAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcTShapeProfileDef_FlangeSlopeAsString_feature", "_UI_IfcTShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcTShapeProfileDef_FlangeSlopeAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Centre Of Gravity In Y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCentreOfGravityInYPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcTShapeProfileDef_CentreOfGravityInY_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcTShapeProfileDef_CentreOfGravityInY_feature", "_UI_IfcTShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcTShapeProfileDef_CentreOfGravityInY(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Centre Of Gravity In YAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCentreOfGravityInYAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcTShapeProfileDef_CentreOfGravityInYAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcTShapeProfileDef_CentreOfGravityInYAsString_feature", "_UI_IfcTShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcTShapeProfileDef_CentreOfGravityInYAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcTShapeProfileDef.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcTShapeProfileDef"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IfcTShapeProfileDef)object).getProfileName();
		return label == null || label.length() == 0 ?
			getString("_UI_IfcTShapeProfileDef_type") :
			getString("_UI_IfcTShapeProfileDef_type") + " " + label;
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

		switch (notification.getFeatureID(IfcTShapeProfileDef.class)) {
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__DEPTH:
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__DEPTH_AS_STRING:
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FLANGE_WIDTH:
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FLANGE_WIDTH_AS_STRING:
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__WEB_THICKNESS:
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__WEB_THICKNESS_AS_STRING:
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FLANGE_THICKNESS:
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FLANGE_THICKNESS_AS_STRING:
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FILLET_RADIUS:
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FILLET_RADIUS_AS_STRING:
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FLANGE_EDGE_RADIUS:
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FLANGE_EDGE_RADIUS_AS_STRING:
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__WEB_EDGE_RADIUS:
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__WEB_EDGE_RADIUS_AS_STRING:
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__WEB_SLOPE:
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__WEB_SLOPE_AS_STRING:
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FLANGE_SLOPE:
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FLANGE_SLOPE_AS_STRING:
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_Y:
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_YAS_STRING:
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
