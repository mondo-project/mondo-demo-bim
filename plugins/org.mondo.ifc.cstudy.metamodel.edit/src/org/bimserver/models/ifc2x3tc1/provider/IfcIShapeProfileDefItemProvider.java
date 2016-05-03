/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcIShapeProfileDef;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcIShapeProfileDef} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcIShapeProfileDefItemProvider extends IfcParameterizedProfileDefItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcIShapeProfileDefItemProvider(AdapterFactory adapterFactory) {
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

			addOverallWidthPropertyDescriptor(object);
			addOverallWidthAsStringPropertyDescriptor(object);
			addOverallDepthPropertyDescriptor(object);
			addOverallDepthAsStringPropertyDescriptor(object);
			addWebThicknessPropertyDescriptor(object);
			addWebThicknessAsStringPropertyDescriptor(object);
			addFlangeThicknessPropertyDescriptor(object);
			addFlangeThicknessAsStringPropertyDescriptor(object);
			addFilletRadiusPropertyDescriptor(object);
			addFilletRadiusAsStringPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Overall Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOverallWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcIShapeProfileDef_OverallWidth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcIShapeProfileDef_OverallWidth_feature", "_UI_IfcIShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcIShapeProfileDef_OverallWidth(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Overall Width As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOverallWidthAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcIShapeProfileDef_OverallWidthAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcIShapeProfileDef_OverallWidthAsString_feature", "_UI_IfcIShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcIShapeProfileDef_OverallWidthAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Overall Depth feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOverallDepthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcIShapeProfileDef_OverallDepth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcIShapeProfileDef_OverallDepth_feature", "_UI_IfcIShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcIShapeProfileDef_OverallDepth(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Overall Depth As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOverallDepthAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcIShapeProfileDef_OverallDepthAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcIShapeProfileDef_OverallDepthAsString_feature", "_UI_IfcIShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcIShapeProfileDef_OverallDepthAsString(),
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
				 getString("_UI_IfcIShapeProfileDef_WebThickness_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcIShapeProfileDef_WebThickness_feature", "_UI_IfcIShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcIShapeProfileDef_WebThickness(),
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
				 getString("_UI_IfcIShapeProfileDef_WebThicknessAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcIShapeProfileDef_WebThicknessAsString_feature", "_UI_IfcIShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcIShapeProfileDef_WebThicknessAsString(),
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
				 getString("_UI_IfcIShapeProfileDef_FlangeThickness_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcIShapeProfileDef_FlangeThickness_feature", "_UI_IfcIShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcIShapeProfileDef_FlangeThickness(),
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
				 getString("_UI_IfcIShapeProfileDef_FlangeThicknessAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcIShapeProfileDef_FlangeThicknessAsString_feature", "_UI_IfcIShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcIShapeProfileDef_FlangeThicknessAsString(),
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
				 getString("_UI_IfcIShapeProfileDef_FilletRadius_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcIShapeProfileDef_FilletRadius_feature", "_UI_IfcIShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcIShapeProfileDef_FilletRadius(),
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
				 getString("_UI_IfcIShapeProfileDef_FilletRadiusAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcIShapeProfileDef_FilletRadiusAsString_feature", "_UI_IfcIShapeProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcIShapeProfileDef_FilletRadiusAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcIShapeProfileDef.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcIShapeProfileDef"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IfcIShapeProfileDef)object).getProfileName();
		return label == null || label.length() == 0 ?
			getString("_UI_IfcIShapeProfileDef_type") :
			getString("_UI_IfcIShapeProfileDef_type") + " " + label;
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

		switch (notification.getFeatureID(IfcIShapeProfileDef.class)) {
			case Ifc2x3tc1Package.IFC_ISHAPE_PROFILE_DEF__OVERALL_WIDTH:
			case Ifc2x3tc1Package.IFC_ISHAPE_PROFILE_DEF__OVERALL_WIDTH_AS_STRING:
			case Ifc2x3tc1Package.IFC_ISHAPE_PROFILE_DEF__OVERALL_DEPTH:
			case Ifc2x3tc1Package.IFC_ISHAPE_PROFILE_DEF__OVERALL_DEPTH_AS_STRING:
			case Ifc2x3tc1Package.IFC_ISHAPE_PROFILE_DEF__WEB_THICKNESS:
			case Ifc2x3tc1Package.IFC_ISHAPE_PROFILE_DEF__WEB_THICKNESS_AS_STRING:
			case Ifc2x3tc1Package.IFC_ISHAPE_PROFILE_DEF__FLANGE_THICKNESS:
			case Ifc2x3tc1Package.IFC_ISHAPE_PROFILE_DEF__FLANGE_THICKNESS_AS_STRING:
			case Ifc2x3tc1Package.IFC_ISHAPE_PROFILE_DEF__FILLET_RADIUS:
			case Ifc2x3tc1Package.IFC_ISHAPE_PROFILE_DEF__FILLET_RADIUS_AS_STRING:
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
