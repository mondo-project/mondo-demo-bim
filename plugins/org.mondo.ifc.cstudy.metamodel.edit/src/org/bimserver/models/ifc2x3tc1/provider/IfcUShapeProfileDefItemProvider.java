/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcUShapeProfileDef;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcUShapeProfileDef} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcUShapeProfileDefItemProvider extends IfcParameterizedProfileDefItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcUShapeProfileDefItemProvider(AdapterFactory adapterFactory) {
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
			addFlangeSlopePropertyDescriptor(object);
			addFlangeSlopeAsStringPropertyDescriptor(object);
			addCentreOfGravityInXPropertyDescriptor(object);
			addCentreOfGravityInXAsStringPropertyDescriptor(object);
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
				 getString("_UI_IfcUShapeProfileDef_Depth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcUShapeProfileDef_Depth_feature", "_UI_IfcUShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcUShapeProfileDef_Depth(),
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
				 getString("_UI_IfcUShapeProfileDef_DepthAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcUShapeProfileDef_DepthAsString_feature", "_UI_IfcUShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcUShapeProfileDef_DepthAsString(),
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
				 getString("_UI_IfcUShapeProfileDef_FlangeWidth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcUShapeProfileDef_FlangeWidth_feature", "_UI_IfcUShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcUShapeProfileDef_FlangeWidth(),
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
				 getString("_UI_IfcUShapeProfileDef_FlangeWidthAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcUShapeProfileDef_FlangeWidthAsString_feature", "_UI_IfcUShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcUShapeProfileDef_FlangeWidthAsString(),
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
				 getString("_UI_IfcUShapeProfileDef_WebThickness_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcUShapeProfileDef_WebThickness_feature", "_UI_IfcUShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcUShapeProfileDef_WebThickness(),
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
				 getString("_UI_IfcUShapeProfileDef_WebThicknessAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcUShapeProfileDef_WebThicknessAsString_feature", "_UI_IfcUShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcUShapeProfileDef_WebThicknessAsString(),
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
				 getString("_UI_IfcUShapeProfileDef_FlangeThickness_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcUShapeProfileDef_FlangeThickness_feature", "_UI_IfcUShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcUShapeProfileDef_FlangeThickness(),
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
				 getString("_UI_IfcUShapeProfileDef_FlangeThicknessAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcUShapeProfileDef_FlangeThicknessAsString_feature", "_UI_IfcUShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcUShapeProfileDef_FlangeThicknessAsString(),
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
				 getString("_UI_IfcUShapeProfileDef_FilletRadius_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcUShapeProfileDef_FilletRadius_feature", "_UI_IfcUShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcUShapeProfileDef_FilletRadius(),
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
				 getString("_UI_IfcUShapeProfileDef_FilletRadiusAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcUShapeProfileDef_FilletRadiusAsString_feature", "_UI_IfcUShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcUShapeProfileDef_FilletRadiusAsString(),
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
				 getString("_UI_IfcUShapeProfileDef_EdgeRadius_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcUShapeProfileDef_EdgeRadius_feature", "_UI_IfcUShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcUShapeProfileDef_EdgeRadius(),
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
				 getString("_UI_IfcUShapeProfileDef_EdgeRadiusAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcUShapeProfileDef_EdgeRadiusAsString_feature", "_UI_IfcUShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcUShapeProfileDef_EdgeRadiusAsString(),
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
				 getString("_UI_IfcUShapeProfileDef_FlangeSlope_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcUShapeProfileDef_FlangeSlope_feature", "_UI_IfcUShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcUShapeProfileDef_FlangeSlope(),
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
				 getString("_UI_IfcUShapeProfileDef_FlangeSlopeAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcUShapeProfileDef_FlangeSlopeAsString_feature", "_UI_IfcUShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcUShapeProfileDef_FlangeSlopeAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Centre Of Gravity In X feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCentreOfGravityInXPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcUShapeProfileDef_CentreOfGravityInX_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcUShapeProfileDef_CentreOfGravityInX_feature", "_UI_IfcUShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcUShapeProfileDef_CentreOfGravityInX(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Centre Of Gravity In XAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCentreOfGravityInXAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcUShapeProfileDef_CentreOfGravityInXAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcUShapeProfileDef_CentreOfGravityInXAsString_feature", "_UI_IfcUShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcUShapeProfileDef_CentreOfGravityInXAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcUShapeProfileDef.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcUShapeProfileDef"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IfcUShapeProfileDef)object).getProfileName();
		return label == null || label.length() == 0 ?
			getString("_UI_IfcUShapeProfileDef_type") :
			getString("_UI_IfcUShapeProfileDef_type") + " " + label;
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

		switch (notification.getFeatureID(IfcUShapeProfileDef.class)) {
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__DEPTH:
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__DEPTH_AS_STRING:
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__FLANGE_WIDTH:
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__FLANGE_WIDTH_AS_STRING:
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__WEB_THICKNESS:
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__WEB_THICKNESS_AS_STRING:
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__FLANGE_THICKNESS:
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__FLANGE_THICKNESS_AS_STRING:
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__FILLET_RADIUS:
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__FILLET_RADIUS_AS_STRING:
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__EDGE_RADIUS:
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__EDGE_RADIUS_AS_STRING:
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__FLANGE_SLOPE:
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__FLANGE_SLOPE_AS_STRING:
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_X:
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_XAS_STRING:
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
