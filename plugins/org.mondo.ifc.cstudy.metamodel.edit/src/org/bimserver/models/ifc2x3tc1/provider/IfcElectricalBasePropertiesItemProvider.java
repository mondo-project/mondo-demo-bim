/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcElectricalBaseProperties;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcElectricalBaseProperties} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcElectricalBasePropertiesItemProvider extends IfcEnergyPropertiesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElectricalBasePropertiesItemProvider(AdapterFactory adapterFactory) {
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

			addElectricCurrentTypePropertyDescriptor(object);
			addInputVoltagePropertyDescriptor(object);
			addInputVoltageAsStringPropertyDescriptor(object);
			addInputFrequencyPropertyDescriptor(object);
			addInputFrequencyAsStringPropertyDescriptor(object);
			addFullLoadCurrentPropertyDescriptor(object);
			addFullLoadCurrentAsStringPropertyDescriptor(object);
			addMinimumCircuitCurrentPropertyDescriptor(object);
			addMinimumCircuitCurrentAsStringPropertyDescriptor(object);
			addMaximumPowerInputPropertyDescriptor(object);
			addMaximumPowerInputAsStringPropertyDescriptor(object);
			addRatedPowerInputPropertyDescriptor(object);
			addRatedPowerInputAsStringPropertyDescriptor(object);
			addInputPhasePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Electric Current Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addElectricCurrentTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcElectricalBaseProperties_ElectricCurrentType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcElectricalBaseProperties_ElectricCurrentType_feature", "_UI_IfcElectricalBaseProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcElectricalBaseProperties_ElectricCurrentType(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input Voltage feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInputVoltagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcElectricalBaseProperties_InputVoltage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcElectricalBaseProperties_InputVoltage_feature", "_UI_IfcElectricalBaseProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcElectricalBaseProperties_InputVoltage(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input Voltage As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInputVoltageAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcElectricalBaseProperties_InputVoltageAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcElectricalBaseProperties_InputVoltageAsString_feature", "_UI_IfcElectricalBaseProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcElectricalBaseProperties_InputVoltageAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input Frequency feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInputFrequencyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcElectricalBaseProperties_InputFrequency_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcElectricalBaseProperties_InputFrequency_feature", "_UI_IfcElectricalBaseProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcElectricalBaseProperties_InputFrequency(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input Frequency As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInputFrequencyAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcElectricalBaseProperties_InputFrequencyAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcElectricalBaseProperties_InputFrequencyAsString_feature", "_UI_IfcElectricalBaseProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcElectricalBaseProperties_InputFrequencyAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Full Load Current feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFullLoadCurrentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcElectricalBaseProperties_FullLoadCurrent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcElectricalBaseProperties_FullLoadCurrent_feature", "_UI_IfcElectricalBaseProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcElectricalBaseProperties_FullLoadCurrent(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Full Load Current As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFullLoadCurrentAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcElectricalBaseProperties_FullLoadCurrentAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcElectricalBaseProperties_FullLoadCurrentAsString_feature", "_UI_IfcElectricalBaseProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcElectricalBaseProperties_FullLoadCurrentAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Minimum Circuit Current feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinimumCircuitCurrentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcElectricalBaseProperties_MinimumCircuitCurrent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcElectricalBaseProperties_MinimumCircuitCurrent_feature", "_UI_IfcElectricalBaseProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcElectricalBaseProperties_MinimumCircuitCurrent(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Minimum Circuit Current As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinimumCircuitCurrentAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcElectricalBaseProperties_MinimumCircuitCurrentAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcElectricalBaseProperties_MinimumCircuitCurrentAsString_feature", "_UI_IfcElectricalBaseProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcElectricalBaseProperties_MinimumCircuitCurrentAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Maximum Power Input feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaximumPowerInputPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcElectricalBaseProperties_MaximumPowerInput_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcElectricalBaseProperties_MaximumPowerInput_feature", "_UI_IfcElectricalBaseProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcElectricalBaseProperties_MaximumPowerInput(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Maximum Power Input As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaximumPowerInputAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcElectricalBaseProperties_MaximumPowerInputAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcElectricalBaseProperties_MaximumPowerInputAsString_feature", "_UI_IfcElectricalBaseProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcElectricalBaseProperties_MaximumPowerInputAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rated Power Input feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRatedPowerInputPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcElectricalBaseProperties_RatedPowerInput_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcElectricalBaseProperties_RatedPowerInput_feature", "_UI_IfcElectricalBaseProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcElectricalBaseProperties_RatedPowerInput(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rated Power Input As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRatedPowerInputAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcElectricalBaseProperties_RatedPowerInputAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcElectricalBaseProperties_RatedPowerInputAsString_feature", "_UI_IfcElectricalBaseProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcElectricalBaseProperties_RatedPowerInputAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input Phase feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInputPhasePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcElectricalBaseProperties_InputPhase_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcElectricalBaseProperties_InputPhase_feature", "_UI_IfcElectricalBaseProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcElectricalBaseProperties_InputPhase(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcElectricalBaseProperties.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcElectricalBaseProperties"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IfcElectricalBaseProperties)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_IfcElectricalBaseProperties_type") :
			getString("_UI_IfcElectricalBaseProperties_type") + " " + label;
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

		switch (notification.getFeatureID(IfcElectricalBaseProperties.class)) {
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__ELECTRIC_CURRENT_TYPE:
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__INPUT_VOLTAGE:
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__INPUT_VOLTAGE_AS_STRING:
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__INPUT_FREQUENCY:
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__INPUT_FREQUENCY_AS_STRING:
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__FULL_LOAD_CURRENT:
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__FULL_LOAD_CURRENT_AS_STRING:
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__MINIMUM_CIRCUIT_CURRENT:
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__MINIMUM_CIRCUIT_CURRENT_AS_STRING:
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__MAXIMUM_POWER_INPUT:
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__MAXIMUM_POWER_INPUT_AS_STRING:
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__RATED_POWER_INPUT:
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__RATED_POWER_INPUT_AS_STRING:
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__INPUT_PHASE:
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
