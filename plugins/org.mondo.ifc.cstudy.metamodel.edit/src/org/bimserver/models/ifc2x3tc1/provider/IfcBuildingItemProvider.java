/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcBuilding;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcBuilding} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcBuildingItemProvider extends IfcSpatialStructureElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBuildingItemProvider(AdapterFactory adapterFactory) {
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

			addElevationOfRefHeightPropertyDescriptor(object);
			addElevationOfRefHeightAsStringPropertyDescriptor(object);
			addElevationOfTerrainPropertyDescriptor(object);
			addElevationOfTerrainAsStringPropertyDescriptor(object);
			addBuildingAddressPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Elevation Of Ref Height feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addElevationOfRefHeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcBuilding_ElevationOfRefHeight_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcBuilding_ElevationOfRefHeight_feature", "_UI_IfcBuilding_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcBuilding_ElevationOfRefHeight(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Elevation Of Ref Height As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addElevationOfRefHeightAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcBuilding_ElevationOfRefHeightAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcBuilding_ElevationOfRefHeightAsString_feature", "_UI_IfcBuilding_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcBuilding_ElevationOfRefHeightAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Elevation Of Terrain feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addElevationOfTerrainPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcBuilding_ElevationOfTerrain_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcBuilding_ElevationOfTerrain_feature", "_UI_IfcBuilding_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcBuilding_ElevationOfTerrain(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Elevation Of Terrain As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addElevationOfTerrainAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcBuilding_ElevationOfTerrainAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcBuilding_ElevationOfTerrainAsString_feature", "_UI_IfcBuilding_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcBuilding_ElevationOfTerrainAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Building Address feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBuildingAddressPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcBuilding_BuildingAddress_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcBuilding_BuildingAddress_feature", "_UI_IfcBuilding_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcBuilding_BuildingAddress(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns IfcBuilding.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcBuilding"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IfcBuilding)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_IfcBuilding_type") :
			getString("_UI_IfcBuilding_type") + " " + label;
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

		switch (notification.getFeatureID(IfcBuilding.class)) {
			case Ifc2x3tc1Package.IFC_BUILDING__ELEVATION_OF_REF_HEIGHT:
			case Ifc2x3tc1Package.IFC_BUILDING__ELEVATION_OF_REF_HEIGHT_AS_STRING:
			case Ifc2x3tc1Package.IFC_BUILDING__ELEVATION_OF_TERRAIN:
			case Ifc2x3tc1Package.IFC_BUILDING__ELEVATION_OF_TERRAIN_AS_STRING:
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
