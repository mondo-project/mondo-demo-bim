/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcStructuralSurfaceMemberVarying;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcStructuralSurfaceMemberVarying} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcStructuralSurfaceMemberVaryingItemProvider extends IfcStructuralSurfaceMemberItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralSurfaceMemberVaryingItemProvider(AdapterFactory adapterFactory) {
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

			addSubsequentThicknessPropertyDescriptor(object);
			addSubsequentThicknessAsStringPropertyDescriptor(object);
			addVaryingThicknessLocationPropertyDescriptor(object);
			addVaryingThicknessPropertyDescriptor(object);
			addVaryingThicknessAsStringPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Subsequent Thickness feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubsequentThicknessPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralSurfaceMemberVarying_SubsequentThickness_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralSurfaceMemberVarying_SubsequentThickness_feature", "_UI_IfcStructuralSurfaceMemberVarying_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralSurfaceMemberVarying_SubsequentThickness(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Subsequent Thickness As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubsequentThicknessAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralSurfaceMemberVarying_SubsequentThicknessAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralSurfaceMemberVarying_SubsequentThicknessAsString_feature", "_UI_IfcStructuralSurfaceMemberVarying_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralSurfaceMemberVarying_SubsequentThicknessAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Varying Thickness Location feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVaryingThicknessLocationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralSurfaceMemberVarying_VaryingThicknessLocation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralSurfaceMemberVarying_VaryingThicknessLocation_feature", "_UI_IfcStructuralSurfaceMemberVarying_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralSurfaceMemberVarying_VaryingThicknessLocation(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Varying Thickness feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVaryingThicknessPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralSurfaceMemberVarying_VaryingThickness_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralSurfaceMemberVarying_VaryingThickness_feature", "_UI_IfcStructuralSurfaceMemberVarying_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralSurfaceMemberVarying_VaryingThickness(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Varying Thickness As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVaryingThicknessAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcStructuralSurfaceMemberVarying_VaryingThicknessAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcStructuralSurfaceMemberVarying_VaryingThicknessAsString_feature", "_UI_IfcStructuralSurfaceMemberVarying_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcStructuralSurfaceMemberVarying_VaryingThicknessAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcStructuralSurfaceMemberVarying.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcStructuralSurfaceMemberVarying"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IfcStructuralSurfaceMemberVarying)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_IfcStructuralSurfaceMemberVarying_type") :
			getString("_UI_IfcStructuralSurfaceMemberVarying_type") + " " + label;
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

		switch (notification.getFeatureID(IfcStructuralSurfaceMemberVarying.class)) {
			case Ifc2x3tc1Package.IFC_STRUCTURAL_SURFACE_MEMBER_VARYING__SUBSEQUENT_THICKNESS:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_SURFACE_MEMBER_VARYING__SUBSEQUENT_THICKNESS_AS_STRING:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_SURFACE_MEMBER_VARYING__VARYING_THICKNESS:
			case Ifc2x3tc1Package.IFC_STRUCTURAL_SURFACE_MEMBER_VARYING__VARYING_THICKNESS_AS_STRING:
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
