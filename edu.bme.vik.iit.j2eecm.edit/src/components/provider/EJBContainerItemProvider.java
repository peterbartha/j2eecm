/**
 */
package components.provider;


import components.ComponentsFactory;
import components.ComponentsPackage;
import components.EJBContainer;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

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
 * This is the item provider adapter for a {@link components.EJBContainer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EJBContainerItemProvider
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
	public EJBContainerItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_EJBContainer_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EJBContainer_name_feature", "_UI_EJBContainer_type"),
				 ComponentsPackage.Literals.EJB_CONTAINER__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ComponentsPackage.Literals.EJB_CONTAINER__GENERALIZATION_RELATIONSHIP);
			childrenFeatures.add(ComponentsPackage.Literals.EJB_CONTAINER__NAMED_ELEMENTS);
			childrenFeatures.add(ComponentsPackage.Literals.EJB_CONTAINER__CLASSIFIERS);
			childrenFeatures.add(ComponentsPackage.Literals.EJB_CONTAINER__RELIZATION_RELATIONSHIP);
			childrenFeatures.add(ComponentsPackage.Literals.EJB_CONTAINER__ASSOCIATIONS);
			childrenFeatures.add(ComponentsPackage.Literals.EJB_CONTAINER__ENUMS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns EJBContainer.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EJBContainer"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((EJBContainer)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_EJBContainer_type") :
			getString("_UI_EJBContainer_type") + " " + label;
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

		switch (notification.getFeatureID(EJBContainer.class)) {
			case ComponentsPackage.EJB_CONTAINER__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ComponentsPackage.EJB_CONTAINER__GENERALIZATION_RELATIONSHIP:
			case ComponentsPackage.EJB_CONTAINER__NAMED_ELEMENTS:
			case ComponentsPackage.EJB_CONTAINER__CLASSIFIERS:
			case ComponentsPackage.EJB_CONTAINER__RELIZATION_RELATIONSHIP:
			case ComponentsPackage.EJB_CONTAINER__ASSOCIATIONS:
			case ComponentsPackage.EJB_CONTAINER__ENUMS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.EJB_CONTAINER__GENERALIZATION_RELATIONSHIP,
				 ComponentsFactory.eINSTANCE.createGeneralization()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.EJB_CONTAINER__NAMED_ELEMENTS,
				 ComponentsFactory.eINSTANCE.createClassElement()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.EJB_CONTAINER__NAMED_ELEMENTS,
				 ComponentsFactory.eINSTANCE.createEntityBean()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.EJB_CONTAINER__NAMED_ELEMENTS,
				 ComponentsFactory.eINSTANCE.createMessageDrivenBean()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.EJB_CONTAINER__NAMED_ELEMENTS,
				 ComponentsFactory.eINSTANCE.createStatelessSessionBean()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.EJB_CONTAINER__NAMED_ELEMENTS,
				 ComponentsFactory.eINSTANCE.createStatefulSessionBean()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.EJB_CONTAINER__NAMED_ELEMENTS,
				 ComponentsFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.EJB_CONTAINER__NAMED_ELEMENTS,
				 ComponentsFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.EJB_CONTAINER__NAMED_ELEMENTS,
				 ComponentsFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.EJB_CONTAINER__NAMED_ELEMENTS,
				 ComponentsFactory.eINSTANCE.createPackageElement()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.EJB_CONTAINER__NAMED_ELEMENTS,
				 ComponentsFactory.eINSTANCE.createInterfaceElement()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.EJB_CONTAINER__NAMED_ELEMENTS,
				 ComponentsFactory.eINSTANCE.createAggregation()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.EJB_CONTAINER__NAMED_ELEMENTS,
				 ComponentsFactory.eINSTANCE.createEnumElement()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.EJB_CONTAINER__CLASSIFIERS,
				 ComponentsFactory.eINSTANCE.createClassElement()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.EJB_CONTAINER__CLASSIFIERS,
				 ComponentsFactory.eINSTANCE.createEntityBean()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.EJB_CONTAINER__CLASSIFIERS,
				 ComponentsFactory.eINSTANCE.createMessageDrivenBean()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.EJB_CONTAINER__CLASSIFIERS,
				 ComponentsFactory.eINSTANCE.createStatelessSessionBean()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.EJB_CONTAINER__CLASSIFIERS,
				 ComponentsFactory.eINSTANCE.createStatefulSessionBean()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.EJB_CONTAINER__CLASSIFIERS,
				 ComponentsFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.EJB_CONTAINER__CLASSIFIERS,
				 ComponentsFactory.eINSTANCE.createPackageElement()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.EJB_CONTAINER__CLASSIFIERS,
				 ComponentsFactory.eINSTANCE.createInterfaceElement()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.EJB_CONTAINER__CLASSIFIERS,
				 ComponentsFactory.eINSTANCE.createAggregation()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.EJB_CONTAINER__RELIZATION_RELATIONSHIP,
				 ComponentsFactory.eINSTANCE.createRealization()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.EJB_CONTAINER__ASSOCIATIONS,
				 ComponentsFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.EJB_CONTAINER__ASSOCIATIONS,
				 ComponentsFactory.eINSTANCE.createAggregation()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.EJB_CONTAINER__ENUMS,
				 ComponentsFactory.eINSTANCE.createEnumElement()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == ComponentsPackage.Literals.EJB_CONTAINER__NAMED_ELEMENTS ||
			childFeature == ComponentsPackage.Literals.EJB_CONTAINER__CLASSIFIERS ||
			childFeature == ComponentsPackage.Literals.EJB_CONTAINER__ASSOCIATIONS ||
			childFeature == ComponentsPackage.Literals.EJB_CONTAINER__ENUMS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ModelEditPlugin.INSTANCE;
	}

}
