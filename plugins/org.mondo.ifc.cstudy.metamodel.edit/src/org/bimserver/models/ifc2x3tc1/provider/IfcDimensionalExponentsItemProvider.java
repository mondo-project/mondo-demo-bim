/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcDimensionalExponents;

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
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcDimensionalExponents} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcDimensionalExponentsItemProvider 
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
	public IfcDimensionalExponentsItemProvider(AdapterFactory adapterFactory) {
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

			addLengthExponentPropertyDescriptor(object);
			addMassExponentPropertyDescriptor(object);
			addTimeExponentPropertyDescriptor(object);
			addElectricCurrentExponentPropertyDescriptor(object);
			addThermodynamicTemperatureExponentPropertyDescriptor(object);
			addAmountOfSubstanceExponentPropertyDescriptor(object);
			addLuminousIntensityExponentPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Length Exponent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLengthExponentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcDimensionalExponents_LengthExponent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcDimensionalExponents_LengthExponent_feature", "_UI_IfcDimensionalExponents_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcDimensionalExponents_LengthExponent(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mass Exponent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMassExponentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcDimensionalExponents_MassExponent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcDimensionalExponents_MassExponent_feature", "_UI_IfcDimensionalExponents_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcDimensionalExponents_MassExponent(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Time Exponent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimeExponentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcDimensionalExponents_TimeExponent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcDimensionalExponents_TimeExponent_feature", "_UI_IfcDimensionalExponents_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcDimensionalExponents_TimeExponent(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Electric Current Exponent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addElectricCurrentExponentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcDimensionalExponents_ElectricCurrentExponent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcDimensionalExponents_ElectricCurrentExponent_feature", "_UI_IfcDimensionalExponents_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcDimensionalExponents_ElectricCurrentExponent(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Thermodynamic Temperature Exponent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addThermodynamicTemperatureExponentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcDimensionalExponents_ThermodynamicTemperatureExponent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcDimensionalExponents_ThermodynamicTemperatureExponent_feature", "_UI_IfcDimensionalExponents_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcDimensionalExponents_ThermodynamicTemperatureExponent(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Amount Of Substance Exponent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAmountOfSubstanceExponentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcDimensionalExponents_AmountOfSubstanceExponent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcDimensionalExponents_AmountOfSubstanceExponent_feature", "_UI_IfcDimensionalExponents_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcDimensionalExponents_AmountOfSubstanceExponent(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Luminous Intensity Exponent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLuminousIntensityExponentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcDimensionalExponents_LuminousIntensityExponent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcDimensionalExponents_LuminousIntensityExponent_feature", "_UI_IfcDimensionalExponents_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcDimensionalExponents_LuminousIntensityExponent(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcDimensionalExponents.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcDimensionalExponents"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		IfcDimensionalExponents ifcDimensionalExponents = (IfcDimensionalExponents)object;
		return getString("_UI_IfcDimensionalExponents_type") + " " + ifcDimensionalExponents.getLengthExponent();
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

		switch (notification.getFeatureID(IfcDimensionalExponents.class)) {
			case Ifc2x3tc1Package.IFC_DIMENSIONAL_EXPONENTS__LENGTH_EXPONENT:
			case Ifc2x3tc1Package.IFC_DIMENSIONAL_EXPONENTS__MASS_EXPONENT:
			case Ifc2x3tc1Package.IFC_DIMENSIONAL_EXPONENTS__TIME_EXPONENT:
			case Ifc2x3tc1Package.IFC_DIMENSIONAL_EXPONENTS__ELECTRIC_CURRENT_EXPONENT:
			case Ifc2x3tc1Package.IFC_DIMENSIONAL_EXPONENTS__THERMODYNAMIC_TEMPERATURE_EXPONENT:
			case Ifc2x3tc1Package.IFC_DIMENSIONAL_EXPONENTS__AMOUNT_OF_SUBSTANCE_EXPONENT:
			case Ifc2x3tc1Package.IFC_DIMENSIONAL_EXPONENTS__LUMINOUS_INTENSITY_EXPONENT:
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
