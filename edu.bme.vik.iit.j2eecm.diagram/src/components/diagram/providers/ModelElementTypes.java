package components.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

import components.ComponentsPackage;
import components.diagram.edit.parts.AppReleationshipEditPart;
import components.diagram.edit.parts.ApplicationClientEditPart;
import components.diagram.edit.parts.BrowserEditPart;
import components.diagram.edit.parts.ClientEditPart;
import components.diagram.edit.parts.ContainerReleationshipEditPart;
import components.diagram.edit.parts.DataReleationshipEditPart;
import components.diagram.edit.parts.DatabaseEditPart;
import components.diagram.edit.parts.EJBContainerEditPart;
import components.diagram.edit.parts.J2EEServerEditPart;
import components.diagram.edit.parts.ModelEditPart;
import components.diagram.edit.parts.WebContainerEditPart;
import components.diagram.edit.parts.WebReleationshipEditPart;
import components.diagram.part.ModelDiagramEditorPlugin;

/**
 * @generated
 */
public class ModelElementTypes {

	/**
	 * @generated
	 */
	private ModelElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Model_1000 = getElementType("edu.bme.vik.iit.j2eecm.diagram.Model_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Client_2001 = getElementType("edu.bme.vik.iit.j2eecm.diagram.Client_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Database_2002 = getElementType("edu.bme.vik.iit.j2eecm.diagram.Database_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType J2EEServer_2003 = getElementType("edu.bme.vik.iit.j2eecm.diagram.J2EEServer_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Browser_3001 = getElementType("edu.bme.vik.iit.j2eecm.diagram.Browser_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ApplicationClient_3002 = getElementType("edu.bme.vik.iit.j2eecm.diagram.ApplicationClient_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType WebContainer_3003 = getElementType("edu.bme.vik.iit.j2eecm.diagram.WebContainer_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EJBContainer_3004 = getElementType("edu.bme.vik.iit.j2eecm.diagram.EJBContainer_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType WebReleationship_4001 = getElementType("edu.bme.vik.iit.j2eecm.diagram.WebReleationship_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DataReleationship_4002 = getElementType("edu.bme.vik.iit.j2eecm.diagram.DataReleationship_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AppReleationship_4003 = getElementType("edu.bme.vik.iit.j2eecm.diagram.AppReleationship_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ContainerReleationship_4004 = getElementType("edu.bme.vik.iit.j2eecm.diagram.ContainerReleationship_4004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return ModelDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Model_1000, ComponentsPackage.eINSTANCE.getModel());

			elements.put(Client_2001, ComponentsPackage.eINSTANCE.getClient());

			elements.put(Database_2002,
					ComponentsPackage.eINSTANCE.getDatabase());

			elements.put(J2EEServer_2003,
					ComponentsPackage.eINSTANCE.getJ2EEServer());

			elements.put(Browser_3001, ComponentsPackage.eINSTANCE.getBrowser());

			elements.put(ApplicationClient_3002,
					ComponentsPackage.eINSTANCE.getApplicationClient());

			elements.put(WebContainer_3003,
					ComponentsPackage.eINSTANCE.getWebContainer());

			elements.put(EJBContainer_3004,
					ComponentsPackage.eINSTANCE.getEJBContainer());

			elements.put(WebReleationship_4001,
					ComponentsPackage.eINSTANCE.getWebReleationship());

			elements.put(DataReleationship_4002,
					ComponentsPackage.eINSTANCE.getDataReleationship());

			elements.put(AppReleationship_4003,
					ComponentsPackage.eINSTANCE.getAppReleationship());

			elements.put(ContainerReleationship_4004,
					ComponentsPackage.eINSTANCE.getContainerReleationship());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Model_1000);
			KNOWN_ELEMENT_TYPES.add(Client_2001);
			KNOWN_ELEMENT_TYPES.add(Database_2002);
			KNOWN_ELEMENT_TYPES.add(J2EEServer_2003);
			KNOWN_ELEMENT_TYPES.add(Browser_3001);
			KNOWN_ELEMENT_TYPES.add(ApplicationClient_3002);
			KNOWN_ELEMENT_TYPES.add(WebContainer_3003);
			KNOWN_ELEMENT_TYPES.add(EJBContainer_3004);
			KNOWN_ELEMENT_TYPES.add(WebReleationship_4001);
			KNOWN_ELEMENT_TYPES.add(DataReleationship_4002);
			KNOWN_ELEMENT_TYPES.add(AppReleationship_4003);
			KNOWN_ELEMENT_TYPES.add(ContainerReleationship_4004);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ModelEditPart.VISUAL_ID:
			return Model_1000;
		case ClientEditPart.VISUAL_ID:
			return Client_2001;
		case DatabaseEditPart.VISUAL_ID:
			return Database_2002;
		case J2EEServerEditPart.VISUAL_ID:
			return J2EEServer_2003;
		case BrowserEditPart.VISUAL_ID:
			return Browser_3001;
		case ApplicationClientEditPart.VISUAL_ID:
			return ApplicationClient_3002;
		case WebContainerEditPart.VISUAL_ID:
			return WebContainer_3003;
		case EJBContainerEditPart.VISUAL_ID:
			return EJBContainer_3004;
		case WebReleationshipEditPart.VISUAL_ID:
			return WebReleationship_4001;
		case DataReleationshipEditPart.VISUAL_ID:
			return DataReleationship_4002;
		case AppReleationshipEditPart.VISUAL_ID:
			return AppReleationship_4003;
		case ContainerReleationshipEditPart.VISUAL_ID:
			return ContainerReleationship_4004;
		}
		return null;
	}

}
