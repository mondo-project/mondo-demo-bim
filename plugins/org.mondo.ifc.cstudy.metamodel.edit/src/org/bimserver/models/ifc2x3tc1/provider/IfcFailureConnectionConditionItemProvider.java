/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcFailureConnectionCondition;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcFailureConnectionCondition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcFailureConnectionConditionItemProvider extends IfcStructuralConnectionConditionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFailureConnectionConditionItemProvider(AdapterFactory adapterFactory) {
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

			addTensionFailureXPropertyDescriptor(object);
			addTensionFailureXAsStringPropertyDescriptor(object);
			addTensionFailureYPropertyDescriptor(object);
			addTensionFailureYAsStringPropertyDescriptor(object);
			addTensionFailureZPropertyDescriptor(object);
			addTensionFailureZAsStringPropertyDescriptor(object);
			addCompressionFailureXPropertyDescriptor(object);
			addCompressionFailureXAsStringPropertyDescriptor(object);
			addCompressionFailureYPropertyDescriptor(object);
			addCompressionFailureYAsStringPropertyDescriptor(object);
			addCompressionFailureZPropertyDescriptor(object);
			addCompressionFailureZAsStringPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Tension Failure X feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTensionFailureXPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcFailureConnectionCondition_TensionFailureX_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcFailureConnectionCondition_TensionFailureX_feature", "_UI_IfcFailureConnectionCondition_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcFailureConnectionCondition_TensionFailureX(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tension Failure XAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTensionFailureXAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcFailureConnectionCondition_TensionFailureXAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcFailureConnectionCondition_TensionFailureXAsString_feature", "_UI_IfcFailureConnectionCondition_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcFailureConnectionCondition_TensionFailureXAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tension Failure Y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTensionFailureYPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcFailureConnectionCondition_TensionFailureY_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcFailureConnectionCondition_TensionFailureY_feature", "_UI_IfcFailureConnectionCondition_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcFailureConnectionCondition_TensionFailureY(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tension Failure YAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTensionFailureYAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcFailureConnectionCondition_TensionFailureYAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcFailureConnectionCondition_TensionFailureYAsString_feature", "_UI_IfcFailureConnectionCondition_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcFailureConnectionCondition_TensionFailureYAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tension Failure Z feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTensionFailureZPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcFailureConnectionCondition_TensionFailureZ_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcFailureConnectionCondition_TensionFailureZ_feature", "_UI_IfcFailureConnectionCondition_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcFailureConnectionCondition_TensionFailureZ(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tension Failure ZAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTensionFailureZAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcFailureConnectionCondition_TensionFailureZAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcFailureConnectionCondition_TensionFailureZAsString_feature", "_UI_IfcFailureConnectionCondition_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcFailureConnectionCondition_TensionFailureZAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Compression Failure X feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCompressionFailureXPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcFailureConnectionCondition_CompressionFailureX_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcFailureConnectionCondition_CompressionFailureX_feature", "_UI_IfcFailureConnectionCondition_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcFailureConnectionCondition_CompressionFailureX(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Compression Failure XAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCompressionFailureXAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcFailureConnectionCondition_CompressionFailureXAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcFailureConnectionCondition_CompressionFailureXAsString_feature", "_UI_IfcFailureConnectionCondition_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcFailureConnectionCondition_CompressionFailureXAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Compression Failure Y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCompressionFailureYPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcFailureConnectionCondition_CompressionFailureY_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcFailureConnectionCondition_CompressionFailureY_feature", "_UI_IfcFailureConnectionCondition_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcFailureConnectionCondition_CompressionFailureY(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Compression Failure YAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCompressionFailureYAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcFailureConnectionCondition_CompressionFailureYAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcFailureConnectionCondition_CompressionFailureYAsString_feature", "_UI_IfcFailureConnectionCondition_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcFailureConnectionCondition_CompressionFailureYAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Compression Failure Z feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCompressionFailureZPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcFailureConnectionCondition_CompressionFailureZ_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcFailureConnectionCondition_CompressionFailureZ_feature", "_UI_IfcFailureConnectionCondition_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcFailureConnectionCondition_CompressionFailureZ(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Compression Failure ZAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCompressionFailureZAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcFailureConnectionCondition_CompressionFailureZAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcFailureConnectionCondition_CompressionFailureZAsString_feature", "_UI_IfcFailureConnectionCondition_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcFailureConnectionCondition_CompressionFailureZAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcFailureConnectionCondition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcFailureConnectionCondition"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IfcFailureConnectionCondition)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_IfcFailureConnectionCondition_type") :
			getString("_UI_IfcFailureConnectionCondition_type") + " " + label;
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

		switch (notification.getFeatureID(IfcFailureConnectionCondition.class)) {
			case Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__TENSION_FAILURE_X:
			case Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__TENSION_FAILURE_XAS_STRING:
			case Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__TENSION_FAILURE_Y:
			case Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__TENSION_FAILURE_YAS_STRING:
			case Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__TENSION_FAILURE_Z:
			case Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__TENSION_FAILURE_ZAS_STRING:
			case Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__COMPRESSION_FAILURE_X:
			case Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__COMPRESSION_FAILURE_XAS_STRING:
			case Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__COMPRESSION_FAILURE_Y:
			case Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__COMPRESSION_FAILURE_YAS_STRING:
			case Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__COMPRESSION_FAILURE_Z:
			case Ifc2x3tc1Package.IFC_FAILURE_CONNECTION_CONDITION__COMPRESSION_FAILURE_ZAS_STRING:
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
