/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcStructuralLoadGroup;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcStructuralLoadGroup} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcStructuralLoadGroupItemProvider extends IfcGroupItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralLoadGroupItemProvider(AdapterFactory adapterFactory) {
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

			addPredefinedTypePropertyDescriptor(object);
			addActionTypePropertyDescriptor(object);
			addActionSourcePropertyDescriptor(object);
			addCoefficientPropertyDescriptor(object);
			addCoefficientAsStringPropertyDescriptor(object);
			addPurposePropertyDescriptor(object);
			addSourceOfResultGroupPropertyDescriptor(object);
			addLoadGroupForPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Predefined Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPredefinedTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralLoadGroup_PredefinedType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralLoadGroup_PredefinedType_feature", "_UI_IfcStructuralLoadGroup_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadGroup_PredefinedType(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Action Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActionTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralLoadGroup_ActionType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralLoadGroup_ActionType_feature", "_UI_IfcStructuralLoadGroup_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadGroup_ActionType(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Action Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActionSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralLoadGroup_ActionSource_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralLoadGroup_ActionSource_feature", "_UI_IfcStructuralLoadGroup_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadGroup_ActionSource(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Coefficient feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCoefficientPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralLoadGroup_Coefficient_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralLoadGroup_Coefficient_feature", "_UI_IfcStructuralLoadGroup_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadGroup_Coefficient(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Coefficient As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCoefficientAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralLoadGroup_CoefficientAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralLoadGroup_CoefficientAsString_feature", "_UI_IfcStructuralLoadGroup_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadGroup_CoefficientAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Purpose feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPurposePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralLoadGroup_Purpose_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralLoadGroup_Purpose_feature", "_UI_IfcStructuralLoadGroup_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadGroup_Purpose(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source Of Result Group feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceOfResultGroupPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralLoadGroup_SourceOfResultGroup_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralLoadGroup_SourceOfResultGroup_feature", "_UI_IfcStructuralLoadGroup_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadGroup_SourceOfResultGroup(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Load Group For feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLoadGroupForPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralLoadGroup_LoadGroupFor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralLoadGroup_LoadGroupFor_feature", "_UI_IfcStructuralLoadGroup_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadGroup_LoadGroupFor(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns IfcStructuralLoadGroup.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcStructuralLoadGroup"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IfcStructuralLoadGroup)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_IfcStructuralLoadGroup_type") :
			getString("_UI_IfcStructuralLoadGroup_type") + " " + label;
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

		switch (notification.getFeatureID(IfcStructuralLoadGroup.class)) {
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_GROUP__PREDEFINED_TYPE:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_GROUP__ACTION_TYPE:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_GROUP__ACTION_SOURCE:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_GROUP__COEFFICIENT:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_GROUP__COEFFICIENT_AS_STRING:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_GROUP__PURPOSE:
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
