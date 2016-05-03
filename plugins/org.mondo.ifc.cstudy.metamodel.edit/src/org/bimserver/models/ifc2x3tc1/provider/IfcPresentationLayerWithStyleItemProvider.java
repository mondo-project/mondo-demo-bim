/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcPresentationLayerWithStyle;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcPresentationLayerWithStyle} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcPresentationLayerWithStyleItemProvider extends IfcPresentationLayerAssignmentItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPresentationLayerWithStyleItemProvider(AdapterFactory adapterFactory) {
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

			addLayerOnPropertyDescriptor(object);
			addLayerFrozenPropertyDescriptor(object);
			addLayerBlockedPropertyDescriptor(object);
			addLayerStylesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Layer On feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLayerOnPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcPresentationLayerWithStyle_LayerOn_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcPresentationLayerWithStyle_LayerOn_feature", "_UI_IfcPresentationLayerWithStyle_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcPresentationLayerWithStyle_LayerOn(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Layer Frozen feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLayerFrozenPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcPresentationLayerWithStyle_LayerFrozen_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcPresentationLayerWithStyle_LayerFrozen_feature", "_UI_IfcPresentationLayerWithStyle_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcPresentationLayerWithStyle_LayerFrozen(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Layer Blocked feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLayerBlockedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcPresentationLayerWithStyle_LayerBlocked_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcPresentationLayerWithStyle_LayerBlocked_feature", "_UI_IfcPresentationLayerWithStyle_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcPresentationLayerWithStyle_LayerBlocked(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Layer Styles feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLayerStylesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcPresentationLayerWithStyle_LayerStyles_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcPresentationLayerWithStyle_LayerStyles_feature", "_UI_IfcPresentationLayerWithStyle_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcPresentationLayerWithStyle_LayerStyles(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns IfcPresentationLayerWithStyle.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcPresentationLayerWithStyle"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IfcPresentationLayerWithStyle)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_IfcPresentationLayerWithStyle_type") :
			getString("_UI_IfcPresentationLayerWithStyle_type") + " " + label;
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

		switch (notification.getFeatureID(IfcPresentationLayerWithStyle.class)) {
			case Ifc2x3tc1Package.IFC_PRESENTATION_LAYER_WITH_STYLE__LAYER_ON:
			case Ifc2x3tc1Package.IFC_PRESENTATION_LAYER_WITH_STYLE__LAYER_FROZEN:
			case Ifc2x3tc1Package.IFC_PRESENTATION_LAYER_WITH_STYLE__LAYER_BLOCKED:
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
