/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcRelConnectsStructuralMember;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcRelConnectsStructuralMember} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcRelConnectsStructuralMemberItemProvider extends IfcRelConnectsItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelConnectsStructuralMemberItemProvider(AdapterFactory adapterFactory) {
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

			addRelatingStructuralMemberPropertyDescriptor(object);
			addRelatedStructuralConnectionPropertyDescriptor(object);
			addAppliedConditionPropertyDescriptor(object);
			addAdditionalConditionsPropertyDescriptor(object);
			addSupportedLengthPropertyDescriptor(object);
			addSupportedLengthAsStringPropertyDescriptor(object);
			addConditionCoordinateSystemPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Relating Structural Member feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRelatingStructuralMemberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcRelConnectsStructuralMember_RelatingStructuralMember_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcRelConnectsStructuralMember_RelatingStructuralMember_feature", "_UI_IfcRelConnectsStructuralMember_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcRelConnectsStructuralMember_RelatingStructuralMember(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Related Structural Connection feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRelatedStructuralConnectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcRelConnectsStructuralMember_RelatedStructuralConnection_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcRelConnectsStructuralMember_RelatedStructuralConnection_feature", "_UI_IfcRelConnectsStructuralMember_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcRelConnectsStructuralMember_RelatedStructuralConnection(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Applied Condition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAppliedConditionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcRelConnectsStructuralMember_AppliedCondition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcRelConnectsStructuralMember_AppliedCondition_feature", "_UI_IfcRelConnectsStructuralMember_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcRelConnectsStructuralMember_AppliedCondition(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Additional Conditions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAdditionalConditionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcRelConnectsStructuralMember_AdditionalConditions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcRelConnectsStructuralMember_AdditionalConditions_feature", "_UI_IfcRelConnectsStructuralMember_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcRelConnectsStructuralMember_AdditionalConditions(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Supported Length feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSupportedLengthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcRelConnectsStructuralMember_SupportedLength_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcRelConnectsStructuralMember_SupportedLength_feature", "_UI_IfcRelConnectsStructuralMember_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcRelConnectsStructuralMember_SupportedLength(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Supported Length As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSupportedLengthAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcRelConnectsStructuralMember_SupportedLengthAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcRelConnectsStructuralMember_SupportedLengthAsString_feature", "_UI_IfcRelConnectsStructuralMember_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcRelConnectsStructuralMember_SupportedLengthAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Condition Coordinate System feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConditionCoordinateSystemPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcRelConnectsStructuralMember_ConditionCoordinateSystem_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcRelConnectsStructuralMember_ConditionCoordinateSystem_feature", "_UI_IfcRelConnectsStructuralMember_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcRelConnectsStructuralMember_ConditionCoordinateSystem(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns IfcRelConnectsStructuralMember.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcRelConnectsStructuralMember"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IfcRelConnectsStructuralMember)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_IfcRelConnectsStructuralMember_type") :
			getString("_UI_IfcRelConnectsStructuralMember_type") + " " + label;
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

		switch (notification.getFeatureID(IfcRelConnectsStructuralMember.class)) {
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__SUPPORTED_LENGTH:
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__SUPPORTED_LENGTH_AS_STRING:
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
