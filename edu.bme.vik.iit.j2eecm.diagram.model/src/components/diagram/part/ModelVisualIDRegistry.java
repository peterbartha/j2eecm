package components.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import components.ComponentsPackage;
import components.Model;
import components.diagram.edit.parts.ApplicationClientEditPart;
import components.diagram.edit.parts.BrowserEditPart;
import components.diagram.edit.parts.ClientApplicationCompartmentEditPart;
import components.diagram.edit.parts.ClientBrowserCompartmentEditPart;
import components.diagram.edit.parts.ClientEditPart;
import components.diagram.edit.parts.DataReleationshipEditPart;
import components.diagram.edit.parts.DatabaseEditPart;
import components.diagram.edit.parts.EJBContainerEditPart;
import components.diagram.edit.parts.J2EEServerEJBContainerCompartmentEditPart;
import components.diagram.edit.parts.J2EEServerEditPart;
import components.diagram.edit.parts.J2EEServerWebContainerCompartmentEditPart;
import components.diagram.edit.parts.ModelEditPart;
import components.diagram.edit.parts.WebContainerEditPart;
import components.diagram.edit.parts.WebReleationshipEditPart;

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
	private static final String DEBUG_KEY = "edu.bme.vik.iit.j2eecm.diagram.model/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ModelEditPart.MODEL_ID.equals(view.getType())) {
				return ModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return components.diagram.part.ModelVisualIDRegistry.getVisualID(view
				.getType());
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
		if (ComponentsPackage.eINSTANCE.getModel().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Model) domainElement)) {
			return ModelEditPart.VISUAL_ID;
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
		String containerModelID = components.diagram.part.ModelVisualIDRegistry
				.getModelID(containerView);
		if (!ModelEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (ModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = components.diagram.part.ModelVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ModelEditPart.VISUAL_ID:
			if (ComponentsPackage.eINSTANCE.getClient().isSuperTypeOf(
					domainElement.eClass())) {
				return ClientEditPart.VISUAL_ID;
			}
			if (ComponentsPackage.eINSTANCE.getDatabase().isSuperTypeOf(
					domainElement.eClass())) {
				return DatabaseEditPart.VISUAL_ID;
			}
			if (ComponentsPackage.eINSTANCE.getJ2EEServer().isSuperTypeOf(
					domainElement.eClass())) {
				return J2EEServerEditPart.VISUAL_ID;
			}
			break;
		case ClientBrowserCompartmentEditPart.VISUAL_ID:
			if (ComponentsPackage.eINSTANCE.getBrowser().isSuperTypeOf(
					domainElement.eClass())) {
				return BrowserEditPart.VISUAL_ID;
			}
			break;
		case ClientApplicationCompartmentEditPart.VISUAL_ID:
			if (ComponentsPackage.eINSTANCE.getApplicationClient()
					.isSuperTypeOf(domainElement.eClass())) {
				return ApplicationClientEditPart.VISUAL_ID;
			}
			break;
		case J2EEServerWebContainerCompartmentEditPart.VISUAL_ID:
			if (ComponentsPackage.eINSTANCE.getWebContainer().isSuperTypeOf(
					domainElement.eClass())) {
				return WebContainerEditPart.VISUAL_ID;
			}
			break;
		case J2EEServerEJBContainerCompartmentEditPart.VISUAL_ID:
			if (ComponentsPackage.eINSTANCE.getEJBContainer().isSuperTypeOf(
					domainElement.eClass())) {
				return EJBContainerEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = components.diagram.part.ModelVisualIDRegistry
				.getModelID(containerView);
		if (!ModelEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (ModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = components.diagram.part.ModelVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ModelEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ModelEditPart.VISUAL_ID:
			if (ClientEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DatabaseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (J2EEServerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClientEditPart.VISUAL_ID:
			if (ClientBrowserCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClientApplicationCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case J2EEServerEditPart.VISUAL_ID:
			if (J2EEServerWebContainerCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (J2EEServerEJBContainerCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClientBrowserCompartmentEditPart.VISUAL_ID:
			if (BrowserEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClientApplicationCompartmentEditPart.VISUAL_ID:
			if (ApplicationClientEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case J2EEServerWebContainerCompartmentEditPart.VISUAL_ID:
			if (WebContainerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case J2EEServerEJBContainerCompartmentEditPart.VISUAL_ID:
			if (EJBContainerEditPart.VISUAL_ID == nodeVisualID) {
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
		if (ComponentsPackage.eINSTANCE.getWebReleationship().isSuperTypeOf(
				domainElement.eClass())) {
			return WebReleationshipEditPart.VISUAL_ID;
		}
		if (ComponentsPackage.eINSTANCE.getDataReleationship().isSuperTypeOf(
				domainElement.eClass())) {
			return DataReleationshipEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Model element) {
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
		case ClientBrowserCompartmentEditPart.VISUAL_ID:
		case ClientApplicationCompartmentEditPart.VISUAL_ID:
		case J2EEServerWebContainerCompartmentEditPart.VISUAL_ID:
		case J2EEServerEJBContainerCompartmentEditPart.VISUAL_ID:
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
		case ModelEditPart.VISUAL_ID:
			return false;
		case DatabaseEditPart.VISUAL_ID:
		case BrowserEditPart.VISUAL_ID:
		case ApplicationClientEditPart.VISUAL_ID:
		case WebContainerEditPart.VISUAL_ID:
		case EJBContainerEditPart.VISUAL_ID:
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
			return components.diagram.part.ModelVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */

		public String getModelID(View view) {
			return components.diagram.part.ModelVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return components.diagram.part.ModelVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */

		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return components.diagram.part.ModelVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */

		public boolean isCompartmentVisualID(int visualID) {
			return components.diagram.part.ModelVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */

		public boolean isSemanticLeafVisualID(int visualID) {
			return components.diagram.part.ModelVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
