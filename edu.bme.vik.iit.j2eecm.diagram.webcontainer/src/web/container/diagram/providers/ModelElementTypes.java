package web.container.diagram.providers;

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

import web.container.diagram.edit.parts.ActionRelationshipEditPart;
import web.container.diagram.edit.parts.EventCall2EditPart;
import web.container.diagram.edit.parts.EventCallEditPart;
import web.container.diagram.edit.parts.ExceptionHandlingEditPart;
import web.container.diagram.edit.parts.HTML5EditPart;
import web.container.diagram.edit.parts.JSPPageEditPart;
import web.container.diagram.edit.parts.LinkElementEditPart;
import web.container.diagram.edit.parts.LinkRelationshipEditPart;
import web.container.diagram.edit.parts.ServletEditPart;
import web.container.diagram.edit.parts.StaticRelationshipEditPart;
import web.container.diagram.edit.parts.StrutsEditPart;
import web.container.diagram.edit.parts.StrutsGlobalEditPart;
import web.container.diagram.edit.parts.StrutsLinkRelationEditPart;
import web.container.diagram.edit.parts.StrutsOperationEditPart;
import web.container.diagram.edit.parts.StrutsRelationEditPart;
import web.container.diagram.edit.parts.WebContainerEditPart;
import web.container.diagram.edit.parts.WebModelRelationshipEditPart;
import web.container.diagram.edit.parts.XMLConfigEditPart;
import web.container.diagram.part.ModelDiagramEditorPlugin;

import components.ComponentsPackage;

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
	public static final IElementType WebContainer_1000 = getElementType("edu.bme.vik.iit.j2eecm.diagram.webcontainer.WebContainer_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType JSPPage_2001 = getElementType("edu.bme.vik.iit.j2eecm.diagram.webcontainer.JSPPage_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Servlet_2002 = getElementType("edu.bme.vik.iit.j2eecm.diagram.webcontainer.Servlet_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HTML5_2003 = getElementType("edu.bme.vik.iit.j2eecm.diagram.webcontainer.HTML5_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType XMLConfig_2006 = getElementType("edu.bme.vik.iit.j2eecm.diagram.webcontainer.XMLConfig_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Struts_2011 = getElementType("edu.bme.vik.iit.j2eecm.diagram.webcontainer.Struts_2011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StrutsGlobal_2014 = getElementType("edu.bme.vik.iit.j2eecm.diagram.webcontainer.StrutsGlobal_2014"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LinkElement_3002 = getElementType("edu.bme.vik.iit.j2eecm.diagram.webcontainer.LinkElement_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StrutsOperation_3001 = getElementType("edu.bme.vik.iit.j2eecm.diagram.webcontainer.StrutsOperation_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EventCall_3004 = getElementType("edu.bme.vik.iit.j2eecm.diagram.webcontainer.EventCall_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExceptionHandling_3007 = getElementType("edu.bme.vik.iit.j2eecm.diagram.webcontainer.ExceptionHandling_3007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EventCall_3009 = getElementType("edu.bme.vik.iit.j2eecm.diagram.webcontainer.EventCall_3009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StaticRelationship_4001 = getElementType("edu.bme.vik.iit.j2eecm.diagram.webcontainer.StaticRelationship_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ActionRelationship_4002 = getElementType("edu.bme.vik.iit.j2eecm.diagram.webcontainer.ActionRelationship_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LinkRelationship_4003 = getElementType("edu.bme.vik.iit.j2eecm.diagram.webcontainer.LinkRelationship_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StrutsLinkRelation_4004 = getElementType("edu.bme.vik.iit.j2eecm.diagram.webcontainer.StrutsLinkRelation_4004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StrutsRelation_4005 = getElementType("edu.bme.vik.iit.j2eecm.diagram.webcontainer.StrutsRelation_4005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType WebModelRelationship_4006 = getElementType("edu.bme.vik.iit.j2eecm.diagram.webcontainer.WebModelRelationship_4006"); //$NON-NLS-1$

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

			elements.put(WebContainer_1000,
					ComponentsPackage.eINSTANCE.getWebContainer());

			elements.put(JSPPage_2001, ComponentsPackage.eINSTANCE.getJSPPage());

			elements.put(Servlet_2002, ComponentsPackage.eINSTANCE.getServlet());

			elements.put(HTML5_2003, ComponentsPackage.eINSTANCE.getHTML5());

			elements.put(XMLConfig_2006,
					ComponentsPackage.eINSTANCE.getXMLConfig());

			elements.put(Struts_2011, ComponentsPackage.eINSTANCE.getStruts());

			elements.put(StrutsGlobal_2014,
					ComponentsPackage.eINSTANCE.getStrutsGlobal());

			elements.put(LinkElement_3002,
					ComponentsPackage.eINSTANCE.getLinkElement());

			elements.put(StrutsOperation_3001,
					ComponentsPackage.eINSTANCE.getStrutsOperation());

			elements.put(EventCall_3004,
					ComponentsPackage.eINSTANCE.getEventCall());

			elements.put(ExceptionHandling_3007,
					ComponentsPackage.eINSTANCE.getExceptionHandling());

			elements.put(EventCall_3009,
					ComponentsPackage.eINSTANCE.getEventCall());

			elements.put(StaticRelationship_4001,
					ComponentsPackage.eINSTANCE.getstaticRelationship());

			elements.put(ActionRelationship_4002,
					ComponentsPackage.eINSTANCE.getActionRelationship());

			elements.put(LinkRelationship_4003,
					ComponentsPackage.eINSTANCE.getlinkRelationship());

			elements.put(StrutsLinkRelation_4004,
					ComponentsPackage.eINSTANCE.getstrutsLinkRelation());

			elements.put(StrutsRelation_4005,
					ComponentsPackage.eINSTANCE.getStrutsRelation());

			elements.put(WebModelRelationship_4006,
					ComponentsPackage.eINSTANCE.getwebModelRelationship());
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
			KNOWN_ELEMENT_TYPES.add(WebContainer_1000);
			KNOWN_ELEMENT_TYPES.add(JSPPage_2001);
			KNOWN_ELEMENT_TYPES.add(Servlet_2002);
			KNOWN_ELEMENT_TYPES.add(HTML5_2003);
			KNOWN_ELEMENT_TYPES.add(XMLConfig_2006);
			KNOWN_ELEMENT_TYPES.add(Struts_2011);
			KNOWN_ELEMENT_TYPES.add(StrutsGlobal_2014);
			KNOWN_ELEMENT_TYPES.add(LinkElement_3002);
			KNOWN_ELEMENT_TYPES.add(StrutsOperation_3001);
			KNOWN_ELEMENT_TYPES.add(EventCall_3004);
			KNOWN_ELEMENT_TYPES.add(ExceptionHandling_3007);
			KNOWN_ELEMENT_TYPES.add(EventCall_3009);
			KNOWN_ELEMENT_TYPES.add(StaticRelationship_4001);
			KNOWN_ELEMENT_TYPES.add(ActionRelationship_4002);
			KNOWN_ELEMENT_TYPES.add(LinkRelationship_4003);
			KNOWN_ELEMENT_TYPES.add(StrutsLinkRelation_4004);
			KNOWN_ELEMENT_TYPES.add(StrutsRelation_4005);
			KNOWN_ELEMENT_TYPES.add(WebModelRelationship_4006);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case WebContainerEditPart.VISUAL_ID:
			return WebContainer_1000;
		case JSPPageEditPart.VISUAL_ID:
			return JSPPage_2001;
		case ServletEditPart.VISUAL_ID:
			return Servlet_2002;
		case HTML5EditPart.VISUAL_ID:
			return HTML5_2003;
		case XMLConfigEditPart.VISUAL_ID:
			return XMLConfig_2006;
		case StrutsEditPart.VISUAL_ID:
			return Struts_2011;
		case StrutsGlobalEditPart.VISUAL_ID:
			return StrutsGlobal_2014;
		case LinkElementEditPart.VISUAL_ID:
			return LinkElement_3002;
		case StrutsOperationEditPart.VISUAL_ID:
			return StrutsOperation_3001;
		case EventCallEditPart.VISUAL_ID:
			return EventCall_3004;
		case ExceptionHandlingEditPart.VISUAL_ID:
			return ExceptionHandling_3007;
		case EventCall2EditPart.VISUAL_ID:
			return EventCall_3009;
		case StaticRelationshipEditPart.VISUAL_ID:
			return StaticRelationship_4001;
		case ActionRelationshipEditPart.VISUAL_ID:
			return ActionRelationship_4002;
		case LinkRelationshipEditPart.VISUAL_ID:
			return LinkRelationship_4003;
		case StrutsLinkRelationEditPart.VISUAL_ID:
			return StrutsLinkRelation_4004;
		case StrutsRelationEditPart.VISUAL_ID:
			return StrutsRelation_4005;
		case WebModelRelationshipEditPart.VISUAL_ID:
			return WebModelRelationship_4006;
		}
		return null;
	}

}
