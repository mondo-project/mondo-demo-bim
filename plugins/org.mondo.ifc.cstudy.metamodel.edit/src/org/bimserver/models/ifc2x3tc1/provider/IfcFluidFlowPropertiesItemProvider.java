/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcFluidFlowProperties;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcFluidFlowProperties} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcFluidFlowPropertiesItemProvider extends IfcPropertySetDefinitionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFluidFlowPropertiesItemProvider(AdapterFactory adapterFactory) {
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

			addPropertySourcePropertyDescriptor(object);
			addFlowConditionTimeSeriesPropertyDescriptor(object);
			addVelocityTimeSeriesPropertyDescriptor(object);
			addFlowrateTimeSeriesPropertyDescriptor(object);
			addFluidPropertyDescriptor(object);
			addPressureTimeSeriesPropertyDescriptor(object);
			addUserDefinedPropertySourcePropertyDescriptor(object);
			addTemperatureSingleValuePropertyDescriptor(object);
			addTemperatureSingleValueAsStringPropertyDescriptor(object);
			addWetBulbTemperatureSingleValuePropertyDescriptor(object);
			addWetBulbTemperatureSingleValueAsStringPropertyDescriptor(object);
			addWetBulbTemperatureTimeSeriesPropertyDescriptor(object);
			addTemperatureTimeSeriesPropertyDescriptor(object);
			addFlowrateSingleValuePropertyDescriptor(object);
			addFlowConditionSingleValuePropertyDescriptor(object);
			addFlowConditionSingleValueAsStringPropertyDescriptor(object);
			addVelocitySingleValuePropertyDescriptor(object);
			addVelocitySingleValueAsStringPropertyDescriptor(object);
			addPressureSingleValuePropertyDescriptor(object);
			addPressureSingleValueAsStringPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Property Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPropertySourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcFluidFlowProperties_PropertySource_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcFluidFlowProperties_PropertySource_feature", "_UI_IfcFluidFlowProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcFluidFlowProperties_PropertySource(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Flow Condition Time Series feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFlowConditionTimeSeriesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcFluidFlowProperties_FlowConditionTimeSeries_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcFluidFlowProperties_FlowConditionTimeSeries_feature", "_UI_IfcFluidFlowProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcFluidFlowProperties_FlowConditionTimeSeries(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Velocity Time Series feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVelocityTimeSeriesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcFluidFlowProperties_VelocityTimeSeries_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcFluidFlowProperties_VelocityTimeSeries_feature", "_UI_IfcFluidFlowProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcFluidFlowProperties_VelocityTimeSeries(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Flowrate Time Series feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFlowrateTimeSeriesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcFluidFlowProperties_FlowrateTimeSeries_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcFluidFlowProperties_FlowrateTimeSeries_feature", "_UI_IfcFluidFlowProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcFluidFlowProperties_FlowrateTimeSeries(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fluid feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFluidPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcFluidFlowProperties_Fluid_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcFluidFlowProperties_Fluid_feature", "_UI_IfcFluidFlowProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcFluidFlowProperties_Fluid(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pressure Time Series feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPressureTimeSeriesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcFluidFlowProperties_PressureTimeSeries_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcFluidFlowProperties_PressureTimeSeries_feature", "_UI_IfcFluidFlowProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcFluidFlowProperties_PressureTimeSeries(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the User Defined Property Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUserDefinedPropertySourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcFluidFlowProperties_UserDefinedPropertySource_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcFluidFlowProperties_UserDefinedPropertySource_feature", "_UI_IfcFluidFlowProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcFluidFlowProperties_UserDefinedPropertySource(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Temperature Single Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTemperatureSingleValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcFluidFlowProperties_TemperatureSingleValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcFluidFlowProperties_TemperatureSingleValue_feature", "_UI_IfcFluidFlowProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcFluidFlowProperties_TemperatureSingleValue(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Temperature Single Value As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTemperatureSingleValueAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcFluidFlowProperties_TemperatureSingleValueAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcFluidFlowProperties_TemperatureSingleValueAsString_feature", "_UI_IfcFluidFlowProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcFluidFlowProperties_TemperatureSingleValueAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Wet Bulb Temperature Single Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWetBulbTemperatureSingleValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcFluidFlowProperties_WetBulbTemperatureSingleValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcFluidFlowProperties_WetBulbTemperatureSingleValue_feature", "_UI_IfcFluidFlowProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcFluidFlowProperties_WetBulbTemperatureSingleValue(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Wet Bulb Temperature Single Value As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWetBulbTemperatureSingleValueAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcFluidFlowProperties_WetBulbTemperatureSingleValueAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcFluidFlowProperties_WetBulbTemperatureSingleValueAsString_feature", "_UI_IfcFluidFlowProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcFluidFlowProperties_WetBulbTemperatureSingleValueAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Wet Bulb Temperature Time Series feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWetBulbTemperatureTimeSeriesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcFluidFlowProperties_WetBulbTemperatureTimeSeries_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcFluidFlowProperties_WetBulbTemperatureTimeSeries_feature", "_UI_IfcFluidFlowProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcFluidFlowProperties_WetBulbTemperatureTimeSeries(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Temperature Time Series feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTemperatureTimeSeriesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcFluidFlowProperties_TemperatureTimeSeries_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcFluidFlowProperties_TemperatureTimeSeries_feature", "_UI_IfcFluidFlowProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcFluidFlowProperties_TemperatureTimeSeries(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Flowrate Single Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFlowrateSingleValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcFluidFlowProperties_FlowrateSingleValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcFluidFlowProperties_FlowrateSingleValue_feature", "_UI_IfcFluidFlowProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcFluidFlowProperties_FlowrateSingleValue(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Flow Condition Single Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFlowConditionSingleValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcFluidFlowProperties_FlowConditionSingleValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcFluidFlowProperties_FlowConditionSingleValue_feature", "_UI_IfcFluidFlowProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcFluidFlowProperties_FlowConditionSingleValue(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Flow Condition Single Value As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFlowConditionSingleValueAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcFluidFlowProperties_FlowConditionSingleValueAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcFluidFlowProperties_FlowConditionSingleValueAsString_feature", "_UI_IfcFluidFlowProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcFluidFlowProperties_FlowConditionSingleValueAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Velocity Single Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVelocitySingleValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcFluidFlowProperties_VelocitySingleValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcFluidFlowProperties_VelocitySingleValue_feature", "_UI_IfcFluidFlowProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcFluidFlowProperties_VelocitySingleValue(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Velocity Single Value As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVelocitySingleValueAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcFluidFlowProperties_VelocitySingleValueAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcFluidFlowProperties_VelocitySingleValueAsString_feature", "_UI_IfcFluidFlowProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcFluidFlowProperties_VelocitySingleValueAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pressure Single Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPressureSingleValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcFluidFlowProperties_PressureSingleValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcFluidFlowProperties_PressureSingleValue_feature", "_UI_IfcFluidFlowProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcFluidFlowProperties_PressureSingleValue(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pressure Single Value As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPressureSingleValueAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcFluidFlowProperties_PressureSingleValueAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcFluidFlowProperties_PressureSingleValueAsString_feature", "_UI_IfcFluidFlowProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcFluidFlowProperties_PressureSingleValueAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcFluidFlowProperties.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcFluidFlowProperties"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IfcFluidFlowProperties)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_IfcFluidFlowProperties_type") :
			getString("_UI_IfcFluidFlowProperties_type") + " " + label;
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

		switch (notification.getFeatureID(IfcFluidFlowProperties.class)) {
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__PROPERTY_SOURCE:
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__USER_DEFINED_PROPERTY_SOURCE:
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__TEMPERATURE_SINGLE_VALUE:
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__TEMPERATURE_SINGLE_VALUE_AS_STRING:
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__WET_BULB_TEMPERATURE_SINGLE_VALUE:
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__WET_BULB_TEMPERATURE_SINGLE_VALUE_AS_STRING:
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__FLOW_CONDITION_SINGLE_VALUE:
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__FLOW_CONDITION_SINGLE_VALUE_AS_STRING:
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__VELOCITY_SINGLE_VALUE:
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__VELOCITY_SINGLE_VALUE_AS_STRING:
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__PRESSURE_SINGLE_VALUE:
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__PRESSURE_SINGLE_VALUE_AS_STRING:
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
