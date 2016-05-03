/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcCShapeProfileDef;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcCShapeProfileDef} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcCShapeProfileDefItemProvider extends IfcParameterizedProfileDefItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCShapeProfileDefItemProvider(AdapterFactory adapterFactory) {
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
			addWallThicknessPropertyDescriptor(object);
			addWallThicknessAsStringPropertyDescriptor(object);
			addGirthPropertyDescriptor(object);
			addGirthAsStringPropertyDescriptor(object);
			addInternalFilletRadiusPropertyDescriptor(object);
			addInternalFilletRadiusAsStringPropertyDescriptor(object);
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
				 getString("_UI_IfcCShapeProfileDef_Depth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCShapeProfileDef_Depth_feature", "_UI_IfcCShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCShapeProfileDef_Depth(),
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
				 getString("_UI_IfcCShapeProfileDef_DepthAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCShapeProfileDef_DepthAsString_feature", "_UI_IfcCShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCShapeProfileDef_DepthAsString(),
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
				 getString("_UI_IfcCShapeProfileDef_Width_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCShapeProfileDef_Width_feature", "_UI_IfcCShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCShapeProfileDef_Width(),
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
				 getString("_UI_IfcCShapeProfileDef_WidthAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCShapeProfileDef_WidthAsString_feature", "_UI_IfcCShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCShapeProfileDef_WidthAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Wall Thickness feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWallThicknessPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcCShapeProfileDef_WallThickness_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCShapeProfileDef_WallThickness_feature", "_UI_IfcCShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCShapeProfileDef_WallThickness(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Wall Thickness As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWallThicknessAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcCShapeProfileDef_WallThicknessAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCShapeProfileDef_WallThicknessAsString_feature", "_UI_IfcCShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCShapeProfileDef_WallThicknessAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Girth feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGirthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcCShapeProfileDef_Girth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCShapeProfileDef_Girth_feature", "_UI_IfcCShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCShapeProfileDef_Girth(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Girth As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGirthAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcCShapeProfileDef_GirthAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCShapeProfileDef_GirthAsString_feature", "_UI_IfcCShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCShapeProfileDef_GirthAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Internal Fillet Radius feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInternalFilletRadiusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcCShapeProfileDef_InternalFilletRadius_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCShapeProfileDef_InternalFilletRadius_feature", "_UI_IfcCShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCShapeProfileDef_InternalFilletRadius(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Internal Fillet Radius As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInternalFilletRadiusAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcCShapeProfileDef_InternalFilletRadiusAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCShapeProfileDef_InternalFilletRadiusAsString_feature", "_UI_IfcCShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCShapeProfileDef_InternalFilletRadiusAsString(),
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
				 getString("_UI_IfcCShapeProfileDef_CentreOfGravityInX_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCShapeProfileDef_CentreOfGravityInX_feature", "_UI_IfcCShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCShapeProfileDef_CentreOfGravityInX(),
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
				 getString("_UI_IfcCShapeProfileDef_CentreOfGravityInXAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCShapeProfileDef_CentreOfGravityInXAsString_feature", "_UI_IfcCShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCShapeProfileDef_CentreOfGravityInXAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcCShapeProfileDef.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcCShapeProfileDef"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IfcCShapeProfileDef)object).getProfileName();
		return label == null || label.length() == 0 ?
			getString("_UI_IfcCShapeProfileDef_type") :
			getString("_UI_IfcCShapeProfileDef_type") + " " + label;
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

		switch (notification.getFeatureID(IfcCShapeProfileDef.class)) {
			case Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__DEPTH:
			case Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__DEPTH_AS_STRING:
			case Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__WIDTH:
			case Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__WIDTH_AS_STRING:
			case Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__WALL_THICKNESS:
			case Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__WALL_THICKNESS_AS_STRING:
			case Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__GIRTH:
			case Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__GIRTH_AS_STRING:
			case Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__INTERNAL_FILLET_RADIUS:
			case Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__INTERNAL_FILLET_RADIUS_AS_STRING:
			case Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_X:
			case Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_XAS_STRING:
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
