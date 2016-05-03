/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcTendon;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcTendon} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcTendonItemProvider extends IfcReinforcingElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTendonItemProvider(AdapterFactory adapterFactory) {
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

			addPredefinedTypePropertyDescriptor(object);
			addNominalDiameterPropertyDescriptor(object);
			addNominalDiameterAsStringPropertyDescriptor(object);
			addCrossSectionAreaPropertyDescriptor(object);
			addCrossSectionAreaAsStringPropertyDescriptor(object);
			addTensionForcePropertyDescriptor(object);
			addTensionForceAsStringPropertyDescriptor(object);
			addPreStressPropertyDescriptor(object);
			addPreStressAsStringPropertyDescriptor(object);
			addFrictionCoefficientPropertyDescriptor(object);
			addFrictionCoefficientAsStringPropertyDescriptor(object);
			addAnchorageSlipPropertyDescriptor(object);
			addAnchorageSlipAsStringPropertyDescriptor(object);
			addMinCurvatureRadiusPropertyDescriptor(object);
			addMinCurvatureRadiusAsStringPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Predefined Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPredefinedTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcTendon_PredefinedType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcTendon_PredefinedType_feature", "_UI_IfcTendon_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcTendon_PredefinedType(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nominal Diameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNominalDiameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcTendon_NominalDiameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcTendon_NominalDiameter_feature", "_UI_IfcTendon_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcTendon_NominalDiameter(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nominal Diameter As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNominalDiameterAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcTendon_NominalDiameterAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcTendon_NominalDiameterAsString_feature", "_UI_IfcTendon_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcTendon_NominalDiameterAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cross Section Area feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCrossSectionAreaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcTendon_CrossSectionArea_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcTendon_CrossSectionArea_feature", "_UI_IfcTendon_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcTendon_CrossSectionArea(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cross Section Area As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCrossSectionAreaAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcTendon_CrossSectionAreaAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcTendon_CrossSectionAreaAsString_feature", "_UI_IfcTendon_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcTendon_CrossSectionAreaAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tension Force feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTensionForcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcTendon_TensionForce_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcTendon_TensionForce_feature", "_UI_IfcTendon_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcTendon_TensionForce(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tension Force As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTensionForceAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcTendon_TensionForceAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcTendon_TensionForceAsString_feature", "_UI_IfcTendon_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcTendon_TensionForceAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pre Stress feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPreStressPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcTendon_PreStress_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcTendon_PreStress_feature", "_UI_IfcTendon_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcTendon_PreStress(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pre Stress As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPreStressAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcTendon_PreStressAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcTendon_PreStressAsString_feature", "_UI_IfcTendon_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcTendon_PreStressAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Friction Coefficient feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFrictionCoefficientPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcTendon_FrictionCoefficient_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcTendon_FrictionCoefficient_feature", "_UI_IfcTendon_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcTendon_FrictionCoefficient(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Friction Coefficient As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFrictionCoefficientAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcTendon_FrictionCoefficientAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcTendon_FrictionCoefficientAsString_feature", "_UI_IfcTendon_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcTendon_FrictionCoefficientAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Anchorage Slip feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAnchorageSlipPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcTendon_AnchorageSlip_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcTendon_AnchorageSlip_feature", "_UI_IfcTendon_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcTendon_AnchorageSlip(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Anchorage Slip As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAnchorageSlipAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcTendon_AnchorageSlipAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcTendon_AnchorageSlipAsString_feature", "_UI_IfcTendon_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcTendon_AnchorageSlipAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Min Curvature Radius feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinCurvatureRadiusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcTendon_MinCurvatureRadius_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcTendon_MinCurvatureRadius_feature", "_UI_IfcTendon_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcTendon_MinCurvatureRadius(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Min Curvature Radius As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinCurvatureRadiusAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcTendon_MinCurvatureRadiusAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcTendon_MinCurvatureRadiusAsString_feature", "_UI_IfcTendon_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcTendon_MinCurvatureRadiusAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcTendon.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcTendon"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IfcTendon)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_IfcTendon_type") :
			getString("_UI_IfcTendon_type") + " " + label;
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

		switch (notification.getFeatureID(IfcTendon.class)) {
			case Ifc2x3tc1Package.IFC_TENDON__PREDEFINED_TYPE:
			case Ifc2x3tc1Package.IFC_TENDON__NOMINAL_DIAMETER:
			case Ifc2x3tc1Package.IFC_TENDON__NOMINAL_DIAMETER_AS_STRING:
			case Ifc2x3tc1Package.IFC_TENDON__CROSS_SECTION_AREA:
			case Ifc2x3tc1Package.IFC_TENDON__CROSS_SECTION_AREA_AS_STRING:
			case Ifc2x3tc1Package.IFC_TENDON__TENSION_FORCE:
			case Ifc2x3tc1Package.IFC_TENDON__TENSION_FORCE_AS_STRING:
			case Ifc2x3tc1Package.IFC_TENDON__PRE_STRESS:
			case Ifc2x3tc1Package.IFC_TENDON__PRE_STRESS_AS_STRING:
			case Ifc2x3tc1Package.IFC_TENDON__FRICTION_COEFFICIENT:
			case Ifc2x3tc1Package.IFC_TENDON__FRICTION_COEFFICIENT_AS_STRING:
			case Ifc2x3tc1Package.IFC_TENDON__ANCHORAGE_SLIP:
			case Ifc2x3tc1Package.IFC_TENDON__ANCHORAGE_SLIP_AS_STRING:
			case Ifc2x3tc1Package.IFC_TENDON__MIN_CURVATURE_RADIUS:
			case Ifc2x3tc1Package.IFC_TENDON__MIN_CURVATURE_RADIUS_AS_STRING:
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
