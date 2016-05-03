/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcBoundingBox;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcBoundingBox} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcBoundingBoxItemProvider extends IfcGeometricRepresentationItemItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBoundingBoxItemProvider(AdapterFactory adapterFactory) {
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

			addCornerPropertyDescriptor(object);
			addXDimPropertyDescriptor(object);
			addXDimAsStringPropertyDescriptor(object);
			addYDimPropertyDescriptor(object);
			addYDimAsStringPropertyDescriptor(object);
			addZDimPropertyDescriptor(object);
			addZDimAsStringPropertyDescriptor(object);
			addDimPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Corner feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCornerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcBoundingBox_Corner_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcBoundingBox_Corner_feature", "_UI_IfcBoundingBox_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcBoundingBox_Corner(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the XDim feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addXDimPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcBoundingBox_XDim_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcBoundingBox_XDim_feature", "_UI_IfcBoundingBox_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcBoundingBox_XDim(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the XDim As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addXDimAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcBoundingBox_XDimAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcBoundingBox_XDimAsString_feature", "_UI_IfcBoundingBox_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcBoundingBox_XDimAsString(),
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
				 getString("_UI_IfcBoundingBox_YDim_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcBoundingBox_YDim_feature", "_UI_IfcBoundingBox_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcBoundingBox_YDim(),
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
				 getString("_UI_IfcBoundingBox_YDimAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcBoundingBox_YDimAsString_feature", "_UI_IfcBoundingBox_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcBoundingBox_YDimAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the ZDim feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addZDimPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcBoundingBox_ZDim_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcBoundingBox_ZDim_feature", "_UI_IfcBoundingBox_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcBoundingBox_ZDim(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the ZDim As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addZDimAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcBoundingBox_ZDimAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcBoundingBox_ZDimAsString_feature", "_UI_IfcBoundingBox_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcBoundingBox_ZDimAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dim feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDimPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcBoundingBox_Dim_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcBoundingBox_Dim_feature", "_UI_IfcBoundingBox_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcBoundingBox_Dim(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcBoundingBox.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcBoundingBox"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		IfcBoundingBox ifcBoundingBox = (IfcBoundingBox)object;
		return getString("_UI_IfcBoundingBox_type") + " " + ifcBoundingBox.getXDim();
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

		switch (notification.getFeatureID(IfcBoundingBox.class)) {
			case Ifc2x3tc1Package.IFC_BOUNDING_BOX__XDIM:
			case Ifc2x3tc1Package.IFC_BOUNDING_BOX__XDIM_AS_STRING:
			case Ifc2x3tc1Package.IFC_BOUNDING_BOX__YDIM:
			case Ifc2x3tc1Package.IFC_BOUNDING_BOX__YDIM_AS_STRING:
			case Ifc2x3tc1Package.IFC_BOUNDING_BOX__ZDIM:
			case Ifc2x3tc1Package.IFC_BOUNDING_BOX__ZDIM_AS_STRING:
			case Ifc2x3tc1Package.IFC_BOUNDING_BOX__DIM:
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
