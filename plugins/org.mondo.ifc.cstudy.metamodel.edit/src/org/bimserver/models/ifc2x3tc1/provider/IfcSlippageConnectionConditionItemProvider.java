/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcSlippageConnectionCondition;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcSlippageConnectionCondition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcSlippageConnectionConditionItemProvider extends IfcStructuralConnectionConditionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSlippageConnectionConditionItemProvider(AdapterFactory adapterFactory) {
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

			addSlippageXPropertyDescriptor(object);
			addSlippageXAsStringPropertyDescriptor(object);
			addSlippageYPropertyDescriptor(object);
			addSlippageYAsStringPropertyDescriptor(object);
			addSlippageZPropertyDescriptor(object);
			addSlippageZAsStringPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Slippage X feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSlippageXPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcSlippageConnectionCondition_SlippageX_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcSlippageConnectionCondition_SlippageX_feature", "_UI_IfcSlippageConnectionCondition_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcSlippageConnectionCondition_SlippageX(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Slippage XAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSlippageXAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcSlippageConnectionCondition_SlippageXAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcSlippageConnectionCondition_SlippageXAsString_feature", "_UI_IfcSlippageConnectionCondition_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcSlippageConnectionCondition_SlippageXAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Slippage Y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSlippageYPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcSlippageConnectionCondition_SlippageY_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcSlippageConnectionCondition_SlippageY_feature", "_UI_IfcSlippageConnectionCondition_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcSlippageConnectionCondition_SlippageY(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Slippage YAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSlippageYAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcSlippageConnectionCondition_SlippageYAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcSlippageConnectionCondition_SlippageYAsString_feature", "_UI_IfcSlippageConnectionCondition_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcSlippageConnectionCondition_SlippageYAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Slippage Z feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSlippageZPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcSlippageConnectionCondition_SlippageZ_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcSlippageConnectionCondition_SlippageZ_feature", "_UI_IfcSlippageConnectionCondition_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcSlippageConnectionCondition_SlippageZ(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Slippage ZAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSlippageZAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcSlippageConnectionCondition_SlippageZAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcSlippageConnectionCondition_SlippageZAsString_feature", "_UI_IfcSlippageConnectionCondition_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcSlippageConnectionCondition_SlippageZAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcSlippageConnectionCondition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcSlippageConnectionCondition"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IfcSlippageConnectionCondition)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_IfcSlippageConnectionCondition_type") :
			getString("_UI_IfcSlippageConnectionCondition_type") + " " + label;
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

		switch (notification.getFeatureID(IfcSlippageConnectionCondition.class)) {
			case Ifc2x3tc1Package.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_X:
			case Ifc2x3tc1Package.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_XAS_STRING:
			case Ifc2x3tc1Package.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_Y:
			case Ifc2x3tc1Package.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_YAS_STRING:
			case Ifc2x3tc1Package.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_Z:
			case Ifc2x3tc1Package.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_ZAS_STRING:
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
