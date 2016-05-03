/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcRectangularPyramid;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcRectangularPyramid} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcRectangularPyramidItemProvider extends IfcCsgPrimitive3DItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRectangularPyramidItemProvider(AdapterFactory adapterFactory) {
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

			addXLengthPropertyDescriptor(object);
			addXLengthAsStringPropertyDescriptor(object);
			addYLengthPropertyDescriptor(object);
			addYLengthAsStringPropertyDescriptor(object);
			addHeightPropertyDescriptor(object);
			addHeightAsStringPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the XLength feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addXLengthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcRectangularPyramid_XLength_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcRectangularPyramid_XLength_feature", "_UI_IfcRectangularPyramid_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcRectangularPyramid_XLength(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the XLength As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addXLengthAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcRectangularPyramid_XLengthAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcRectangularPyramid_XLengthAsString_feature", "_UI_IfcRectangularPyramid_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcRectangularPyramid_XLengthAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the YLength feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addYLengthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcRectangularPyramid_YLength_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcRectangularPyramid_YLength_feature", "_UI_IfcRectangularPyramid_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcRectangularPyramid_YLength(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the YLength As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addYLengthAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcRectangularPyramid_YLengthAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcRectangularPyramid_YLengthAsString_feature", "_UI_IfcRectangularPyramid_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcRectangularPyramid_YLengthAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Height feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcRectangularPyramid_Height_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcRectangularPyramid_Height_feature", "_UI_IfcRectangularPyramid_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcRectangularPyramid_Height(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Height As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeightAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcRectangularPyramid_HeightAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcRectangularPyramid_HeightAsString_feature", "_UI_IfcRectangularPyramid_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcRectangularPyramid_HeightAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcRectangularPyramid.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcRectangularPyramid"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		IfcRectangularPyramid ifcRectangularPyramid = (IfcRectangularPyramid)object;
		return getString("_UI_IfcRectangularPyramid_type") + " " + ifcRectangularPyramid.getDim();
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

		switch (notification.getFeatureID(IfcRectangularPyramid.class)) {
			case Ifc2x3tc1Package.IFC_RECTANGULAR_PYRAMID__XLENGTH:
			case Ifc2x3tc1Package.IFC_RECTANGULAR_PYRAMID__XLENGTH_AS_STRING:
			case Ifc2x3tc1Package.IFC_RECTANGULAR_PYRAMID__YLENGTH:
			case Ifc2x3tc1Package.IFC_RECTANGULAR_PYRAMID__YLENGTH_AS_STRING:
			case Ifc2x3tc1Package.IFC_RECTANGULAR_PYRAMID__HEIGHT:
			case Ifc2x3tc1Package.IFC_RECTANGULAR_PYRAMID__HEIGHT_AS_STRING:
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
