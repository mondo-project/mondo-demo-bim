/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcMechanicalConcreteMaterialProperties;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcMechanicalConcreteMaterialProperties} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcMechanicalConcreteMaterialPropertiesItemProvider extends IfcMechanicalMaterialPropertiesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMechanicalConcreteMaterialPropertiesItemProvider(AdapterFactory adapterFactory) {
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

			addCompressiveStrengthPropertyDescriptor(object);
			addCompressiveStrengthAsStringPropertyDescriptor(object);
			addMaxAggregateSizePropertyDescriptor(object);
			addMaxAggregateSizeAsStringPropertyDescriptor(object);
			addAdmixturesDescriptionPropertyDescriptor(object);
			addWorkabilityPropertyDescriptor(object);
			addProtectivePoreRatioPropertyDescriptor(object);
			addProtectivePoreRatioAsStringPropertyDescriptor(object);
			addWaterImpermeabilityPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Compressive Strength feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCompressiveStrengthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcMechanicalConcreteMaterialProperties_CompressiveStrength_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcMechanicalConcreteMaterialProperties_CompressiveStrength_feature", "_UI_IfcMechanicalConcreteMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcMechanicalConcreteMaterialProperties_CompressiveStrength(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Compressive Strength As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCompressiveStrengthAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcMechanicalConcreteMaterialProperties_CompressiveStrengthAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcMechanicalConcreteMaterialProperties_CompressiveStrengthAsString_feature", "_UI_IfcMechanicalConcreteMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcMechanicalConcreteMaterialProperties_CompressiveStrengthAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Aggregate Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxAggregateSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcMechanicalConcreteMaterialProperties_MaxAggregateSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcMechanicalConcreteMaterialProperties_MaxAggregateSize_feature", "_UI_IfcMechanicalConcreteMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcMechanicalConcreteMaterialProperties_MaxAggregateSize(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Aggregate Size As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxAggregateSizeAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcMechanicalConcreteMaterialProperties_MaxAggregateSizeAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcMechanicalConcreteMaterialProperties_MaxAggregateSizeAsString_feature", "_UI_IfcMechanicalConcreteMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcMechanicalConcreteMaterialProperties_MaxAggregateSizeAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Admixtures Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAdmixturesDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcMechanicalConcreteMaterialProperties_AdmixturesDescription_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcMechanicalConcreteMaterialProperties_AdmixturesDescription_feature", "_UI_IfcMechanicalConcreteMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcMechanicalConcreteMaterialProperties_AdmixturesDescription(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Workability feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWorkabilityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcMechanicalConcreteMaterialProperties_Workability_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcMechanicalConcreteMaterialProperties_Workability_feature", "_UI_IfcMechanicalConcreteMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcMechanicalConcreteMaterialProperties_Workability(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Protective Pore Ratio feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProtectivePoreRatioPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcMechanicalConcreteMaterialProperties_ProtectivePoreRatio_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcMechanicalConcreteMaterialProperties_ProtectivePoreRatio_feature", "_UI_IfcMechanicalConcreteMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcMechanicalConcreteMaterialProperties_ProtectivePoreRatio(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Protective Pore Ratio As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProtectivePoreRatioAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcMechanicalConcreteMaterialProperties_ProtectivePoreRatioAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcMechanicalConcreteMaterialProperties_ProtectivePoreRatioAsString_feature", "_UI_IfcMechanicalConcreteMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcMechanicalConcreteMaterialProperties_ProtectivePoreRatioAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Water Impermeability feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWaterImpermeabilityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcMechanicalConcreteMaterialProperties_WaterImpermeability_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcMechanicalConcreteMaterialProperties_WaterImpermeability_feature", "_UI_IfcMechanicalConcreteMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcMechanicalConcreteMaterialProperties_WaterImpermeability(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcMechanicalConcreteMaterialProperties.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcMechanicalConcreteMaterialProperties"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		IfcMechanicalConcreteMaterialProperties ifcMechanicalConcreteMaterialProperties = (IfcMechanicalConcreteMaterialProperties)object;
		return getString("_UI_IfcMechanicalConcreteMaterialProperties_type") + " " + ifcMechanicalConcreteMaterialProperties.getDynamicViscosity();
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

		switch (notification.getFeatureID(IfcMechanicalConcreteMaterialProperties.class)) {
			case Ifc2x3tc1Package.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__COMPRESSIVE_STRENGTH:
			case Ifc2x3tc1Package.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__COMPRESSIVE_STRENGTH_AS_STRING:
			case Ifc2x3tc1Package.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__MAX_AGGREGATE_SIZE:
			case Ifc2x3tc1Package.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__MAX_AGGREGATE_SIZE_AS_STRING:
			case Ifc2x3tc1Package.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__ADMIXTURES_DESCRIPTION:
			case Ifc2x3tc1Package.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__WORKABILITY:
			case Ifc2x3tc1Package.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__PROTECTIVE_PORE_RATIO:
			case Ifc2x3tc1Package.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__PROTECTIVE_PORE_RATIO_AS_STRING:
			case Ifc2x3tc1Package.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__WATER_IMPERMEABILITY:
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
