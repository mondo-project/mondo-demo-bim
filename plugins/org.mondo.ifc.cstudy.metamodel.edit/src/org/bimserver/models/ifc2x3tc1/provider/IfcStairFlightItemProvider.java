/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcStairFlight;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcStairFlight} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcStairFlightItemProvider extends IfcBuildingElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStairFlightItemProvider(AdapterFactory adapterFactory) {
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

			addNumberOfRiserPropertyDescriptor(object);
			addNumberOfTreadsPropertyDescriptor(object);
			addRiserHeightPropertyDescriptor(object);
			addRiserHeightAsStringPropertyDescriptor(object);
			addTreadLengthPropertyDescriptor(object);
			addTreadLengthAsStringPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Number Of Riser feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumberOfRiserPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStairFlight_NumberOfRiser_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStairFlight_NumberOfRiser_feature", "_UI_IfcStairFlight_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStairFlight_NumberOfRiser(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Number Of Treads feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumberOfTreadsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStairFlight_NumberOfTreads_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStairFlight_NumberOfTreads_feature", "_UI_IfcStairFlight_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStairFlight_NumberOfTreads(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Riser Height feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRiserHeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStairFlight_RiserHeight_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStairFlight_RiserHeight_feature", "_UI_IfcStairFlight_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStairFlight_RiserHeight(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Riser Height As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRiserHeightAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStairFlight_RiserHeightAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStairFlight_RiserHeightAsString_feature", "_UI_IfcStairFlight_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStairFlight_RiserHeightAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tread Length feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTreadLengthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStairFlight_TreadLength_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStairFlight_TreadLength_feature", "_UI_IfcStairFlight_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStairFlight_TreadLength(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tread Length As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTreadLengthAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStairFlight_TreadLengthAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStairFlight_TreadLengthAsString_feature", "_UI_IfcStairFlight_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStairFlight_TreadLengthAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcStairFlight.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcStairFlight"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IfcStairFlight)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_IfcStairFlight_type") :
			getString("_UI_IfcStairFlight_type") + " " + label;
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

		switch (notification.getFeatureID(IfcStairFlight.class)) {
			case Ifc2x3tc1Package.IFC_STAIR_FLIGHT__NUMBER_OF_RISER:
			case Ifc2x3tc1Package.IFC_STAIR_FLIGHT__NUMBER_OF_TREADS:
			case Ifc2x3tc1Package.IFC_STAIR_FLIGHT__RISER_HEIGHT:
			case Ifc2x3tc1Package.IFC_STAIR_FLIGHT__RISER_HEIGHT_AS_STRING:
			case Ifc2x3tc1Package.IFC_STAIR_FLIGHT__TREAD_LENGTH:
			case Ifc2x3tc1Package.IFC_STAIR_FLIGHT__TREAD_LENGTH_AS_STRING:
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
