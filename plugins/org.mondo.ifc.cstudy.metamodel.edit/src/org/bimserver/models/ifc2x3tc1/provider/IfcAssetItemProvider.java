/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcAsset;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcAsset} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcAssetItemProvider extends IfcGroupItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAssetItemProvider(AdapterFactory adapterFactory) {
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

			addAssetIDPropertyDescriptor(object);
			addOriginalValuePropertyDescriptor(object);
			addCurrentValuePropertyDescriptor(object);
			addTotalReplacementCostPropertyDescriptor(object);
			addOwnerPropertyDescriptor(object);
			addUserPropertyDescriptor(object);
			addResponsiblePersonPropertyDescriptor(object);
			addIncorporationDatePropertyDescriptor(object);
			addDepreciatedValuePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Asset ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssetIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcAsset_AssetID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcAsset_AssetID_feature", "_UI_IfcAsset_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcAsset_AssetID(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Original Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOriginalValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcAsset_OriginalValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcAsset_OriginalValue_feature", "_UI_IfcAsset_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcAsset_OriginalValue(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Current Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrentValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcAsset_CurrentValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcAsset_CurrentValue_feature", "_UI_IfcAsset_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcAsset_CurrentValue(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Total Replacement Cost feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTotalReplacementCostPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcAsset_TotalReplacementCost_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcAsset_TotalReplacementCost_feature", "_UI_IfcAsset_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcAsset_TotalReplacementCost(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Owner feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcAsset_Owner_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcAsset_Owner_feature", "_UI_IfcAsset_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcAsset_Owner(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the User feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUserPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcAsset_User_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcAsset_User_feature", "_UI_IfcAsset_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcAsset_User(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Responsible Person feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResponsiblePersonPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcAsset_ResponsiblePerson_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcAsset_ResponsiblePerson_feature", "_UI_IfcAsset_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcAsset_ResponsiblePerson(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Incorporation Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncorporationDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcAsset_IncorporationDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcAsset_IncorporationDate_feature", "_UI_IfcAsset_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcAsset_IncorporationDate(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Depreciated Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDepreciatedValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcAsset_DepreciatedValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcAsset_DepreciatedValue_feature", "_UI_IfcAsset_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcAsset_DepreciatedValue(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns IfcAsset.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcAsset"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IfcAsset)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_IfcAsset_type") :
			getString("_UI_IfcAsset_type") + " " + label;
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

		switch (notification.getFeatureID(IfcAsset.class)) {
			case Ifc2x3tc1Package.IFC_ASSET__ASSET_ID:
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
