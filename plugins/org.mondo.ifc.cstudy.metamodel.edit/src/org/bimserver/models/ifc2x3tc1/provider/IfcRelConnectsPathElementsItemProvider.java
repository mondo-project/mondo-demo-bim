/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcRelConnectsPathElements;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcRelConnectsPathElements} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcRelConnectsPathElementsItemProvider extends IfcRelConnectsElementsItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelConnectsPathElementsItemProvider(AdapterFactory adapterFactory) {
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

			addRelatingPrioritiesPropertyDescriptor(object);
			addRelatedPrioritiesPropertyDescriptor(object);
			addRelatedConnectionTypePropertyDescriptor(object);
			addRelatingConnectionTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Relating Priorities feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRelatingPrioritiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcRelConnectsPathElements_RelatingPriorities_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcRelConnectsPathElements_RelatingPriorities_feature", "_UI_IfcRelConnectsPathElements_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcRelConnectsPathElements_RelatingPriorities(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Related Priorities feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRelatedPrioritiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcRelConnectsPathElements_RelatedPriorities_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcRelConnectsPathElements_RelatedPriorities_feature", "_UI_IfcRelConnectsPathElements_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcRelConnectsPathElements_RelatedPriorities(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Related Connection Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRelatedConnectionTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcRelConnectsPathElements_RelatedConnectionType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcRelConnectsPathElements_RelatedConnectionType_feature", "_UI_IfcRelConnectsPathElements_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcRelConnectsPathElements_RelatedConnectionType(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Relating Connection Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRelatingConnectionTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcRelConnectsPathElements_RelatingConnectionType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcRelConnectsPathElements_RelatingConnectionType_feature", "_UI_IfcRelConnectsPathElements_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcRelConnectsPathElements_RelatingConnectionType(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcRelConnectsPathElements.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcRelConnectsPathElements"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IfcRelConnectsPathElements)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_IfcRelConnectsPathElements_type") :
			getString("_UI_IfcRelConnectsPathElements_type") + " " + label;
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

		switch (notification.getFeatureID(IfcRelConnectsPathElements.class)) {
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_PATH_ELEMENTS__RELATING_PRIORITIES:
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_PATH_ELEMENTS__RELATED_PRIORITIES:
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_PATH_ELEMENTS__RELATED_CONNECTION_TYPE:
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_PATH_ELEMENTS__RELATING_CONNECTION_TYPE:
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
