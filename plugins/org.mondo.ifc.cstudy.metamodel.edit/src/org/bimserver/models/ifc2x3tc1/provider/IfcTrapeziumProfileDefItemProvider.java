/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcTrapeziumProfileDef;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcTrapeziumProfileDef} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcTrapeziumProfileDefItemProvider extends IfcParameterizedProfileDefItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTrapeziumProfileDefItemProvider(AdapterFactory adapterFactory) {
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

			addBottomXDimPropertyDescriptor(object);
			addBottomXDimAsStringPropertyDescriptor(object);
			addTopXDimPropertyDescriptor(object);
			addTopXDimAsStringPropertyDescriptor(object);
			addYDimPropertyDescriptor(object);
			addYDimAsStringPropertyDescriptor(object);
			addTopXOffsetPropertyDescriptor(object);
			addTopXOffsetAsStringPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Bottom XDim feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBottomXDimPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcTrapeziumProfileDef_BottomXDim_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcTrapeziumProfileDef_BottomXDim_feature", "_UI_IfcTrapeziumProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcTrapeziumProfileDef_BottomXDim(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Bottom XDim As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBottomXDimAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcTrapeziumProfileDef_BottomXDimAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcTrapeziumProfileDef_BottomXDimAsString_feature", "_UI_IfcTrapeziumProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcTrapeziumProfileDef_BottomXDimAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Top XDim feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTopXDimPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcTrapeziumProfileDef_TopXDim_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcTrapeziumProfileDef_TopXDim_feature", "_UI_IfcTrapeziumProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcTrapeziumProfileDef_TopXDim(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Top XDim As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTopXDimAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcTrapeziumProfileDef_TopXDimAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcTrapeziumProfileDef_TopXDimAsString_feature", "_UI_IfcTrapeziumProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcTrapeziumProfileDef_TopXDimAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the YDim feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addYDimPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcTrapeziumProfileDef_YDim_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcTrapeziumProfileDef_YDim_feature", "_UI_IfcTrapeziumProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcTrapeziumProfileDef_YDim(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the YDim As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addYDimAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcTrapeziumProfileDef_YDimAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcTrapeziumProfileDef_YDimAsString_feature", "_UI_IfcTrapeziumProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcTrapeziumProfileDef_YDimAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Top XOffset feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTopXOffsetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcTrapeziumProfileDef_TopXOffset_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcTrapeziumProfileDef_TopXOffset_feature", "_UI_IfcTrapeziumProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcTrapeziumProfileDef_TopXOffset(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Top XOffset As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTopXOffsetAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcTrapeziumProfileDef_TopXOffsetAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcTrapeziumProfileDef_TopXOffsetAsString_feature", "_UI_IfcTrapeziumProfileDef_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcTrapeziumProfileDef_TopXOffsetAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcTrapeziumProfileDef.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcTrapeziumProfileDef"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IfcTrapeziumProfileDef)object).getProfileName();
		return label == null || label.length() == 0 ?
			getString("_UI_IfcTrapeziumProfileDef_type") :
			getString("_UI_IfcTrapeziumProfileDef_type") + " " + label;
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

		switch (notification.getFeatureID(IfcTrapeziumProfileDef.class)) {
			case Ifc2x3tc1Package.IFC_TRAPEZIUM_PROFILE_DEF__BOTTOM_XDIM:
			case Ifc2x3tc1Package.IFC_TRAPEZIUM_PROFILE_DEF__BOTTOM_XDIM_AS_STRING:
			case Ifc2x3tc1Package.IFC_TRAPEZIUM_PROFILE_DEF__TOP_XDIM:
			case Ifc2x3tc1Package.IFC_TRAPEZIUM_PROFILE_DEF__TOP_XDIM_AS_STRING:
			case Ifc2x3tc1Package.IFC_TRAPEZIUM_PROFILE_DEF__YDIM:
			case Ifc2x3tc1Package.IFC_TRAPEZIUM_PROFILE_DEF__YDIM_AS_STRING:
			case Ifc2x3tc1Package.IFC_TRAPEZIUM_PROFILE_DEF__TOP_XOFFSET:
			case Ifc2x3tc1Package.IFC_TRAPEZIUM_PROFILE_DEF__TOP_XOFFSET_AS_STRING:
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
