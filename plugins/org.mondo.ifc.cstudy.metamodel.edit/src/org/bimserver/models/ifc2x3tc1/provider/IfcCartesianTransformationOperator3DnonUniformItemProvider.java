/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcCartesianTransformationOperator3DnonUniform;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcCartesianTransformationOperator3DnonUniform} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcCartesianTransformationOperator3DnonUniformItemProvider extends IfcCartesianTransformationOperator3DItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCartesianTransformationOperator3DnonUniformItemProvider(AdapterFactory adapterFactory) {
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

			addScale2PropertyDescriptor(object);
			addScale2AsStringPropertyDescriptor(object);
			addScale3PropertyDescriptor(object);
			addScale3AsStringPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Scale2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScale2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcCartesianTransformationOperator3DnonUniform_Scale2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCartesianTransformationOperator3DnonUniform_Scale2_feature", "_UI_IfcCartesianTransformationOperator3DnonUniform_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCartesianTransformationOperator3DnonUniform_Scale2(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Scale2 As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScale2AsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcCartesianTransformationOperator3DnonUniform_Scale2AsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCartesianTransformationOperator3DnonUniform_Scale2AsString_feature", "_UI_IfcCartesianTransformationOperator3DnonUniform_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCartesianTransformationOperator3DnonUniform_Scale2AsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Scale3 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScale3PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcCartesianTransformationOperator3DnonUniform_Scale3_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCartesianTransformationOperator3DnonUniform_Scale3_feature", "_UI_IfcCartesianTransformationOperator3DnonUniform_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCartesianTransformationOperator3DnonUniform_Scale3(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Scale3 As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScale3AsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcCartesianTransformationOperator3DnonUniform_Scale3AsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCartesianTransformationOperator3DnonUniform_Scale3AsString_feature", "_UI_IfcCartesianTransformationOperator3DnonUniform_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCartesianTransformationOperator3DnonUniform_Scale3AsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcCartesianTransformationOperator3DnonUniform.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcCartesianTransformationOperator3DnonUniform"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		IfcCartesianTransformationOperator3DnonUniform ifcCartesianTransformationOperator3DnonUniform = (IfcCartesianTransformationOperator3DnonUniform)object;
		return getString("_UI_IfcCartesianTransformationOperator3DnonUniform_type") + " " + ifcCartesianTransformationOperator3DnonUniform.getScale();
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

		switch (notification.getFeatureID(IfcCartesianTransformationOperator3DnonUniform.class)) {
			case Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR3_DNON_UNIFORM__SCALE2:
			case Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR3_DNON_UNIFORM__SCALE2_AS_STRING:
			case Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR3_DNON_UNIFORM__SCALE3:
			case Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR3_DNON_UNIFORM__SCALE3_AS_STRING:
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
