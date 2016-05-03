/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcPhysicalComplexQuantity;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcPhysicalComplexQuantity} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcPhysicalComplexQuantityItemProvider extends IfcPhysicalQuantityItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPhysicalComplexQuantityItemProvider(AdapterFactory adapterFactory) {
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

			addHasQuantitiesPropertyDescriptor(object);
			addDiscriminationPropertyDescriptor(object);
			addQualityPropertyDescriptor(object);
			addUsagePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Has Quantities feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasQuantitiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcPhysicalComplexQuantity_HasQuantities_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcPhysicalComplexQuantity_HasQuantities_feature", "_UI_IfcPhysicalComplexQuantity_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcPhysicalComplexQuantity_HasQuantities(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Discrimination feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDiscriminationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcPhysicalComplexQuantity_Discrimination_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcPhysicalComplexQuantity_Discrimination_feature", "_UI_IfcPhysicalComplexQuantity_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcPhysicalComplexQuantity_Discrimination(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Quality feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQualityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcPhysicalComplexQuantity_Quality_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcPhysicalComplexQuantity_Quality_feature", "_UI_IfcPhysicalComplexQuantity_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcPhysicalComplexQuantity_Quality(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Usage feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcPhysicalComplexQuantity_Usage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcPhysicalComplexQuantity_Usage_feature", "_UI_IfcPhysicalComplexQuantity_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcPhysicalComplexQuantity_Usage(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcPhysicalComplexQuantity.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcPhysicalComplexQuantity"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IfcPhysicalComplexQuantity)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_IfcPhysicalComplexQuantity_type") :
			getString("_UI_IfcPhysicalComplexQuantity_type") + " " + label;
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

		switch (notification.getFeatureID(IfcPhysicalComplexQuantity.class)) {
			case Ifc2x3tc1Package.IFC_PHYSICAL_COMPLEX_QUANTITY__DISCRIMINATION:
			case Ifc2x3tc1Package.IFC_PHYSICAL_COMPLEX_QUANTITY__QUALITY:
			case Ifc2x3tc1Package.IFC_PHYSICAL_COMPLEX_QUANTITY__USAGE:
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
