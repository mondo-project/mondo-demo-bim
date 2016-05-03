/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcRibPlateProfileProperties;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcRibPlateProfileProperties} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcRibPlateProfilePropertiesItemProvider extends IfcProfilePropertiesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRibPlateProfilePropertiesItemProvider(AdapterFactory adapterFactory) {
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

			addThicknessPropertyDescriptor(object);
			addThicknessAsStringPropertyDescriptor(object);
			addRibHeightPropertyDescriptor(object);
			addRibHeightAsStringPropertyDescriptor(object);
			addRibWidthPropertyDescriptor(object);
			addRibWidthAsStringPropertyDescriptor(object);
			addRibSpacingPropertyDescriptor(object);
			addRibSpacingAsStringPropertyDescriptor(object);
			addDirectionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_IfcRibPlateProfileProperties_Thickness_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcRibPlateProfileProperties_Thickness_feature", "_UI_IfcRibPlateProfileProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcRibPlateProfileProperties_Thickness(),
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
				 getString("_UI_IfcRibPlateProfileProperties_ThicknessAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcRibPlateProfileProperties_ThicknessAsString_feature", "_UI_IfcRibPlateProfileProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcRibPlateProfileProperties_ThicknessAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rib Height feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRibHeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcRibPlateProfileProperties_RibHeight_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcRibPlateProfileProperties_RibHeight_feature", "_UI_IfcRibPlateProfileProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcRibPlateProfileProperties_RibHeight(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rib Height As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRibHeightAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcRibPlateProfileProperties_RibHeightAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcRibPlateProfileProperties_RibHeightAsString_feature", "_UI_IfcRibPlateProfileProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcRibPlateProfileProperties_RibHeightAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rib Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRibWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcRibPlateProfileProperties_RibWidth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcRibPlateProfileProperties_RibWidth_feature", "_UI_IfcRibPlateProfileProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcRibPlateProfileProperties_RibWidth(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rib Width As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRibWidthAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcRibPlateProfileProperties_RibWidthAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcRibPlateProfileProperties_RibWidthAsString_feature", "_UI_IfcRibPlateProfileProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcRibPlateProfileProperties_RibWidthAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rib Spacing feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRibSpacingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcRibPlateProfileProperties_RibSpacing_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcRibPlateProfileProperties_RibSpacing_feature", "_UI_IfcRibPlateProfileProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcRibPlateProfileProperties_RibSpacing(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rib Spacing As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRibSpacingAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcRibPlateProfileProperties_RibSpacingAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcRibPlateProfileProperties_RibSpacingAsString_feature", "_UI_IfcRibPlateProfileProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcRibPlateProfileProperties_RibSpacingAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Direction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDirectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcRibPlateProfileProperties_Direction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcRibPlateProfileProperties_Direction_feature", "_UI_IfcRibPlateProfileProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcRibPlateProfileProperties_Direction(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcRibPlateProfileProperties.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcRibPlateProfileProperties"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IfcRibPlateProfileProperties)object).getProfileName();
		return label == null || label.length() == 0 ?
			getString("_UI_IfcRibPlateProfileProperties_type") :
			getString("_UI_IfcRibPlateProfileProperties_type") + " " + label;
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

		switch (notification.getFeatureID(IfcRibPlateProfileProperties.class)) {
			case Ifc2x3tc1Package.IFC_RIB_PLATE_PROFILE_PROPERTIES__THICKNESS:
			case Ifc2x3tc1Package.IFC_RIB_PLATE_PROFILE_PROPERTIES__THICKNESS_AS_STRING:
			case Ifc2x3tc1Package.IFC_RIB_PLATE_PROFILE_PROPERTIES__RIB_HEIGHT:
			case Ifc2x3tc1Package.IFC_RIB_PLATE_PROFILE_PROPERTIES__RIB_HEIGHT_AS_STRING:
			case Ifc2x3tc1Package.IFC_RIB_PLATE_PROFILE_PROPERTIES__RIB_WIDTH:
			case Ifc2x3tc1Package.IFC_RIB_PLATE_PROFILE_PROPERTIES__RIB_WIDTH_AS_STRING:
			case Ifc2x3tc1Package.IFC_RIB_PLATE_PROFILE_PROPERTIES__RIB_SPACING:
			case Ifc2x3tc1Package.IFC_RIB_PLATE_PROFILE_PROPERTIES__RIB_SPACING_AS_STRING:
			case Ifc2x3tc1Package.IFC_RIB_PLATE_PROFILE_PROPERTIES__DIRECTION:
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
