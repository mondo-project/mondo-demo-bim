/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcLightSourceSpot;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcLightSourceSpot} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcLightSourceSpotItemProvider extends IfcLightSourcePositionalItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLightSourceSpotItemProvider(AdapterFactory adapterFactory) {
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

			addOrientationPropertyDescriptor(object);
			addConcentrationExponentPropertyDescriptor(object);
			addConcentrationExponentAsStringPropertyDescriptor(object);
			addSpreadAnglePropertyDescriptor(object);
			addSpreadAngleAsStringPropertyDescriptor(object);
			addBeamWidthAnglePropertyDescriptor(object);
			addBeamWidthAngleAsStringPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Orientation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOrientationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcLightSourceSpot_Orientation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcLightSourceSpot_Orientation_feature", "_UI_IfcLightSourceSpot_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcLightSourceSpot_Orientation(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Concentration Exponent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConcentrationExponentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcLightSourceSpot_ConcentrationExponent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcLightSourceSpot_ConcentrationExponent_feature", "_UI_IfcLightSourceSpot_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcLightSourceSpot_ConcentrationExponent(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Concentration Exponent As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConcentrationExponentAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcLightSourceSpot_ConcentrationExponentAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcLightSourceSpot_ConcentrationExponentAsString_feature", "_UI_IfcLightSourceSpot_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcLightSourceSpot_ConcentrationExponentAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Spread Angle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpreadAnglePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcLightSourceSpot_SpreadAngle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcLightSourceSpot_SpreadAngle_feature", "_UI_IfcLightSourceSpot_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcLightSourceSpot_SpreadAngle(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Spread Angle As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpreadAngleAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcLightSourceSpot_SpreadAngleAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcLightSourceSpot_SpreadAngleAsString_feature", "_UI_IfcLightSourceSpot_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcLightSourceSpot_SpreadAngleAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Beam Width Angle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBeamWidthAnglePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcLightSourceSpot_BeamWidthAngle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcLightSourceSpot_BeamWidthAngle_feature", "_UI_IfcLightSourceSpot_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcLightSourceSpot_BeamWidthAngle(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Beam Width Angle As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBeamWidthAngleAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcLightSourceSpot_BeamWidthAngleAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcLightSourceSpot_BeamWidthAngleAsString_feature", "_UI_IfcLightSourceSpot_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcLightSourceSpot_BeamWidthAngleAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcLightSourceSpot.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcLightSourceSpot"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IfcLightSourceSpot)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_IfcLightSourceSpot_type") :
			getString("_UI_IfcLightSourceSpot_type") + " " + label;
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

		switch (notification.getFeatureID(IfcLightSourceSpot.class)) {
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_SPOT__CONCENTRATION_EXPONENT:
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_SPOT__CONCENTRATION_EXPONENT_AS_STRING:
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_SPOT__SPREAD_ANGLE:
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_SPOT__SPREAD_ANGLE_AS_STRING:
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_SPOT__BEAM_WIDTH_ANGLE:
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_SPOT__BEAM_WIDTH_ANGLE_AS_STRING:
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
