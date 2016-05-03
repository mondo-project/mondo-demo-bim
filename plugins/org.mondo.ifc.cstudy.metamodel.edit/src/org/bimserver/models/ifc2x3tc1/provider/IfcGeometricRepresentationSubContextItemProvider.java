/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcGeometricRepresentationSubContext;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcGeometricRepresentationSubContext} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcGeometricRepresentationSubContextItemProvider extends IfcGeometricRepresentationContextItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcGeometricRepresentationSubContextItemProvider(AdapterFactory adapterFactory) {
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

			addParentContextPropertyDescriptor(object);
			addTargetScalePropertyDescriptor(object);
			addTargetScaleAsStringPropertyDescriptor(object);
			addTargetViewPropertyDescriptor(object);
			addUserDefinedTargetViewPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Parent Context feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParentContextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcGeometricRepresentationSubContext_ParentContext_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcGeometricRepresentationSubContext_ParentContext_feature", "_UI_IfcGeometricRepresentationSubContext_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcGeometricRepresentationSubContext_ParentContext(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Scale feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetScalePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcGeometricRepresentationSubContext_TargetScale_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcGeometricRepresentationSubContext_TargetScale_feature", "_UI_IfcGeometricRepresentationSubContext_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcGeometricRepresentationSubContext_TargetScale(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Scale As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetScaleAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcGeometricRepresentationSubContext_TargetScaleAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcGeometricRepresentationSubContext_TargetScaleAsString_feature", "_UI_IfcGeometricRepresentationSubContext_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcGeometricRepresentationSubContext_TargetScaleAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target View feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetViewPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcGeometricRepresentationSubContext_TargetView_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcGeometricRepresentationSubContext_TargetView_feature", "_UI_IfcGeometricRepresentationSubContext_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcGeometricRepresentationSubContext_TargetView(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the User Defined Target View feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUserDefinedTargetViewPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcGeometricRepresentationSubContext_UserDefinedTargetView_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcGeometricRepresentationSubContext_UserDefinedTargetView_feature", "_UI_IfcGeometricRepresentationSubContext_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcGeometricRepresentationSubContext_UserDefinedTargetView(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcGeometricRepresentationSubContext.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcGeometricRepresentationSubContext"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IfcGeometricRepresentationSubContext)object).getContextIdentifier();
		return label == null || label.length() == 0 ?
			getString("_UI_IfcGeometricRepresentationSubContext_type") :
			getString("_UI_IfcGeometricRepresentationSubContext_type") + " " + label;
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

		switch (notification.getFeatureID(IfcGeometricRepresentationSubContext.class)) {
			case Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT__TARGET_SCALE:
			case Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT__TARGET_SCALE_AS_STRING:
			case Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT__TARGET_VIEW:
			case Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT__USER_DEFINED_TARGET_VIEW:
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
