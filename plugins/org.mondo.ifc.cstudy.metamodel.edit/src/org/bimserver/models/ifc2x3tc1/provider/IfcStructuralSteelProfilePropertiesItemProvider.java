/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcStructuralSteelProfileProperties;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcStructuralSteelProfileProperties} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcStructuralSteelProfilePropertiesItemProvider extends IfcStructuralProfilePropertiesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralSteelProfilePropertiesItemProvider(AdapterFactory adapterFactory) {
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

			addShearAreaZPropertyDescriptor(object);
			addShearAreaZAsStringPropertyDescriptor(object);
			addShearAreaYPropertyDescriptor(object);
			addShearAreaYAsStringPropertyDescriptor(object);
			addPlasticShapeFactorYPropertyDescriptor(object);
			addPlasticShapeFactorYAsStringPropertyDescriptor(object);
			addPlasticShapeFactorZPropertyDescriptor(object);
			addPlasticShapeFactorZAsStringPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Shear Area Z feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShearAreaZPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralSteelProfileProperties_ShearAreaZ_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralSteelProfileProperties_ShearAreaZ_feature", "_UI_IfcStructuralSteelProfileProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralSteelProfileProperties_ShearAreaZ(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Shear Area ZAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShearAreaZAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralSteelProfileProperties_ShearAreaZAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralSteelProfileProperties_ShearAreaZAsString_feature", "_UI_IfcStructuralSteelProfileProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralSteelProfileProperties_ShearAreaZAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Shear Area Y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShearAreaYPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralSteelProfileProperties_ShearAreaY_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralSteelProfileProperties_ShearAreaY_feature", "_UI_IfcStructuralSteelProfileProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralSteelProfileProperties_ShearAreaY(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Shear Area YAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShearAreaYAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralSteelProfileProperties_ShearAreaYAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralSteelProfileProperties_ShearAreaYAsString_feature", "_UI_IfcStructuralSteelProfileProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralSteelProfileProperties_ShearAreaYAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Plastic Shape Factor Y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlasticShapeFactorYPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralSteelProfileProperties_PlasticShapeFactorY_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralSteelProfileProperties_PlasticShapeFactorY_feature", "_UI_IfcStructuralSteelProfileProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralSteelProfileProperties_PlasticShapeFactorY(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Plastic Shape Factor YAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlasticShapeFactorYAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralSteelProfileProperties_PlasticShapeFactorYAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralSteelProfileProperties_PlasticShapeFactorYAsString_feature", "_UI_IfcStructuralSteelProfileProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralSteelProfileProperties_PlasticShapeFactorYAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Plastic Shape Factor Z feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlasticShapeFactorZPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralSteelProfileProperties_PlasticShapeFactorZ_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralSteelProfileProperties_PlasticShapeFactorZ_feature", "_UI_IfcStructuralSteelProfileProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralSteelProfileProperties_PlasticShapeFactorZ(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Plastic Shape Factor ZAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlasticShapeFactorZAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralSteelProfileProperties_PlasticShapeFactorZAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralSteelProfileProperties_PlasticShapeFactorZAsString_feature", "_UI_IfcStructuralSteelProfileProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralSteelProfileProperties_PlasticShapeFactorZAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcStructuralSteelProfileProperties.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcStructuralSteelProfileProperties"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IfcStructuralSteelProfileProperties)object).getProfileName();
		return label == null || label.length() == 0 ?
			getString("_UI_IfcStructuralSteelProfileProperties_type") :
			getString("_UI_IfcStructuralSteelProfileProperties_type") + " " + label;
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

		switch (notification.getFeatureID(IfcStructuralSteelProfileProperties.class)) {
			case Ifc2x3tc1Package.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__SHEAR_AREA_Z:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__SHEAR_AREA_ZAS_STRING:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__SHEAR_AREA_Y:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__SHEAR_AREA_YAS_STRING:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__PLASTIC_SHAPE_FACTOR_Y:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__PLASTIC_SHAPE_FACTOR_YAS_STRING:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__PLASTIC_SHAPE_FACTOR_Z:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__PLASTIC_SHAPE_FACTOR_ZAS_STRING:
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
