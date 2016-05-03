/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcWorkControl;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcWorkControl} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcWorkControlItemProvider extends IfcControlItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcWorkControlItemProvider(AdapterFactory adapterFactory) {
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

			addIdentifierPropertyDescriptor(object);
			addCreationDatePropertyDescriptor(object);
			addCreatorsPropertyDescriptor(object);
			addPurposePropertyDescriptor(object);
			addDurationPropertyDescriptor(object);
			addDurationAsStringPropertyDescriptor(object);
			addTotalFloatPropertyDescriptor(object);
			addTotalFloatAsStringPropertyDescriptor(object);
			addStartTimePropertyDescriptor(object);
			addFinishTimePropertyDescriptor(object);
			addWorkControlTypePropertyDescriptor(object);
			addUserDefinedControlTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Identifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdentifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcWorkControl_Identifier_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcWorkControl_Identifier_feature", "_UI_IfcWorkControl_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcWorkControl_Identifier(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Creation Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreationDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcWorkControl_CreationDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcWorkControl_CreationDate_feature", "_UI_IfcWorkControl_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcWorkControl_CreationDate(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Creators feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreatorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcWorkControl_Creators_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcWorkControl_Creators_feature", "_UI_IfcWorkControl_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcWorkControl_Creators(),
				 true,
				 false,
				 true,
				 null,
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
				 getString("_UI_IfcWorkControl_Purpose_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcWorkControl_Purpose_feature", "_UI_IfcWorkControl_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcWorkControl_Purpose(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Duration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDurationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcWorkControl_Duration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcWorkControl_Duration_feature", "_UI_IfcWorkControl_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcWorkControl_Duration(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Duration As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDurationAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcWorkControl_DurationAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcWorkControl_DurationAsString_feature", "_UI_IfcWorkControl_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcWorkControl_DurationAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Total Float feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTotalFloatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcWorkControl_TotalFloat_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcWorkControl_TotalFloat_feature", "_UI_IfcWorkControl_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcWorkControl_TotalFloat(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Total Float As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTotalFloatAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcWorkControl_TotalFloatAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcWorkControl_TotalFloatAsString_feature", "_UI_IfcWorkControl_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcWorkControl_TotalFloatAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Start Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcWorkControl_StartTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcWorkControl_StartTime_feature", "_UI_IfcWorkControl_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcWorkControl_StartTime(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Finish Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFinishTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcWorkControl_FinishTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcWorkControl_FinishTime_feature", "_UI_IfcWorkControl_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcWorkControl_FinishTime(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Work Control Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWorkControlTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcWorkControl_WorkControlType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcWorkControl_WorkControlType_feature", "_UI_IfcWorkControl_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcWorkControl_WorkControlType(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the User Defined Control Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUserDefinedControlTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcWorkControl_UserDefinedControlType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcWorkControl_UserDefinedControlType_feature", "_UI_IfcWorkControl_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcWorkControl_UserDefinedControlType(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcWorkControl.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcWorkControl"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IfcWorkControl)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_IfcWorkControl_type") :
			getString("_UI_IfcWorkControl_type") + " " + label;
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

		switch (notification.getFeatureID(IfcWorkControl.class)) {
			case Ifc2x3tc1Package.IFC_WORK_CONTROL__IDENTIFIER:
			case Ifc2x3tc1Package.IFC_WORK_CONTROL__PURPOSE:
			case Ifc2x3tc1Package.IFC_WORK_CONTROL__DURATION:
			case Ifc2x3tc1Package.IFC_WORK_CONTROL__DURATION_AS_STRING:
			case Ifc2x3tc1Package.IFC_WORK_CONTROL__TOTAL_FLOAT:
			case Ifc2x3tc1Package.IFC_WORK_CONTROL__TOTAL_FLOAT_AS_STRING:
			case Ifc2x3tc1Package.IFC_WORK_CONTROL__WORK_CONTROL_TYPE:
			case Ifc2x3tc1Package.IFC_WORK_CONTROL__USER_DEFINED_CONTROL_TYPE:
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
