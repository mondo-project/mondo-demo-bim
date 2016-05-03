/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcElement;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcElementItemProvider extends IfcProductItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElementItemProvider(AdapterFactory adapterFactory) {
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

			addTagPropertyDescriptor(object);
			addHasStructuralMemberPropertyDescriptor(object);
			addFillsVoidsPropertyDescriptor(object);
			addConnectedToPropertyDescriptor(object);
			addHasCoveringsPropertyDescriptor(object);
			addHasProjectionsPropertyDescriptor(object);
			addReferencedInStructuresPropertyDescriptor(object);
			addHasPortsPropertyDescriptor(object);
			addHasOpeningsPropertyDescriptor(object);
			addIsConnectionRealizationPropertyDescriptor(object);
			addProvidesBoundariesPropertyDescriptor(object);
			addConnectedFromPropertyDescriptor(object);
			addContainedInStructurePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Tag feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTagPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcElement_Tag_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcElement_Tag_feature", "_UI_IfcElement_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcElement_Tag(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Structural Member feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasStructuralMemberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcElement_HasStructuralMember_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcElement_HasStructuralMember_feature", "_UI_IfcElement_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcElement_HasStructuralMember(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fills Voids feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFillsVoidsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcElement_FillsVoids_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcElement_FillsVoids_feature", "_UI_IfcElement_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcElement_FillsVoids(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Connected To feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConnectedToPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcElement_ConnectedTo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcElement_ConnectedTo_feature", "_UI_IfcElement_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcElement_ConnectedTo(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Coverings feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasCoveringsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcElement_HasCoverings_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcElement_HasCoverings_feature", "_UI_IfcElement_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcElement_HasCoverings(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Projections feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasProjectionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcElement_HasProjections_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcElement_HasProjections_feature", "_UI_IfcElement_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcElement_HasProjections(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Referenced In Structures feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReferencedInStructuresPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcElement_ReferencedInStructures_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcElement_ReferencedInStructures_feature", "_UI_IfcElement_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcElement_ReferencedInStructures(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Ports feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasPortsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcElement_HasPorts_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcElement_HasPorts_feature", "_UI_IfcElement_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcElement_HasPorts(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Openings feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasOpeningsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcElement_HasOpenings_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcElement_HasOpenings_feature", "_UI_IfcElement_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcElement_HasOpenings(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Connection Realization feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsConnectionRealizationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcElement_IsConnectionRealization_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcElement_IsConnectionRealization_feature", "_UI_IfcElement_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcElement_IsConnectionRealization(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Provides Boundaries feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProvidesBoundariesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcElement_ProvidesBoundaries_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcElement_ProvidesBoundaries_feature", "_UI_IfcElement_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcElement_ProvidesBoundaries(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Connected From feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConnectedFromPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcElement_ConnectedFrom_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcElement_ConnectedFrom_feature", "_UI_IfcElement_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcElement_ConnectedFrom(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Contained In Structure feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContainedInStructurePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcElement_ContainedInStructure_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcElement_ContainedInStructure_feature", "_UI_IfcElement_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcElement_ContainedInStructure(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns IfcElement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcElement"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IfcElement)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_IfcElement_type") :
			getString("_UI_IfcElement_type") + " " + label;
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

		switch (notification.getFeatureID(IfcElement.class)) {
			case Ifc2x3tc1Package.IFC_ELEMENT__TAG:
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
