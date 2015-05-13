package web.container.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import web.container.diagram.edit.parts.ActionRelationshipEditPart;
import web.container.diagram.edit.parts.EventCall2EditPart;
import web.container.diagram.edit.parts.EventCallEditPart;
import web.container.diagram.edit.parts.EventCallName2EditPart;
import web.container.diagram.edit.parts.EventCallNameEditPart;
import web.container.diagram.edit.parts.ExceptionHandlingEditPart;
import web.container.diagram.edit.parts.ExceptionHandlingNameEditPart;
import web.container.diagram.edit.parts.HTML5EditPart;
import web.container.diagram.edit.parts.HTML5NameEditPart;
import web.container.diagram.edit.parts.JSPPageEditPart;
import web.container.diagram.edit.parts.JSPPageLinkElementCompartmentEditPart;
import web.container.diagram.edit.parts.JSPPageNameEditPart;
import web.container.diagram.edit.parts.LinkElementEditPart;
import web.container.diagram.edit.parts.LinkElementLinkEditPart;
import web.container.diagram.edit.parts.LinkRelationshipEditPart;
import web.container.diagram.edit.parts.ServletEditPart;
import web.container.diagram.edit.parts.ServletNameEditPart;
import web.container.diagram.edit.parts.StaticRelationshipEditPart;
import web.container.diagram.edit.parts.StrutsEditPart;
import web.container.diagram.edit.parts.StrutsExceptionHandlingCompartment2EditPart;
import web.container.diagram.edit.parts.StrutsExceptionHandlingCompartmentEditPart;
import web.container.diagram.edit.parts.StrutsGlobalEditPart;
import web.container.diagram.edit.parts.StrutsGlobalEventCallCompartmentEditPart;
import web.container.diagram.edit.parts.StrutsLinkRelationEditPart;
import web.container.diagram.edit.parts.StrutsNameEditPart;
import web.container.diagram.edit.parts.StrutsOperationEditPart;
import web.container.diagram.edit.parts.StrutsOperationNameEditPart;
import web.container.diagram.edit.parts.StrutsRelationEditPart;
import web.container.diagram.edit.parts.StrutsStructsOperationCompartmentEditPart;
import web.container.diagram.edit.parts.WebContainerEditPart;
import web.container.diagram.edit.parts.WebModelRelationshipEditPart;
import web.container.diagram.edit.parts.WebModelRelationshipLabelEditPart;
import web.container.diagram.edit.parts.XMLConfigEditPart;
import web.container.diagram.edit.parts.XMLConfigNameEditPart;

import components.ComponentsPackage;
import components.WebContainer;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class ModelVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "edu.bme.vik.iit.j2eecm.diagram.webcontainer/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (WebContainerEditPart.MODEL_ID.equals(view.getType())) {
				return WebContainerEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return web.container.diagram.part.ModelVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				ModelDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ComponentsPackage.eINSTANCE.getWebContainer().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((WebContainer) domainElement)) {
			return WebContainerEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = web.container.diagram.part.ModelVisualIDRegistry
				.getModelID(containerView);
		if (!WebContainerEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (WebContainerEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = web.container.diagram.part.ModelVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = WebContainerEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case WebContainerEditPart.VISUAL_ID:
			if (ComponentsPackage.eINSTANCE.getJSPPage().isSuperTypeOf(
					domainElement.eClass())) {
				return JSPPageEditPart.VISUAL_ID;
			}
			if (ComponentsPackage.eINSTANCE.getServlet().isSuperTypeOf(
					domainElement.eClass())) {
				return ServletEditPart.VISUAL_ID;
			}
			if (ComponentsPackage.eINSTANCE.getHTML5().isSuperTypeOf(
					domainElement.eClass())) {
				return HTML5EditPart.VISUAL_ID;
			}
			if (ComponentsPackage.eINSTANCE.getXMLConfig().isSuperTypeOf(
					domainElement.eClass())) {
				return XMLConfigEditPart.VISUAL_ID;
			}
			if (ComponentsPackage.eINSTANCE.getStruts().isSuperTypeOf(
					domainElement.eClass())) {
				return StrutsEditPart.VISUAL_ID;
			}
			if (ComponentsPackage.eINSTANCE.getStrutsGlobal().isSuperTypeOf(
					domainElement.eClass())) {
				return StrutsGlobalEditPart.VISUAL_ID;
			}
			break;
		case JSPPageLinkElementCompartmentEditPart.VISUAL_ID:
			if (ComponentsPackage.eINSTANCE.getLinkElement().isSuperTypeOf(
					domainElement.eClass())) {
				return LinkElementEditPart.VISUAL_ID;
			}
			break;
		case StrutsStructsOperationCompartmentEditPart.VISUAL_ID:
			if (ComponentsPackage.eINSTANCE.getStrutsOperation().isSuperTypeOf(
					domainElement.eClass())) {
				return StrutsOperationEditPart.VISUAL_ID;
			}
			break;
		case StrutsExceptionHandlingCompartmentEditPart.VISUAL_ID:
			if (ComponentsPackage.eINSTANCE.getEventCall().isSuperTypeOf(
					domainElement.eClass())) {
				return EventCallEditPart.VISUAL_ID;
			}
			break;
		case StrutsExceptionHandlingCompartment2EditPart.VISUAL_ID:
			if (ComponentsPackage.eINSTANCE.getExceptionHandling()
					.isSuperTypeOf(domainElement.eClass())) {
				return ExceptionHandlingEditPart.VISUAL_ID;
			}
			break;
		case StrutsGlobalEventCallCompartmentEditPart.VISUAL_ID:
			if (ComponentsPackage.eINSTANCE.getEventCall().isSuperTypeOf(
					domainElement.eClass())) {
				return EventCall2EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = web.container.diagram.part.ModelVisualIDRegistry
				.getModelID(containerView);
		if (!WebContainerEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (WebContainerEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = web.container.diagram.part.ModelVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = WebContainerEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case WebContainerEditPart.VISUAL_ID:
			if (JSPPageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ServletEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HTML5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (XMLConfigEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StrutsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StrutsGlobalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case JSPPageEditPart.VISUAL_ID:
			if (JSPPageNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JSPPageLinkElementCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ServletEditPart.VISUAL_ID:
			if (ServletNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case HTML5EditPart.VISUAL_ID:
			if (HTML5NameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case XMLConfigEditPart.VISUAL_ID:
			if (XMLConfigNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StrutsEditPart.VISUAL_ID:
			if (StrutsNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StrutsStructsOperationCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StrutsExceptionHandlingCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StrutsExceptionHandlingCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StrutsGlobalEditPart.VISUAL_ID:
			if (StrutsGlobalEventCallCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LinkElementEditPart.VISUAL_ID:
			if (LinkElementLinkEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StrutsOperationEditPart.VISUAL_ID:
			if (StrutsOperationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EventCallEditPart.VISUAL_ID:
			if (EventCallNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExceptionHandlingEditPart.VISUAL_ID:
			if (ExceptionHandlingNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EventCall2EditPart.VISUAL_ID:
			if (EventCallName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case JSPPageLinkElementCompartmentEditPart.VISUAL_ID:
			if (LinkElementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StrutsStructsOperationCompartmentEditPart.VISUAL_ID:
			if (StrutsOperationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StrutsExceptionHandlingCompartmentEditPart.VISUAL_ID:
			if (EventCallEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StrutsExceptionHandlingCompartment2EditPart.VISUAL_ID:
			if (ExceptionHandlingEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StrutsGlobalEventCallCompartmentEditPart.VISUAL_ID:
			if (EventCall2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WebModelRelationshipEditPart.VISUAL_ID:
			if (WebModelRelationshipLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ComponentsPackage.eINSTANCE.getstaticRelationship().isSuperTypeOf(
				domainElement.eClass())) {
			return StaticRelationshipEditPart.VISUAL_ID;
		}
		if (ComponentsPackage.eINSTANCE.getActionRelationship().isSuperTypeOf(
				domainElement.eClass())) {
			return ActionRelationshipEditPart.VISUAL_ID;
		}
		if (ComponentsPackage.eINSTANCE.getlinkRelationship().isSuperTypeOf(
				domainElement.eClass())) {
			return LinkRelationshipEditPart.VISUAL_ID;
		}
		if (ComponentsPackage.eINSTANCE.getstrutsLinkRelation().isSuperTypeOf(
				domainElement.eClass())) {
			return StrutsLinkRelationEditPart.VISUAL_ID;
		}
		if (ComponentsPackage.eINSTANCE.getStrutsRelation().isSuperTypeOf(
				domainElement.eClass())) {
			return StrutsRelationEditPart.VISUAL_ID;
		}
		if (ComponentsPackage.eINSTANCE.getwebModelRelationship()
				.isSuperTypeOf(domainElement.eClass())) {
			return WebModelRelationshipEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(WebContainer element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case JSPPageLinkElementCompartmentEditPart.VISUAL_ID:
		case StrutsStructsOperationCompartmentEditPart.VISUAL_ID:
		case StrutsExceptionHandlingCompartmentEditPart.VISUAL_ID:
		case StrutsExceptionHandlingCompartment2EditPart.VISUAL_ID:
		case StrutsGlobalEventCallCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case WebContainerEditPart.VISUAL_ID:
			return false;
		case ServletEditPart.VISUAL_ID:
		case HTML5EditPart.VISUAL_ID:
		case XMLConfigEditPart.VISUAL_ID:
		case StrutsOperationEditPart.VISUAL_ID:
		case LinkElementEditPart.VISUAL_ID:
		case EventCallEditPart.VISUAL_ID:
		case ExceptionHandlingEditPart.VISUAL_ID:
		case EventCall2EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */

		public int getVisualID(View view) {
			return web.container.diagram.part.ModelVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */

		public String getModelID(View view) {
			return web.container.diagram.part.ModelVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return web.container.diagram.part.ModelVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */

		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return web.container.diagram.part.ModelVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */

		public boolean isCompartmentVisualID(int visualID) {
			return web.container.diagram.part.ModelVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */

		public boolean isSemanticLeafVisualID(int visualID) {
			return web.container.diagram.part.ModelVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
