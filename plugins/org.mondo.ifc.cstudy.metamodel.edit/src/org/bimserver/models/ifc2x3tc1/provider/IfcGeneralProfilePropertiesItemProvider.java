/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcGeneralProfileProperties;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcGeneralProfileProperties} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcGeneralProfilePropertiesItemProvider extends IfcProfilePropertiesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcGeneralProfilePropertiesItemProvider(AdapterFactory adapterFactory) {
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

			addPhysicalWeightPropertyDescriptor(object);
			addPhysicalWeightAsStringPropertyDescriptor(object);
			addPerimeterPropertyDescriptor(object);
			addPerimeterAsStringPropertyDescriptor(object);
			addMinimumPlateThicknessPropertyDescriptor(object);
			addMinimumPlateThicknessAsStringPropertyDescriptor(object);
			addMaximumPlateThicknessPropertyDescriptor(object);
			addMaximumPlateThicknessAsStringPropertyDescriptor(object);
			addCrossSectionAreaPropertyDescriptor(object);
			addCrossSectionAreaAsStringPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Physical Weight feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhysicalWeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcGeneralProfileProperties_PhysicalWeight_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcGeneralProfileProperties_PhysicalWeight_feature", "_UI_IfcGeneralProfileProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcGeneralProfileProperties_PhysicalWeight(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Physical Weight As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhysicalWeightAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcGeneralProfileProperties_PhysicalWeightAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcGeneralProfileProperties_PhysicalWeightAsString_feature", "_UI_IfcGeneralProfileProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcGeneralProfileProperties_PhysicalWeightAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Perimeter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPerimeterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcGeneralProfileProperties_Perimeter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcGeneralProfileProperties_Perimeter_feature", "_UI_IfcGeneralProfileProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcGeneralProfileProperties_Perimeter(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Perimeter As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPerimeterAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcGeneralProfileProperties_PerimeterAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcGeneralProfileProperties_PerimeterAsString_feature", "_UI_IfcGeneralProfileProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcGeneralProfileProperties_PerimeterAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Minimum Plate Thickness feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinimumPlateThicknessPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcGeneralProfileProperties_MinimumPlateThickness_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcGeneralProfileProperties_MinimumPlateThickness_feature", "_UI_IfcGeneralProfileProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcGeneralProfileProperties_MinimumPlateThickness(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Minimum Plate Thickness As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinimumPlateThicknessAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcGeneralProfileProperties_MinimumPlateThicknessAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcGeneralProfileProperties_MinimumPlateThicknessAsString_feature", "_UI_IfcGeneralProfileProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcGeneralProfileProperties_MinimumPlateThicknessAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Maximum Plate Thickness feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaximumPlateThicknessPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcGeneralProfileProperties_MaximumPlateThickness_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcGeneralProfileProperties_MaximumPlateThickness_feature", "_UI_IfcGeneralProfileProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcGeneralProfileProperties_MaximumPlateThickness(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Maximum Plate Thickness As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaximumPlateThicknessAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcGeneralProfileProperties_MaximumPlateThicknessAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcGeneralProfileProperties_MaximumPlateThicknessAsString_feature", "_UI_IfcGeneralProfileProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcGeneralProfileProperties_MaximumPlateThicknessAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cross Section Area feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCrossSectionAreaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcGeneralProfileProperties_CrossSectionArea_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcGeneralProfileProperties_CrossSectionArea_feature", "_UI_IfcGeneralProfileProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcGeneralProfileProperties_CrossSectionArea(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cross Section Area As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCrossSectionAreaAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcGeneralProfileProperties_CrossSectionAreaAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcGeneralProfileProperties_CrossSectionAreaAsString_feature", "_UI_IfcGeneralProfileProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcGeneralProfileProperties_CrossSectionAreaAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcGeneralProfileProperties.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcGeneralProfileProperties"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IfcGeneralProfileProperties)object).getProfileName();
		return label == null || label.length() == 0 ?
			getString("_UI_IfcGeneralProfileProperties_type") :
			getString("_UI_IfcGeneralProfileProperties_type") + " " + label;
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

		switch (notification.getFeatureID(IfcGeneralProfileProperties.class)) {
			case Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__PHYSICAL_WEIGHT:
			case Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__PHYSICAL_WEIGHT_AS_STRING:
			case Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__PERIMETER:
			case Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__PERIMETER_AS_STRING:
			case Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__MINIMUM_PLATE_THICKNESS:
			case Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__MINIMUM_PLATE_THICKNESS_AS_STRING:
			case Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__MAXIMUM_PLATE_THICKNESS:
			case Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__MAXIMUM_PLATE_THICKNESS_AS_STRING:
			case Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__CROSS_SECTION_AREA:
			case Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__CROSS_SECTION_AREA_AS_STRING:
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
