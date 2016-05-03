/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcTextStyleWithBoxCharacteristics;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcTextStyleWithBoxCharacteristics} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcTextStyleWithBoxCharacteristicsItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTextStyleWithBoxCharacteristicsItemProvider(AdapterFactory adapterFactory) {
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

			addBoxHeightPropertyDescriptor(object);
			addBoxHeightAsStringPropertyDescriptor(object);
			addBoxWidthPropertyDescriptor(object);
			addBoxWidthAsStringPropertyDescriptor(object);
			addBoxSlantAnglePropertyDescriptor(object);
			addBoxSlantAngleAsStringPropertyDescriptor(object);
			addBoxRotateAnglePropertyDescriptor(object);
			addBoxRotateAngleAsStringPropertyDescriptor(object);
			addCharacterSpacingPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Box Height feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBoxHeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcTextStyleWithBoxCharacteristics_BoxHeight_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcTextStyleWithBoxCharacteristics_BoxHeight_feature", "_UI_IfcTextStyleWithBoxCharacteristics_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics_BoxHeight(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Box Height As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBoxHeightAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcTextStyleWithBoxCharacteristics_BoxHeightAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcTextStyleWithBoxCharacteristics_BoxHeightAsString_feature", "_UI_IfcTextStyleWithBoxCharacteristics_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics_BoxHeightAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Box Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBoxWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcTextStyleWithBoxCharacteristics_BoxWidth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcTextStyleWithBoxCharacteristics_BoxWidth_feature", "_UI_IfcTextStyleWithBoxCharacteristics_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics_BoxWidth(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Box Width As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBoxWidthAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcTextStyleWithBoxCharacteristics_BoxWidthAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcTextStyleWithBoxCharacteristics_BoxWidthAsString_feature", "_UI_IfcTextStyleWithBoxCharacteristics_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics_BoxWidthAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Box Slant Angle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBoxSlantAnglePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcTextStyleWithBoxCharacteristics_BoxSlantAngle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcTextStyleWithBoxCharacteristics_BoxSlantAngle_feature", "_UI_IfcTextStyleWithBoxCharacteristics_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics_BoxSlantAngle(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Box Slant Angle As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBoxSlantAngleAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcTextStyleWithBoxCharacteristics_BoxSlantAngleAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcTextStyleWithBoxCharacteristics_BoxSlantAngleAsString_feature", "_UI_IfcTextStyleWithBoxCharacteristics_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics_BoxSlantAngleAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Box Rotate Angle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBoxRotateAnglePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcTextStyleWithBoxCharacteristics_BoxRotateAngle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcTextStyleWithBoxCharacteristics_BoxRotateAngle_feature", "_UI_IfcTextStyleWithBoxCharacteristics_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics_BoxRotateAngle(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Box Rotate Angle As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBoxRotateAngleAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcTextStyleWithBoxCharacteristics_BoxRotateAngleAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcTextStyleWithBoxCharacteristics_BoxRotateAngleAsString_feature", "_UI_IfcTextStyleWithBoxCharacteristics_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics_BoxRotateAngleAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Character Spacing feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCharacterSpacingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcTextStyleWithBoxCharacteristics_CharacterSpacing_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcTextStyleWithBoxCharacteristics_CharacterSpacing_feature", "_UI_IfcTextStyleWithBoxCharacteristics_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics_CharacterSpacing(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns IfcTextStyleWithBoxCharacteristics.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcTextStyleWithBoxCharacteristics"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		IfcTextStyleWithBoxCharacteristics ifcTextStyleWithBoxCharacteristics = (IfcTextStyleWithBoxCharacteristics)object;
		return getString("_UI_IfcTextStyleWithBoxCharacteristics_type") + " " + ifcTextStyleWithBoxCharacteristics.getBoxHeight();
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

		switch (notification.getFeatureID(IfcTextStyleWithBoxCharacteristics.class)) {
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_HEIGHT:
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_HEIGHT_AS_STRING:
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_WIDTH:
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_WIDTH_AS_STRING:
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_SLANT_ANGLE:
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_SLANT_ANGLE_AS_STRING:
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_ROTATE_ANGLE:
			case Ifc2x3tc1Package.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS__BOX_ROTATE_ANGLE_AS_STRING:
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

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Ifc2x3tc1EditPlugin.INSTANCE;
	}

}
