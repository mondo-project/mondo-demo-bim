/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcProductsOfCombustionProperties;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcProductsOfCombustionProperties} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcProductsOfCombustionPropertiesItemProvider extends IfcMaterialPropertiesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProductsOfCombustionPropertiesItemProvider(AdapterFactory adapterFactory) {
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

			addSpecificHeatCapacityPropertyDescriptor(object);
			addSpecificHeatCapacityAsStringPropertyDescriptor(object);
			addN20ContentPropertyDescriptor(object);
			addN20ContentAsStringPropertyDescriptor(object);
			addCOContentPropertyDescriptor(object);
			addCOContentAsStringPropertyDescriptor(object);
			addCO2ContentPropertyDescriptor(object);
			addCO2ContentAsStringPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Specific Heat Capacity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpecificHeatCapacityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcProductsOfCombustionProperties_SpecificHeatCapacity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcProductsOfCombustionProperties_SpecificHeatCapacity_feature", "_UI_IfcProductsOfCombustionProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcProductsOfCombustionProperties_SpecificHeatCapacity(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Specific Heat Capacity As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpecificHeatCapacityAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcProductsOfCombustionProperties_SpecificHeatCapacityAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcProductsOfCombustionProperties_SpecificHeatCapacityAsString_feature", "_UI_IfcProductsOfCombustionProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcProductsOfCombustionProperties_SpecificHeatCapacityAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the N20 Content feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addN20ContentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcProductsOfCombustionProperties_N20Content_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcProductsOfCombustionProperties_N20Content_feature", "_UI_IfcProductsOfCombustionProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcProductsOfCombustionProperties_N20Content(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the N20 Content As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addN20ContentAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcProductsOfCombustionProperties_N20ContentAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcProductsOfCombustionProperties_N20ContentAsString_feature", "_UI_IfcProductsOfCombustionProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcProductsOfCombustionProperties_N20ContentAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the CO Content feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCOContentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcProductsOfCombustionProperties_COContent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcProductsOfCombustionProperties_COContent_feature", "_UI_IfcProductsOfCombustionProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcProductsOfCombustionProperties_COContent(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the CO Content As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCOContentAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcProductsOfCombustionProperties_COContentAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcProductsOfCombustionProperties_COContentAsString_feature", "_UI_IfcProductsOfCombustionProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcProductsOfCombustionProperties_COContentAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the CO2 Content feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCO2ContentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcProductsOfCombustionProperties_CO2Content_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcProductsOfCombustionProperties_CO2Content_feature", "_UI_IfcProductsOfCombustionProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcProductsOfCombustionProperties_CO2Content(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the CO2 Content As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCO2ContentAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcProductsOfCombustionProperties_CO2ContentAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcProductsOfCombustionProperties_CO2ContentAsString_feature", "_UI_IfcProductsOfCombustionProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcProductsOfCombustionProperties_CO2ContentAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcProductsOfCombustionProperties.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcProductsOfCombustionProperties"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		IfcProductsOfCombustionProperties ifcProductsOfCombustionProperties = (IfcProductsOfCombustionProperties)object;
		return getString("_UI_IfcProductsOfCombustionProperties_type") + " " + ifcProductsOfCombustionProperties.getSpecificHeatCapacity();
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

		switch (notification.getFeatureID(IfcProductsOfCombustionProperties.class)) {
			case Ifc2x3tc1Package.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__SPECIFIC_HEAT_CAPACITY:
			case Ifc2x3tc1Package.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__SPECIFIC_HEAT_CAPACITY_AS_STRING:
			case Ifc2x3tc1Package.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__N20_CONTENT:
			case Ifc2x3tc1Package.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__N20_CONTENT_AS_STRING:
			case Ifc2x3tc1Package.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__CO_CONTENT:
			case Ifc2x3tc1Package.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__CO_CONTENT_AS_STRING:
			case Ifc2x3tc1Package.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__CO2_CONTENT:
			case Ifc2x3tc1Package.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__CO2_CONTENT_AS_STRING:
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
