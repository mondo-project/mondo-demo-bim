/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcAsymmetricIShapeProfileDef;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcAsymmetricIShapeProfileDef} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcAsymmetricIShapeProfileDefItemProvider extends IfcIShapeProfileDefItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAsymmetricIShapeProfileDefItemProvider(AdapterFactory adapterFactory) {
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

			addTopFlangeWidthPropertyDescriptor(object);
			addTopFlangeWidthAsStringPropertyDescriptor(object);
			addTopFlangeThicknessPropertyDescriptor(object);
			addTopFlangeThicknessAsStringPropertyDescriptor(object);
			addTopFlangeFilletRadiusPropertyDescriptor(object);
			addTopFlangeFilletRadiusAsStringPropertyDescriptor(object);
			addCentreOfGravityInYPropertyDescriptor(object);
			addCentreOfGravityInYAsStringPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Top Flange Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTopFlangeWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcAsymmetricIShapeProfileDef_TopFlangeWidth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcAsymmetricIShapeProfileDef_TopFlangeWidth_feature", "_UI_IfcAsymmetricIShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcAsymmetricIShapeProfileDef_TopFlangeWidth(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Top Flange Width As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTopFlangeWidthAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcAsymmetricIShapeProfileDef_TopFlangeWidthAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcAsymmetricIShapeProfileDef_TopFlangeWidthAsString_feature", "_UI_IfcAsymmetricIShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcAsymmetricIShapeProfileDef_TopFlangeWidthAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Top Flange Thickness feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTopFlangeThicknessPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcAsymmetricIShapeProfileDef_TopFlangeThickness_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcAsymmetricIShapeProfileDef_TopFlangeThickness_feature", "_UI_IfcAsymmetricIShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcAsymmetricIShapeProfileDef_TopFlangeThickness(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Top Flange Thickness As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTopFlangeThicknessAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcAsymmetricIShapeProfileDef_TopFlangeThicknessAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcAsymmetricIShapeProfileDef_TopFlangeThicknessAsString_feature", "_UI_IfcAsymmetricIShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcAsymmetricIShapeProfileDef_TopFlangeThicknessAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Top Flange Fillet Radius feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTopFlangeFilletRadiusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcAsymmetricIShapeProfileDef_TopFlangeFilletRadius_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcAsymmetricIShapeProfileDef_TopFlangeFilletRadius_feature", "_UI_IfcAsymmetricIShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcAsymmetricIShapeProfileDef_TopFlangeFilletRadius(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Top Flange Fillet Radius As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTopFlangeFilletRadiusAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcAsymmetricIShapeProfileDef_TopFlangeFilletRadiusAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcAsymmetricIShapeProfileDef_TopFlangeFilletRadiusAsString_feature", "_UI_IfcAsymmetricIShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcAsymmetricIShapeProfileDef_TopFlangeFilletRadiusAsString(),
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
				 getString("_UI_IfcAsymmetricIShapeProfileDef_CentreOfGravityInY_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcAsymmetricIShapeProfileDef_CentreOfGravityInY_feature", "_UI_IfcAsymmetricIShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcAsymmetricIShapeProfileDef_CentreOfGravityInY(),
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
				 getString("_UI_IfcAsymmetricIShapeProfileDef_CentreOfGravityInYAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcAsymmetricIShapeProfileDef_CentreOfGravityInYAsString_feature", "_UI_IfcAsymmetricIShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcAsymmetricIShapeProfileDef_CentreOfGravityInYAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcAsymmetricIShapeProfileDef.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcAsymmetricIShapeProfileDef"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IfcAsymmetricIShapeProfileDef)object).getProfileName();
		return label == null || label.length() == 0 ?
			getString("_UI_IfcAsymmetricIShapeProfileDef_type") :
			getString("_UI_IfcAsymmetricIShapeProfileDef_type") + " " + label;
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

		switch (notification.getFeatureID(IfcAsymmetricIShapeProfileDef.class)) {
			case Ifc2x3tc1Package.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__TOP_FLANGE_WIDTH:
			case Ifc2x3tc1Package.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__TOP_FLANGE_WIDTH_AS_STRING:
			case Ifc2x3tc1Package.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__TOP_FLANGE_THICKNESS:
			case Ifc2x3tc1Package.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__TOP_FLANGE_THICKNESS_AS_STRING:
			case Ifc2x3tc1Package.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__TOP_FLANGE_FILLET_RADIUS:
			case Ifc2x3tc1Package.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__TOP_FLANGE_FILLET_RADIUS_AS_STRING:
			case Ifc2x3tc1Package.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_Y:
			case Ifc2x3tc1Package.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_YAS_STRING:
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
