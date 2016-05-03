/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcWaterProperties;
import org.bimserver.models.ifc2x3tc1.Tristate;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcWaterProperties} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcWaterPropertiesItemProvider extends IfcMaterialPropertiesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcWaterPropertiesItemProvider(AdapterFactory adapterFactory) {
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

			addIsPotablePropertyDescriptor(object);
			addHardnessPropertyDescriptor(object);
			addHardnessAsStringPropertyDescriptor(object);
			addAlkalinityConcentrationPropertyDescriptor(object);
			addAlkalinityConcentrationAsStringPropertyDescriptor(object);
			addAcidityConcentrationPropertyDescriptor(object);
			addAcidityConcentrationAsStringPropertyDescriptor(object);
			addImpuritiesContentPropertyDescriptor(object);
			addImpuritiesContentAsStringPropertyDescriptor(object);
			addPHLevelPropertyDescriptor(object);
			addPHLevelAsStringPropertyDescriptor(object);
			addDissolvedSolidsContentPropertyDescriptor(object);
			addDissolvedSolidsContentAsStringPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Is Potable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsPotablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcWaterProperties_IsPotable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcWaterProperties_IsPotable_feature", "_UI_IfcWaterProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_IsPotable(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hardness feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHardnessPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcWaterProperties_Hardness_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcWaterProperties_Hardness_feature", "_UI_IfcWaterProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_Hardness(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hardness As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHardnessAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcWaterProperties_HardnessAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcWaterProperties_HardnessAsString_feature", "_UI_IfcWaterProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_HardnessAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Alkalinity Concentration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAlkalinityConcentrationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcWaterProperties_AlkalinityConcentration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcWaterProperties_AlkalinityConcentration_feature", "_UI_IfcWaterProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_AlkalinityConcentration(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Alkalinity Concentration As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAlkalinityConcentrationAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcWaterProperties_AlkalinityConcentrationAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcWaterProperties_AlkalinityConcentrationAsString_feature", "_UI_IfcWaterProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_AlkalinityConcentrationAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Acidity Concentration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAcidityConcentrationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcWaterProperties_AcidityConcentration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcWaterProperties_AcidityConcentration_feature", "_UI_IfcWaterProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_AcidityConcentration(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Acidity Concentration As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAcidityConcentrationAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcWaterProperties_AcidityConcentrationAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcWaterProperties_AcidityConcentrationAsString_feature", "_UI_IfcWaterProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_AcidityConcentrationAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Impurities Content feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImpuritiesContentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcWaterProperties_ImpuritiesContent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcWaterProperties_ImpuritiesContent_feature", "_UI_IfcWaterProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_ImpuritiesContent(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Impurities Content As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImpuritiesContentAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcWaterProperties_ImpuritiesContentAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcWaterProperties_ImpuritiesContentAsString_feature", "_UI_IfcWaterProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_ImpuritiesContentAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the PH Level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPHLevelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcWaterProperties_PHLevel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcWaterProperties_PHLevel_feature", "_UI_IfcWaterProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_PHLevel(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the PH Level As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPHLevelAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcWaterProperties_PHLevelAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcWaterProperties_PHLevelAsString_feature", "_UI_IfcWaterProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_PHLevelAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dissolved Solids Content feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDissolvedSolidsContentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcWaterProperties_DissolvedSolidsContent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcWaterProperties_DissolvedSolidsContent_feature", "_UI_IfcWaterProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_DissolvedSolidsContent(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dissolved Solids Content As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDissolvedSolidsContentAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcWaterProperties_DissolvedSolidsContentAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcWaterProperties_DissolvedSolidsContentAsString_feature", "_UI_IfcWaterProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties_DissolvedSolidsContentAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcWaterProperties.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcWaterProperties"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Tristate labelValue = ((IfcWaterProperties)object).getIsPotable();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_IfcWaterProperties_type") :
			getString("_UI_IfcWaterProperties_type") + " " + label;
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

		switch (notification.getFeatureID(IfcWaterProperties.class)) {
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__IS_POTABLE:
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__HARDNESS:
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__HARDNESS_AS_STRING:
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__ALKALINITY_CONCENTRATION:
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__ALKALINITY_CONCENTRATION_AS_STRING:
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__ACIDITY_CONCENTRATION:
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__ACIDITY_CONCENTRATION_AS_STRING:
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__IMPURITIES_CONTENT:
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__IMPURITIES_CONTENT_AS_STRING:
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__PH_LEVEL:
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__PH_LEVEL_AS_STRING:
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__DISSOLVED_SOLIDS_CONTENT:
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__DISSOLVED_SOLIDS_CONTENT_AS_STRING:
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
