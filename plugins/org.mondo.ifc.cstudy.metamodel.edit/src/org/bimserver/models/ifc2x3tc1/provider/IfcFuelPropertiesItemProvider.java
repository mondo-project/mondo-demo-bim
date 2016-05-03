/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcFuelProperties;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcFuelProperties} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcFuelPropertiesItemProvider extends IfcMaterialPropertiesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFuelPropertiesItemProvider(AdapterFactory adapterFactory) {
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

			addCombustionTemperaturePropertyDescriptor(object);
			addCombustionTemperatureAsStringPropertyDescriptor(object);
			addCarbonContentPropertyDescriptor(object);
			addCarbonContentAsStringPropertyDescriptor(object);
			addLowerHeatingValuePropertyDescriptor(object);
			addLowerHeatingValueAsStringPropertyDescriptor(object);
			addHigherHeatingValuePropertyDescriptor(object);
			addHigherHeatingValueAsStringPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Combustion Temperature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCombustionTemperaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcFuelProperties_CombustionTemperature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcFuelProperties_CombustionTemperature_feature", "_UI_IfcFuelProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcFuelProperties_CombustionTemperature(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Combustion Temperature As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCombustionTemperatureAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcFuelProperties_CombustionTemperatureAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcFuelProperties_CombustionTemperatureAsString_feature", "_UI_IfcFuelProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcFuelProperties_CombustionTemperatureAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Carbon Content feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCarbonContentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcFuelProperties_CarbonContent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcFuelProperties_CarbonContent_feature", "_UI_IfcFuelProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcFuelProperties_CarbonContent(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Carbon Content As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCarbonContentAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcFuelProperties_CarbonContentAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcFuelProperties_CarbonContentAsString_feature", "_UI_IfcFuelProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcFuelProperties_CarbonContentAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lower Heating Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLowerHeatingValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcFuelProperties_LowerHeatingValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcFuelProperties_LowerHeatingValue_feature", "_UI_IfcFuelProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcFuelProperties_LowerHeatingValue(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lower Heating Value As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLowerHeatingValueAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcFuelProperties_LowerHeatingValueAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcFuelProperties_LowerHeatingValueAsString_feature", "_UI_IfcFuelProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcFuelProperties_LowerHeatingValueAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Higher Heating Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHigherHeatingValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcFuelProperties_HigherHeatingValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcFuelProperties_HigherHeatingValue_feature", "_UI_IfcFuelProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcFuelProperties_HigherHeatingValue(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Higher Heating Value As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHigherHeatingValueAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcFuelProperties_HigherHeatingValueAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcFuelProperties_HigherHeatingValueAsString_feature", "_UI_IfcFuelProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcFuelProperties_HigherHeatingValueAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcFuelProperties.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcFuelProperties"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		IfcFuelProperties ifcFuelProperties = (IfcFuelProperties)object;
		return getString("_UI_IfcFuelProperties_type") + " " + ifcFuelProperties.getCombustionTemperature();
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

		switch (notification.getFeatureID(IfcFuelProperties.class)) {
			case Ifc2x3tc1Package.IFC_FUEL_PROPERTIES__COMBUSTION_TEMPERATURE:
			case Ifc2x3tc1Package.IFC_FUEL_PROPERTIES__COMBUSTION_TEMPERATURE_AS_STRING:
			case Ifc2x3tc1Package.IFC_FUEL_PROPERTIES__CARBON_CONTENT:
			case Ifc2x3tc1Package.IFC_FUEL_PROPERTIES__CARBON_CONTENT_AS_STRING:
			case Ifc2x3tc1Package.IFC_FUEL_PROPERTIES__LOWER_HEATING_VALUE:
			case Ifc2x3tc1Package.IFC_FUEL_PROPERTIES__LOWER_HEATING_VALUE_AS_STRING:
			case Ifc2x3tc1Package.IFC_FUEL_PROPERTIES__HIGHER_HEATING_VALUE:
			case Ifc2x3tc1Package.IFC_FUEL_PROPERTIES__HIGHER_HEATING_VALUE_AS_STRING:
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
