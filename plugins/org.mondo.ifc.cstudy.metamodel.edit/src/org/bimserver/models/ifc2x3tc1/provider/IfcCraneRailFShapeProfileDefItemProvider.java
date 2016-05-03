/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcCraneRailFShapeProfileDef;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcCraneRailFShapeProfileDef} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcCraneRailFShapeProfileDefItemProvider extends IfcParameterizedProfileDefItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCraneRailFShapeProfileDefItemProvider(AdapterFactory adapterFactory) {
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

			addOverallHeightPropertyDescriptor(object);
			addOverallHeightAsStringPropertyDescriptor(object);
			addHeadWidthPropertyDescriptor(object);
			addHeadWidthAsStringPropertyDescriptor(object);
			addRadiusPropertyDescriptor(object);
			addRadiusAsStringPropertyDescriptor(object);
			addHeadDepth2PropertyDescriptor(object);
			addHeadDepth2AsStringPropertyDescriptor(object);
			addHeadDepth3PropertyDescriptor(object);
			addHeadDepth3AsStringPropertyDescriptor(object);
			addWebThicknessPropertyDescriptor(object);
			addWebThicknessAsStringPropertyDescriptor(object);
			addBaseDepth1PropertyDescriptor(object);
			addBaseDepth1AsStringPropertyDescriptor(object);
			addBaseDepth2PropertyDescriptor(object);
			addBaseDepth2AsStringPropertyDescriptor(object);
			addCentreOfGravityInYPropertyDescriptor(object);
			addCentreOfGravityInYAsStringPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Overall Height feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOverallHeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcCraneRailFShapeProfileDef_OverallHeight_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCraneRailFShapeProfileDef_OverallHeight_feature", "_UI_IfcCraneRailFShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailFShapeProfileDef_OverallHeight(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Overall Height As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOverallHeightAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcCraneRailFShapeProfileDef_OverallHeightAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCraneRailFShapeProfileDef_OverallHeightAsString_feature", "_UI_IfcCraneRailFShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailFShapeProfileDef_OverallHeightAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Head Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeadWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcCraneRailFShapeProfileDef_HeadWidth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCraneRailFShapeProfileDef_HeadWidth_feature", "_UI_IfcCraneRailFShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailFShapeProfileDef_HeadWidth(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Head Width As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeadWidthAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcCraneRailFShapeProfileDef_HeadWidthAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCraneRailFShapeProfileDef_HeadWidthAsString_feature", "_UI_IfcCraneRailFShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailFShapeProfileDef_HeadWidthAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Radius feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRadiusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcCraneRailFShapeProfileDef_Radius_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCraneRailFShapeProfileDef_Radius_feature", "_UI_IfcCraneRailFShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailFShapeProfileDef_Radius(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Radius As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRadiusAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcCraneRailFShapeProfileDef_RadiusAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCraneRailFShapeProfileDef_RadiusAsString_feature", "_UI_IfcCraneRailFShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailFShapeProfileDef_RadiusAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Head Depth2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeadDepth2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcCraneRailFShapeProfileDef_HeadDepth2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCraneRailFShapeProfileDef_HeadDepth2_feature", "_UI_IfcCraneRailFShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailFShapeProfileDef_HeadDepth2(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Head Depth2 As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeadDepth2AsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcCraneRailFShapeProfileDef_HeadDepth2AsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCraneRailFShapeProfileDef_HeadDepth2AsString_feature", "_UI_IfcCraneRailFShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailFShapeProfileDef_HeadDepth2AsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Head Depth3 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeadDepth3PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcCraneRailFShapeProfileDef_HeadDepth3_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCraneRailFShapeProfileDef_HeadDepth3_feature", "_UI_IfcCraneRailFShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailFShapeProfileDef_HeadDepth3(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Head Depth3 As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeadDepth3AsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcCraneRailFShapeProfileDef_HeadDepth3AsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCraneRailFShapeProfileDef_HeadDepth3AsString_feature", "_UI_IfcCraneRailFShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailFShapeProfileDef_HeadDepth3AsString(),
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
				 getString("_UI_IfcCraneRailFShapeProfileDef_WebThickness_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCraneRailFShapeProfileDef_WebThickness_feature", "_UI_IfcCraneRailFShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailFShapeProfileDef_WebThickness(),
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
				 getString("_UI_IfcCraneRailFShapeProfileDef_WebThicknessAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCraneRailFShapeProfileDef_WebThicknessAsString_feature", "_UI_IfcCraneRailFShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailFShapeProfileDef_WebThicknessAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Base Depth1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBaseDepth1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcCraneRailFShapeProfileDef_BaseDepth1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCraneRailFShapeProfileDef_BaseDepth1_feature", "_UI_IfcCraneRailFShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailFShapeProfileDef_BaseDepth1(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Base Depth1 As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBaseDepth1AsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcCraneRailFShapeProfileDef_BaseDepth1AsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCraneRailFShapeProfileDef_BaseDepth1AsString_feature", "_UI_IfcCraneRailFShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailFShapeProfileDef_BaseDepth1AsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Base Depth2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBaseDepth2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcCraneRailFShapeProfileDef_BaseDepth2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCraneRailFShapeProfileDef_BaseDepth2_feature", "_UI_IfcCraneRailFShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailFShapeProfileDef_BaseDepth2(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Base Depth2 As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBaseDepth2AsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcCraneRailFShapeProfileDef_BaseDepth2AsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCraneRailFShapeProfileDef_BaseDepth2AsString_feature", "_UI_IfcCraneRailFShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailFShapeProfileDef_BaseDepth2AsString(),
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
				 getString("_UI_IfcCraneRailFShapeProfileDef_CentreOfGravityInY_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCraneRailFShapeProfileDef_CentreOfGravityInY_feature", "_UI_IfcCraneRailFShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailFShapeProfileDef_CentreOfGravityInY(),
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
				 getString("_UI_IfcCraneRailFShapeProfileDef_CentreOfGravityInYAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCraneRailFShapeProfileDef_CentreOfGravityInYAsString_feature", "_UI_IfcCraneRailFShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailFShapeProfileDef_CentreOfGravityInYAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcCraneRailFShapeProfileDef.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcCraneRailFShapeProfileDef"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IfcCraneRailFShapeProfileDef)object).getProfileName();
		return label == null || label.length() == 0 ?
			getString("_UI_IfcCraneRailFShapeProfileDef_type") :
			getString("_UI_IfcCraneRailFShapeProfileDef_type") + " " + label;
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

		switch (notification.getFeatureID(IfcCraneRailFShapeProfileDef.class)) {
			case Ifc2x3tc1Package.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF__OVERALL_HEIGHT:
			case Ifc2x3tc1Package.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF__OVERALL_HEIGHT_AS_STRING:
			case Ifc2x3tc1Package.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF__HEAD_WIDTH:
			case Ifc2x3tc1Package.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF__HEAD_WIDTH_AS_STRING:
			case Ifc2x3tc1Package.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF__RADIUS:
			case Ifc2x3tc1Package.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF__RADIUS_AS_STRING:
			case Ifc2x3tc1Package.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF__HEAD_DEPTH2:
			case Ifc2x3tc1Package.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF__HEAD_DEPTH2_AS_STRING:
			case Ifc2x3tc1Package.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF__HEAD_DEPTH3:
			case Ifc2x3tc1Package.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF__HEAD_DEPTH3_AS_STRING:
			case Ifc2x3tc1Package.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF__WEB_THICKNESS:
			case Ifc2x3tc1Package.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF__WEB_THICKNESS_AS_STRING:
			case Ifc2x3tc1Package.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF__BASE_DEPTH1:
			case Ifc2x3tc1Package.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF__BASE_DEPTH1_AS_STRING:
			case Ifc2x3tc1Package.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF__BASE_DEPTH2:
			case Ifc2x3tc1Package.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF__BASE_DEPTH2_AS_STRING:
			case Ifc2x3tc1Package.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_Y:
			case Ifc2x3tc1Package.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_YAS_STRING:
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
