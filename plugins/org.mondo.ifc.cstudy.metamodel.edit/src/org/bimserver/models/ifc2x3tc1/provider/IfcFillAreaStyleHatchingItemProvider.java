/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcFillAreaStyleHatching;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcFillAreaStyleHatching} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcFillAreaStyleHatchingItemProvider extends IfcGeometricRepresentationItemItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFillAreaStyleHatchingItemProvider(AdapterFactory adapterFactory) {
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

			addHatchLineAppearancePropertyDescriptor(object);
			addStartOfNextHatchLinePropertyDescriptor(object);
			addPointOfReferenceHatchLinePropertyDescriptor(object);
			addPatternStartPropertyDescriptor(object);
			addHatchLineAnglePropertyDescriptor(object);
			addHatchLineAngleAsStringPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Hatch Line Appearance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHatchLineAppearancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcFillAreaStyleHatching_HatchLineAppearance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcFillAreaStyleHatching_HatchLineAppearance_feature", "_UI_IfcFillAreaStyleHatching_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcFillAreaStyleHatching_HatchLineAppearance(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Start Of Next Hatch Line feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartOfNextHatchLinePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcFillAreaStyleHatching_StartOfNextHatchLine_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcFillAreaStyleHatching_StartOfNextHatchLine_feature", "_UI_IfcFillAreaStyleHatching_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcFillAreaStyleHatching_StartOfNextHatchLine(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Point Of Reference Hatch Line feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPointOfReferenceHatchLinePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcFillAreaStyleHatching_PointOfReferenceHatchLine_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcFillAreaStyleHatching_PointOfReferenceHatchLine_feature", "_UI_IfcFillAreaStyleHatching_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcFillAreaStyleHatching_PointOfReferenceHatchLine(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pattern Start feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPatternStartPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcFillAreaStyleHatching_PatternStart_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcFillAreaStyleHatching_PatternStart_feature", "_UI_IfcFillAreaStyleHatching_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcFillAreaStyleHatching_PatternStart(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hatch Line Angle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHatchLineAnglePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcFillAreaStyleHatching_HatchLineAngle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcFillAreaStyleHatching_HatchLineAngle_feature", "_UI_IfcFillAreaStyleHatching_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcFillAreaStyleHatching_HatchLineAngle(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hatch Line Angle As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHatchLineAngleAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcFillAreaStyleHatching_HatchLineAngleAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcFillAreaStyleHatching_HatchLineAngleAsString_feature", "_UI_IfcFillAreaStyleHatching_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcFillAreaStyleHatching_HatchLineAngleAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcFillAreaStyleHatching.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcFillAreaStyleHatching"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		IfcFillAreaStyleHatching ifcFillAreaStyleHatching = (IfcFillAreaStyleHatching)object;
		return getString("_UI_IfcFillAreaStyleHatching_type") + " " + ifcFillAreaStyleHatching.getHatchLineAngle();
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

		switch (notification.getFeatureID(IfcFillAreaStyleHatching.class)) {
			case Ifc2x3tc1Package.IFC_FILL_AREA_STYLE_HATCHING__HATCH_LINE_ANGLE:
			case Ifc2x3tc1Package.IFC_FILL_AREA_STYLE_HATCHING__HATCH_LINE_ANGLE_AS_STRING:
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
