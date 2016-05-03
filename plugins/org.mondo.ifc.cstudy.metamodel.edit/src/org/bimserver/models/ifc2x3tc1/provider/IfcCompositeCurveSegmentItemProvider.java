/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcCompositeCurveSegment;
import org.bimserver.models.ifc2x3tc1.IfcTransitionCode;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcCompositeCurveSegment} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcCompositeCurveSegmentItemProvider extends IfcGeometricRepresentationItemItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCompositeCurveSegmentItemProvider(AdapterFactory adapterFactory) {
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

			addTransitionPropertyDescriptor(object);
			addSameSensePropertyDescriptor(object);
			addParentCurvePropertyDescriptor(object);
			addUsingCurvesPropertyDescriptor(object);
			addDimPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Transition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransitionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcCompositeCurveSegment_Transition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCompositeCurveSegment_Transition_feature", "_UI_IfcCompositeCurveSegment_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCompositeCurveSegment_Transition(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Same Sense feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSameSensePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcCompositeCurveSegment_SameSense_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCompositeCurveSegment_SameSense_feature", "_UI_IfcCompositeCurveSegment_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCompositeCurveSegment_SameSense(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parent Curve feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParentCurvePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcCompositeCurveSegment_ParentCurve_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCompositeCurveSegment_ParentCurve_feature", "_UI_IfcCompositeCurveSegment_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCompositeCurveSegment_ParentCurve(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Using Curves feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsingCurvesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcCompositeCurveSegment_UsingCurves_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCompositeCurveSegment_UsingCurves_feature", "_UI_IfcCompositeCurveSegment_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCompositeCurveSegment_UsingCurves(),
				 true,
				 false,
				 true,
				 null,
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
				 getString("_UI_IfcCompositeCurveSegment_Dim_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcCompositeCurveSegment_Dim_feature", "_UI_IfcCompositeCurveSegment_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcCompositeCurveSegment_Dim(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcCompositeCurveSegment.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcCompositeCurveSegment"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		IfcTransitionCode labelValue = ((IfcCompositeCurveSegment)object).getTransition();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_IfcCompositeCurveSegment_type") :
			getString("_UI_IfcCompositeCurveSegment_type") + " " + label;
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

		switch (notification.getFeatureID(IfcCompositeCurveSegment.class)) {
			case Ifc2x3tc1Package.IFC_COMPOSITE_CURVE_SEGMENT__TRANSITION:
			case Ifc2x3tc1Package.IFC_COMPOSITE_CURVE_SEGMENT__SAME_SENSE:
			case Ifc2x3tc1Package.IFC_COMPOSITE_CURVE_SEGMENT__DIM:
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
