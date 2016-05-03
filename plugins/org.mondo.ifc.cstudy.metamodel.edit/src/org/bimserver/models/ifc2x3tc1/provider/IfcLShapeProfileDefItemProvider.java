/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcLShapeProfileDef;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcLShapeProfileDef} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcLShapeProfileDefItemProvider extends IfcParameterizedProfileDefItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLShapeProfileDefItemProvider(AdapterFactory adapterFactory) {
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
			addWidthPropertyDescriptor(object);
			addWidthAsStringPropertyDescriptor(object);
			addThicknessPropertyDescriptor(object);
			addThicknessAsStringPropertyDescriptor(object);
			addFilletRadiusPropertyDescriptor(object);
			addFilletRadiusAsStringPropertyDescriptor(object);
			addEdgeRadiusPropertyDescriptor(object);
			addEdgeRadiusAsStringPropertyDescriptor(object);
			addLegSlopePropertyDescriptor(object);
			addLegSlopeAsStringPropertyDescriptor(object);
			addCentreOfGravityInXPropertyDescriptor(object);
			addCentreOfGravityInXAsStringPropertyDescriptor(object);
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
				 getString("_UI_IfcLShapeProfileDef_Depth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcLShapeProfileDef_Depth_feature", "_UI_IfcLShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_Depth(),
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
				 getString("_UI_IfcLShapeProfileDef_DepthAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcLShapeProfileDef_DepthAsString_feature", "_UI_IfcLShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_DepthAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcLShapeProfileDef_Width_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcLShapeProfileDef_Width_feature", "_UI_IfcLShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_Width(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Width As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWidthAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcLShapeProfileDef_WidthAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcLShapeProfileDef_WidthAsString_feature", "_UI_IfcLShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_WidthAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Thickness feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addThicknessPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcLShapeProfileDef_Thickness_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcLShapeProfileDef_Thickness_feature", "_UI_IfcLShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_Thickness(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Thickness As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addThicknessAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcLShapeProfileDef_ThicknessAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcLShapeProfileDef_ThicknessAsString_feature", "_UI_IfcLShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_ThicknessAsString(),
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
				 getString("_UI_IfcLShapeProfileDef_FilletRadius_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcLShapeProfileDef_FilletRadius_feature", "_UI_IfcLShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_FilletRadius(),
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
				 getString("_UI_IfcLShapeProfileDef_FilletRadiusAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcLShapeProfileDef_FilletRadiusAsString_feature", "_UI_IfcLShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_FilletRadiusAsString(),
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
				 getString("_UI_IfcLShapeProfileDef_EdgeRadius_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcLShapeProfileDef_EdgeRadius_feature", "_UI_IfcLShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_EdgeRadius(),
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
				 getString("_UI_IfcLShapeProfileDef_EdgeRadiusAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcLShapeProfileDef_EdgeRadiusAsString_feature", "_UI_IfcLShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_EdgeRadiusAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Leg Slope feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLegSlopePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcLShapeProfileDef_LegSlope_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcLShapeProfileDef_LegSlope_feature", "_UI_IfcLShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_LegSlope(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Leg Slope As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLegSlopeAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcLShapeProfileDef_LegSlopeAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcLShapeProfileDef_LegSlopeAsString_feature", "_UI_IfcLShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_LegSlopeAsString(),
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
				 getString("_UI_IfcLShapeProfileDef_CentreOfGravityInX_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcLShapeProfileDef_CentreOfGravityInX_feature", "_UI_IfcLShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_CentreOfGravityInX(),
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
				 getString("_UI_IfcLShapeProfileDef_CentreOfGravityInXAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcLShapeProfileDef_CentreOfGravityInXAsString_feature", "_UI_IfcLShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_CentreOfGravityInXAsString(),
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
				 getString("_UI_IfcLShapeProfileDef_CentreOfGravityInY_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcLShapeProfileDef_CentreOfGravityInY_feature", "_UI_IfcLShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_CentreOfGravityInY(),
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
				 getString("_UI_IfcLShapeProfileDef_CentreOfGravityInYAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcLShapeProfileDef_CentreOfGravityInYAsString_feature", "_UI_IfcLShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef_CentreOfGravityInYAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcLShapeProfileDef.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcLShapeProfileDef"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IfcLShapeProfileDef)object).getProfileName();
		return label == null || label.length() == 0 ?
			getString("_UI_IfcLShapeProfileDef_type") :
			getString("_UI_IfcLShapeProfileDef_type") + " " + label;
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

		switch (notification.getFeatureID(IfcLShapeProfileDef.class)) {
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__DEPTH:
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__DEPTH_AS_STRING:
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__WIDTH:
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__WIDTH_AS_STRING:
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__THICKNESS:
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__THICKNESS_AS_STRING:
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__FILLET_RADIUS:
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__FILLET_RADIUS_AS_STRING:
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__EDGE_RADIUS:
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__EDGE_RADIUS_AS_STRING:
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__LEG_SLOPE:
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__LEG_SLOPE_AS_STRING:
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_X:
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_XAS_STRING:
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_Y:
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_YAS_STRING:
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
