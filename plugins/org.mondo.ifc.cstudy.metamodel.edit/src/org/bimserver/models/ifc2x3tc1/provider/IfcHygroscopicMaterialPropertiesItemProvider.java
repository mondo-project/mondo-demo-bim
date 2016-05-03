/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcHygroscopicMaterialProperties;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcHygroscopicMaterialProperties} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcHygroscopicMaterialPropertiesItemProvider extends IfcMaterialPropertiesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcHygroscopicMaterialPropertiesItemProvider(AdapterFactory adapterFactory) {
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

			addUpperVaporResistanceFactorPropertyDescriptor(object);
			addUpperVaporResistanceFactorAsStringPropertyDescriptor(object);
			addLowerVaporResistanceFactorPropertyDescriptor(object);
			addLowerVaporResistanceFactorAsStringPropertyDescriptor(object);
			addIsothermalMoistureCapacityPropertyDescriptor(object);
			addIsothermalMoistureCapacityAsStringPropertyDescriptor(object);
			addVaporPermeabilityPropertyDescriptor(object);
			addVaporPermeabilityAsStringPropertyDescriptor(object);
			addMoistureDiffusivityPropertyDescriptor(object);
			addMoistureDiffusivityAsStringPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Upper Vapor Resistance Factor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUpperVaporResistanceFactorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcHygroscopicMaterialProperties_UpperVaporResistanceFactor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcHygroscopicMaterialProperties_UpperVaporResistanceFactor_feature", "_UI_IfcHygroscopicMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcHygroscopicMaterialProperties_UpperVaporResistanceFactor(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Upper Vapor Resistance Factor As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUpperVaporResistanceFactorAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcHygroscopicMaterialProperties_UpperVaporResistanceFactorAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcHygroscopicMaterialProperties_UpperVaporResistanceFactorAsString_feature", "_UI_IfcHygroscopicMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcHygroscopicMaterialProperties_UpperVaporResistanceFactorAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lower Vapor Resistance Factor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLowerVaporResistanceFactorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcHygroscopicMaterialProperties_LowerVaporResistanceFactor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcHygroscopicMaterialProperties_LowerVaporResistanceFactor_feature", "_UI_IfcHygroscopicMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcHygroscopicMaterialProperties_LowerVaporResistanceFactor(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lower Vapor Resistance Factor As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLowerVaporResistanceFactorAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcHygroscopicMaterialProperties_LowerVaporResistanceFactorAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcHygroscopicMaterialProperties_LowerVaporResistanceFactorAsString_feature", "_UI_IfcHygroscopicMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcHygroscopicMaterialProperties_LowerVaporResistanceFactorAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Isothermal Moisture Capacity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsothermalMoistureCapacityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcHygroscopicMaterialProperties_IsothermalMoistureCapacity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcHygroscopicMaterialProperties_IsothermalMoistureCapacity_feature", "_UI_IfcHygroscopicMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcHygroscopicMaterialProperties_IsothermalMoistureCapacity(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Isothermal Moisture Capacity As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsothermalMoistureCapacityAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcHygroscopicMaterialProperties_IsothermalMoistureCapacityAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcHygroscopicMaterialProperties_IsothermalMoistureCapacityAsString_feature", "_UI_IfcHygroscopicMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcHygroscopicMaterialProperties_IsothermalMoistureCapacityAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vapor Permeability feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVaporPermeabilityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcHygroscopicMaterialProperties_VaporPermeability_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcHygroscopicMaterialProperties_VaporPermeability_feature", "_UI_IfcHygroscopicMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcHygroscopicMaterialProperties_VaporPermeability(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vapor Permeability As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVaporPermeabilityAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcHygroscopicMaterialProperties_VaporPermeabilityAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcHygroscopicMaterialProperties_VaporPermeabilityAsString_feature", "_UI_IfcHygroscopicMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcHygroscopicMaterialProperties_VaporPermeabilityAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Moisture Diffusivity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMoistureDiffusivityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcHygroscopicMaterialProperties_MoistureDiffusivity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcHygroscopicMaterialProperties_MoistureDiffusivity_feature", "_UI_IfcHygroscopicMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcHygroscopicMaterialProperties_MoistureDiffusivity(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Moisture Diffusivity As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMoistureDiffusivityAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcHygroscopicMaterialProperties_MoistureDiffusivityAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcHygroscopicMaterialProperties_MoistureDiffusivityAsString_feature", "_UI_IfcHygroscopicMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcHygroscopicMaterialProperties_MoistureDiffusivityAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcHygroscopicMaterialProperties.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcHygroscopicMaterialProperties"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		IfcHygroscopicMaterialProperties ifcHygroscopicMaterialProperties = (IfcHygroscopicMaterialProperties)object;
		return getString("_UI_IfcHygroscopicMaterialProperties_type") + " " + ifcHygroscopicMaterialProperties.getUpperVaporResistanceFactor();
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

		switch (notification.getFeatureID(IfcHygroscopicMaterialProperties.class)) {
			case Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__UPPER_VAPOR_RESISTANCE_FACTOR:
			case Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__UPPER_VAPOR_RESISTANCE_FACTOR_AS_STRING:
			case Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__LOWER_VAPOR_RESISTANCE_FACTOR:
			case Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__LOWER_VAPOR_RESISTANCE_FACTOR_AS_STRING:
			case Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__ISOTHERMAL_MOISTURE_CAPACITY:
			case Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__ISOTHERMAL_MOISTURE_CAPACITY_AS_STRING:
			case Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__VAPOR_PERMEABILITY:
			case Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__VAPOR_PERMEABILITY_AS_STRING:
			case Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__MOISTURE_DIFFUSIVITY:
			case Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__MOISTURE_DIFFUSIVITY_AS_STRING:
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
