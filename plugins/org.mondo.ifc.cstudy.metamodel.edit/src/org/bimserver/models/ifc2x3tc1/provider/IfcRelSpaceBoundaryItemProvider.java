/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcRelSpaceBoundary;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcRelSpaceBoundary} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcRelSpaceBoundaryItemProvider extends IfcRelConnectsItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelSpaceBoundaryItemProvider(AdapterFactory adapterFactory) {
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

			addRelatingSpacePropertyDescriptor(object);
			addRelatedBuildingElementPropertyDescriptor(object);
			addConnectionGeometryPropertyDescriptor(object);
			addPhysicalOrVirtualBoundaryPropertyDescriptor(object);
			addInternalOrExternalBoundaryPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Relating Space feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRelatingSpacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcRelSpaceBoundary_RelatingSpace_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcRelSpaceBoundary_RelatingSpace_feature", "_UI_IfcRelSpaceBoundary_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcRelSpaceBoundary_RelatingSpace(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Related Building Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRelatedBuildingElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcRelSpaceBoundary_RelatedBuildingElement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcRelSpaceBoundary_RelatedBuildingElement_feature", "_UI_IfcRelSpaceBoundary_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcRelSpaceBoundary_RelatedBuildingElement(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Connection Geometry feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConnectionGeometryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcRelSpaceBoundary_ConnectionGeometry_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcRelSpaceBoundary_ConnectionGeometry_feature", "_UI_IfcRelSpaceBoundary_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcRelSpaceBoundary_ConnectionGeometry(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Physical Or Virtual Boundary feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhysicalOrVirtualBoundaryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcRelSpaceBoundary_PhysicalOrVirtualBoundary_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcRelSpaceBoundary_PhysicalOrVirtualBoundary_feature", "_UI_IfcRelSpaceBoundary_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcRelSpaceBoundary_PhysicalOrVirtualBoundary(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Internal Or External Boundary feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInternalOrExternalBoundaryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcRelSpaceBoundary_InternalOrExternalBoundary_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcRelSpaceBoundary_InternalOrExternalBoundary_feature", "_UI_IfcRelSpaceBoundary_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcRelSpaceBoundary_InternalOrExternalBoundary(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcRelSpaceBoundary.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcRelSpaceBoundary"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IfcRelSpaceBoundary)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_IfcRelSpaceBoundary_type") :
			getString("_UI_IfcRelSpaceBoundary_type") + " " + label;
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

		switch (notification.getFeatureID(IfcRelSpaceBoundary.class)) {
			case Ifc2x3tc1Package.IFC_REL_SPACE_BOUNDARY__PHYSICAL_OR_VIRTUAL_BOUNDARY:
			case Ifc2x3tc1Package.IFC_REL_SPACE_BOUNDARY__INTERNAL_OR_EXTERNAL_BOUNDARY:
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
