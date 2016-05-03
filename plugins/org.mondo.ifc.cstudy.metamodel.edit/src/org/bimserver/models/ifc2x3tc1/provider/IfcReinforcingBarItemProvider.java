/**
 */
package org.bimserver.models.ifc2x3tc1.provider;


import java.util.Collection;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcReinforcingBar;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.bimserver.models.ifc2x3tc1.IfcReinforcingBar} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfcReinforcingBarItemProvider extends IfcReinforcingElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcReinforcingBarItemProvider(AdapterFactory adapterFactory) {
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

			addNominalDiameterPropertyDescriptor(object);
			addNominalDiameterAsStringPropertyDescriptor(object);
			addCrossSectionAreaPropertyDescriptor(object);
			addCrossSectionAreaAsStringPropertyDescriptor(object);
			addBarLengthPropertyDescriptor(object);
			addBarLengthAsStringPropertyDescriptor(object);
			addBarRolePropertyDescriptor(object);
			addBarSurfacePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Nominal Diameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNominalDiameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcReinforcingBar_NominalDiameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcReinforcingBar_NominalDiameter_feature", "_UI_IfcReinforcingBar_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcReinforcingBar_NominalDiameter(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nominal Diameter As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNominalDiameterAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcReinforcingBar_NominalDiameterAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcReinforcingBar_NominalDiameterAsString_feature", "_UI_IfcReinforcingBar_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcReinforcingBar_NominalDiameterAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cross Section Area feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCrossSectionAreaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcReinforcingBar_CrossSectionArea_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcReinforcingBar_CrossSectionArea_feature", "_UI_IfcReinforcingBar_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcReinforcingBar_CrossSectionArea(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cross Section Area As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCrossSectionAreaAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcReinforcingBar_CrossSectionAreaAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcReinforcingBar_CrossSectionAreaAsString_feature", "_UI_IfcReinforcingBar_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcReinforcingBar_CrossSectionAreaAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Bar Length feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBarLengthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcReinforcingBar_BarLength_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcReinforcingBar_BarLength_feature", "_UI_IfcReinforcingBar_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcReinforcingBar_BarLength(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Bar Length As String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBarLengthAsStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcReinforcingBar_BarLengthAsString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcReinforcingBar_BarLengthAsString_feature", "_UI_IfcReinforcingBar_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcReinforcingBar_BarLengthAsString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Bar Role feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBarRolePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfcReinforcingBar_BarRole_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcReinforcingBar_BarRole_feature", "_UI_IfcReinforcingBar_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcReinforcingBar_BarRole(),
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
				 getString("_UI_IfcReinforcingBar_BarSurface_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfcReinforcingBar_BarSurface_feature", "_UI_IfcReinforcingBar_type"),
				 Ifc2x3tc1Package.eINSTANCE.getIfcReinforcingBar_BarSurface(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IfcReinforcingBar.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfcReinforcingBar"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IfcReinforcingBar)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_IfcReinforcingBar_type") :
			getString("_UI_IfcReinforcingBar_type") + " " + label;
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

		switch (notification.getFeatureID(IfcReinforcingBar.class)) {
			case Ifc2x3tc1Package.IFC_REINFORCING_BAR__NOMINAL_DIAMETER:
			case Ifc2x3tc1Package.IFC_REINFORCING_BAR__NOMINAL_DIAMETER_AS_STRING:
			case Ifc2x3tc1Package.IFC_REINFORCING_BAR__CROSS_SECTION_AREA:
			case Ifc2x3tc1Package.IFC_REINFORCING_BAR__CROSS_SECTION_AREA_AS_STRING:
			case Ifc2x3tc1Package.IFC_REINFORCING_BAR__BAR_LENGTH:
			case Ifc2x3tc1Package.IFC_REINFORCING_BAR__BAR_LENGTH_AS_STRING:
			case Ifc2x3tc1Package.IFC_REINFORCING_BAR__BAR_ROLE:
			case Ifc2x3tc1Package.IFC_REINFORCING_BAR__BAR_SURFACE:
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
