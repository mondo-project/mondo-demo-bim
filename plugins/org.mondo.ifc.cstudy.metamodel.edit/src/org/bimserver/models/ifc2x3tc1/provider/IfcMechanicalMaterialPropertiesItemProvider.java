/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcMechanicalMaterialProperties;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcMechanicalMaterialProperties} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcMechanicalMaterialPropertiesItemProvider extends IfcMaterialPropertiesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMechanicalMaterialPropertiesItemProvider(AdapterFactory adapterFactory) {
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

			addDynamicViscosityPropertyDescriptor(object);
			addDynamicViscosityAsStringPropertyDescriptor(object);
			addYoungModulusPropertyDescriptor(object);
			addYoungModulusAsStringPropertyDescriptor(object);
			addShearModulusPropertyDescriptor(object);
			addShearModulusAsStringPropertyDescriptor(object);
			addPoissonRatioPropertyDescriptor(object);
			addPoissonRatioAsStringPropertyDescriptor(object);
			addThermalExpansionCoefficientPropertyDescriptor(object);
			addThermalExpansionCoefficientAsStringPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Dynamic Viscosity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDynamicViscosityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcMechanicalMaterialProperties_DynamicViscosity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcMechanicalMaterialProperties_DynamicViscosity_feature", "_UI_IfcMechanicalMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcMechanicalMaterialProperties_DynamicViscosity(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dynamic Viscosity As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDynamicViscosityAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcMechanicalMaterialProperties_DynamicViscosityAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcMechanicalMaterialProperties_DynamicViscosityAsString_feature", "_UI_IfcMechanicalMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcMechanicalMaterialProperties_DynamicViscosityAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Young Modulus feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addYoungModulusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcMechanicalMaterialProperties_YoungModulus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcMechanicalMaterialProperties_YoungModulus_feature", "_UI_IfcMechanicalMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcMechanicalMaterialProperties_YoungModulus(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Young Modulus As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addYoungModulusAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcMechanicalMaterialProperties_YoungModulusAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcMechanicalMaterialProperties_YoungModulusAsString_feature", "_UI_IfcMechanicalMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcMechanicalMaterialProperties_YoungModulusAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Shear Modulus feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShearModulusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcMechanicalMaterialProperties_ShearModulus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcMechanicalMaterialProperties_ShearModulus_feature", "_UI_IfcMechanicalMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcMechanicalMaterialProperties_ShearModulus(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Shear Modulus As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShearModulusAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcMechanicalMaterialProperties_ShearModulusAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcMechanicalMaterialProperties_ShearModulusAsString_feature", "_UI_IfcMechanicalMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcMechanicalMaterialProperties_ShearModulusAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Poisson Ratio feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPoissonRatioPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcMechanicalMaterialProperties_PoissonRatio_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcMechanicalMaterialProperties_PoissonRatio_feature", "_UI_IfcMechanicalMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcMechanicalMaterialProperties_PoissonRatio(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Poisson Ratio As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPoissonRatioAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcMechanicalMaterialProperties_PoissonRatioAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcMechanicalMaterialProperties_PoissonRatioAsString_feature", "_UI_IfcMechanicalMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcMechanicalMaterialProperties_PoissonRatioAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Thermal Expansion Coefficient feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addThermalExpansionCoefficientPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcMechanicalMaterialProperties_ThermalExpansionCoefficient_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcMechanicalMaterialProperties_ThermalExpansionCoefficient_feature", "_UI_IfcMechanicalMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcMechanicalMaterialProperties_ThermalExpansionCoefficient(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Thermal Expansion Coefficient As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addThermalExpansionCoefficientAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcMechanicalMaterialProperties_ThermalExpansionCoefficientAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcMechanicalMaterialProperties_ThermalExpansionCoefficientAsString_feature", "_UI_IfcMechanicalMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcMechanicalMaterialProperties_ThermalExpansionCoefficientAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcMechanicalMaterialProperties.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcMechanicalMaterialProperties"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		IfcMechanicalMaterialProperties ifcMechanicalMaterialProperties = (IfcMechanicalMaterialProperties)object;
		return getString("_UI_IfcMechanicalMaterialProperties_type") + " " + ifcMechanicalMaterialProperties.getDynamicViscosity();
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

		switch (notification.getFeatureID(IfcMechanicalMaterialProperties.class)) {
			case Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__DYNAMIC_VISCOSITY:
			case Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__DYNAMIC_VISCOSITY_AS_STRING:
			case Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__YOUNG_MODULUS:
			case Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__YOUNG_MODULUS_AS_STRING:
			case Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__SHEAR_MODULUS:
			case Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__SHEAR_MODULUS_AS_STRING:
			case Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__POISSON_RATIO:
			case Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__POISSON_RATIO_AS_STRING:
			case Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__THERMAL_EXPANSION_COEFFICIENT:
			case Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__THERMAL_EXPANSION_COEFFICIENT_AS_STRING:
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
