/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcCurveStyleFontPattern;

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
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcCurveStyleFontPattern} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcCurveStyleFontPatternItemProvider 
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
	public IfcCurveStyleFontPatternItemProvider(AdapterFactory adapterFactory) {
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

			addVisibleSegmentLengthPropertyDescriptor(object);
			addVisibleSegmentLengthAsStringPropertyDescriptor(object);
			addInvisibleSegmentLengthPropertyDescriptor(object);
			addInvisibleSegmentLengthAsStringPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Visible Segment Length feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVisibleSegmentLengthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcCurveStyleFontPattern_VisibleSegmentLength_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCurveStyleFontPattern_VisibleSegmentLength_feature", "_UI_IfcCurveStyleFontPattern_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCurveStyleFontPattern_VisibleSegmentLength(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Visible Segment Length As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVisibleSegmentLengthAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcCurveStyleFontPattern_VisibleSegmentLengthAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCurveStyleFontPattern_VisibleSegmentLengthAsString_feature", "_UI_IfcCurveStyleFontPattern_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCurveStyleFontPattern_VisibleSegmentLengthAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Invisible Segment Length feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInvisibleSegmentLengthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcCurveStyleFontPattern_InvisibleSegmentLength_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCurveStyleFontPattern_InvisibleSegmentLength_feature", "_UI_IfcCurveStyleFontPattern_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCurveStyleFontPattern_InvisibleSegmentLength(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Invisible Segment Length As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInvisibleSegmentLengthAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcCurveStyleFontPattern_InvisibleSegmentLengthAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCurveStyleFontPattern_InvisibleSegmentLengthAsString_feature", "_UI_IfcCurveStyleFontPattern_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCurveStyleFontPattern_InvisibleSegmentLengthAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcCurveStyleFontPattern.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcCurveStyleFontPattern"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		IfcCurveStyleFontPattern ifcCurveStyleFontPattern = (IfcCurveStyleFontPattern)object;
		return getString("_UI_IfcCurveStyleFontPattern_type") + " " + ifcCurveStyleFontPattern.getVisibleSegmentLength();
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

		switch (notification.getFeatureID(IfcCurveStyleFontPattern.class)) {
			case Ifc2x3tc1Package.IFC_CURVE_STYLE_FONT_PATTERN__VISIBLE_SEGMENT_LENGTH:
			case Ifc2x3tc1Package.IFC_CURVE_STYLE_FONT_PATTERN__VISIBLE_SEGMENT_LENGTH_AS_STRING:
			case Ifc2x3tc1Package.IFC_CURVE_STYLE_FONT_PATTERN__INVISIBLE_SEGMENT_LENGTH:
			case Ifc2x3tc1Package.IFC_CURVE_STYLE_FONT_PATTERN__INVISIBLE_SEGMENT_LENGTH_AS_STRING:
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
