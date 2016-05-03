/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcThermalMaterialProperties;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcThermalMaterialProperties} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcThermalMaterialPropertiesItemProvider extends IfcMaterialPropertiesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcThermalMaterialPropertiesItemProvider(AdapterFactory adapterFactory) {
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

			addSpecificHeatCapacityPropertyDescriptor(object);
			addSpecificHeatCapacityAsStringPropertyDescriptor(object);
			addBoilingPointPropertyDescriptor(object);
			addBoilingPointAsStringPropertyDescriptor(object);
			addFreezingPointPropertyDescriptor(object);
			addFreezingPointAsStringPropertyDescriptor(object);
			addThermalConductivityPropertyDescriptor(object);
			addThermalConductivityAsStringPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Specific Heat Capacity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpecificHeatCapacityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcThermalMaterialProperties_SpecificHeatCapacity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcThermalMaterialProperties_SpecificHeatCapacity_feature", "_UI_IfcThermalMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcThermalMaterialProperties_SpecificHeatCapacity(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Specific Heat Capacity As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpecificHeatCapacityAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcThermalMaterialProperties_SpecificHeatCapacityAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcThermalMaterialProperties_SpecificHeatCapacityAsString_feature", "_UI_IfcThermalMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcThermalMaterialProperties_SpecificHeatCapacityAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Boiling Point feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBoilingPointPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcThermalMaterialProperties_BoilingPoint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcThermalMaterialProperties_BoilingPoint_feature", "_UI_IfcThermalMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcThermalMaterialProperties_BoilingPoint(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Boiling Point As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBoilingPointAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcThermalMaterialProperties_BoilingPointAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcThermalMaterialProperties_BoilingPointAsString_feature", "_UI_IfcThermalMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcThermalMaterialProperties_BoilingPointAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Freezing Point feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFreezingPointPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcThermalMaterialProperties_FreezingPoint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcThermalMaterialProperties_FreezingPoint_feature", "_UI_IfcThermalMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcThermalMaterialProperties_FreezingPoint(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Freezing Point As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFreezingPointAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcThermalMaterialProperties_FreezingPointAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcThermalMaterialProperties_FreezingPointAsString_feature", "_UI_IfcThermalMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcThermalMaterialProperties_FreezingPointAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Thermal Conductivity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addThermalConductivityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcThermalMaterialProperties_ThermalConductivity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcThermalMaterialProperties_ThermalConductivity_feature", "_UI_IfcThermalMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcThermalMaterialProperties_ThermalConductivity(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Thermal Conductivity As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addThermalConductivityAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcThermalMaterialProperties_ThermalConductivityAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcThermalMaterialProperties_ThermalConductivityAsString_feature", "_UI_IfcThermalMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcThermalMaterialProperties_ThermalConductivityAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcThermalMaterialProperties.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcThermalMaterialProperties"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		IfcThermalMaterialProperties ifcThermalMaterialProperties = (IfcThermalMaterialProperties)object;
		return getString("_UI_IfcThermalMaterialProperties_type") + " " + ifcThermalMaterialProperties.getSpecificHeatCapacity();
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

		switch (notification.getFeatureID(IfcThermalMaterialProperties.class)) {
			case Ifc2x3tc1Package.IFC_THERMAL_MATERIAL_PROPERTIES__SPECIFIC_HEAT_CAPACITY:
			case Ifc2x3tc1Package.IFC_THERMAL_MATERIAL_PROPERTIES__SPECIFIC_HEAT_CAPACITY_AS_STRING:
			case Ifc2x3tc1Package.IFC_THERMAL_MATERIAL_PROPERTIES__BOILING_POINT:
			case Ifc2x3tc1Package.IFC_THERMAL_MATERIAL_PROPERTIES__BOILING_POINT_AS_STRING:
			case Ifc2x3tc1Package.IFC_THERMAL_MATERIAL_PROPERTIES__FREEZING_POINT:
			case Ifc2x3tc1Package.IFC_THERMAL_MATERIAL_PROPERTIES__FREEZING_POINT_AS_STRING:
			case Ifc2x3tc1Package.IFC_THERMAL_MATERIAL_PROPERTIES__THERMAL_CONDUCTIVITY:
			case Ifc2x3tc1Package.IFC_THERMAL_MATERIAL_PROPERTIES__THERMAL_CONDUCTIVITY_AS_STRING:
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
