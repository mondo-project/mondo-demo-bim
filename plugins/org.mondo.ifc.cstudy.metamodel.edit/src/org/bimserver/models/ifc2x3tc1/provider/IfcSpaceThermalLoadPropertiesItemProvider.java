/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcSpaceThermalLoadProperties;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcSpaceThermalLoadProperties} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcSpaceThermalLoadPropertiesItemProvider extends IfcPropertySetDefinitionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSpaceThermalLoadPropertiesItemProvider(AdapterFactory adapterFactory) {
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

			addApplicableValueRatioPropertyDescriptor(object);
			addApplicableValueRatioAsStringPropertyDescriptor(object);
			addThermalLoadSourcePropertyDescriptor(object);
			addPropertySourcePropertyDescriptor(object);
			addSourceDescriptionPropertyDescriptor(object);
			addMaximumValuePropertyDescriptor(object);
			addMaximumValueAsStringPropertyDescriptor(object);
			addMinimumValuePropertyDescriptor(object);
			addMinimumValueAsStringPropertyDescriptor(object);
			addThermalLoadTimeSeriesValuesPropertyDescriptor(object);
			addUserDefinedThermalLoadSourcePropertyDescriptor(object);
			addUserDefinedPropertySourcePropertyDescriptor(object);
			addThermalLoadTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Applicable Value Ratio feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addApplicableValueRatioPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcSpaceThermalLoadProperties_ApplicableValueRatio_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcSpaceThermalLoadProperties_ApplicableValueRatio_feature", "_UI_IfcSpaceThermalLoadProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcSpaceThermalLoadProperties_ApplicableValueRatio(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Applicable Value Ratio As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addApplicableValueRatioAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcSpaceThermalLoadProperties_ApplicableValueRatioAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcSpaceThermalLoadProperties_ApplicableValueRatioAsString_feature", "_UI_IfcSpaceThermalLoadProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcSpaceThermalLoadProperties_ApplicableValueRatioAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Thermal Load Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addThermalLoadSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcSpaceThermalLoadProperties_ThermalLoadSource_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcSpaceThermalLoadProperties_ThermalLoadSource_feature", "_UI_IfcSpaceThermalLoadProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcSpaceThermalLoadProperties_ThermalLoadSource(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_IfcSpaceThermalLoadProperties_PropertySource_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcSpaceThermalLoadProperties_PropertySource_feature", "_UI_IfcSpaceThermalLoadProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcSpaceThermalLoadProperties_PropertySource(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcSpaceThermalLoadProperties_SourceDescription_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcSpaceThermalLoadProperties_SourceDescription_feature", "_UI_IfcSpaceThermalLoadProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcSpaceThermalLoadProperties_SourceDescription(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Maximum Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaximumValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcSpaceThermalLoadProperties_MaximumValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcSpaceThermalLoadProperties_MaximumValue_feature", "_UI_IfcSpaceThermalLoadProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcSpaceThermalLoadProperties_MaximumValue(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Maximum Value As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaximumValueAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcSpaceThermalLoadProperties_MaximumValueAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcSpaceThermalLoadProperties_MaximumValueAsString_feature", "_UI_IfcSpaceThermalLoadProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcSpaceThermalLoadProperties_MaximumValueAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Minimum Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinimumValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcSpaceThermalLoadProperties_MinimumValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcSpaceThermalLoadProperties_MinimumValue_feature", "_UI_IfcSpaceThermalLoadProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcSpaceThermalLoadProperties_MinimumValue(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Minimum Value As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinimumValueAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcSpaceThermalLoadProperties_MinimumValueAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcSpaceThermalLoadProperties_MinimumValueAsString_feature", "_UI_IfcSpaceThermalLoadProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcSpaceThermalLoadProperties_MinimumValueAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Thermal Load Time Series Values feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addThermalLoadTimeSeriesValuesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcSpaceThermalLoadProperties_ThermalLoadTimeSeriesValues_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcSpaceThermalLoadProperties_ThermalLoadTimeSeriesValues_feature", "_UI_IfcSpaceThermalLoadProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcSpaceThermalLoadProperties_ThermalLoadTimeSeriesValues(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the User Defined Thermal Load Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUserDefinedThermalLoadSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcSpaceThermalLoadProperties_UserDefinedThermalLoadSource_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcSpaceThermalLoadProperties_UserDefinedThermalLoadSource_feature", "_UI_IfcSpaceThermalLoadProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcSpaceThermalLoadProperties_UserDefinedThermalLoadSource(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_IfcSpaceThermalLoadProperties_UserDefinedPropertySource_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcSpaceThermalLoadProperties_UserDefinedPropertySource_feature", "_UI_IfcSpaceThermalLoadProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcSpaceThermalLoadProperties_UserDefinedPropertySource(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Thermal Load Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addThermalLoadTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcSpaceThermalLoadProperties_ThermalLoadType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcSpaceThermalLoadProperties_ThermalLoadType_feature", "_UI_IfcSpaceThermalLoadProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcSpaceThermalLoadProperties_ThermalLoadType(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcSpaceThermalLoadProperties.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcSpaceThermalLoadProperties"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IfcSpaceThermalLoadProperties)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_IfcSpaceThermalLoadProperties_type") :
			getString("_UI_IfcSpaceThermalLoadProperties_type") + " " + label;
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

		switch (notification.getFeatureID(IfcSpaceThermalLoadProperties.class)) {
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__APPLICABLE_VALUE_RATIO:
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__APPLICABLE_VALUE_RATIO_AS_STRING:
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__THERMAL_LOAD_SOURCE:
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__PROPERTY_SOURCE:
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__SOURCE_DESCRIPTION:
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__MAXIMUM_VALUE:
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__MAXIMUM_VALUE_AS_STRING:
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__MINIMUM_VALUE:
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__MINIMUM_VALUE_AS_STRING:
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__USER_DEFINED_THERMAL_LOAD_SOURCE:
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__USER_DEFINED_PROPERTY_SOURCE:
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__THERMAL_LOAD_TYPE:
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
