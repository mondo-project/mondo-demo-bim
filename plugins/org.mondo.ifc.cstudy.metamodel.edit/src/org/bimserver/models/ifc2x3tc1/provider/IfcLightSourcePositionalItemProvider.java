/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcLightSourcePositional;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcLightSourcePositional} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcLightSourcePositionalItemProvider extends IfcLightSourceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLightSourcePositionalItemProvider(AdapterFactory adapterFactory) {
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

			addPositionPropertyDescriptor(object);
			addRadiusPropertyDescriptor(object);
			addRadiusAsStringPropertyDescriptor(object);
			addConstantAttenuationPropertyDescriptor(object);
			addConstantAttenuationAsStringPropertyDescriptor(object);
			addDistanceAttenuationPropertyDescriptor(object);
			addDistanceAttenuationAsStringPropertyDescriptor(object);
			addQuadricAttenuationPropertyDescriptor(object);
			addQuadricAttenuationAsStringPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Position feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPositionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcLightSourcePositional_Position_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcLightSourcePositional_Position_feature", "_UI_IfcLightSourcePositional_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcLightSourcePositional_Position(),
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
				 getString("_UI_IfcLightSourcePositional_Radius_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcLightSourcePositional_Radius_feature", "_UI_IfcLightSourcePositional_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcLightSourcePositional_Radius(),
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
				 getString("_UI_IfcLightSourcePositional_RadiusAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcLightSourcePositional_RadiusAsString_feature", "_UI_IfcLightSourcePositional_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcLightSourcePositional_RadiusAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant Attenuation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstantAttenuationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcLightSourcePositional_ConstantAttenuation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcLightSourcePositional_ConstantAttenuation_feature", "_UI_IfcLightSourcePositional_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcLightSourcePositional_ConstantAttenuation(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant Attenuation As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstantAttenuationAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcLightSourcePositional_ConstantAttenuationAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcLightSourcePositional_ConstantAttenuationAsString_feature", "_UI_IfcLightSourcePositional_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcLightSourcePositional_ConstantAttenuationAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Distance Attenuation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDistanceAttenuationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcLightSourcePositional_DistanceAttenuation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcLightSourcePositional_DistanceAttenuation_feature", "_UI_IfcLightSourcePositional_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcLightSourcePositional_DistanceAttenuation(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Distance Attenuation As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDistanceAttenuationAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcLightSourcePositional_DistanceAttenuationAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcLightSourcePositional_DistanceAttenuationAsString_feature", "_UI_IfcLightSourcePositional_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcLightSourcePositional_DistanceAttenuationAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Quadric Attenuation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQuadricAttenuationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcLightSourcePositional_QuadricAttenuation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcLightSourcePositional_QuadricAttenuation_feature", "_UI_IfcLightSourcePositional_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcLightSourcePositional_QuadricAttenuation(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Quadric Attenuation As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQuadricAttenuationAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcLightSourcePositional_QuadricAttenuationAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcLightSourcePositional_QuadricAttenuationAsString_feature", "_UI_IfcLightSourcePositional_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcLightSourcePositional_QuadricAttenuationAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcLightSourcePositional.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcLightSourcePositional"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IfcLightSourcePositional)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_IfcLightSourcePositional_type") :
			getString("_UI_IfcLightSourcePositional_type") + " " + label;
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

		switch (notification.getFeatureID(IfcLightSourcePositional.class)) {
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_POSITIONAL__RADIUS:
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_POSITIONAL__RADIUS_AS_STRING:
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_POSITIONAL__CONSTANT_ATTENUATION:
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_POSITIONAL__CONSTANT_ATTENUATION_AS_STRING:
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_POSITIONAL__DISTANCE_ATTENUATION:
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_POSITIONAL__DISTANCE_ATTENUATION_AS_STRING:
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_POSITIONAL__QUADRIC_ATTENUATION:
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_POSITIONAL__QUADRIC_ATTENUATION_AS_STRING:
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
