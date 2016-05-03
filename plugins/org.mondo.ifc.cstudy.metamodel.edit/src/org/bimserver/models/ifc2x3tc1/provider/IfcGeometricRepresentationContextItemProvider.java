/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcGeometricRepresentationContext;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcGeometricRepresentationContext} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcGeometricRepresentationContextItemProvider extends IfcRepresentationContextItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcGeometricRepresentationContextItemProvider(AdapterFactory adapterFactory) {
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

			addCoordinateSpaceDimensionPropertyDescriptor(object);
			addPrecisionPropertyDescriptor(object);
			addPrecisionAsStringPropertyDescriptor(object);
			addWorldCoordinateSystemPropertyDescriptor(object);
			addTrueNorthPropertyDescriptor(object);
			addHasSubContextsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Coordinate Space Dimension feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCoordinateSpaceDimensionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcGeometricRepresentationContext_CoordinateSpaceDimension_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcGeometricRepresentationContext_CoordinateSpaceDimension_feature", "_UI_IfcGeometricRepresentationContext_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcGeometricRepresentationContext_CoordinateSpaceDimension(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Precision feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrecisionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcGeometricRepresentationContext_Precision_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcGeometricRepresentationContext_Precision_feature", "_UI_IfcGeometricRepresentationContext_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcGeometricRepresentationContext_Precision(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Precision As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrecisionAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcGeometricRepresentationContext_PrecisionAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcGeometricRepresentationContext_PrecisionAsString_feature", "_UI_IfcGeometricRepresentationContext_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcGeometricRepresentationContext_PrecisionAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the World Coordinate System feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWorldCoordinateSystemPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcGeometricRepresentationContext_WorldCoordinateSystem_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcGeometricRepresentationContext_WorldCoordinateSystem_feature", "_UI_IfcGeometricRepresentationContext_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcGeometricRepresentationContext_WorldCoordinateSystem(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the True North feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTrueNorthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcGeometricRepresentationContext_TrueNorth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcGeometricRepresentationContext_TrueNorth_feature", "_UI_IfcGeometricRepresentationContext_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcGeometricRepresentationContext_TrueNorth(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Sub Contexts feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasSubContextsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcGeometricRepresentationContext_HasSubContexts_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcGeometricRepresentationContext_HasSubContexts_feature", "_UI_IfcGeometricRepresentationContext_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcGeometricRepresentationContext_HasSubContexts(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns IfcGeometricRepresentationContext.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcGeometricRepresentationContext"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IfcGeometricRepresentationContext)object).getContextIdentifier();
		return label == null || label.length() == 0 ?
			getString("_UI_IfcGeometricRepresentationContext_type") :
			getString("_UI_IfcGeometricRepresentationContext_type") + " " + label;
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

		switch (notification.getFeatureID(IfcGeometricRepresentationContext.class)) {
			case Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__COORDINATE_SPACE_DIMENSION:
			case Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__PRECISION:
			case Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__PRECISION_AS_STRING:
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
