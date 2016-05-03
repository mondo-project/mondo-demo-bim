/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcSweptDiskSolid;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcSweptDiskSolid} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcSweptDiskSolidItemProvider extends IfcSolidModelItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSweptDiskSolidItemProvider(AdapterFactory adapterFactory) {
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

			addDirectrixPropertyDescriptor(object);
			addRadiusPropertyDescriptor(object);
			addRadiusAsStringPropertyDescriptor(object);
			addInnerRadiusPropertyDescriptor(object);
			addInnerRadiusAsStringPropertyDescriptor(object);
			addStartParamPropertyDescriptor(object);
			addStartParamAsStringPropertyDescriptor(object);
			addEndParamPropertyDescriptor(object);
			addEndParamAsStringPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Directrix feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDirectrixPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcSweptDiskSolid_Directrix_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcSweptDiskSolid_Directrix_feature", "_UI_IfcSweptDiskSolid_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcSweptDiskSolid_Directrix(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Radius feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRadiusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcSweptDiskSolid_Radius_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcSweptDiskSolid_Radius_feature", "_UI_IfcSweptDiskSolid_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcSweptDiskSolid_Radius(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Radius As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRadiusAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcSweptDiskSolid_RadiusAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcSweptDiskSolid_RadiusAsString_feature", "_UI_IfcSweptDiskSolid_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcSweptDiskSolid_RadiusAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Inner Radius feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInnerRadiusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcSweptDiskSolid_InnerRadius_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcSweptDiskSolid_InnerRadius_feature", "_UI_IfcSweptDiskSolid_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcSweptDiskSolid_InnerRadius(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Inner Radius As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInnerRadiusAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcSweptDiskSolid_InnerRadiusAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcSweptDiskSolid_InnerRadiusAsString_feature", "_UI_IfcSweptDiskSolid_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcSweptDiskSolid_InnerRadiusAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Start Param feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartParamPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcSweptDiskSolid_StartParam_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcSweptDiskSolid_StartParam_feature", "_UI_IfcSweptDiskSolid_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcSweptDiskSolid_StartParam(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Start Param As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartParamAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcSweptDiskSolid_StartParamAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcSweptDiskSolid_StartParamAsString_feature", "_UI_IfcSweptDiskSolid_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcSweptDiskSolid_StartParamAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the End Param feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEndParamPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcSweptDiskSolid_EndParam_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcSweptDiskSolid_EndParam_feature", "_UI_IfcSweptDiskSolid_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcSweptDiskSolid_EndParam(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the End Param As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEndParamAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcSweptDiskSolid_EndParamAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcSweptDiskSolid_EndParamAsString_feature", "_UI_IfcSweptDiskSolid_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcSweptDiskSolid_EndParamAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcSweptDiskSolid.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcSweptDiskSolid"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		IfcSweptDiskSolid ifcSweptDiskSolid = (IfcSweptDiskSolid)object;
		return getString("_UI_IfcSweptDiskSolid_type") + " " + ifcSweptDiskSolid.getDim();
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

		switch (notification.getFeatureID(IfcSweptDiskSolid.class)) {
			case Ifc2x3tc1Package.IFC_SWEPT_DISK_SOLID__RADIUS:
			case Ifc2x3tc1Package.IFC_SWEPT_DISK_SOLID__RADIUS_AS_STRING:
			case Ifc2x3tc1Package.IFC_SWEPT_DISK_SOLID__INNER_RADIUS:
			case Ifc2x3tc1Package.IFC_SWEPT_DISK_SOLID__INNER_RADIUS_AS_STRING:
			case Ifc2x3tc1Package.IFC_SWEPT_DISK_SOLID__START_PARAM:
			case Ifc2x3tc1Package.IFC_SWEPT_DISK_SOLID__START_PARAM_AS_STRING:
			case Ifc2x3tc1Package.IFC_SWEPT_DISK_SOLID__END_PARAM:
			case Ifc2x3tc1Package.IFC_SWEPT_DISK_SOLID__END_PARAM_AS_STRING:
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
