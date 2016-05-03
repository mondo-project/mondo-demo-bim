/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcOpticalMaterialProperties;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcOpticalMaterialProperties} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcOpticalMaterialPropertiesItemProvider extends IfcMaterialPropertiesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcOpticalMaterialPropertiesItemProvider(AdapterFactory adapterFactory) {
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

			addVisibleTransmittancePropertyDescriptor(object);
			addVisibleTransmittanceAsStringPropertyDescriptor(object);
			addSolarTransmittancePropertyDescriptor(object);
			addSolarTransmittanceAsStringPropertyDescriptor(object);
			addThermalIrTransmittancePropertyDescriptor(object);
			addThermalIrTransmittanceAsStringPropertyDescriptor(object);
			addThermalIrEmissivityBackPropertyDescriptor(object);
			addThermalIrEmissivityBackAsStringPropertyDescriptor(object);
			addThermalIrEmissivityFrontPropertyDescriptor(object);
			addThermalIrEmissivityFrontAsStringPropertyDescriptor(object);
			addVisibleReflectanceBackPropertyDescriptor(object);
			addVisibleReflectanceBackAsStringPropertyDescriptor(object);
			addVisibleReflectanceFrontPropertyDescriptor(object);
			addVisibleReflectanceFrontAsStringPropertyDescriptor(object);
			addSolarReflectanceFrontPropertyDescriptor(object);
			addSolarReflectanceFrontAsStringPropertyDescriptor(object);
			addSolarReflectanceBackPropertyDescriptor(object);
			addSolarReflectanceBackAsStringPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Visible Transmittance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVisibleTransmittancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcOpticalMaterialProperties_VisibleTransmittance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcOpticalMaterialProperties_VisibleTransmittance_feature", "_UI_IfcOpticalMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_VisibleTransmittance(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Visible Transmittance As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVisibleTransmittanceAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcOpticalMaterialProperties_VisibleTransmittanceAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcOpticalMaterialProperties_VisibleTransmittanceAsString_feature", "_UI_IfcOpticalMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_VisibleTransmittanceAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Solar Transmittance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSolarTransmittancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcOpticalMaterialProperties_SolarTransmittance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcOpticalMaterialProperties_SolarTransmittance_feature", "_UI_IfcOpticalMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_SolarTransmittance(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Solar Transmittance As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSolarTransmittanceAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcOpticalMaterialProperties_SolarTransmittanceAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcOpticalMaterialProperties_SolarTransmittanceAsString_feature", "_UI_IfcOpticalMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_SolarTransmittanceAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Thermal Ir Transmittance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addThermalIrTransmittancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcOpticalMaterialProperties_ThermalIrTransmittance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcOpticalMaterialProperties_ThermalIrTransmittance_feature", "_UI_IfcOpticalMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_ThermalIrTransmittance(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Thermal Ir Transmittance As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addThermalIrTransmittanceAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcOpticalMaterialProperties_ThermalIrTransmittanceAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcOpticalMaterialProperties_ThermalIrTransmittanceAsString_feature", "_UI_IfcOpticalMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_ThermalIrTransmittanceAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Thermal Ir Emissivity Back feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addThermalIrEmissivityBackPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcOpticalMaterialProperties_ThermalIrEmissivityBack_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcOpticalMaterialProperties_ThermalIrEmissivityBack_feature", "_UI_IfcOpticalMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_ThermalIrEmissivityBack(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Thermal Ir Emissivity Back As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addThermalIrEmissivityBackAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcOpticalMaterialProperties_ThermalIrEmissivityBackAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcOpticalMaterialProperties_ThermalIrEmissivityBackAsString_feature", "_UI_IfcOpticalMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_ThermalIrEmissivityBackAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Thermal Ir Emissivity Front feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addThermalIrEmissivityFrontPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcOpticalMaterialProperties_ThermalIrEmissivityFront_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcOpticalMaterialProperties_ThermalIrEmissivityFront_feature", "_UI_IfcOpticalMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_ThermalIrEmissivityFront(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Thermal Ir Emissivity Front As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addThermalIrEmissivityFrontAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcOpticalMaterialProperties_ThermalIrEmissivityFrontAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcOpticalMaterialProperties_ThermalIrEmissivityFrontAsString_feature", "_UI_IfcOpticalMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_ThermalIrEmissivityFrontAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Visible Reflectance Back feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVisibleReflectanceBackPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcOpticalMaterialProperties_VisibleReflectanceBack_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcOpticalMaterialProperties_VisibleReflectanceBack_feature", "_UI_IfcOpticalMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_VisibleReflectanceBack(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Visible Reflectance Back As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVisibleReflectanceBackAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcOpticalMaterialProperties_VisibleReflectanceBackAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcOpticalMaterialProperties_VisibleReflectanceBackAsString_feature", "_UI_IfcOpticalMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_VisibleReflectanceBackAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Visible Reflectance Front feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVisibleReflectanceFrontPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcOpticalMaterialProperties_VisibleReflectanceFront_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcOpticalMaterialProperties_VisibleReflectanceFront_feature", "_UI_IfcOpticalMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_VisibleReflectanceFront(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Visible Reflectance Front As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVisibleReflectanceFrontAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcOpticalMaterialProperties_VisibleReflectanceFrontAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcOpticalMaterialProperties_VisibleReflectanceFrontAsString_feature", "_UI_IfcOpticalMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_VisibleReflectanceFrontAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Solar Reflectance Front feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSolarReflectanceFrontPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcOpticalMaterialProperties_SolarReflectanceFront_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcOpticalMaterialProperties_SolarReflectanceFront_feature", "_UI_IfcOpticalMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_SolarReflectanceFront(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Solar Reflectance Front As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSolarReflectanceFrontAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcOpticalMaterialProperties_SolarReflectanceFrontAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcOpticalMaterialProperties_SolarReflectanceFrontAsString_feature", "_UI_IfcOpticalMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_SolarReflectanceFrontAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Solar Reflectance Back feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSolarReflectanceBackPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcOpticalMaterialProperties_SolarReflectanceBack_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcOpticalMaterialProperties_SolarReflectanceBack_feature", "_UI_IfcOpticalMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_SolarReflectanceBack(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Solar Reflectance Back As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSolarReflectanceBackAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcOpticalMaterialProperties_SolarReflectanceBackAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcOpticalMaterialProperties_SolarReflectanceBackAsString_feature", "_UI_IfcOpticalMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties_SolarReflectanceBackAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcOpticalMaterialProperties.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcOpticalMaterialProperties"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		IfcOpticalMaterialProperties ifcOpticalMaterialProperties = (IfcOpticalMaterialProperties)object;
		return getString("_UI_IfcOpticalMaterialProperties_type") + " " + ifcOpticalMaterialProperties.getVisibleTransmittance();
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

		switch (notification.getFeatureID(IfcOpticalMaterialProperties.class)) {
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_TRANSMITTANCE:
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_TRANSMITTANCE_AS_STRING:
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_TRANSMITTANCE:
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_TRANSMITTANCE_AS_STRING:
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_TRANSMITTANCE:
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_TRANSMITTANCE_AS_STRING:
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_EMISSIVITY_BACK:
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_EMISSIVITY_BACK_AS_STRING:
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_EMISSIVITY_FRONT:
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_EMISSIVITY_FRONT_AS_STRING:
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_REFLECTANCE_BACK:
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_REFLECTANCE_BACK_AS_STRING:
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_REFLECTANCE_FRONT:
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_REFLECTANCE_FRONT_AS_STRING:
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_REFLECTANCE_FRONT:
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_REFLECTANCE_FRONT_AS_STRING:
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_REFLECTANCE_BACK:
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_REFLECTANCE_BACK_AS_STRING:
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
