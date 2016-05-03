/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcScheduleTimeControl;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcScheduleTimeControl} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcScheduleTimeControlItemProvider extends IfcControlItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcScheduleTimeControlItemProvider(AdapterFactory adapterFactory) {
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

			addActualStartPropertyDescriptor(object);
			addEarlyStartPropertyDescriptor(object);
			addLateStartPropertyDescriptor(object);
			addScheduleStartPropertyDescriptor(object);
			addActualFinishPropertyDescriptor(object);
			addEarlyFinishPropertyDescriptor(object);
			addLateFinishPropertyDescriptor(object);
			addScheduleFinishPropertyDescriptor(object);
			addScheduleDurationPropertyDescriptor(object);
			addScheduleDurationAsStringPropertyDescriptor(object);
			addActualDurationPropertyDescriptor(object);
			addActualDurationAsStringPropertyDescriptor(object);
			addRemainingTimePropertyDescriptor(object);
			addRemainingTimeAsStringPropertyDescriptor(object);
			addFreeFloatPropertyDescriptor(object);
			addFreeFloatAsStringPropertyDescriptor(object);
			addTotalFloatPropertyDescriptor(object);
			addTotalFloatAsStringPropertyDescriptor(object);
			addIsCriticalPropertyDescriptor(object);
			addStatusTimePropertyDescriptor(object);
			addStartFloatPropertyDescriptor(object);
			addStartFloatAsStringPropertyDescriptor(object);
			addFinishFloatPropertyDescriptor(object);
			addFinishFloatAsStringPropertyDescriptor(object);
			addCompletionPropertyDescriptor(object);
			addCompletionAsStringPropertyDescriptor(object);
			addScheduleTimeControlAssignedPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Actual Start feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActualStartPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcScheduleTimeControl_ActualStart_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcScheduleTimeControl_ActualStart_feature", "_UI_IfcScheduleTimeControl_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcScheduleTimeControl_ActualStart(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Early Start feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEarlyStartPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcScheduleTimeControl_EarlyStart_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcScheduleTimeControl_EarlyStart_feature", "_UI_IfcScheduleTimeControl_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcScheduleTimeControl_EarlyStart(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Late Start feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLateStartPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcScheduleTimeControl_LateStart_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcScheduleTimeControl_LateStart_feature", "_UI_IfcScheduleTimeControl_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcScheduleTimeControl_LateStart(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Schedule Start feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScheduleStartPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcScheduleTimeControl_ScheduleStart_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcScheduleTimeControl_ScheduleStart_feature", "_UI_IfcScheduleTimeControl_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcScheduleTimeControl_ScheduleStart(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Actual Finish feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActualFinishPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcScheduleTimeControl_ActualFinish_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcScheduleTimeControl_ActualFinish_feature", "_UI_IfcScheduleTimeControl_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcScheduleTimeControl_ActualFinish(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Early Finish feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEarlyFinishPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcScheduleTimeControl_EarlyFinish_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcScheduleTimeControl_EarlyFinish_feature", "_UI_IfcScheduleTimeControl_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcScheduleTimeControl_EarlyFinish(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Late Finish feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLateFinishPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcScheduleTimeControl_LateFinish_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcScheduleTimeControl_LateFinish_feature", "_UI_IfcScheduleTimeControl_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcScheduleTimeControl_LateFinish(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Schedule Finish feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScheduleFinishPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcScheduleTimeControl_ScheduleFinish_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcScheduleTimeControl_ScheduleFinish_feature", "_UI_IfcScheduleTimeControl_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcScheduleTimeControl_ScheduleFinish(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Schedule Duration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScheduleDurationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcScheduleTimeControl_ScheduleDuration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcScheduleTimeControl_ScheduleDuration_feature", "_UI_IfcScheduleTimeControl_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcScheduleTimeControl_ScheduleDuration(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Schedule Duration As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScheduleDurationAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcScheduleTimeControl_ScheduleDurationAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcScheduleTimeControl_ScheduleDurationAsString_feature", "_UI_IfcScheduleTimeControl_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcScheduleTimeControl_ScheduleDurationAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Actual Duration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActualDurationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcScheduleTimeControl_ActualDuration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcScheduleTimeControl_ActualDuration_feature", "_UI_IfcScheduleTimeControl_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcScheduleTimeControl_ActualDuration(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Actual Duration As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActualDurationAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcScheduleTimeControl_ActualDurationAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcScheduleTimeControl_ActualDurationAsString_feature", "_UI_IfcScheduleTimeControl_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcScheduleTimeControl_ActualDurationAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Remaining Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRemainingTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcScheduleTimeControl_RemainingTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcScheduleTimeControl_RemainingTime_feature", "_UI_IfcScheduleTimeControl_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcScheduleTimeControl_RemainingTime(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Remaining Time As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRemainingTimeAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcScheduleTimeControl_RemainingTimeAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcScheduleTimeControl_RemainingTimeAsString_feature", "_UI_IfcScheduleTimeControl_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcScheduleTimeControl_RemainingTimeAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Free Float feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFreeFloatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcScheduleTimeControl_FreeFloat_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcScheduleTimeControl_FreeFloat_feature", "_UI_IfcScheduleTimeControl_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcScheduleTimeControl_FreeFloat(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Free Float As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFreeFloatAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcScheduleTimeControl_FreeFloatAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcScheduleTimeControl_FreeFloatAsString_feature", "_UI_IfcScheduleTimeControl_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcScheduleTimeControl_FreeFloatAsString(),
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
				 getString("_UI_IfcScheduleTimeControl_TotalFloat_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcScheduleTimeControl_TotalFloat_feature", "_UI_IfcScheduleTimeControl_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcScheduleTimeControl_TotalFloat(),
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
				 getString("_UI_IfcScheduleTimeControl_TotalFloatAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcScheduleTimeControl_TotalFloatAsString_feature", "_UI_IfcScheduleTimeControl_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcScheduleTimeControl_TotalFloatAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Critical feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsCriticalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcScheduleTimeControl_IsCritical_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcScheduleTimeControl_IsCritical_feature", "_UI_IfcScheduleTimeControl_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcScheduleTimeControl_IsCritical(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Status Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatusTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcScheduleTimeControl_StatusTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcScheduleTimeControl_StatusTime_feature", "_UI_IfcScheduleTimeControl_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcScheduleTimeControl_StatusTime(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Start Float feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartFloatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcScheduleTimeControl_StartFloat_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcScheduleTimeControl_StartFloat_feature", "_UI_IfcScheduleTimeControl_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcScheduleTimeControl_StartFloat(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Start Float As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartFloatAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcScheduleTimeControl_StartFloatAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcScheduleTimeControl_StartFloatAsString_feature", "_UI_IfcScheduleTimeControl_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcScheduleTimeControl_StartFloatAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Finish Float feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFinishFloatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcScheduleTimeControl_FinishFloat_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcScheduleTimeControl_FinishFloat_feature", "_UI_IfcScheduleTimeControl_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcScheduleTimeControl_FinishFloat(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Finish Float As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFinishFloatAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcScheduleTimeControl_FinishFloatAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcScheduleTimeControl_FinishFloatAsString_feature", "_UI_IfcScheduleTimeControl_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcScheduleTimeControl_FinishFloatAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Completion feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCompletionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcScheduleTimeControl_Completion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcScheduleTimeControl_Completion_feature", "_UI_IfcScheduleTimeControl_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcScheduleTimeControl_Completion(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Completion As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCompletionAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcScheduleTimeControl_CompletionAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcScheduleTimeControl_CompletionAsString_feature", "_UI_IfcScheduleTimeControl_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcScheduleTimeControl_CompletionAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Schedule Time Control Assigned feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScheduleTimeControlAssignedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcScheduleTimeControl_ScheduleTimeControlAssigned_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcScheduleTimeControl_ScheduleTimeControlAssigned_feature", "_UI_IfcScheduleTimeControl_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcScheduleTimeControl_ScheduleTimeControlAssigned(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns IfcScheduleTimeControl.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcScheduleTimeControl"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IfcScheduleTimeControl)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_IfcScheduleTimeControl_type") :
			getString("_UI_IfcScheduleTimeControl_type") + " " + label;
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

		switch (notification.getFeatureID(IfcScheduleTimeControl.class)) {
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_DURATION:
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_DURATION_AS_STRING:
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__ACTUAL_DURATION:
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__ACTUAL_DURATION_AS_STRING:
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__REMAINING_TIME:
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__REMAINING_TIME_AS_STRING:
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__FREE_FLOAT:
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__FREE_FLOAT_AS_STRING:
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__TOTAL_FLOAT:
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__TOTAL_FLOAT_AS_STRING:
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__IS_CRITICAL:
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__START_FLOAT:
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__START_FLOAT_AS_STRING:
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__FINISH_FLOAT:
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__FINISH_FLOAT_AS_STRING:
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__COMPLETION:
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__COMPLETION_AS_STRING:
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
