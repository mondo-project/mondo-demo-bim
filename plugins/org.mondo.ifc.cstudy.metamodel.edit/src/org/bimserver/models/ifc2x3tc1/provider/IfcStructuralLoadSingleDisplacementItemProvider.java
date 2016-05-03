/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcStructuralLoadSingleDisplacement;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcStructuralLoadSingleDisplacement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcStructuralLoadSingleDisplacementItemProvider extends IfcStructuralLoadStaticItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralLoadSingleDisplacementItemProvider(AdapterFactory adapterFactory) {
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

			addDisplacementXPropertyDescriptor(object);
			addDisplacementXAsStringPropertyDescriptor(object);
			addDisplacementYPropertyDescriptor(object);
			addDisplacementYAsStringPropertyDescriptor(object);
			addDisplacementZPropertyDescriptor(object);
			addDisplacementZAsStringPropertyDescriptor(object);
			addRotationalDisplacementRXPropertyDescriptor(object);
			addRotationalDisplacementRXAsStringPropertyDescriptor(object);
			addRotationalDisplacementRYPropertyDescriptor(object);
			addRotationalDisplacementRYAsStringPropertyDescriptor(object);
			addRotationalDisplacementRZPropertyDescriptor(object);
			addRotationalDisplacementRZAsStringPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Displacement X feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDisplacementXPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralLoadSingleDisplacement_DisplacementX_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralLoadSingleDisplacement_DisplacementX_feature", "_UI_IfcStructuralLoadSingleDisplacement_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadSingleDisplacement_DisplacementX(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Displacement XAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDisplacementXAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralLoadSingleDisplacement_DisplacementXAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralLoadSingleDisplacement_DisplacementXAsString_feature", "_UI_IfcStructuralLoadSingleDisplacement_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadSingleDisplacement_DisplacementXAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Displacement Y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDisplacementYPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralLoadSingleDisplacement_DisplacementY_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralLoadSingleDisplacement_DisplacementY_feature", "_UI_IfcStructuralLoadSingleDisplacement_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadSingleDisplacement_DisplacementY(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Displacement YAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDisplacementYAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralLoadSingleDisplacement_DisplacementYAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralLoadSingleDisplacement_DisplacementYAsString_feature", "_UI_IfcStructuralLoadSingleDisplacement_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadSingleDisplacement_DisplacementYAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Displacement Z feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDisplacementZPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralLoadSingleDisplacement_DisplacementZ_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralLoadSingleDisplacement_DisplacementZ_feature", "_UI_IfcStructuralLoadSingleDisplacement_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadSingleDisplacement_DisplacementZ(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Displacement ZAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDisplacementZAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralLoadSingleDisplacement_DisplacementZAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralLoadSingleDisplacement_DisplacementZAsString_feature", "_UI_IfcStructuralLoadSingleDisplacement_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadSingleDisplacement_DisplacementZAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rotational Displacement RX feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRotationalDisplacementRXPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralLoadSingleDisplacement_RotationalDisplacementRX_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralLoadSingleDisplacement_RotationalDisplacementRX_feature", "_UI_IfcStructuralLoadSingleDisplacement_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadSingleDisplacement_RotationalDisplacementRX(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rotational Displacement RX As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRotationalDisplacementRXAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralLoadSingleDisplacement_RotationalDisplacementRXAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralLoadSingleDisplacement_RotationalDisplacementRXAsString_feature", "_UI_IfcStructuralLoadSingleDisplacement_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadSingleDisplacement_RotationalDisplacementRXAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rotational Displacement RY feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRotationalDisplacementRYPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralLoadSingleDisplacement_RotationalDisplacementRY_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralLoadSingleDisplacement_RotationalDisplacementRY_feature", "_UI_IfcStructuralLoadSingleDisplacement_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadSingleDisplacement_RotationalDisplacementRY(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rotational Displacement RY As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRotationalDisplacementRYAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralLoadSingleDisplacement_RotationalDisplacementRYAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralLoadSingleDisplacement_RotationalDisplacementRYAsString_feature", "_UI_IfcStructuralLoadSingleDisplacement_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadSingleDisplacement_RotationalDisplacementRYAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rotational Displacement RZ feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRotationalDisplacementRZPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralLoadSingleDisplacement_RotationalDisplacementRZ_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralLoadSingleDisplacement_RotationalDisplacementRZ_feature", "_UI_IfcStructuralLoadSingleDisplacement_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadSingleDisplacement_RotationalDisplacementRZ(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rotational Displacement RZ As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRotationalDisplacementRZAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralLoadSingleDisplacement_RotationalDisplacementRZAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralLoadSingleDisplacement_RotationalDisplacementRZAsString_feature", "_UI_IfcStructuralLoadSingleDisplacement_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadSingleDisplacement_RotationalDisplacementRZAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcStructuralLoadSingleDisplacement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcStructuralLoadSingleDisplacement"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IfcStructuralLoadSingleDisplacement)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_IfcStructuralLoadSingleDisplacement_type") :
			getString("_UI_IfcStructuralLoadSingleDisplacement_type") + " " + label;
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

		switch (notification.getFeatureID(IfcStructuralLoadSingleDisplacement.class)) {
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__DISPLACEMENT_X:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__DISPLACEMENT_XAS_STRING:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__DISPLACEMENT_Y:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__DISPLACEMENT_YAS_STRING:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__DISPLACEMENT_Z:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__DISPLACEMENT_ZAS_STRING:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__ROTATIONAL_DISPLACEMENT_RX:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__ROTATIONAL_DISPLACEMENT_RX_AS_STRING:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__ROTATIONAL_DISPLACEMENT_RY:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__ROTATIONAL_DISPLACEMENT_RY_AS_STRING:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__ROTATIONAL_DISPLACEMENT_RZ:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__ROTATIONAL_DISPLACEMENT_RZ_AS_STRING:
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
