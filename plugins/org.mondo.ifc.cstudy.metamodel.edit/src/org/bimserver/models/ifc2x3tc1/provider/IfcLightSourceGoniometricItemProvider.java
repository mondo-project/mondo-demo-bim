/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcLightSourceGoniometric;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcLightSourceGoniometric} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcLightSourceGoniometricItemProvider extends IfcLightSourceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLightSourceGoniometricItemProvider(AdapterFactory adapterFactory) {
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
			addColourAppearancePropertyDescriptor(object);
			addColourTemperaturePropertyDescriptor(object);
			addColourTemperatureAsStringPropertyDescriptor(object);
			addLuminousFluxPropertyDescriptor(object);
			addLuminousFluxAsStringPropertyDescriptor(object);
			addLightEmissionSourcePropertyDescriptor(object);
			addLightDistributionDataSourcePropertyDescriptor(object);
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
				 getString("_UI_IfcLightSourceGoniometric_Position_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcLightSourceGoniometric_Position_feature", "_UI_IfcLightSourceGoniometric_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcLightSourceGoniometric_Position(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Colour Appearance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColourAppearancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcLightSourceGoniometric_ColourAppearance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcLightSourceGoniometric_ColourAppearance_feature", "_UI_IfcLightSourceGoniometric_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcLightSourceGoniometric_ColourAppearance(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Colour Temperature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColourTemperaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcLightSourceGoniometric_ColourTemperature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcLightSourceGoniometric_ColourTemperature_feature", "_UI_IfcLightSourceGoniometric_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcLightSourceGoniometric_ColourTemperature(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Colour Temperature As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColourTemperatureAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcLightSourceGoniometric_ColourTemperatureAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcLightSourceGoniometric_ColourTemperatureAsString_feature", "_UI_IfcLightSourceGoniometric_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcLightSourceGoniometric_ColourTemperatureAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Luminous Flux feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLuminousFluxPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcLightSourceGoniometric_LuminousFlux_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcLightSourceGoniometric_LuminousFlux_feature", "_UI_IfcLightSourceGoniometric_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcLightSourceGoniometric_LuminousFlux(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Luminous Flux As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLuminousFluxAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcLightSourceGoniometric_LuminousFluxAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcLightSourceGoniometric_LuminousFluxAsString_feature", "_UI_IfcLightSourceGoniometric_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcLightSourceGoniometric_LuminousFluxAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Light Emission Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLightEmissionSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcLightSourceGoniometric_LightEmissionSource_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcLightSourceGoniometric_LightEmissionSource_feature", "_UI_IfcLightSourceGoniometric_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcLightSourceGoniometric_LightEmissionSource(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Light Distribution Data Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLightDistributionDataSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcLightSourceGoniometric_LightDistributionDataSource_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcLightSourceGoniometric_LightDistributionDataSource_feature", "_UI_IfcLightSourceGoniometric_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcLightSourceGoniometric_LightDistributionDataSource(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns IfcLightSourceGoniometric.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcLightSourceGoniometric"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IfcLightSourceGoniometric)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_IfcLightSourceGoniometric_type") :
			getString("_UI_IfcLightSourceGoniometric_type") + " " + label;
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

		switch (notification.getFeatureID(IfcLightSourceGoniometric.class)) {
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_GONIOMETRIC__COLOUR_TEMPERATURE:
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_GONIOMETRIC__COLOUR_TEMPERATURE_AS_STRING:
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_GONIOMETRIC__LUMINOUS_FLUX:
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_GONIOMETRIC__LUMINOUS_FLUX_AS_STRING:
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_GONIOMETRIC__LIGHT_EMISSION_SOURCE:
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
