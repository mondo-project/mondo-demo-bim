/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcRectangleHollowProfileDef;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcRectangleHollowProfileDef} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcRectangleHollowProfileDefItemProvider extends IfcRectangleProfileDefItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRectangleHollowProfileDefItemProvider(AdapterFactory adapterFactory) {
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

			addWallThicknessPropertyDescriptor(object);
			addWallThicknessAsStringPropertyDescriptor(object);
			addInnerFilletRadiusPropertyDescriptor(object);
			addInnerFilletRadiusAsStringPropertyDescriptor(object);
			addOuterFilletRadiusPropertyDescriptor(object);
			addOuterFilletRadiusAsStringPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_IfcRectangleHollowProfileDef_WallThickness_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcRectangleHollowProfileDef_WallThickness_feature", "_UI_IfcRectangleHollowProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcRectangleHollowProfileDef_WallThickness(),
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
				 getString("_UI_IfcRectangleHollowProfileDef_WallThicknessAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcRectangleHollowProfileDef_WallThicknessAsString_feature", "_UI_IfcRectangleHollowProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcRectangleHollowProfileDef_WallThicknessAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Inner Fillet Radius feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInnerFilletRadiusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcRectangleHollowProfileDef_InnerFilletRadius_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcRectangleHollowProfileDef_InnerFilletRadius_feature", "_UI_IfcRectangleHollowProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcRectangleHollowProfileDef_InnerFilletRadius(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Inner Fillet Radius As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInnerFilletRadiusAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcRectangleHollowProfileDef_InnerFilletRadiusAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcRectangleHollowProfileDef_InnerFilletRadiusAsString_feature", "_UI_IfcRectangleHollowProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcRectangleHollowProfileDef_InnerFilletRadiusAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Outer Fillet Radius feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOuterFilletRadiusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcRectangleHollowProfileDef_OuterFilletRadius_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcRectangleHollowProfileDef_OuterFilletRadius_feature", "_UI_IfcRectangleHollowProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcRectangleHollowProfileDef_OuterFilletRadius(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Outer Fillet Radius As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOuterFilletRadiusAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcRectangleHollowProfileDef_OuterFilletRadiusAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcRectangleHollowProfileDef_OuterFilletRadiusAsString_feature", "_UI_IfcRectangleHollowProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcRectangleHollowProfileDef_OuterFilletRadiusAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcRectangleHollowProfileDef.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcRectangleHollowProfileDef"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IfcRectangleHollowProfileDef)object).getProfileName();
		return label == null || label.length() == 0 ?
			getString("_UI_IfcRectangleHollowProfileDef_type") :
			getString("_UI_IfcRectangleHollowProfileDef_type") + " " + label;
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

		switch (notification.getFeatureID(IfcRectangleHollowProfileDef.class)) {
			case Ifc2x3tc1Package.IFC_RECTANGLE_HOLLOW_PROFILE_DEF__WALL_THICKNESS:
			case Ifc2x3tc1Package.IFC_RECTANGLE_HOLLOW_PROFILE_DEF__WALL_THICKNESS_AS_STRING:
			case Ifc2x3tc1Package.IFC_RECTANGLE_HOLLOW_PROFILE_DEF__INNER_FILLET_RADIUS:
			case Ifc2x3tc1Package.IFC_RECTANGLE_HOLLOW_PROFILE_DEF__INNER_FILLET_RADIUS_AS_STRING:
			case Ifc2x3tc1Package.IFC_RECTANGLE_HOLLOW_PROFILE_DEF__OUTER_FILLET_RADIUS:
			case Ifc2x3tc1Package.IFC_RECTANGLE_HOLLOW_PROFILE_DEF__OUTER_FILLET_RADIUS_AS_STRING:
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
