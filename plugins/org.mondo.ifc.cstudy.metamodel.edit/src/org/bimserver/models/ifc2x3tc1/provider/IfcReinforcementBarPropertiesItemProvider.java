/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcReinforcementBarProperties;

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
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcReinforcementBarProperties} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcReinforcementBarPropertiesItemProvider 
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
	public IfcReinforcementBarPropertiesItemProvider(AdapterFactory adapterFactory) {
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

			addTotalCrossSectionAreaPropertyDescriptor(object);
			addTotalCrossSectionAreaAsStringPropertyDescriptor(object);
			addSteelGradePropertyDescriptor(object);
			addBarSurfacePropertyDescriptor(object);
			addEffectiveDepthPropertyDescriptor(object);
			addEffectiveDepthAsStringPropertyDescriptor(object);
			addNominalBarDiameterPropertyDescriptor(object);
			addNominalBarDiameterAsStringPropertyDescriptor(object);
			addBarCountPropertyDescriptor(object);
			addBarCountAsStringPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Total Cross Section Area feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTotalCrossSectionAreaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcReinforcementBarProperties_TotalCrossSectionArea_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcReinforcementBarProperties_TotalCrossSectionArea_feature", "_UI_IfcReinforcementBarProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcReinforcementBarProperties_TotalCrossSectionArea(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Total Cross Section Area As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTotalCrossSectionAreaAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcReinforcementBarProperties_TotalCrossSectionAreaAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcReinforcementBarProperties_TotalCrossSectionAreaAsString_feature", "_UI_IfcReinforcementBarProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcReinforcementBarProperties_TotalCrossSectionAreaAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Steel Grade feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSteelGradePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcReinforcementBarProperties_SteelGrade_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcReinforcementBarProperties_SteelGrade_feature", "_UI_IfcReinforcementBarProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcReinforcementBarProperties_SteelGrade(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Bar Surface feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBarSurfacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcReinforcementBarProperties_BarSurface_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcReinforcementBarProperties_BarSurface_feature", "_UI_IfcReinforcementBarProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcReinforcementBarProperties_BarSurface(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Effective Depth feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEffectiveDepthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcReinforcementBarProperties_EffectiveDepth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcReinforcementBarProperties_EffectiveDepth_feature", "_UI_IfcReinforcementBarProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcReinforcementBarProperties_EffectiveDepth(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Effective Depth As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEffectiveDepthAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcReinforcementBarProperties_EffectiveDepthAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcReinforcementBarProperties_EffectiveDepthAsString_feature", "_UI_IfcReinforcementBarProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcReinforcementBarProperties_EffectiveDepthAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nominal Bar Diameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNominalBarDiameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcReinforcementBarProperties_NominalBarDiameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcReinforcementBarProperties_NominalBarDiameter_feature", "_UI_IfcReinforcementBarProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcReinforcementBarProperties_NominalBarDiameter(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nominal Bar Diameter As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNominalBarDiameterAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcReinforcementBarProperties_NominalBarDiameterAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcReinforcementBarProperties_NominalBarDiameterAsString_feature", "_UI_IfcReinforcementBarProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcReinforcementBarProperties_NominalBarDiameterAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Bar Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBarCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcReinforcementBarProperties_BarCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcReinforcementBarProperties_BarCount_feature", "_UI_IfcReinforcementBarProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcReinforcementBarProperties_BarCount(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Bar Count As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBarCountAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcReinforcementBarProperties_BarCountAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcReinforcementBarProperties_BarCountAsString_feature", "_UI_IfcReinforcementBarProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcReinforcementBarProperties_BarCountAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcReinforcementBarProperties.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcReinforcementBarProperties"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		IfcReinforcementBarProperties ifcReinforcementBarProperties = (IfcReinforcementBarProperties)object;
		return getString("_UI_IfcReinforcementBarProperties_type") + " " + ifcReinforcementBarProperties.getTotalCrossSectionArea();
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

		switch (notification.getFeatureID(IfcReinforcementBarProperties.class)) {
			case Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__TOTAL_CROSS_SECTION_AREA:
			case Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__TOTAL_CROSS_SECTION_AREA_AS_STRING:
			case Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__STEEL_GRADE:
			case Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__BAR_SURFACE:
			case Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__EFFECTIVE_DEPTH:
			case Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__EFFECTIVE_DEPTH_AS_STRING:
			case Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__NOMINAL_BAR_DIAMETER:
			case Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__NOMINAL_BAR_DIAMETER_AS_STRING:
			case Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__BAR_COUNT:
			case Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__BAR_COUNT_AS_STRING:
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
