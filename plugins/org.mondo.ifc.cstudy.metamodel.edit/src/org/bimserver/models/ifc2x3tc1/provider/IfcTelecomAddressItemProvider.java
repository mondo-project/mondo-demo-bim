/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcAddressTypeEnum;
import org.bimserver.models.ifc2x3tc1.IfcTelecomAddress;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcTelecomAddress} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcTelecomAddressItemProvider extends IfcAddressItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTelecomAddressItemProvider(AdapterFactory adapterFactory) {
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

			addTelephoneNumbersPropertyDescriptor(object);
			addFacsimileNumbersPropertyDescriptor(object);
			addPagerNumberPropertyDescriptor(object);
			addElectronicMailAddressesPropertyDescriptor(object);
			addWWWHomePageURLPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Telephone Numbers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTelephoneNumbersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcTelecomAddress_TelephoneNumbers_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcTelecomAddress_TelephoneNumbers_feature", "_UI_IfcTelecomAddress_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcTelecomAddress_TelephoneNumbers(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Facsimile Numbers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFacsimileNumbersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcTelecomAddress_FacsimileNumbers_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcTelecomAddress_FacsimileNumbers_feature", "_UI_IfcTelecomAddress_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcTelecomAddress_FacsimileNumbers(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pager Number feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPagerNumberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcTelecomAddress_PagerNumber_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcTelecomAddress_PagerNumber_feature", "_UI_IfcTelecomAddress_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcTelecomAddress_PagerNumber(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Electronic Mail Addresses feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addElectronicMailAddressesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcTelecomAddress_ElectronicMailAddresses_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcTelecomAddress_ElectronicMailAddresses_feature", "_UI_IfcTelecomAddress_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcTelecomAddress_ElectronicMailAddresses(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the WWW Home Page URL feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWWWHomePageURLPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcTelecomAddress_WWWHomePageURL_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcTelecomAddress_WWWHomePageURL_feature", "_UI_IfcTelecomAddress_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcTelecomAddress_WWWHomePageURL(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcTelecomAddress.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcTelecomAddress"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		IfcAddressTypeEnum labelValue = ((IfcTelecomAddress)object).getPurpose();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_IfcTelecomAddress_type") :
			getString("_UI_IfcTelecomAddress_type") + " " + label;
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

		switch (notification.getFeatureID(IfcTelecomAddress.class)) {
			case Ifc2x3tc1Package.IFC_TELECOM_ADDRESS__TELEPHONE_NUMBERS:
			case Ifc2x3tc1Package.IFC_TELECOM_ADDRESS__FACSIMILE_NUMBERS:
			case Ifc2x3tc1Package.IFC_TELECOM_ADDRESS__PAGER_NUMBER:
			case Ifc2x3tc1Package.IFC_TELECOM_ADDRESS__ELECTRONIC_MAIL_ADDRESSES:
			case Ifc2x3tc1Package.IFC_TELECOM_ADDRESS__WWW_HOME_PAGE_URL:
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
