/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcRectangularTrimmedSurface;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcRectangularTrimmedSurface} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcRectangularTrimmedSurfaceItemProvider extends IfcBoundedSurfaceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRectangularTrimmedSurfaceItemProvider(AdapterFactory adapterFactory) {
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

			addBasisSurfacePropertyDescriptor(object);
			addU1PropertyDescriptor(object);
			addU1AsStringPropertyDescriptor(object);
			addV1PropertyDescriptor(object);
			addV1AsStringPropertyDescriptor(object);
			addU2PropertyDescriptor(object);
			addU2AsStringPropertyDescriptor(object);
			addV2PropertyDescriptor(object);
			addV2AsStringPropertyDescriptor(object);
			addUsensePropertyDescriptor(object);
			addVsensePropertyDescriptor(object);
			addDimPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Basis Surface feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBasisSurfacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcRectangularTrimmedSurface_BasisSurface_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcRectangularTrimmedSurface_BasisSurface_feature", "_UI_IfcRectangularTrimmedSurface_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcRectangularTrimmedSurface_BasisSurface(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the U1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addU1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcRectangularTrimmedSurface_U1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcRectangularTrimmedSurface_U1_feature", "_UI_IfcRectangularTrimmedSurface_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcRectangularTrimmedSurface_U1(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the U1 As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addU1AsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcRectangularTrimmedSurface_U1AsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcRectangularTrimmedSurface_U1AsString_feature", "_UI_IfcRectangularTrimmedSurface_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcRectangularTrimmedSurface_U1AsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the V1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addV1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcRectangularTrimmedSurface_V1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcRectangularTrimmedSurface_V1_feature", "_UI_IfcRectangularTrimmedSurface_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcRectangularTrimmedSurface_V1(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the V1 As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addV1AsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcRectangularTrimmedSurface_V1AsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcRectangularTrimmedSurface_V1AsString_feature", "_UI_IfcRectangularTrimmedSurface_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcRectangularTrimmedSurface_V1AsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the U2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addU2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcRectangularTrimmedSurface_U2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcRectangularTrimmedSurface_U2_feature", "_UI_IfcRectangularTrimmedSurface_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcRectangularTrimmedSurface_U2(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the U2 As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addU2AsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcRectangularTrimmedSurface_U2AsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcRectangularTrimmedSurface_U2AsString_feature", "_UI_IfcRectangularTrimmedSurface_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcRectangularTrimmedSurface_U2AsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the V2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addV2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcRectangularTrimmedSurface_V2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcRectangularTrimmedSurface_V2_feature", "_UI_IfcRectangularTrimmedSurface_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcRectangularTrimmedSurface_V2(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the V2 As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addV2AsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcRectangularTrimmedSurface_V2AsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcRectangularTrimmedSurface_V2AsString_feature", "_UI_IfcRectangularTrimmedSurface_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcRectangularTrimmedSurface_V2AsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Usense feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsensePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcRectangularTrimmedSurface_Usense_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcRectangularTrimmedSurface_Usense_feature", "_UI_IfcRectangularTrimmedSurface_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcRectangularTrimmedSurface_Usense(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vsense feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVsensePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcRectangularTrimmedSurface_Vsense_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcRectangularTrimmedSurface_Vsense_feature", "_UI_IfcRectangularTrimmedSurface_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcRectangularTrimmedSurface_Vsense(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_IfcRectangularTrimmedSurface_Dim_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcRectangularTrimmedSurface_Dim_feature", "_UI_IfcRectangularTrimmedSurface_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcRectangularTrimmedSurface_Dim(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcRectangularTrimmedSurface.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcRectangularTrimmedSurface"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		IfcRectangularTrimmedSurface ifcRectangularTrimmedSurface = (IfcRectangularTrimmedSurface)object;
		return getString("_UI_IfcRectangularTrimmedSurface_type") + " " + ifcRectangularTrimmedSurface.getU1();
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

		switch (notification.getFeatureID(IfcRectangularTrimmedSurface.class)) {
			case Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__U1:
			case Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__U1_AS_STRING:
			case Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__V1:
			case Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__V1_AS_STRING:
			case Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__U2:
			case Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__U2_AS_STRING:
			case Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__V2:
			case Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__V2_AS_STRING:
			case Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__USENSE:
			case Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__VSENSE:
			case Ifc2x3tc1Package.IFC_RECTANGULAR_TRIMMED_SURFACE__DIM:
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
