package components.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import components.ComponentsPackage;
import components.Model;
import components.diagram.edit.parts.AppReleationshipEditPart;
import components.diagram.edit.parts.AppReleationshipProtocolEditPart;
import components.diagram.edit.parts.ApplicationClientEditPart;
import components.diagram.edit.parts.ApplicationClientLanguageEditPart;
import components.diagram.edit.parts.ApplicationClientNameEditPart;
import components.diagram.edit.parts.BrowserEditPart;
import components.diagram.edit.parts.BrowserNameEditPart;
import components.diagram.edit.parts.ClientApplicationCompartmentEditPart;
import components.diagram.edit.parts.ClientBrowserCompartmentEditPart;
import components.diagram.edit.parts.ClientEditPart;
import components.diagram.edit.parts.ClientNameEditPart;
import components.diagram.edit.parts.ClientOsEditPart;
import components.diagram.edit.parts.ContainerReleationshipEditPart;
import components.diagram.edit.parts.ContainerReleationshipProtocolEditPart;
import components.diagram.edit.parts.DataReleationshipEditPart;
import components.diagram.edit.parts.DataReleationshipProtocolEditPart;
import components.diagram.edit.parts.DatabaseDatabaseEngineEditPart;
import components.diagram.edit.parts.DatabaseEditPart;
import components.diagram.edit.parts.DatabaseNameEditPart;
import components.diagram.edit.parts.DatabaseOsEditPart;
import components.diagram.edit.parts.EJBContainerEditPart;
import components.diagram.edit.parts.EJBContainerNameEditPart;
import components.diagram.edit.parts.J2EEServerEJBContainerCompartmentEditPart;
import components.diagram.edit.parts.J2EEServerEditPart;
import components.diagram.edit.parts.J2EEServerNameEditPart;
import components.diagram.edit.parts.J2EEServerOsEditPart;
import components.diagram.edit.parts.J2EEServerWebContainerCompartmentEditPart;
import components.diagram.edit.parts.ModelEditPart;
import components.diagram.edit.parts.WebContainerEditPart;
import components.diagram.edit.parts.WebContainerNameEditPart;
import components.diagram.edit.parts.WebContainerServerAppEditPart;
import components.diagram.edit.parts.WebReleationshipEditPart;
import components.diagram.edit.parts.WebReleationshipProtocolEditPart;

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
	private static final String DEBUG_KEY = "edu.bme.vik.iit.j2eecm.diagram/debug/visualID"; //$NON-NLS-1$

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
			if (ClientNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClientOsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClientBrowserCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClientApplicationCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DatabaseEditPart.VISUAL_ID:
			if (DatabaseNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DatabaseOsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DatabaseDatabaseEngineEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case J2EEServerEditPart.VISUAL_ID:
			if (J2EEServerNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (J2EEServerOsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (J2EEServerWebContainerCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (J2EEServerEJBContainerCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BrowserEditPart.VISUAL_ID:
			if (BrowserNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ApplicationClientEditPart.VISUAL_ID:
			if (ApplicationClientNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ApplicationClientLanguageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WebContainerEditPart.VISUAL_ID:
			if (WebContainerNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WebContainerServerAppEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EJBContainerEditPart.VISUAL_ID:
			if (EJBContainerNameEditPart.VISUAL_ID == nodeVisualID) {
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
		case WebReleationshipEditPart.VISUAL_ID:
			if (WebReleationshipProtocolEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataReleationshipEditPart.VISUAL_ID:
			if (DataReleationshipProtocolEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AppReleationshipEditPart.VISUAL_ID:
			if (AppReleationshipProtocolEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ContainerReleationshipEditPart.VISUAL_ID:
			if (ContainerReleationshipProtocolEditPart.VISUAL_ID == nodeVisualID) {
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
		if (ComponentsPackage.eINSTANCE.getAppReleationship().isSuperTypeOf(
				domainElement.eClass())) {
			return AppReleationshipEditPart.VISUAL_ID;
		}
		if (ComponentsPackage.eINSTANCE.getContainerReleationship()
				.isSuperTypeOf(domainElement.eClass())) {
			return ContainerReleationshipEditPart.VISUAL_ID;
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
