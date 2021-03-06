/**
 */
package components.provider;


import components.ComponentsFactory;
import components.ComponentsPackage;
import components.WebContainer;

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
 * This is the item provider adapter for a {@link components.WebContainer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WebContainerItemProvider
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
	public WebContainerItemProvider(AdapterFactory adapterFactory) {
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
			addServerAppPropertyDescriptor(object);
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
				 getString("_UI_WebContainer_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebContainer_name_feature", "_UI_WebContainer_type"),
				 ComponentsPackage.Literals.WEB_CONTAINER__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Server App feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServerAppPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebContainer_serverApp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebContainer_serverApp_feature", "_UI_WebContainer_type"),
				 ComponentsPackage.Literals.WEB_CONTAINER__SERVER_APP,
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
			childrenFeatures.add(ComponentsPackage.Literals.WEB_CONTAINER__ELEMENTS);
			childrenFeatures.add(ComponentsPackage.Literals.WEB_CONTAINER__STRUTS);
			childrenFeatures.add(ComponentsPackage.Literals.WEB_CONTAINER__STATIC_ELEMENTS);
			childrenFeatures.add(ComponentsPackage.Literals.WEB_CONTAINER__STRUTS_ACTIONS);
			childrenFeatures.add(ComponentsPackage.Literals.WEB_CONTAINER__WEBRELATIONS);
			childrenFeatures.add(ComponentsPackage.Literals.WEB_CONTAINER__LINK_ELEMENTS);
			childrenFeatures.add(ComponentsPackage.Literals.WEB_CONTAINER__GLOBAL);
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
	 * This returns WebContainer.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/WebContainer"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((WebContainer)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_WebContainer_type") :
			getString("_UI_WebContainer_type") + " " + label;
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

		switch (notification.getFeatureID(WebContainer.class)) {
			case ComponentsPackage.WEB_CONTAINER__NAME:
			case ComponentsPackage.WEB_CONTAINER__SERVER_APP:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ComponentsPackage.WEB_CONTAINER__ELEMENTS:
			case ComponentsPackage.WEB_CONTAINER__STRUTS:
			case ComponentsPackage.WEB_CONTAINER__STATIC_ELEMENTS:
			case ComponentsPackage.WEB_CONTAINER__STRUTS_ACTIONS:
			case ComponentsPackage.WEB_CONTAINER__WEBRELATIONS:
			case ComponentsPackage.WEB_CONTAINER__LINK_ELEMENTS:
			case ComponentsPackage.WEB_CONTAINER__GLOBAL:
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
				(ComponentsPackage.Literals.WEB_CONTAINER__ELEMENTS,
				 ComponentsFactory.eINSTANCE.createServlet()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.WEB_CONTAINER__ELEMENTS,
				 ComponentsFactory.eINSTANCE.createJSPPage()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.WEB_CONTAINER__STRUTS,
				 ComponentsFactory.eINSTANCE.createStruts()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.WEB_CONTAINER__STATIC_ELEMENTS,
				 ComponentsFactory.eINSTANCE.createXMLConfig()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.WEB_CONTAINER__STATIC_ELEMENTS,
				 ComponentsFactory.eINSTANCE.createHTML5()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.WEB_CONTAINER__STRUTS_ACTIONS,
				 ComponentsFactory.eINSTANCE.createStrutsOperation()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.WEB_CONTAINER__STRUTS_ACTIONS,
				 ComponentsFactory.eINSTANCE.createExceptionHandling()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.WEB_CONTAINER__STRUTS_ACTIONS,
				 ComponentsFactory.eINSTANCE.createEventCall()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.WEB_CONTAINER__WEBRELATIONS,
				 ComponentsFactory.eINSTANCE.createwebModelRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.WEB_CONTAINER__WEBRELATIONS,
				 ComponentsFactory.eINSTANCE.createActionRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.WEB_CONTAINER__WEBRELATIONS,
				 ComponentsFactory.eINSTANCE.createStrutsRelation()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.WEB_CONTAINER__WEBRELATIONS,
				 ComponentsFactory.eINSTANCE.createstaticRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.WEB_CONTAINER__WEBRELATIONS,
				 ComponentsFactory.eINSTANCE.createlinkRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.WEB_CONTAINER__WEBRELATIONS,
				 ComponentsFactory.eINSTANCE.createstrutsLinkRelation()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.WEB_CONTAINER__LINK_ELEMENTS,
				 ComponentsFactory.eINSTANCE.createLinkElement()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.WEB_CONTAINER__GLOBAL,
				 ComponentsFactory.eINSTANCE.createStrutsGlobal()));
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
