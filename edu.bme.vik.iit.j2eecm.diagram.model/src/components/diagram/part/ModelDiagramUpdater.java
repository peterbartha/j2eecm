package components.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import components.ApplicationClient;
import components.Browser;
import components.Client;
import components.ComponentsPackage;
import components.DataReleationship;
import components.Database;
import components.EJBContainer;
import components.J2EEServer;
import components.Model;
import components.WebContainer;
import components.WebReleationship;
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
import components.diagram.providers.ModelElementTypes;

/**
 * @generated
 */
public class ModelDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<ModelNodeDescriptor> getSemanticChildren(View view) {
		switch (ModelVisualIDRegistry.getVisualID(view)) {
		case ModelEditPart.VISUAL_ID:
			return getModel_1000SemanticChildren(view);
		case ClientBrowserCompartmentEditPart.VISUAL_ID:
			return getClientBrowserCompartment_7001SemanticChildren(view);
		case ClientApplicationCompartmentEditPart.VISUAL_ID:
			return getClientApplicationCompartment_7002SemanticChildren(view);
		case J2EEServerWebContainerCompartmentEditPart.VISUAL_ID:
			return getJ2EEServerWebContainerCompartment_7003SemanticChildren(view);
		case J2EEServerEJBContainerCompartmentEditPart.VISUAL_ID:
			return getJ2EEServerEJBContainerCompartment_7004SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelNodeDescriptor> getModel_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Model modelElement = (Model) view.getElement();
		LinkedList<ModelNodeDescriptor> result = new LinkedList<ModelNodeDescriptor>();
		{
			Client childElement = modelElement.getClient();
			int visualID = ModelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ClientEditPart.VISUAL_ID) {
				result.add(new ModelNodeDescriptor(childElement, visualID));
			}
		}
		{
			Database childElement = modelElement.getDatabase();
			int visualID = ModelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DatabaseEditPart.VISUAL_ID) {
				result.add(new ModelNodeDescriptor(childElement, visualID));
			}
		}
		{
			J2EEServer childElement = modelElement.getServer();
			int visualID = ModelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == J2EEServerEditPart.VISUAL_ID) {
				result.add(new ModelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelNodeDescriptor> getClientBrowserCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Client modelElement = (Client) containerView.getElement();
		LinkedList<ModelNodeDescriptor> result = new LinkedList<ModelNodeDescriptor>();
		{
			Browser childElement = modelElement.getBrowser();
			int visualID = ModelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == BrowserEditPart.VISUAL_ID) {
				result.add(new ModelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelNodeDescriptor> getClientApplicationCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Client modelElement = (Client) containerView.getElement();
		LinkedList<ModelNodeDescriptor> result = new LinkedList<ModelNodeDescriptor>();
		{
			ApplicationClient childElement = modelElement.getApplication();
			int visualID = ModelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ApplicationClientEditPart.VISUAL_ID) {
				result.add(new ModelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelNodeDescriptor> getJ2EEServerWebContainerCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		J2EEServer modelElement = (J2EEServer) containerView.getElement();
		LinkedList<ModelNodeDescriptor> result = new LinkedList<ModelNodeDescriptor>();
		{
			WebContainer childElement = modelElement.getWebContainer();
			int visualID = ModelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == WebContainerEditPart.VISUAL_ID) {
				result.add(new ModelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelNodeDescriptor> getJ2EEServerEJBContainerCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		J2EEServer modelElement = (J2EEServer) containerView.getElement();
		LinkedList<ModelNodeDescriptor> result = new LinkedList<ModelNodeDescriptor>();
		{
			EJBContainer childElement = modelElement.getEjbContainer();
			int visualID = ModelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EJBContainerEditPart.VISUAL_ID) {
				result.add(new ModelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getContainedLinks(View view) {
		switch (ModelVisualIDRegistry.getVisualID(view)) {
		case ModelEditPart.VISUAL_ID:
			return getModel_1000ContainedLinks(view);
		case ClientEditPart.VISUAL_ID:
			return getClient_2001ContainedLinks(view);
		case DatabaseEditPart.VISUAL_ID:
			return getDatabase_2002ContainedLinks(view);
		case J2EEServerEditPart.VISUAL_ID:
			return getJ2EEServer_2003ContainedLinks(view);
		case BrowserEditPart.VISUAL_ID:
			return getBrowser_3001ContainedLinks(view);
		case ApplicationClientEditPart.VISUAL_ID:
			return getApplicationClient_3002ContainedLinks(view);
		case WebContainerEditPart.VISUAL_ID:
			return getWebContainer_3003ContainedLinks(view);
		case EJBContainerEditPart.VISUAL_ID:
			return getEJBContainer_3004ContainedLinks(view);
		case WebReleationshipEditPart.VISUAL_ID:
			return getWebReleationship_4001ContainedLinks(view);
		case DataReleationshipEditPart.VISUAL_ID:
			return getDataReleationship_4002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getIncomingLinks(View view) {
		switch (ModelVisualIDRegistry.getVisualID(view)) {
		case ClientEditPart.VISUAL_ID:
			return getClient_2001IncomingLinks(view);
		case DatabaseEditPart.VISUAL_ID:
			return getDatabase_2002IncomingLinks(view);
		case J2EEServerEditPart.VISUAL_ID:
			return getJ2EEServer_2003IncomingLinks(view);
		case BrowserEditPart.VISUAL_ID:
			return getBrowser_3001IncomingLinks(view);
		case ApplicationClientEditPart.VISUAL_ID:
			return getApplicationClient_3002IncomingLinks(view);
		case WebContainerEditPart.VISUAL_ID:
			return getWebContainer_3003IncomingLinks(view);
		case EJBContainerEditPart.VISUAL_ID:
			return getEJBContainer_3004IncomingLinks(view);
		case WebReleationshipEditPart.VISUAL_ID:
			return getWebReleationship_4001IncomingLinks(view);
		case DataReleationshipEditPart.VISUAL_ID:
			return getDataReleationship_4002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getOutgoingLinks(View view) {
		switch (ModelVisualIDRegistry.getVisualID(view)) {
		case ClientEditPart.VISUAL_ID:
			return getClient_2001OutgoingLinks(view);
		case DatabaseEditPart.VISUAL_ID:
			return getDatabase_2002OutgoingLinks(view);
		case J2EEServerEditPart.VISUAL_ID:
			return getJ2EEServer_2003OutgoingLinks(view);
		case BrowserEditPart.VISUAL_ID:
			return getBrowser_3001OutgoingLinks(view);
		case ApplicationClientEditPart.VISUAL_ID:
			return getApplicationClient_3002OutgoingLinks(view);
		case WebContainerEditPart.VISUAL_ID:
			return getWebContainer_3003OutgoingLinks(view);
		case EJBContainerEditPart.VISUAL_ID:
			return getEJBContainer_3004OutgoingLinks(view);
		case WebReleationshipEditPart.VISUAL_ID:
			return getWebReleationship_4001OutgoingLinks(view);
		case DataReleationshipEditPart.VISUAL_ID:
			return getDataReleationship_4002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getModel_1000ContainedLinks(
			View view) {
		Model modelElement = (Model) view.getElement();
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_WebReleationship_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_DataReleationship_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getClient_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getDatabase_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getJ2EEServer_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getBrowser_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getApplicationClient_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getWebContainer_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getEJBContainer_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getWebReleationship_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getDataReleationship_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getClient_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getDatabase_2002IncomingLinks(
			View view) {
		Database modelElement = (Database) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DataReleationship_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getJ2EEServer_2003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getBrowser_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getApplicationClient_3002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getWebContainer_3003IncomingLinks(
			View view) {
		WebContainer modelElement = (WebContainer) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_WebReleationship_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getEJBContainer_3004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getWebReleationship_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getDataReleationship_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getClient_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getDatabase_2002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getJ2EEServer_2003OutgoingLinks(
			View view) {
		J2EEServer modelElement = (J2EEServer) view.getElement();
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DataReleationship_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getBrowser_3001OutgoingLinks(
			View view) {
		Browser modelElement = (Browser) view.getElement();
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_WebReleationship_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getApplicationClient_3002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getWebContainer_3003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getEJBContainer_3004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getWebReleationship_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getDataReleationship_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getContainedTypeModelFacetLinks_WebReleationship_4001(
			Model container) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		WebReleationship link = container.getWebRealtion();
		if (WebReleationshipEditPart.VISUAL_ID != ModelVisualIDRegistry
				.getLinkWithClassVisualID(link)) {
			return result;
		}
		WebContainer dst = link.getWebContainer();
		Browser src = link.getBrowser();
		result.add(new ModelLinkDescriptor(src, dst, link,
				ModelElementTypes.WebReleationship_4001,
				WebReleationshipEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getContainedTypeModelFacetLinks_DataReleationship_4002(
			Model container) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		DataReleationship link = container.getDataRelation();
		if (DataReleationshipEditPart.VISUAL_ID != ModelVisualIDRegistry
				.getLinkWithClassVisualID(link)) {
			return result;
		}
		Database dst = link.getDatabase();
		J2EEServer src = link.getServer();
		result.add(new ModelLinkDescriptor(src, dst, link,
				ModelElementTypes.DataReleationship_4002,
				DataReleationshipEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getIncomingTypeModelFacetLinks_WebReleationship_4001(
			WebContainer target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ComponentsPackage.eINSTANCE
					.getWebReleationship_WebContainer()
					|| false == setting.getEObject() instanceof WebReleationship) {
				continue;
			}
			WebReleationship link = (WebReleationship) setting.getEObject();
			if (WebReleationshipEditPart.VISUAL_ID != ModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Browser src = link.getBrowser();
			result.add(new ModelLinkDescriptor(src, target, link,
					ModelElementTypes.WebReleationship_4001,
					WebReleationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getIncomingTypeModelFacetLinks_DataReleationship_4002(
			Database target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ComponentsPackage.eINSTANCE
					.getDataReleationship_Database()
					|| false == setting.getEObject() instanceof DataReleationship) {
				continue;
			}
			DataReleationship link = (DataReleationship) setting.getEObject();
			if (DataReleationshipEditPart.VISUAL_ID != ModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			J2EEServer src = link.getServer();
			result.add(new ModelLinkDescriptor(src, target, link,
					ModelElementTypes.DataReleationship_4002,
					DataReleationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getOutgoingTypeModelFacetLinks_WebReleationship_4001(
			Browser source) {
		Model container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Model) {
				container = (Model) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		WebReleationship link = container.getWebRealtion();
		if (WebReleationshipEditPart.VISUAL_ID != ModelVisualIDRegistry
				.getLinkWithClassVisualID(link)) {
			return result;
		}
		WebContainer dst = link.getWebContainer();
		Browser src = link.getBrowser();
		if (src != source) {
			return result;
		}
		result.add(new ModelLinkDescriptor(src, dst, link,
				ModelElementTypes.WebReleationship_4001,
				WebReleationshipEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getOutgoingTypeModelFacetLinks_DataReleationship_4002(
			J2EEServer source) {
		Model container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Model) {
				container = (Model) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		DataReleationship link = container.getDataRelation();
		if (DataReleationshipEditPart.VISUAL_ID != ModelVisualIDRegistry
				.getLinkWithClassVisualID(link)) {
			return result;
		}
		Database dst = link.getDatabase();
		J2EEServer src = link.getServer();
		if (src != source) {
			return result;
		}
		result.add(new ModelLinkDescriptor(src, dst, link,
				ModelElementTypes.DataReleationship_4002,
				DataReleationshipEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */

		public List<ModelNodeDescriptor> getSemanticChildren(View view) {
			return ModelDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */

		public List<ModelLinkDescriptor> getContainedLinks(View view) {
			return ModelDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */

		public List<ModelLinkDescriptor> getIncomingLinks(View view) {
			return ModelDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */

		public List<ModelLinkDescriptor> getOutgoingLinks(View view) {
			return ModelDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
