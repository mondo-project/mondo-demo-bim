/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcRelInteractionRequirements;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcRelInteractionRequirements} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcRelInteractionRequirementsItemProvider extends IfcRelConnectsItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelInteractionRequirementsItemProvider(AdapterFactory adapterFactory) {
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

			addDailyInteractionPropertyDescriptor(object);
			addDailyInteractionAsStringPropertyDescriptor(object);
			addImportanceRatingPropertyDescriptor(object);
			addImportanceRatingAsStringPropertyDescriptor(object);
			addLocationOfInteractionPropertyDescriptor(object);
			addRelatedSpaceProgramPropertyDescriptor(object);
			addRelatingSpaceProgramPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Daily Interaction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDailyInteractionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcRelInteractionRequirements_DailyInteraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcRelInteractionRequirements_DailyInteraction_feature", "_UI_IfcRelInteractionRequirements_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcRelInteractionRequirements_DailyInteraction(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Daily Interaction As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDailyInteractionAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcRelInteractionRequirements_DailyInteractionAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcRelInteractionRequirements_DailyInteractionAsString_feature", "_UI_IfcRelInteractionRequirements_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcRelInteractionRequirements_DailyInteractionAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Importance Rating feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImportanceRatingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcRelInteractionRequirements_ImportanceRating_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcRelInteractionRequirements_ImportanceRating_feature", "_UI_IfcRelInteractionRequirements_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcRelInteractionRequirements_ImportanceRating(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Importance Rating As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImportanceRatingAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcRelInteractionRequirements_ImportanceRatingAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcRelInteractionRequirements_ImportanceRatingAsString_feature", "_UI_IfcRelInteractionRequirements_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcRelInteractionRequirements_ImportanceRatingAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Location Of Interaction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocationOfInteractionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcRelInteractionRequirements_LocationOfInteraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcRelInteractionRequirements_LocationOfInteraction_feature", "_UI_IfcRelInteractionRequirements_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcRelInteractionRequirements_LocationOfInteraction(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Related Space Program feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRelatedSpaceProgramPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcRelInteractionRequirements_RelatedSpaceProgram_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcRelInteractionRequirements_RelatedSpaceProgram_feature", "_UI_IfcRelInteractionRequirements_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcRelInteractionRequirements_RelatedSpaceProgram(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Relating Space Program feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRelatingSpaceProgramPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcRelInteractionRequirements_RelatingSpaceProgram_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcRelInteractionRequirements_RelatingSpaceProgram_feature", "_UI_IfcRelInteractionRequirements_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcRelInteractionRequirements_RelatingSpaceProgram(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns IfcRelInteractionRequirements.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcRelInteractionRequirements"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IfcRelInteractionRequirements)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_IfcRelInteractionRequirements_type") :
			getString("_UI_IfcRelInteractionRequirements_type") + " " + label;
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

		switch (notification.getFeatureID(IfcRelInteractionRequirements.class)) {
			case Ifc2x3tc1Package.IFC_REL_INTERACTION_REQUIREMENTS__DAILY_INTERACTION:
			case Ifc2x3tc1Package.IFC_REL_INTERACTION_REQUIREMENTS__DAILY_INTERACTION_AS_STRING:
			case Ifc2x3tc1Package.IFC_REL_INTERACTION_REQUIREMENTS__IMPORTANCE_RATING:
			case Ifc2x3tc1Package.IFC_REL_INTERACTION_REQUIREMENTS__IMPORTANCE_RATING_AS_STRING:
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
