/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcLayerSetDirectionEnum;
import org.bimserver.models.ifc2x3tc1.IfcMaterialLayerSetUsage;

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
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcMaterialLayerSetUsage} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcMaterialLayerSetUsageItemProvider 
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
	public IfcMaterialLayerSetUsageItemProvider(AdapterFactory adapterFactory) {
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

			addForLayerSetPropertyDescriptor(object);
			addLayerSetDirectionPropertyDescriptor(object);
			addDirectionSensePropertyDescriptor(object);
			addOffsetFromReferenceLinePropertyDescriptor(object);
			addOffsetFromReferenceLineAsStringPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the For Layer Set feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addForLayerSetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcMaterialLayerSetUsage_ForLayerSet_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcMaterialLayerSetUsage_ForLayerSet_feature", "_UI_IfcMaterialLayerSetUsage_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcMaterialLayerSetUsage_ForLayerSet(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Layer Set Direction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLayerSetDirectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcMaterialLayerSetUsage_LayerSetDirection_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcMaterialLayerSetUsage_LayerSetDirection_feature", "_UI_IfcMaterialLayerSetUsage_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcMaterialLayerSetUsage_LayerSetDirection(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Direction Sense feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDirectionSensePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcMaterialLayerSetUsage_DirectionSense_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcMaterialLayerSetUsage_DirectionSense_feature", "_UI_IfcMaterialLayerSetUsage_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcMaterialLayerSetUsage_DirectionSense(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Offset From Reference Line feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOffsetFromReferenceLinePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcMaterialLayerSetUsage_OffsetFromReferenceLine_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcMaterialLayerSetUsage_OffsetFromReferenceLine_feature", "_UI_IfcMaterialLayerSetUsage_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcMaterialLayerSetUsage_OffsetFromReferenceLine(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Offset From Reference Line As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOffsetFromReferenceLineAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcMaterialLayerSetUsage_OffsetFromReferenceLineAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcMaterialLayerSetUsage_OffsetFromReferenceLineAsString_feature", "_UI_IfcMaterialLayerSetUsage_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcMaterialLayerSetUsage_OffsetFromReferenceLineAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcMaterialLayerSetUsage.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcMaterialLayerSetUsage"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		IfcLayerSetDirectionEnum labelValue = ((IfcMaterialLayerSetUsage)object).getLayerSetDirection();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_IfcMaterialLayerSetUsage_type") :
			getString("_UI_IfcMaterialLayerSetUsage_type") + " " + label;
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

		switch (notification.getFeatureID(IfcMaterialLayerSetUsage.class)) {
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER_SET_USAGE__LAYER_SET_DIRECTION:
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER_SET_USAGE__DIRECTION_SENSE:
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER_SET_USAGE__OFFSET_FROM_REFERENCE_LINE:
			case Ifc2x3tc1Package.IFC_MATERIAL_LAYER_SET_USAGE__OFFSET_FROM_REFERENCE_LINE_AS_STRING:
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
