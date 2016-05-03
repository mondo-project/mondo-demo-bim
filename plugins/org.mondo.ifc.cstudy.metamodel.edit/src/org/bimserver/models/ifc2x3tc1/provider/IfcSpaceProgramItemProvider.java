/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcSpaceProgram;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcSpaceProgram} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcSpaceProgramItemProvider extends IfcControlItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSpaceProgramItemProvider(AdapterFactory adapterFactory) {
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

			addSpaceProgramIdentifierPropertyDescriptor(object);
			addMaxRequiredAreaPropertyDescriptor(object);
			addMaxRequiredAreaAsStringPropertyDescriptor(object);
			addMinRequiredAreaPropertyDescriptor(object);
			addMinRequiredAreaAsStringPropertyDescriptor(object);
			addRequestedLocationPropertyDescriptor(object);
			addStandardRequiredAreaPropertyDescriptor(object);
			addStandardRequiredAreaAsStringPropertyDescriptor(object);
			addHasInteractionReqsFromPropertyDescriptor(object);
			addHasInteractionReqsToPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Space Program Identifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpaceProgramIdentifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcSpaceProgram_SpaceProgramIdentifier_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcSpaceProgram_SpaceProgramIdentifier_feature", "_UI_IfcSpaceProgram_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcSpaceProgram_SpaceProgramIdentifier(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Required Area feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxRequiredAreaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcSpaceProgram_MaxRequiredArea_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcSpaceProgram_MaxRequiredArea_feature", "_UI_IfcSpaceProgram_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcSpaceProgram_MaxRequiredArea(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Required Area As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxRequiredAreaAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcSpaceProgram_MaxRequiredAreaAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcSpaceProgram_MaxRequiredAreaAsString_feature", "_UI_IfcSpaceProgram_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcSpaceProgram_MaxRequiredAreaAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Min Required Area feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinRequiredAreaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcSpaceProgram_MinRequiredArea_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcSpaceProgram_MinRequiredArea_feature", "_UI_IfcSpaceProgram_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcSpaceProgram_MinRequiredArea(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Min Required Area As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinRequiredAreaAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcSpaceProgram_MinRequiredAreaAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcSpaceProgram_MinRequiredAreaAsString_feature", "_UI_IfcSpaceProgram_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcSpaceProgram_MinRequiredAreaAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Requested Location feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequestedLocationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcSpaceProgram_RequestedLocation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcSpaceProgram_RequestedLocation_feature", "_UI_IfcSpaceProgram_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcSpaceProgram_RequestedLocation(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Standard Required Area feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStandardRequiredAreaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcSpaceProgram_StandardRequiredArea_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcSpaceProgram_StandardRequiredArea_feature", "_UI_IfcSpaceProgram_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcSpaceProgram_StandardRequiredArea(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Standard Required Area As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStandardRequiredAreaAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcSpaceProgram_StandardRequiredAreaAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcSpaceProgram_StandardRequiredAreaAsString_feature", "_UI_IfcSpaceProgram_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcSpaceProgram_StandardRequiredAreaAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Interaction Reqs From feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasInteractionReqsFromPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcSpaceProgram_HasInteractionReqsFrom_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcSpaceProgram_HasInteractionReqsFrom_feature", "_UI_IfcSpaceProgram_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcSpaceProgram_HasInteractionReqsFrom(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Interaction Reqs To feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasInteractionReqsToPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcSpaceProgram_HasInteractionReqsTo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcSpaceProgram_HasInteractionReqsTo_feature", "_UI_IfcSpaceProgram_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcSpaceProgram_HasInteractionReqsTo(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns IfcSpaceProgram.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcSpaceProgram"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IfcSpaceProgram)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_IfcSpaceProgram_type") :
			getString("_UI_IfcSpaceProgram_type") + " " + label;
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

		switch (notification.getFeatureID(IfcSpaceProgram.class)) {
			case Ifc2x3tc1Package.IFC_SPACE_PROGRAM__SPACE_PROGRAM_IDENTIFIER:
			case Ifc2x3tc1Package.IFC_SPACE_PROGRAM__MAX_REQUIRED_AREA:
			case Ifc2x3tc1Package.IFC_SPACE_PROGRAM__MAX_REQUIRED_AREA_AS_STRING:
			case Ifc2x3tc1Package.IFC_SPACE_PROGRAM__MIN_REQUIRED_AREA:
			case Ifc2x3tc1Package.IFC_SPACE_PROGRAM__MIN_REQUIRED_AREA_AS_STRING:
			case Ifc2x3tc1Package.IFC_SPACE_PROGRAM__STANDARD_REQUIRED_AREA:
			case Ifc2x3tc1Package.IFC_SPACE_PROGRAM__STANDARD_REQUIRED_AREA_AS_STRING:
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
