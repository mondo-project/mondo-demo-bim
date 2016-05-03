/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcAddressTypeEnum;
import org.bimserver.models.ifc2x3tc1.IfcPostalAddress;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcPostalAddress} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcPostalAddressItemProvider extends IfcAddressItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPostalAddressItemProvider(AdapterFactory adapterFactory) {
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

			addInternalLocationPropertyDescriptor(object);
			addAddressLinesPropertyDescriptor(object);
			addPostalBoxPropertyDescriptor(object);
			addTownPropertyDescriptor(object);
			addRegionPropertyDescriptor(object);
			addPostalCodePropertyDescriptor(object);
			addCountryPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Internal Location feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInternalLocationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcPostalAddress_InternalLocation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcPostalAddress_InternalLocation_feature", "_UI_IfcPostalAddress_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcPostalAddress_InternalLocation(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Address Lines feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAddressLinesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcPostalAddress_AddressLines_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcPostalAddress_AddressLines_feature", "_UI_IfcPostalAddress_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcPostalAddress_AddressLines(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Postal Box feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPostalBoxPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcPostalAddress_PostalBox_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcPostalAddress_PostalBox_feature", "_UI_IfcPostalAddress_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcPostalAddress_PostalBox(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Town feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTownPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcPostalAddress_Town_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcPostalAddress_Town_feature", "_UI_IfcPostalAddress_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcPostalAddress_Town(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Region feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRegionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcPostalAddress_Region_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcPostalAddress_Region_feature", "_UI_IfcPostalAddress_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcPostalAddress_Region(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Postal Code feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPostalCodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcPostalAddress_PostalCode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcPostalAddress_PostalCode_feature", "_UI_IfcPostalAddress_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcPostalAddress_PostalCode(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Country feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCountryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcPostalAddress_Country_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcPostalAddress_Country_feature", "_UI_IfcPostalAddress_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcPostalAddress_Country(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcPostalAddress.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcPostalAddress"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		IfcAddressTypeEnum labelValue = ((IfcPostalAddress)object).getPurpose();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_IfcPostalAddress_type") :
			getString("_UI_IfcPostalAddress_type") + " " + label;
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

		switch (notification.getFeatureID(IfcPostalAddress.class)) {
			case Ifc2x3tc1Package.IFC_POSTAL_ADDRESS__INTERNAL_LOCATION:
			case Ifc2x3tc1Package.IFC_POSTAL_ADDRESS__ADDRESS_LINES:
			case Ifc2x3tc1Package.IFC_POSTAL_ADDRESS__POSTAL_BOX:
			case Ifc2x3tc1Package.IFC_POSTAL_ADDRESS__TOWN:
			case Ifc2x3tc1Package.IFC_POSTAL_ADDRESS__REGION:
			case Ifc2x3tc1Package.IFC_POSTAL_ADDRESS__POSTAL_CODE:
			case Ifc2x3tc1Package.IFC_POSTAL_ADDRESS__COUNTRY:
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
