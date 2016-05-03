/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcLightDistributionData;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcLightDistributionData} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcLightDistributionDataItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLightDistributionDataItemProvider(AdapterFactory adapterFactory) {
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

			addMainPlaneAnglePropertyDescriptor(object);
			addMainPlaneAngleAsStringPropertyDescriptor(object);
			addSecondaryPlaneAnglePropertyDescriptor(object);
			addSecondaryPlaneAngleAsStringPropertyDescriptor(object);
			addLuminousIntensityPropertyDescriptor(object);
			addLuminousIntensityAsStringPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Main Plane Angle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMainPlaneAnglePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcLightDistributionData_MainPlaneAngle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcLightDistributionData_MainPlaneAngle_feature", "_UI_IfcLightDistributionData_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcLightDistributionData_MainPlaneAngle(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Main Plane Angle As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMainPlaneAngleAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcLightDistributionData_MainPlaneAngleAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcLightDistributionData_MainPlaneAngleAsString_feature", "_UI_IfcLightDistributionData_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcLightDistributionData_MainPlaneAngleAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Secondary Plane Angle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecondaryPlaneAnglePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcLightDistributionData_SecondaryPlaneAngle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcLightDistributionData_SecondaryPlaneAngle_feature", "_UI_IfcLightDistributionData_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcLightDistributionData_SecondaryPlaneAngle(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Secondary Plane Angle As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecondaryPlaneAngleAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcLightDistributionData_SecondaryPlaneAngleAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcLightDistributionData_SecondaryPlaneAngleAsString_feature", "_UI_IfcLightDistributionData_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcLightDistributionData_SecondaryPlaneAngleAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Luminous Intensity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLuminousIntensityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcLightDistributionData_LuminousIntensity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcLightDistributionData_LuminousIntensity_feature", "_UI_IfcLightDistributionData_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcLightDistributionData_LuminousIntensity(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Luminous Intensity As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLuminousIntensityAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcLightDistributionData_LuminousIntensityAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcLightDistributionData_LuminousIntensityAsString_feature", "_UI_IfcLightDistributionData_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcLightDistributionData_LuminousIntensityAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcLightDistributionData.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcLightDistributionData"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		IfcLightDistributionData ifcLightDistributionData = (IfcLightDistributionData)object;
		return getString("_UI_IfcLightDistributionData_type") + " " + ifcLightDistributionData.getMainPlaneAngle();
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

		switch (notification.getFeatureID(IfcLightDistributionData.class)) {
			case Ifc2x3tc1Package.IFC_LIGHT_DISTRIBUTION_DATA__MAIN_PLANE_ANGLE:
			case Ifc2x3tc1Package.IFC_LIGHT_DISTRIBUTION_DATA__MAIN_PLANE_ANGLE_AS_STRING:
			case Ifc2x3tc1Package.IFC_LIGHT_DISTRIBUTION_DATA__SECONDARY_PLANE_ANGLE:
			case Ifc2x3tc1Package.IFC_LIGHT_DISTRIBUTION_DATA__SECONDARY_PLANE_ANGLE_AS_STRING:
			case Ifc2x3tc1Package.IFC_LIGHT_DISTRIBUTION_DATA__LUMINOUS_INTENSITY:
			case Ifc2x3tc1Package.IFC_LIGHT_DISTRIBUTION_DATA__LUMINOUS_INTENSITY_AS_STRING:
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

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Ifc2x3tc1EditPlugin.INSTANCE;
	}

}
