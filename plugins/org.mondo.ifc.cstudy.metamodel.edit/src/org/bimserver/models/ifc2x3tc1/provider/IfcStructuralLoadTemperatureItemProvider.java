/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcStructuralLoadTemperature;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcStructuralLoadTemperature} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcStructuralLoadTemperatureItemProvider extends IfcStructuralLoadStaticItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralLoadTemperatureItemProvider(AdapterFactory adapterFactory) {
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

			addDeltaT_ConstantPropertyDescriptor(object);
			addDeltaT_ConstantAsStringPropertyDescriptor(object);
			addDeltaT_YPropertyDescriptor(object);
			addDeltaT_YAsStringPropertyDescriptor(object);
			addDeltaT_ZPropertyDescriptor(object);
			addDeltaT_ZAsStringPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Delta TConstant feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeltaT_ConstantPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralLoadTemperature_DeltaT_Constant_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralLoadTemperature_DeltaT_Constant_feature", "_UI_IfcStructuralLoadTemperature_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadTemperature_DeltaT_Constant(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Delta TConstant As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeltaT_ConstantAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralLoadTemperature_DeltaT_ConstantAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralLoadTemperature_DeltaT_ConstantAsString_feature", "_UI_IfcStructuralLoadTemperature_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadTemperature_DeltaT_ConstantAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Delta TY feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeltaT_YPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralLoadTemperature_DeltaT_Y_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralLoadTemperature_DeltaT_Y_feature", "_UI_IfcStructuralLoadTemperature_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadTemperature_DeltaT_Y(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Delta TYAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeltaT_YAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralLoadTemperature_DeltaT_YAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralLoadTemperature_DeltaT_YAsString_feature", "_UI_IfcStructuralLoadTemperature_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadTemperature_DeltaT_YAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Delta TZ feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeltaT_ZPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralLoadTemperature_DeltaT_Z_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralLoadTemperature_DeltaT_Z_feature", "_UI_IfcStructuralLoadTemperature_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadTemperature_DeltaT_Z(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Delta TZAs String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeltaT_ZAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralLoadTemperature_DeltaT_ZAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralLoadTemperature_DeltaT_ZAsString_feature", "_UI_IfcStructuralLoadTemperature_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadTemperature_DeltaT_ZAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcStructuralLoadTemperature.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcStructuralLoadTemperature"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IfcStructuralLoadTemperature)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_IfcStructuralLoadTemperature_type") :
			getString("_UI_IfcStructuralLoadTemperature_type") + " " + label;
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

		switch (notification.getFeatureID(IfcStructuralLoadTemperature.class)) {
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_TEMPERATURE__DELTA_TCONSTANT:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_TEMPERATURE__DELTA_TCONSTANT_AS_STRING:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_TEMPERATURE__DELTA_TY:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_TEMPERATURE__DELTA_TYAS_STRING:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_TEMPERATURE__DELTA_TZ:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_TEMPERATURE__DELTA_TZAS_STRING:
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
