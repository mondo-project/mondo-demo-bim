/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcGeneralMaterialProperties;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcGeneralMaterialProperties} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcGeneralMaterialPropertiesItemProvider extends IfcMaterialPropertiesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcGeneralMaterialPropertiesItemProvider(AdapterFactory adapterFactory) {
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

			addMolecularWeightPropertyDescriptor(object);
			addMolecularWeightAsStringPropertyDescriptor(object);
			addPorosityPropertyDescriptor(object);
			addPorosityAsStringPropertyDescriptor(object);
			addMassDensityPropertyDescriptor(object);
			addMassDensityAsStringPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Molecular Weight feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMolecularWeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcGeneralMaterialProperties_MolecularWeight_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcGeneralMaterialProperties_MolecularWeight_feature", "_UI_IfcGeneralMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcGeneralMaterialProperties_MolecularWeight(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Molecular Weight As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMolecularWeightAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcGeneralMaterialProperties_MolecularWeightAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcGeneralMaterialProperties_MolecularWeightAsString_feature", "_UI_IfcGeneralMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcGeneralMaterialProperties_MolecularWeightAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Porosity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPorosityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcGeneralMaterialProperties_Porosity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcGeneralMaterialProperties_Porosity_feature", "_UI_IfcGeneralMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcGeneralMaterialProperties_Porosity(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Porosity As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPorosityAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcGeneralMaterialProperties_PorosityAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcGeneralMaterialProperties_PorosityAsString_feature", "_UI_IfcGeneralMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcGeneralMaterialProperties_PorosityAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mass Density feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMassDensityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcGeneralMaterialProperties_MassDensity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcGeneralMaterialProperties_MassDensity_feature", "_UI_IfcGeneralMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcGeneralMaterialProperties_MassDensity(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mass Density As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMassDensityAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcGeneralMaterialProperties_MassDensityAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcGeneralMaterialProperties_MassDensityAsString_feature", "_UI_IfcGeneralMaterialProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcGeneralMaterialProperties_MassDensityAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcGeneralMaterialProperties.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcGeneralMaterialProperties"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		IfcGeneralMaterialProperties ifcGeneralMaterialProperties = (IfcGeneralMaterialProperties)object;
		return getString("_UI_IfcGeneralMaterialProperties_type") + " " + ifcGeneralMaterialProperties.getMolecularWeight();
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

		switch (notification.getFeatureID(IfcGeneralMaterialProperties.class)) {
			case Ifc2x3tc1Package.IFC_GENERAL_MATERIAL_PROPERTIES__MOLECULAR_WEIGHT:
			case Ifc2x3tc1Package.IFC_GENERAL_MATERIAL_PROPERTIES__MOLECULAR_WEIGHT_AS_STRING:
			case Ifc2x3tc1Package.IFC_GENERAL_MATERIAL_PROPERTIES__POROSITY:
			case Ifc2x3tc1Package.IFC_GENERAL_MATERIAL_PROPERTIES__POROSITY_AS_STRING:
			case Ifc2x3tc1Package.IFC_GENERAL_MATERIAL_PROPERTIES__MASS_DENSITY:
			case Ifc2x3tc1Package.IFC_GENERAL_MATERIAL_PROPERTIES__MASS_DENSITY_AS_STRING:
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
