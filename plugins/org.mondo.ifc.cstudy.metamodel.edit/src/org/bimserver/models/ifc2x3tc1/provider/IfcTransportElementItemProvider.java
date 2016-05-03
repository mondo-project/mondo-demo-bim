/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcTransportElement;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcTransportElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcTransportElementItemProvider extends IfcElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTransportElementItemProvider(AdapterFactory adapterFactory) {
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

			addOperationTypePropertyDescriptor(object);
			addCapacityByWeightPropertyDescriptor(object);
			addCapacityByWeightAsStringPropertyDescriptor(object);
			addCapacityByNumberPropertyDescriptor(object);
			addCapacityByNumberAsStringPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Operation Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOperationTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcTransportElement_OperationType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcTransportElement_OperationType_feature", "_UI_IfcTransportElement_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcTransportElement_OperationType(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Capacity By Weight feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCapacityByWeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcTransportElement_CapacityByWeight_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcTransportElement_CapacityByWeight_feature", "_UI_IfcTransportElement_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcTransportElement_CapacityByWeight(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Capacity By Weight As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCapacityByWeightAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcTransportElement_CapacityByWeightAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcTransportElement_CapacityByWeightAsString_feature", "_UI_IfcTransportElement_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcTransportElement_CapacityByWeightAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Capacity By Number feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCapacityByNumberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcTransportElement_CapacityByNumber_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcTransportElement_CapacityByNumber_feature", "_UI_IfcTransportElement_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcTransportElement_CapacityByNumber(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Capacity By Number As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCapacityByNumberAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcTransportElement_CapacityByNumberAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcTransportElement_CapacityByNumberAsString_feature", "_UI_IfcTransportElement_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcTransportElement_CapacityByNumberAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcTransportElement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcTransportElement"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IfcTransportElement)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_IfcTransportElement_type") :
			getString("_UI_IfcTransportElement_type") + " " + label;
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

		switch (notification.getFeatureID(IfcTransportElement.class)) {
			case Ifc2x3tc1Package.IFC_TRANSPORT_ELEMENT__OPERATION_TYPE:
			case Ifc2x3tc1Package.IFC_TRANSPORT_ELEMENT__CAPACITY_BY_WEIGHT:
			case Ifc2x3tc1Package.IFC_TRANSPORT_ELEMENT__CAPACITY_BY_WEIGHT_AS_STRING:
			case Ifc2x3tc1Package.IFC_TRANSPORT_ELEMENT__CAPACITY_BY_NUMBER:
			case Ifc2x3tc1Package.IFC_TRANSPORT_ELEMENT__CAPACITY_BY_NUMBER_AS_STRING:
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
