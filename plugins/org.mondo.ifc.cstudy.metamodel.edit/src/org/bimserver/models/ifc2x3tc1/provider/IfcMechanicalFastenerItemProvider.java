/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcMechanicalFastener;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcMechanicalFastener} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcMechanicalFastenerItemProvider extends IfcFastenerItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMechanicalFastenerItemProvider(AdapterFactory adapterFactory) {
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

			addNominalDiameterPropertyDescriptor(object);
			addNominalDiameterAsStringPropertyDescriptor(object);
			addNominalLengthPropertyDescriptor(object);
			addNominalLengthAsStringPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Nominal Diameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNominalDiameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcMechanicalFastener_NominalDiameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcMechanicalFastener_NominalDiameter_feature", "_UI_IfcMechanicalFastener_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcMechanicalFastener_NominalDiameter(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nominal Diameter As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNominalDiameterAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcMechanicalFastener_NominalDiameterAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcMechanicalFastener_NominalDiameterAsString_feature", "_UI_IfcMechanicalFastener_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcMechanicalFastener_NominalDiameterAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nominal Length feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNominalLengthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcMechanicalFastener_NominalLength_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcMechanicalFastener_NominalLength_feature", "_UI_IfcMechanicalFastener_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcMechanicalFastener_NominalLength(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nominal Length As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNominalLengthAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcMechanicalFastener_NominalLengthAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcMechanicalFastener_NominalLengthAsString_feature", "_UI_IfcMechanicalFastener_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcMechanicalFastener_NominalLengthAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcMechanicalFastener.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcMechanicalFastener"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IfcMechanicalFastener)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_IfcMechanicalFastener_type") :
			getString("_UI_IfcMechanicalFastener_type") + " " + label;
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

		switch (notification.getFeatureID(IfcMechanicalFastener.class)) {
			case Ifc2x3tc1Package.IFC_MECHANICAL_FASTENER__NOMINAL_DIAMETER:
			case Ifc2x3tc1Package.IFC_MECHANICAL_FASTENER__NOMINAL_DIAMETER_AS_STRING:
			case Ifc2x3tc1Package.IFC_MECHANICAL_FASTENER__NOMINAL_LENGTH:
			case Ifc2x3tc1Package.IFC_MECHANICAL_FASTENER__NOMINAL_LENGTH_AS_STRING:
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
