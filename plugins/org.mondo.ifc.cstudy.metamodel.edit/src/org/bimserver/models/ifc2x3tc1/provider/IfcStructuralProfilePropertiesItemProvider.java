/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcStructuralProfileProperties;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcStructuralProfileProperties} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcStructuralProfilePropertiesItemProvider extends IfcGeneralProfilePropertiesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralProfilePropertiesItemProvider(AdapterFactory adapterFactory) {
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

			addTorsionalConstantXPropertyDescriptor(object);
			addTorsionalConstantXAsStringPropertyDescriptor(object);
			addMomentOfInertiaYZPropertyDescriptor(object);
			addMomentOfInertiaYZAsStringPropertyDescriptor(object);
			addMomentOfInertiaYPropertyDescriptor(object);
			addMomentOfInertiaYAsStringPropertyDescriptor(object);
			addMomentOfInertiaZPropertyDescriptor(object);
			addMomentOfInertiaZAsStringPropertyDescriptor(object);
			addWarpingConstantPropertyDescriptor(object);
			addWarpingConstantAsStringPropertyDescriptor(object);
			addShearCentreZPropertyDescriptor(object);
			addShearCentreZAsStringPropertyDescriptor(object);
			addShearCentreYPropertyDescriptor(object);
			addShearCentreYAsStringPropertyDescriptor(object);
			addShearDeformationAreaZPropertyDescriptor(object);
			addShearDeformationAreaZAsStringPropertyDescriptor(object);
			addShearDeformationAreaYPropertyDescriptor(object);
			addShearDeformationAreaYAsStringPropertyDescriptor(object);
			addMaximumSectionModulusYPropertyDescriptor(object);
			addMaximumSectionModulusYAsStringPropertyDescriptor(object);
			addMinimumSectionModulusYPropertyDescriptor(object);
			addMinimumSectionModulusYAsStringPropertyDescriptor(object);
			addMaximumSectionModulusZPropertyDescriptor(object);
			addMaximumSectionModulusZAsStringPropertyDescriptor(object);
			addMinimumSectionModulusZPropertyDescriptor(object);
			addMinimumSectionModulusZAsStringPropertyDescriptor(object);
			addTorsionalSectionModulusPropertyDescriptor(object);
			addTorsionalSectionModulusAsStringPropertyDescriptor(object);
			addCentreOfGravityInXPropertyDescriptor(object);
			addCentreOfGravityInXAsStringPropertyDescriptor(object);
			addCentreOfGravityInYPropertyDescriptor(object);
			addCentreOfGravityInYAsStringPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Torsional Constant X feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTorsionalConstantXPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralProfileProperties_TorsionalConstantX_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralProfileProperties_TorsionalConstantX_feature", "_UI_IfcStructuralProfileProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralProfileProperties_TorsionalConstantX(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Torsional Constant XAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTorsionalConstantXAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralProfileProperties_TorsionalConstantXAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralProfileProperties_TorsionalConstantXAsString_feature", "_UI_IfcStructuralProfileProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralProfileProperties_TorsionalConstantXAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Moment Of Inertia YZ feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMomentOfInertiaYZPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralProfileProperties_MomentOfInertiaYZ_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralProfileProperties_MomentOfInertiaYZ_feature", "_UI_IfcStructuralProfileProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralProfileProperties_MomentOfInertiaYZ(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Moment Of Inertia YZ As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMomentOfInertiaYZAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralProfileProperties_MomentOfInertiaYZAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralProfileProperties_MomentOfInertiaYZAsString_feature", "_UI_IfcStructuralProfileProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralProfileProperties_MomentOfInertiaYZAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Moment Of Inertia Y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMomentOfInertiaYPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralProfileProperties_MomentOfInertiaY_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralProfileProperties_MomentOfInertiaY_feature", "_UI_IfcStructuralProfileProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralProfileProperties_MomentOfInertiaY(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Moment Of Inertia YAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMomentOfInertiaYAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralProfileProperties_MomentOfInertiaYAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralProfileProperties_MomentOfInertiaYAsString_feature", "_UI_IfcStructuralProfileProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralProfileProperties_MomentOfInertiaYAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Moment Of Inertia Z feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMomentOfInertiaZPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralProfileProperties_MomentOfInertiaZ_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralProfileProperties_MomentOfInertiaZ_feature", "_UI_IfcStructuralProfileProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralProfileProperties_MomentOfInertiaZ(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Moment Of Inertia ZAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMomentOfInertiaZAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralProfileProperties_MomentOfInertiaZAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralProfileProperties_MomentOfInertiaZAsString_feature", "_UI_IfcStructuralProfileProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralProfileProperties_MomentOfInertiaZAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Warping Constant feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWarpingConstantPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralProfileProperties_WarpingConstant_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralProfileProperties_WarpingConstant_feature", "_UI_IfcStructuralProfileProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralProfileProperties_WarpingConstant(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Warping Constant As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWarpingConstantAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralProfileProperties_WarpingConstantAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralProfileProperties_WarpingConstantAsString_feature", "_UI_IfcStructuralProfileProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralProfileProperties_WarpingConstantAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Shear Centre Z feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShearCentreZPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralProfileProperties_ShearCentreZ_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralProfileProperties_ShearCentreZ_feature", "_UI_IfcStructuralProfileProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralProfileProperties_ShearCentreZ(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Shear Centre ZAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShearCentreZAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralProfileProperties_ShearCentreZAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralProfileProperties_ShearCentreZAsString_feature", "_UI_IfcStructuralProfileProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralProfileProperties_ShearCentreZAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Shear Centre Y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShearCentreYPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralProfileProperties_ShearCentreY_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralProfileProperties_ShearCentreY_feature", "_UI_IfcStructuralProfileProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralProfileProperties_ShearCentreY(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Shear Centre YAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShearCentreYAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralProfileProperties_ShearCentreYAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralProfileProperties_ShearCentreYAsString_feature", "_UI_IfcStructuralProfileProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralProfileProperties_ShearCentreYAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Shear Deformation Area Z feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShearDeformationAreaZPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralProfileProperties_ShearDeformationAreaZ_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralProfileProperties_ShearDeformationAreaZ_feature", "_UI_IfcStructuralProfileProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralProfileProperties_ShearDeformationAreaZ(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Shear Deformation Area ZAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShearDeformationAreaZAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralProfileProperties_ShearDeformationAreaZAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralProfileProperties_ShearDeformationAreaZAsString_feature", "_UI_IfcStructuralProfileProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralProfileProperties_ShearDeformationAreaZAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Shear Deformation Area Y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShearDeformationAreaYPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralProfileProperties_ShearDeformationAreaY_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralProfileProperties_ShearDeformationAreaY_feature", "_UI_IfcStructuralProfileProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralProfileProperties_ShearDeformationAreaY(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Shear Deformation Area YAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShearDeformationAreaYAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralProfileProperties_ShearDeformationAreaYAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralProfileProperties_ShearDeformationAreaYAsString_feature", "_UI_IfcStructuralProfileProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralProfileProperties_ShearDeformationAreaYAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Maximum Section Modulus Y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaximumSectionModulusYPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralProfileProperties_MaximumSectionModulusY_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralProfileProperties_MaximumSectionModulusY_feature", "_UI_IfcStructuralProfileProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralProfileProperties_MaximumSectionModulusY(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Maximum Section Modulus YAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaximumSectionModulusYAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralProfileProperties_MaximumSectionModulusYAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralProfileProperties_MaximumSectionModulusYAsString_feature", "_UI_IfcStructuralProfileProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralProfileProperties_MaximumSectionModulusYAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Minimum Section Modulus Y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinimumSectionModulusYPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralProfileProperties_MinimumSectionModulusY_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralProfileProperties_MinimumSectionModulusY_feature", "_UI_IfcStructuralProfileProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralProfileProperties_MinimumSectionModulusY(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Minimum Section Modulus YAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinimumSectionModulusYAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralProfileProperties_MinimumSectionModulusYAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralProfileProperties_MinimumSectionModulusYAsString_feature", "_UI_IfcStructuralProfileProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralProfileProperties_MinimumSectionModulusYAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Maximum Section Modulus Z feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaximumSectionModulusZPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralProfileProperties_MaximumSectionModulusZ_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralProfileProperties_MaximumSectionModulusZ_feature", "_UI_IfcStructuralProfileProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralProfileProperties_MaximumSectionModulusZ(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Maximum Section Modulus ZAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaximumSectionModulusZAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralProfileProperties_MaximumSectionModulusZAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralProfileProperties_MaximumSectionModulusZAsString_feature", "_UI_IfcStructuralProfileProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralProfileProperties_MaximumSectionModulusZAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Minimum Section Modulus Z feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinimumSectionModulusZPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralProfileProperties_MinimumSectionModulusZ_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralProfileProperties_MinimumSectionModulusZ_feature", "_UI_IfcStructuralProfileProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralProfileProperties_MinimumSectionModulusZ(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Minimum Section Modulus ZAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinimumSectionModulusZAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralProfileProperties_MinimumSectionModulusZAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralProfileProperties_MinimumSectionModulusZAsString_feature", "_UI_IfcStructuralProfileProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralProfileProperties_MinimumSectionModulusZAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Torsional Section Modulus feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTorsionalSectionModulusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralProfileProperties_TorsionalSectionModulus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralProfileProperties_TorsionalSectionModulus_feature", "_UI_IfcStructuralProfileProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralProfileProperties_TorsionalSectionModulus(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Torsional Section Modulus As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTorsionalSectionModulusAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralProfileProperties_TorsionalSectionModulusAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralProfileProperties_TorsionalSectionModulusAsString_feature", "_UI_IfcStructuralProfileProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralProfileProperties_TorsionalSectionModulusAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Centre Of Gravity In X feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCentreOfGravityInXPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralProfileProperties_CentreOfGravityInX_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralProfileProperties_CentreOfGravityInX_feature", "_UI_IfcStructuralProfileProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralProfileProperties_CentreOfGravityInX(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Centre Of Gravity In XAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCentreOfGravityInXAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralProfileProperties_CentreOfGravityInXAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralProfileProperties_CentreOfGravityInXAsString_feature", "_UI_IfcStructuralProfileProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralProfileProperties_CentreOfGravityInXAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Centre Of Gravity In Y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCentreOfGravityInYPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralProfileProperties_CentreOfGravityInY_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralProfileProperties_CentreOfGravityInY_feature", "_UI_IfcStructuralProfileProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralProfileProperties_CentreOfGravityInY(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Centre Of Gravity In YAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCentreOfGravityInYAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralProfileProperties_CentreOfGravityInYAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralProfileProperties_CentreOfGravityInYAsString_feature", "_UI_IfcStructuralProfileProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralProfileProperties_CentreOfGravityInYAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcStructuralProfileProperties.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcStructuralProfileProperties"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IfcStructuralProfileProperties)object).getProfileName();
		return label == null || label.length() == 0 ?
			getString("_UI_IfcStructuralProfileProperties_type") :
			getString("_UI_IfcStructuralProfileProperties_type") + " " + label;
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

		switch (notification.getFeatureID(IfcStructuralProfileProperties.class)) {
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__TORSIONAL_CONSTANT_X:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__TORSIONAL_CONSTANT_XAS_STRING:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MOMENT_OF_INERTIA_YZ:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MOMENT_OF_INERTIA_YZ_AS_STRING:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MOMENT_OF_INERTIA_Y:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MOMENT_OF_INERTIA_YAS_STRING:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MOMENT_OF_INERTIA_Z:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MOMENT_OF_INERTIA_ZAS_STRING:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__WARPING_CONSTANT:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__WARPING_CONSTANT_AS_STRING:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_CENTRE_Z:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_CENTRE_ZAS_STRING:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_CENTRE_Y:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_CENTRE_YAS_STRING:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_DEFORMATION_AREA_Z:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_DEFORMATION_AREA_ZAS_STRING:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_DEFORMATION_AREA_Y:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_DEFORMATION_AREA_YAS_STRING:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MAXIMUM_SECTION_MODULUS_Y:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MAXIMUM_SECTION_MODULUS_YAS_STRING:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MINIMUM_SECTION_MODULUS_Y:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MINIMUM_SECTION_MODULUS_YAS_STRING:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MAXIMUM_SECTION_MODULUS_Z:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MAXIMUM_SECTION_MODULUS_ZAS_STRING:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MINIMUM_SECTION_MODULUS_Z:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MINIMUM_SECTION_MODULUS_ZAS_STRING:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__TORSIONAL_SECTION_MODULUS:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__TORSIONAL_SECTION_MODULUS_AS_STRING:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__CENTRE_OF_GRAVITY_IN_X:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__CENTRE_OF_GRAVITY_IN_XAS_STRING:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__CENTRE_OF_GRAVITY_IN_Y:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__CENTRE_OF_GRAVITY_IN_YAS_STRING:
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
