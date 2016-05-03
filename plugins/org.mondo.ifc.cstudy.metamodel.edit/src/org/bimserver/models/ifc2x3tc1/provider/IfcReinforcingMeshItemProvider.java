/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcReinforcingMesh;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcReinforcingMesh} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcReinforcingMeshItemProvider extends IfcReinforcingElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcReinforcingMeshItemProvider(AdapterFactory adapterFactory) {
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

			addMeshLengthPropertyDescriptor(object);
			addMeshLengthAsStringPropertyDescriptor(object);
			addMeshWidthPropertyDescriptor(object);
			addMeshWidthAsStringPropertyDescriptor(object);
			addLongitudinalBarNominalDiameterPropertyDescriptor(object);
			addLongitudinalBarNominalDiameterAsStringPropertyDescriptor(object);
			addTransverseBarNominalDiameterPropertyDescriptor(object);
			addTransverseBarNominalDiameterAsStringPropertyDescriptor(object);
			addLongitudinalBarCrossSectionAreaPropertyDescriptor(object);
			addLongitudinalBarCrossSectionAreaAsStringPropertyDescriptor(object);
			addTransverseBarCrossSectionAreaPropertyDescriptor(object);
			addTransverseBarCrossSectionAreaAsStringPropertyDescriptor(object);
			addLongitudinalBarSpacingPropertyDescriptor(object);
			addLongitudinalBarSpacingAsStringPropertyDescriptor(object);
			addTransverseBarSpacingPropertyDescriptor(object);
			addTransverseBarSpacingAsStringPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Mesh Length feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMeshLengthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcReinforcingMesh_MeshLength_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcReinforcingMesh_MeshLength_feature", "_UI_IfcReinforcingMesh_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcReinforcingMesh_MeshLength(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mesh Length As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMeshLengthAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcReinforcingMesh_MeshLengthAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcReinforcingMesh_MeshLengthAsString_feature", "_UI_IfcReinforcingMesh_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcReinforcingMesh_MeshLengthAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mesh Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMeshWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcReinforcingMesh_MeshWidth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcReinforcingMesh_MeshWidth_feature", "_UI_IfcReinforcingMesh_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcReinforcingMesh_MeshWidth(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mesh Width As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMeshWidthAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcReinforcingMesh_MeshWidthAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcReinforcingMesh_MeshWidthAsString_feature", "_UI_IfcReinforcingMesh_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcReinforcingMesh_MeshWidthAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Longitudinal Bar Nominal Diameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLongitudinalBarNominalDiameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcReinforcingMesh_LongitudinalBarNominalDiameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcReinforcingMesh_LongitudinalBarNominalDiameter_feature", "_UI_IfcReinforcingMesh_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcReinforcingMesh_LongitudinalBarNominalDiameter(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Longitudinal Bar Nominal Diameter As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLongitudinalBarNominalDiameterAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcReinforcingMesh_LongitudinalBarNominalDiameterAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcReinforcingMesh_LongitudinalBarNominalDiameterAsString_feature", "_UI_IfcReinforcingMesh_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcReinforcingMesh_LongitudinalBarNominalDiameterAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Transverse Bar Nominal Diameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransverseBarNominalDiameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcReinforcingMesh_TransverseBarNominalDiameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcReinforcingMesh_TransverseBarNominalDiameter_feature", "_UI_IfcReinforcingMesh_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcReinforcingMesh_TransverseBarNominalDiameter(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Transverse Bar Nominal Diameter As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransverseBarNominalDiameterAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcReinforcingMesh_TransverseBarNominalDiameterAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcReinforcingMesh_TransverseBarNominalDiameterAsString_feature", "_UI_IfcReinforcingMesh_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcReinforcingMesh_TransverseBarNominalDiameterAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Longitudinal Bar Cross Section Area feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLongitudinalBarCrossSectionAreaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcReinforcingMesh_LongitudinalBarCrossSectionArea_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcReinforcingMesh_LongitudinalBarCrossSectionArea_feature", "_UI_IfcReinforcingMesh_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcReinforcingMesh_LongitudinalBarCrossSectionArea(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Longitudinal Bar Cross Section Area As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLongitudinalBarCrossSectionAreaAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcReinforcingMesh_LongitudinalBarCrossSectionAreaAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcReinforcingMesh_LongitudinalBarCrossSectionAreaAsString_feature", "_UI_IfcReinforcingMesh_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcReinforcingMesh_LongitudinalBarCrossSectionAreaAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Transverse Bar Cross Section Area feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransverseBarCrossSectionAreaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcReinforcingMesh_TransverseBarCrossSectionArea_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcReinforcingMesh_TransverseBarCrossSectionArea_feature", "_UI_IfcReinforcingMesh_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcReinforcingMesh_TransverseBarCrossSectionArea(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Transverse Bar Cross Section Area As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransverseBarCrossSectionAreaAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcReinforcingMesh_TransverseBarCrossSectionAreaAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcReinforcingMesh_TransverseBarCrossSectionAreaAsString_feature", "_UI_IfcReinforcingMesh_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcReinforcingMesh_TransverseBarCrossSectionAreaAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Longitudinal Bar Spacing feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLongitudinalBarSpacingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcReinforcingMesh_LongitudinalBarSpacing_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcReinforcingMesh_LongitudinalBarSpacing_feature", "_UI_IfcReinforcingMesh_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcReinforcingMesh_LongitudinalBarSpacing(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Longitudinal Bar Spacing As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLongitudinalBarSpacingAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcReinforcingMesh_LongitudinalBarSpacingAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcReinforcingMesh_LongitudinalBarSpacingAsString_feature", "_UI_IfcReinforcingMesh_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcReinforcingMesh_LongitudinalBarSpacingAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Transverse Bar Spacing feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransverseBarSpacingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcReinforcingMesh_TransverseBarSpacing_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcReinforcingMesh_TransverseBarSpacing_feature", "_UI_IfcReinforcingMesh_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcReinforcingMesh_TransverseBarSpacing(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Transverse Bar Spacing As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransverseBarSpacingAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcReinforcingMesh_TransverseBarSpacingAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcReinforcingMesh_TransverseBarSpacingAsString_feature", "_UI_IfcReinforcingMesh_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcReinforcingMesh_TransverseBarSpacingAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcReinforcingMesh.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcReinforcingMesh"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IfcReinforcingMesh)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_IfcReinforcingMesh_type") :
			getString("_UI_IfcReinforcingMesh_type") + " " + label;
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

		switch (notification.getFeatureID(IfcReinforcingMesh.class)) {
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__MESH_LENGTH:
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__MESH_LENGTH_AS_STRING:
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__MESH_WIDTH:
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__MESH_WIDTH_AS_STRING:
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__LONGITUDINAL_BAR_NOMINAL_DIAMETER:
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__LONGITUDINAL_BAR_NOMINAL_DIAMETER_AS_STRING:
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__TRANSVERSE_BAR_NOMINAL_DIAMETER:
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__TRANSVERSE_BAR_NOMINAL_DIAMETER_AS_STRING:
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__LONGITUDINAL_BAR_CROSS_SECTION_AREA:
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__LONGITUDINAL_BAR_CROSS_SECTION_AREA_AS_STRING:
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__TRANSVERSE_BAR_CROSS_SECTION_AREA:
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__TRANSVERSE_BAR_CROSS_SECTION_AREA_AS_STRING:
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__LONGITUDINAL_BAR_SPACING:
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__LONGITUDINAL_BAR_SPACING_AS_STRING:
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__TRANSVERSE_BAR_SPACING:
			case Ifc2x3tc1Package.IFC_REINFORCING_MESH__TRANSVERSE_BAR_SPACING_AS_STRING:
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
