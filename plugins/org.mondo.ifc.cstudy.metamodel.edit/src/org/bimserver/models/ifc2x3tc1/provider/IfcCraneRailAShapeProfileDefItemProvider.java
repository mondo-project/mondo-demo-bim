/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcCraneRailAShapeProfileDef;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcCraneRailAShapeProfileDef} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcCraneRailAShapeProfileDefItemProvider extends IfcParameterizedProfileDefItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCraneRailAShapeProfileDefItemProvider(AdapterFactory adapterFactory) {
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
			addBaseWidth2PropertyDescriptor(object);
			addBaseWidth2AsStringPropertyDescriptor(object);
			addRadiusPropertyDescriptor(object);
			addRadiusAsStringPropertyDescriptor(object);
			addHeadWidthPropertyDescriptor(object);
			addHeadWidthAsStringPropertyDescriptor(object);
			addHeadDepth2PropertyDescriptor(object);
			addHeadDepth2AsStringPropertyDescriptor(object);
			addHeadDepth3PropertyDescriptor(object);
			addHeadDepth3AsStringPropertyDescriptor(object);
			addWebThicknessPropertyDescriptor(object);
			addWebThicknessAsStringPropertyDescriptor(object);
			addBaseWidth4PropertyDescriptor(object);
			addBaseWidth4AsStringPropertyDescriptor(object);
			addBaseDepth1PropertyDescriptor(object);
			addBaseDepth1AsStringPropertyDescriptor(object);
			addBaseDepth2PropertyDescriptor(object);
			addBaseDepth2AsStringPropertyDescriptor(object);
			addBaseDepth3PropertyDescriptor(object);
			addBaseDepth3AsStringPropertyDescriptor(object);
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
				 getString("_UI_IfcCraneRailAShapeProfileDef_OverallHeight_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCraneRailAShapeProfileDef_OverallHeight_feature", "_UI_IfcCraneRailAShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_OverallHeight(),
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
				 getString("_UI_IfcCraneRailAShapeProfileDef_OverallHeightAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCraneRailAShapeProfileDef_OverallHeightAsString_feature", "_UI_IfcCraneRailAShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_OverallHeightAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Base Width2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBaseWidth2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcCraneRailAShapeProfileDef_BaseWidth2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCraneRailAShapeProfileDef_BaseWidth2_feature", "_UI_IfcCraneRailAShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_BaseWidth2(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Base Width2 As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBaseWidth2AsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcCraneRailAShapeProfileDef_BaseWidth2AsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCraneRailAShapeProfileDef_BaseWidth2AsString_feature", "_UI_IfcCraneRailAShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_BaseWidth2AsString(),
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
				 getString("_UI_IfcCraneRailAShapeProfileDef_Radius_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCraneRailAShapeProfileDef_Radius_feature", "_UI_IfcCraneRailAShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_Radius(),
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
				 getString("_UI_IfcCraneRailAShapeProfileDef_RadiusAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCraneRailAShapeProfileDef_RadiusAsString_feature", "_UI_IfcCraneRailAShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_RadiusAsString(),
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
				 getString("_UI_IfcCraneRailAShapeProfileDef_HeadWidth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCraneRailAShapeProfileDef_HeadWidth_feature", "_UI_IfcCraneRailAShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_HeadWidth(),
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
				 getString("_UI_IfcCraneRailAShapeProfileDef_HeadWidthAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCraneRailAShapeProfileDef_HeadWidthAsString_feature", "_UI_IfcCraneRailAShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_HeadWidthAsString(),
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
				 getString("_UI_IfcCraneRailAShapeProfileDef_HeadDepth2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCraneRailAShapeProfileDef_HeadDepth2_feature", "_UI_IfcCraneRailAShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_HeadDepth2(),
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
				 getString("_UI_IfcCraneRailAShapeProfileDef_HeadDepth2AsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCraneRailAShapeProfileDef_HeadDepth2AsString_feature", "_UI_IfcCraneRailAShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_HeadDepth2AsString(),
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
				 getString("_UI_IfcCraneRailAShapeProfileDef_HeadDepth3_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCraneRailAShapeProfileDef_HeadDepth3_feature", "_UI_IfcCraneRailAShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_HeadDepth3(),
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
				 getString("_UI_IfcCraneRailAShapeProfileDef_HeadDepth3AsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCraneRailAShapeProfileDef_HeadDepth3AsString_feature", "_UI_IfcCraneRailAShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_HeadDepth3AsString(),
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
				 getString("_UI_IfcCraneRailAShapeProfileDef_WebThickness_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCraneRailAShapeProfileDef_WebThickness_feature", "_UI_IfcCraneRailAShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_WebThickness(),
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
				 getString("_UI_IfcCraneRailAShapeProfileDef_WebThicknessAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCraneRailAShapeProfileDef_WebThicknessAsString_feature", "_UI_IfcCraneRailAShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_WebThicknessAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Base Width4 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBaseWidth4PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcCraneRailAShapeProfileDef_BaseWidth4_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCraneRailAShapeProfileDef_BaseWidth4_feature", "_UI_IfcCraneRailAShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_BaseWidth4(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Base Width4 As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBaseWidth4AsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcCraneRailAShapeProfileDef_BaseWidth4AsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCraneRailAShapeProfileDef_BaseWidth4AsString_feature", "_UI_IfcCraneRailAShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_BaseWidth4AsString(),
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
				 getString("_UI_IfcCraneRailAShapeProfileDef_BaseDepth1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCraneRailAShapeProfileDef_BaseDepth1_feature", "_UI_IfcCraneRailAShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_BaseDepth1(),
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
				 getString("_UI_IfcCraneRailAShapeProfileDef_BaseDepth1AsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCraneRailAShapeProfileDef_BaseDepth1AsString_feature", "_UI_IfcCraneRailAShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_BaseDepth1AsString(),
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
				 getString("_UI_IfcCraneRailAShapeProfileDef_BaseDepth2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCraneRailAShapeProfileDef_BaseDepth2_feature", "_UI_IfcCraneRailAShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_BaseDepth2(),
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
				 getString("_UI_IfcCraneRailAShapeProfileDef_BaseDepth2AsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCraneRailAShapeProfileDef_BaseDepth2AsString_feature", "_UI_IfcCraneRailAShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_BaseDepth2AsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Base Depth3 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBaseDepth3PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcCraneRailAShapeProfileDef_BaseDepth3_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCraneRailAShapeProfileDef_BaseDepth3_feature", "_UI_IfcCraneRailAShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_BaseDepth3(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Base Depth3 As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBaseDepth3AsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcCraneRailAShapeProfileDef_BaseDepth3AsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCraneRailAShapeProfileDef_BaseDepth3AsString_feature", "_UI_IfcCraneRailAShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_BaseDepth3AsString(),
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
				 getString("_UI_IfcCraneRailAShapeProfileDef_CentreOfGravityInY_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCraneRailAShapeProfileDef_CentreOfGravityInY_feature", "_UI_IfcCraneRailAShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_CentreOfGravityInY(),
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
				 getString("_UI_IfcCraneRailAShapeProfileDef_CentreOfGravityInYAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCraneRailAShapeProfileDef_CentreOfGravityInYAsString_feature", "_UI_IfcCraneRailAShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_CentreOfGravityInYAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcCraneRailAShapeProfileDef.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcCraneRailAShapeProfileDef"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IfcCraneRailAShapeProfileDef)object).getProfileName();
		return label == null || label.length() == 0 ?
			getString("_UI_IfcCraneRailAShapeProfileDef_type") :
			getString("_UI_IfcCraneRailAShapeProfileDef_type") + " " + label;
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

		switch (notification.getFeatureID(IfcCraneRailAShapeProfileDef.class)) {
			case Ifc2x3tc1Package.IFC_CRANE_RAIL_ASHAPE_PROFILE_DEF__OVERALL_HEIGHT:
			case Ifc2x3tc1Package.IFC_CRANE_RAIL_ASHAPE_PROFILE_DEF__OVERALL_HEIGHT_AS_STRING:
			case Ifc2x3tc1Package.IFC_CRANE_RAIL_ASHAPE_PROFILE_DEF__BASE_WIDTH2:
			case Ifc2x3tc1Package.IFC_CRANE_RAIL_ASHAPE_PROFILE_DEF__BASE_WIDTH2_AS_STRING:
			case Ifc2x3tc1Package.IFC_CRANE_RAIL_ASHAPE_PROFILE_DEF__RADIUS:
			case Ifc2x3tc1Package.IFC_CRANE_RAIL_ASHAPE_PROFILE_DEF__RADIUS_AS_STRING:
			case Ifc2x3tc1Package.IFC_CRANE_RAIL_ASHAPE_PROFILE_DEF__HEAD_WIDTH:
			case Ifc2x3tc1Package.IFC_CRANE_RAIL_ASHAPE_PROFILE_DEF__HEAD_WIDTH_AS_STRING:
			case Ifc2x3tc1Package.IFC_CRANE_RAIL_ASHAPE_PROFILE_DEF__HEAD_DEPTH2:
			case Ifc2x3tc1Package.IFC_CRANE_RAIL_ASHAPE_PROFILE_DEF__HEAD_DEPTH2_AS_STRING:
			case Ifc2x3tc1Package.IFC_CRANE_RAIL_ASHAPE_PROFILE_DEF__HEAD_DEPTH3:
			case Ifc2x3tc1Package.IFC_CRANE_RAIL_ASHAPE_PROFILE_DEF__HEAD_DEPTH3_AS_STRING:
			case Ifc2x3tc1Package.IFC_CRANE_RAIL_ASHAPE_PROFILE_DEF__WEB_THICKNESS:
			case Ifc2x3tc1Package.IFC_CRANE_RAIL_ASHAPE_PROFILE_DEF__WEB_THICKNESS_AS_STRING:
			case Ifc2x3tc1Package.IFC_CRANE_RAIL_ASHAPE_PROFILE_DEF__BASE_WIDTH4:
			case Ifc2x3tc1Package.IFC_CRANE_RAIL_ASHAPE_PROFILE_DEF__BASE_WIDTH4_AS_STRING:
			case Ifc2x3tc1Package.IFC_CRANE_RAIL_ASHAPE_PROFILE_DEF__BASE_DEPTH1:
			case Ifc2x3tc1Package.IFC_CRANE_RAIL_ASHAPE_PROFILE_DEF__BASE_DEPTH1_AS_STRING:
			case Ifc2x3tc1Package.IFC_CRANE_RAIL_ASHAPE_PROFILE_DEF__BASE_DEPTH2:
			case Ifc2x3tc1Package.IFC_CRANE_RAIL_ASHAPE_PROFILE_DEF__BASE_DEPTH2_AS_STRING:
			case Ifc2x3tc1Package.IFC_CRANE_RAIL_ASHAPE_PROFILE_DEF__BASE_DEPTH3:
			case Ifc2x3tc1Package.IFC_CRANE_RAIL_ASHAPE_PROFILE_DEF__BASE_DEPTH3_AS_STRING:
			case Ifc2x3tc1Package.IFC_CRANE_RAIL_ASHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_Y:
			case Ifc2x3tc1Package.IFC_CRANE_RAIL_ASHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_YAS_STRING:
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
