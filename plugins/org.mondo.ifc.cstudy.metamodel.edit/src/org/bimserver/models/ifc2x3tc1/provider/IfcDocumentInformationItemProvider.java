/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcDocumentInformation;

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
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcDocumentInformation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcDocumentInformationItemProvider 
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
	public IfcDocumentInformationItemProvider(AdapterFactory adapterFactory) {
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

			addDocumentIdPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addDocumentReferencesPropertyDescriptor(object);
			addPurposePropertyDescriptor(object);
			addIntendedUsePropertyDescriptor(object);
			addScopePropertyDescriptor(object);
			addRevisionPropertyDescriptor(object);
			addDocumentOwnerPropertyDescriptor(object);
			addEditorsPropertyDescriptor(object);
			addCreationTimePropertyDescriptor(object);
			addLastRevisionTimePropertyDescriptor(object);
			addElectronicFormatPropertyDescriptor(object);
			addValidFromPropertyDescriptor(object);
			addValidUntilPropertyDescriptor(object);
			addConfidentialityPropertyDescriptor(object);
			addStatusPropertyDescriptor(object);
			addIsPointedToPropertyDescriptor(object);
			addIsPointerPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Document Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDocumentIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcDocumentInformation_DocumentId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcDocumentInformation_DocumentId_feature", "_UI_IfcDocumentInformation_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_DocumentId(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcDocumentInformation_Name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcDocumentInformation_Name_feature", "_UI_IfcDocumentInformation_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_Name(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcDocumentInformation_Description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcDocumentInformation_Description_feature", "_UI_IfcDocumentInformation_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_Description(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Document References feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDocumentReferencesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcDocumentInformation_DocumentReferences_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcDocumentInformation_DocumentReferences_feature", "_UI_IfcDocumentInformation_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_DocumentReferences(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Purpose feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPurposePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcDocumentInformation_Purpose_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcDocumentInformation_Purpose_feature", "_UI_IfcDocumentInformation_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_Purpose(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Intended Use feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIntendedUsePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcDocumentInformation_IntendedUse_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcDocumentInformation_IntendedUse_feature", "_UI_IfcDocumentInformation_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_IntendedUse(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Scope feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScopePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcDocumentInformation_Scope_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcDocumentInformation_Scope_feature", "_UI_IfcDocumentInformation_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_Scope(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Revision feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRevisionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcDocumentInformation_Revision_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcDocumentInformation_Revision_feature", "_UI_IfcDocumentInformation_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_Revision(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Document Owner feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDocumentOwnerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcDocumentInformation_DocumentOwner_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcDocumentInformation_DocumentOwner_feature", "_UI_IfcDocumentInformation_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_DocumentOwner(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Editors feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEditorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcDocumentInformation_Editors_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcDocumentInformation_Editors_feature", "_UI_IfcDocumentInformation_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_Editors(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Creation Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreationTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcDocumentInformation_CreationTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcDocumentInformation_CreationTime_feature", "_UI_IfcDocumentInformation_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_CreationTime(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Last Revision Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLastRevisionTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcDocumentInformation_LastRevisionTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcDocumentInformation_LastRevisionTime_feature", "_UI_IfcDocumentInformation_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_LastRevisionTime(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Electronic Format feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addElectronicFormatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcDocumentInformation_ElectronicFormat_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcDocumentInformation_ElectronicFormat_feature", "_UI_IfcDocumentInformation_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_ElectronicFormat(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Valid From feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValidFromPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcDocumentInformation_ValidFrom_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcDocumentInformation_ValidFrom_feature", "_UI_IfcDocumentInformation_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_ValidFrom(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Valid Until feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValidUntilPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcDocumentInformation_ValidUntil_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcDocumentInformation_ValidUntil_feature", "_UI_IfcDocumentInformation_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_ValidUntil(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Confidentiality feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConfidentialityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcDocumentInformation_Confidentiality_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcDocumentInformation_Confidentiality_feature", "_UI_IfcDocumentInformation_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_Confidentiality(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcDocumentInformation_Status_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcDocumentInformation_Status_feature", "_UI_IfcDocumentInformation_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_Status(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Pointed To feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsPointedToPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcDocumentInformation_IsPointedTo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcDocumentInformation_IsPointedTo_feature", "_UI_IfcDocumentInformation_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_IsPointedTo(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Pointer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsPointerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcDocumentInformation_IsPointer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcDocumentInformation_IsPointer_feature", "_UI_IfcDocumentInformation_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcDocumentInformation_IsPointer(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns IfcDocumentInformation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcDocumentInformation"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IfcDocumentInformation)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_IfcDocumentInformation_type") :
			getString("_UI_IfcDocumentInformation_type") + " " + label;
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

		switch (notification.getFeatureID(IfcDocumentInformation.class)) {
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__DOCUMENT_ID:
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__NAME:
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__DESCRIPTION:
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__PURPOSE:
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__INTENDED_USE:
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__SCOPE:
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__REVISION:
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__CONFIDENTIALITY:
			case Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__STATUS:
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
