/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcMechanicalSteelMaterialProperties;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcMechanicalSteelMaterialProperties} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcMechanicalSteelMaterialPropertiesItemProvider extends IfcMechanicalMaterialPropertiesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMechanicalSteelMaterialPropertiesItemProvider(AdapterFactory adapterFactory) {
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

			addYieldStressPropertyDescriptor(object);
			addYieldStressAsStringPropertyDescriptor(object);
			addUltimateStressPropertyDescriptor(object);
			addUltimateStressAsStringPropertyDescriptor(object);
			addUltimateStrainPropertyDescriptor(object);
			addUltimateStrainAsStringPropertyDescriptor(object);
			addHardeningModulePropertyDescriptor(object);
			addHardeningModuleAsStringPropertyDescriptor(object);
			addProportionalStressPropertyDescriptor(object);
			addProportionalStressAsStringPropertyDescriptor(object);
			addPlasticStrainPropertyDescriptor(object);
			addPlasticStrainAsStringPropertyDescriptor(object);
			addRelaxationsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Yield Stress feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addYieldStressPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcMechanicalSteelMaterialProperties_YieldStress_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcMechanicalSteelMaterialProperties_YieldStress_feature", "_UI_IfcMechanicalSteelMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcMechanicalSteelMaterialProperties_YieldStress(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Yield Stress As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addYieldStressAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcMechanicalSteelMaterialProperties_YieldStressAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcMechanicalSteelMaterialProperties_YieldStressAsString_feature", "_UI_IfcMechanicalSteelMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcMechanicalSteelMaterialProperties_YieldStressAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ultimate Stress feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUltimateStressPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcMechanicalSteelMaterialProperties_UltimateStress_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcMechanicalSteelMaterialProperties_UltimateStress_feature", "_UI_IfcMechanicalSteelMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcMechanicalSteelMaterialProperties_UltimateStress(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ultimate Stress As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUltimateStressAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcMechanicalSteelMaterialProperties_UltimateStressAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcMechanicalSteelMaterialProperties_UltimateStressAsString_feature", "_UI_IfcMechanicalSteelMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcMechanicalSteelMaterialProperties_UltimateStressAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ultimate Strain feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUltimateStrainPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcMechanicalSteelMaterialProperties_UltimateStrain_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcMechanicalSteelMaterialProperties_UltimateStrain_feature", "_UI_IfcMechanicalSteelMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcMechanicalSteelMaterialProperties_UltimateStrain(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ultimate Strain As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUltimateStrainAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcMechanicalSteelMaterialProperties_UltimateStrainAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcMechanicalSteelMaterialProperties_UltimateStrainAsString_feature", "_UI_IfcMechanicalSteelMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcMechanicalSteelMaterialProperties_UltimateStrainAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hardening Module feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHardeningModulePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcMechanicalSteelMaterialProperties_HardeningModule_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcMechanicalSteelMaterialProperties_HardeningModule_feature", "_UI_IfcMechanicalSteelMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcMechanicalSteelMaterialProperties_HardeningModule(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hardening Module As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHardeningModuleAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcMechanicalSteelMaterialProperties_HardeningModuleAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcMechanicalSteelMaterialProperties_HardeningModuleAsString_feature", "_UI_IfcMechanicalSteelMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcMechanicalSteelMaterialProperties_HardeningModuleAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Proportional Stress feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProportionalStressPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcMechanicalSteelMaterialProperties_ProportionalStress_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcMechanicalSteelMaterialProperties_ProportionalStress_feature", "_UI_IfcMechanicalSteelMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcMechanicalSteelMaterialProperties_ProportionalStress(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Proportional Stress As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProportionalStressAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcMechanicalSteelMaterialProperties_ProportionalStressAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcMechanicalSteelMaterialProperties_ProportionalStressAsString_feature", "_UI_IfcMechanicalSteelMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcMechanicalSteelMaterialProperties_ProportionalStressAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Plastic Strain feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlasticStrainPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcMechanicalSteelMaterialProperties_PlasticStrain_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcMechanicalSteelMaterialProperties_PlasticStrain_feature", "_UI_IfcMechanicalSteelMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcMechanicalSteelMaterialProperties_PlasticStrain(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Plastic Strain As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlasticStrainAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcMechanicalSteelMaterialProperties_PlasticStrainAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcMechanicalSteelMaterialProperties_PlasticStrainAsString_feature", "_UI_IfcMechanicalSteelMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcMechanicalSteelMaterialProperties_PlasticStrainAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Relaxations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRelaxationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcMechanicalSteelMaterialProperties_Relaxations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcMechanicalSteelMaterialProperties_Relaxations_feature", "_UI_IfcMechanicalSteelMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcMechanicalSteelMaterialProperties_Relaxations(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns IfcMechanicalSteelMaterialProperties.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcMechanicalSteelMaterialProperties"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		IfcMechanicalSteelMaterialProperties ifcMechanicalSteelMaterialProperties = (IfcMechanicalSteelMaterialProperties)object;
		return getString("_UI_IfcMechanicalSteelMaterialProperties_type") + " " + ifcMechanicalSteelMaterialProperties.getDynamicViscosity();
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

		switch (notification.getFeatureID(IfcMechanicalSteelMaterialProperties.class)) {
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__YIELD_STRESS:
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__YIELD_STRESS_AS_STRING:
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__ULTIMATE_STRESS:
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__ULTIMATE_STRESS_AS_STRING:
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__ULTIMATE_STRAIN:
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__ULTIMATE_STRAIN_AS_STRING:
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__HARDENING_MODULE:
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__HARDENING_MODULE_AS_STRING:
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__PROPORTIONAL_STRESS:
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__PROPORTIONAL_STRESS_AS_STRING:
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__PLASTIC_STRAIN:
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__PLASTIC_STRAIN_AS_STRING:
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
