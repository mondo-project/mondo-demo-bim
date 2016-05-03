/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcSurfaceStyleRendering;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcSurfaceStyleRendering} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcSurfaceStyleRenderingItemProvider extends IfcSurfaceStyleShadingItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSurfaceStyleRenderingItemProvider(AdapterFactory adapterFactory) {
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

			addTransparencyPropertyDescriptor(object);
			addTransparencyAsStringPropertyDescriptor(object);
			addDiffuseColourPropertyDescriptor(object);
			addTransmissionColourPropertyDescriptor(object);
			addDiffuseTransmissionColourPropertyDescriptor(object);
			addReflectionColourPropertyDescriptor(object);
			addSpecularColourPropertyDescriptor(object);
			addSpecularHighlightPropertyDescriptor(object);
			addReflectanceMethodPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Transparency feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransparencyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcSurfaceStyleRendering_Transparency_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcSurfaceStyleRendering_Transparency_feature", "_UI_IfcSurfaceStyleRendering_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcSurfaceStyleRendering_Transparency(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Transparency As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransparencyAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcSurfaceStyleRendering_TransparencyAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcSurfaceStyleRendering_TransparencyAsString_feature", "_UI_IfcSurfaceStyleRendering_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcSurfaceStyleRendering_TransparencyAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Diffuse Colour feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDiffuseColourPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcSurfaceStyleRendering_DiffuseColour_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcSurfaceStyleRendering_DiffuseColour_feature", "_UI_IfcSurfaceStyleRendering_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcSurfaceStyleRendering_DiffuseColour(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Transmission Colour feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransmissionColourPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcSurfaceStyleRendering_TransmissionColour_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcSurfaceStyleRendering_TransmissionColour_feature", "_UI_IfcSurfaceStyleRendering_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcSurfaceStyleRendering_TransmissionColour(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Diffuse Transmission Colour feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDiffuseTransmissionColourPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcSurfaceStyleRendering_DiffuseTransmissionColour_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcSurfaceStyleRendering_DiffuseTransmissionColour_feature", "_UI_IfcSurfaceStyleRendering_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcSurfaceStyleRendering_DiffuseTransmissionColour(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reflection Colour feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReflectionColourPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcSurfaceStyleRendering_ReflectionColour_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcSurfaceStyleRendering_ReflectionColour_feature", "_UI_IfcSurfaceStyleRendering_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcSurfaceStyleRendering_ReflectionColour(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Specular Colour feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpecularColourPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcSurfaceStyleRendering_SpecularColour_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcSurfaceStyleRendering_SpecularColour_feature", "_UI_IfcSurfaceStyleRendering_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcSurfaceStyleRendering_SpecularColour(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Specular Highlight feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpecularHighlightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcSurfaceStyleRendering_SpecularHighlight_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcSurfaceStyleRendering_SpecularHighlight_feature", "_UI_IfcSurfaceStyleRendering_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcSurfaceStyleRendering_SpecularHighlight(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reflectance Method feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReflectanceMethodPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcSurfaceStyleRendering_ReflectanceMethod_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcSurfaceStyleRendering_ReflectanceMethod_feature", "_UI_IfcSurfaceStyleRendering_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcSurfaceStyleRendering_ReflectanceMethod(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcSurfaceStyleRendering.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcSurfaceStyleRendering"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		IfcSurfaceStyleRendering ifcSurfaceStyleRendering = (IfcSurfaceStyleRendering)object;
		return getString("_UI_IfcSurfaceStyleRendering_type") + " " + ifcSurfaceStyleRendering.getTransparency();
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

		switch (notification.getFeatureID(IfcSurfaceStyleRendering.class)) {
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_RENDERING__TRANSPARENCY:
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_RENDERING__TRANSPARENCY_AS_STRING:
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_RENDERING__REFLECTANCE_METHOD:
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
