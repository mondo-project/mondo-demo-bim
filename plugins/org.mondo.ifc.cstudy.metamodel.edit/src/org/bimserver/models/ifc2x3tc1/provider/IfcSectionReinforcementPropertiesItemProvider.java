/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcSectionReinforcementProperties;

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
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcSectionReinforcementProperties} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcSectionReinforcementPropertiesItemProvider 
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
	public IfcSectionReinforcementPropertiesItemProvider(AdapterFactory adapterFactory) {
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

			addLongitudinalStartPositionPropertyDescriptor(object);
			addLongitudinalStartPositionAsStringPropertyDescriptor(object);
			addLongitudinalEndPositionPropertyDescriptor(object);
			addLongitudinalEndPositionAsStringPropertyDescriptor(object);
			addTransversePositionPropertyDescriptor(object);
			addTransversePositionAsStringPropertyDescriptor(object);
			addReinforcementRolePropertyDescriptor(object);
			addSectionDefinitionPropertyDescriptor(object);
			addCrossSectionReinforcementDefinitionsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Longitudinal Start Position feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLongitudinalStartPositionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcSectionReinforcementProperties_LongitudinalStartPosition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcSectionReinforcementProperties_LongitudinalStartPosition_feature", "_UI_IfcSectionReinforcementProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcSectionReinforcementProperties_LongitudinalStartPosition(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Longitudinal Start Position As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLongitudinalStartPositionAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcSectionReinforcementProperties_LongitudinalStartPositionAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcSectionReinforcementProperties_LongitudinalStartPositionAsString_feature", "_UI_IfcSectionReinforcementProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcSectionReinforcementProperties_LongitudinalStartPositionAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Longitudinal End Position feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLongitudinalEndPositionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcSectionReinforcementProperties_LongitudinalEndPosition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcSectionReinforcementProperties_LongitudinalEndPosition_feature", "_UI_IfcSectionReinforcementProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcSectionReinforcementProperties_LongitudinalEndPosition(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Longitudinal End Position As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLongitudinalEndPositionAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcSectionReinforcementProperties_LongitudinalEndPositionAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcSectionReinforcementProperties_LongitudinalEndPositionAsString_feature", "_UI_IfcSectionReinforcementProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcSectionReinforcementProperties_LongitudinalEndPositionAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Transverse Position feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransversePositionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcSectionReinforcementProperties_TransversePosition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcSectionReinforcementProperties_TransversePosition_feature", "_UI_IfcSectionReinforcementProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcSectionReinforcementProperties_TransversePosition(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Transverse Position As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransversePositionAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcSectionReinforcementProperties_TransversePositionAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcSectionReinforcementProperties_TransversePositionAsString_feature", "_UI_IfcSectionReinforcementProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcSectionReinforcementProperties_TransversePositionAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reinforcement Role feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReinforcementRolePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcSectionReinforcementProperties_ReinforcementRole_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcSectionReinforcementProperties_ReinforcementRole_feature", "_UI_IfcSectionReinforcementProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcSectionReinforcementProperties_ReinforcementRole(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Section Definition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSectionDefinitionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcSectionReinforcementProperties_SectionDefinition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcSectionReinforcementProperties_SectionDefinition_feature", "_UI_IfcSectionReinforcementProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcSectionReinforcementProperties_SectionDefinition(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cross Section Reinforcement Definitions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCrossSectionReinforcementDefinitionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcSectionReinforcementProperties_CrossSectionReinforcementDefinitions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcSectionReinforcementProperties_CrossSectionReinforcementDefinitions_feature", "_UI_IfcSectionReinforcementProperties_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcSectionReinforcementProperties_CrossSectionReinforcementDefinitions(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns IfcSectionReinforcementProperties.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcSectionReinforcementProperties"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		IfcSectionReinforcementProperties ifcSectionReinforcementProperties = (IfcSectionReinforcementProperties)object;
		return getString("_UI_IfcSectionReinforcementProperties_type") + " " + ifcSectionReinforcementProperties.getLongitudinalStartPosition();
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

		switch (notification.getFeatureID(IfcSectionReinforcementProperties.class)) {
			case Ifc2x3tc1Package.IFC_SECTION_REINFORCEMENT_PROPERTIES__LONGITUDINAL_START_POSITION:
			case Ifc2x3tc1Package.IFC_SECTION_REINFORCEMENT_PROPERTIES__LONGITUDINAL_START_POSITION_AS_STRING:
			case Ifc2x3tc1Package.IFC_SECTION_REINFORCEMENT_PROPERTIES__LONGITUDINAL_END_POSITION:
			case Ifc2x3tc1Package.IFC_SECTION_REINFORCEMENT_PROPERTIES__LONGITUDINAL_END_POSITION_AS_STRING:
			case Ifc2x3tc1Package.IFC_SECTION_REINFORCEMENT_PROPERTIES__TRANSVERSE_POSITION:
			case Ifc2x3tc1Package.IFC_SECTION_REINFORCEMENT_PROPERTIES__TRANSVERSE_POSITION_AS_STRING:
			case Ifc2x3tc1Package.IFC_SECTION_REINFORCEMENT_PROPERTIES__REINFORCEMENT_ROLE:
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
