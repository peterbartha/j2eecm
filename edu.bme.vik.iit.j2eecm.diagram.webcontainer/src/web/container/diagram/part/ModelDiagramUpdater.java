package web.container.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import web.container.diagram.edit.parts.ActionRelationshipEditPart;
import web.container.diagram.edit.parts.EventCall2EditPart;
import web.container.diagram.edit.parts.EventCallEditPart;
import web.container.diagram.edit.parts.ExceptionHandlingEditPart;
import web.container.diagram.edit.parts.HTML5EditPart;
import web.container.diagram.edit.parts.JSPPageEditPart;
import web.container.diagram.edit.parts.JSPPageLinkElementCompartmentEditPart;
import web.container.diagram.edit.parts.LinkElementEditPart;
import web.container.diagram.edit.parts.LinkRelationshipEditPart;
import web.container.diagram.edit.parts.ServletEditPart;
import web.container.diagram.edit.parts.StaticRelationshipEditPart;
import web.container.diagram.edit.parts.StrutsEditPart;
import web.container.diagram.edit.parts.StrutsExceptionHandlingCompartment2EditPart;
import web.container.diagram.edit.parts.StrutsExceptionHandlingCompartmentEditPart;
import web.container.diagram.edit.parts.StrutsGlobalEditPart;
import web.container.diagram.edit.parts.StrutsGlobalEventCallCompartmentEditPart;
import web.container.diagram.edit.parts.StrutsLinkRelationEditPart;
import web.container.diagram.edit.parts.StrutsOperationEditPart;
import web.container.diagram.edit.parts.StrutsRelationEditPart;
import web.container.diagram.edit.parts.StrutsStructsOperationCompartmentEditPart;
import web.container.diagram.edit.parts.WebContainerEditPart;
import web.container.diagram.edit.parts.WebModelRelationshipEditPart;
import web.container.diagram.edit.parts.XMLConfigEditPart;
import web.container.diagram.providers.ModelElementTypes;

import components.Action;
import components.ActionRelationship;
import components.ComponentsPackage;
import components.EventCall;
import components.ExceptionHandling;
import components.JSPPage;
import components.LinkElement;
import components.Servlet;
import components.StaticWebElement;
import components.Struts;
import components.StrutsGlobal;
import components.StrutsOperation;
import components.StrutsRelation;
import components.WebContainer;
import components.WebContainerElement;
import components.XMLConfig;

/**
 * @generated
 */
public class ModelDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<ModelNodeDescriptor> getSemanticChildren(View view) {
		switch (ModelVisualIDRegistry.getVisualID(view)) {
		case WebContainerEditPart.VISUAL_ID:
			return getWebContainer_1000SemanticChildren(view);
		case JSPPageLinkElementCompartmentEditPart.VISUAL_ID:
			return getJSPPageLinkElementCompartment_7002SemanticChildren(view);
		case StrutsStructsOperationCompartmentEditPart.VISUAL_ID:
			return getStrutsStructsOperationCompartment_7001SemanticChildren(view);
		case StrutsExceptionHandlingCompartmentEditPart.VISUAL_ID:
			return getStrutsEventCallCompartment_7003SemanticChildren(view);
		case StrutsExceptionHandlingCompartment2EditPart.VISUAL_ID:
			return getStrutsExceptionHandlingCompartment_7007SemanticChildren(view);
		case StrutsGlobalEventCallCompartmentEditPart.VISUAL_ID:
			return getStrutsGlobalEventCallCompartment_7009SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelNodeDescriptor> getWebContainer_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		WebContainer modelElement = (WebContainer) view.getElement();
		LinkedList<ModelNodeDescriptor> result = new LinkedList<ModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getElements().iterator(); it
				.hasNext();) {
			WebContainerElement childElement = (WebContainerElement) it.next();
			int visualID = ModelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == JSPPageEditPart.VISUAL_ID) {
				result.add(new ModelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ServletEditPart.VISUAL_ID) {
				result.add(new ModelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getStaticElements().iterator(); it
				.hasNext();) {
			StaticWebElement childElement = (StaticWebElement) it.next();
			int visualID = ModelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == HTML5EditPart.VISUAL_ID) {
				result.add(new ModelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == XMLConfigEditPart.VISUAL_ID) {
				result.add(new ModelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getStruts().iterator(); it.hasNext();) {
			Struts childElement = (Struts) it.next();
			int visualID = ModelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == StrutsEditPart.VISUAL_ID) {
				result.add(new ModelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			StrutsGlobal childElement = modelElement.getGlobal();
			int visualID = ModelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == StrutsGlobalEditPart.VISUAL_ID) {
				result.add(new ModelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelNodeDescriptor> getJSPPageLinkElementCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		JSPPage modelElement = (JSPPage) containerView.getElement();
		LinkedList<ModelNodeDescriptor> result = new LinkedList<ModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLinks().iterator(); it.hasNext();) {
			LinkElement childElement = (LinkElement) it.next();
			int visualID = ModelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == LinkElementEditPart.VISUAL_ID) {
				result.add(new ModelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelNodeDescriptor> getStrutsStructsOperationCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Struts modelElement = (Struts) containerView.getElement();
		LinkedList<ModelNodeDescriptor> result = new LinkedList<ModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getActions().iterator(); it
				.hasNext();) {
			Action childElement = (Action) it.next();
			int visualID = ModelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == StrutsOperationEditPart.VISUAL_ID) {
				result.add(new ModelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelNodeDescriptor> getStrutsEventCallCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Struts modelElement = (Struts) containerView.getElement();
		LinkedList<ModelNodeDescriptor> result = new LinkedList<ModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getActions().iterator(); it
				.hasNext();) {
			Action childElement = (Action) it.next();
			int visualID = ModelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EventCallEditPart.VISUAL_ID) {
				result.add(new ModelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelNodeDescriptor> getStrutsExceptionHandlingCompartment_7007SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Struts modelElement = (Struts) containerView.getElement();
		LinkedList<ModelNodeDescriptor> result = new LinkedList<ModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getActions().iterator(); it
				.hasNext();) {
			Action childElement = (Action) it.next();
			int visualID = ModelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ExceptionHandlingEditPart.VISUAL_ID) {
				result.add(new ModelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelNodeDescriptor> getStrutsGlobalEventCallCompartment_7009SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		StrutsGlobal modelElement = (StrutsGlobal) containerView.getElement();
		LinkedList<ModelNodeDescriptor> result = new LinkedList<ModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getActions().iterator(); it
				.hasNext();) {
			Action childElement = (Action) it.next();
			int visualID = ModelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EventCall2EditPart.VISUAL_ID) {
				result.add(new ModelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getContainedLinks(View view) {
		switch (ModelVisualIDRegistry.getVisualID(view)) {
		case WebContainerEditPart.VISUAL_ID:
			return getWebContainer_1000ContainedLinks(view);
		case JSPPageEditPart.VISUAL_ID:
			return getJSPPage_2001ContainedLinks(view);
		case ServletEditPart.VISUAL_ID:
			return getServlet_2002ContainedLinks(view);
		case HTML5EditPart.VISUAL_ID:
			return getHTML5_2003ContainedLinks(view);
		case XMLConfigEditPart.VISUAL_ID:
			return getXMLConfig_2006ContainedLinks(view);
		case StrutsEditPart.VISUAL_ID:
			return getStruts_2011ContainedLinks(view);
		case StrutsGlobalEditPart.VISUAL_ID:
			return getStrutsGlobal_2014ContainedLinks(view);
		case LinkElementEditPart.VISUAL_ID:
			return getLinkElement_3002ContainedLinks(view);
		case StrutsOperationEditPart.VISUAL_ID:
			return getStrutsOperation_3001ContainedLinks(view);
		case EventCallEditPart.VISUAL_ID:
			return getEventCall_3004ContainedLinks(view);
		case ExceptionHandlingEditPart.VISUAL_ID:
			return getExceptionHandling_3007ContainedLinks(view);
		case EventCall2EditPart.VISUAL_ID:
			return getEventCall_3009ContainedLinks(view);
		case StaticRelationshipEditPart.VISUAL_ID:
			return getStaticRelationship_4001ContainedLinks(view);
		case ActionRelationshipEditPart.VISUAL_ID:
			return getActionRelationship_4002ContainedLinks(view);
		case LinkRelationshipEditPart.VISUAL_ID:
			return getLinkRelationship_4003ContainedLinks(view);
		case StrutsLinkRelationEditPart.VISUAL_ID:
			return getStrutsLinkRelation_4004ContainedLinks(view);
		case StrutsRelationEditPart.VISUAL_ID:
			return getStrutsRelation_4005ContainedLinks(view);
		case WebModelRelationshipEditPart.VISUAL_ID:
			return getWebModelRelationship_4006ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getIncomingLinks(View view) {
		switch (ModelVisualIDRegistry.getVisualID(view)) {
		case JSPPageEditPart.VISUAL_ID:
			return getJSPPage_2001IncomingLinks(view);
		case ServletEditPart.VISUAL_ID:
			return getServlet_2002IncomingLinks(view);
		case HTML5EditPart.VISUAL_ID:
			return getHTML5_2003IncomingLinks(view);
		case XMLConfigEditPart.VISUAL_ID:
			return getXMLConfig_2006IncomingLinks(view);
		case StrutsEditPart.VISUAL_ID:
			return getStruts_2011IncomingLinks(view);
		case StrutsGlobalEditPart.VISUAL_ID:
			return getStrutsGlobal_2014IncomingLinks(view);
		case LinkElementEditPart.VISUAL_ID:
			return getLinkElement_3002IncomingLinks(view);
		case StrutsOperationEditPart.VISUAL_ID:
			return getStrutsOperation_3001IncomingLinks(view);
		case EventCallEditPart.VISUAL_ID:
			return getEventCall_3004IncomingLinks(view);
		case ExceptionHandlingEditPart.VISUAL_ID:
			return getExceptionHandling_3007IncomingLinks(view);
		case EventCall2EditPart.VISUAL_ID:
			return getEventCall_3009IncomingLinks(view);
		case StaticRelationshipEditPart.VISUAL_ID:
			return getStaticRelationship_4001IncomingLinks(view);
		case ActionRelationshipEditPart.VISUAL_ID:
			return getActionRelationship_4002IncomingLinks(view);
		case LinkRelationshipEditPart.VISUAL_ID:
			return getLinkRelationship_4003IncomingLinks(view);
		case StrutsLinkRelationEditPart.VISUAL_ID:
			return getStrutsLinkRelation_4004IncomingLinks(view);
		case StrutsRelationEditPart.VISUAL_ID:
			return getStrutsRelation_4005IncomingLinks(view);
		case WebModelRelationshipEditPart.VISUAL_ID:
			return getWebModelRelationship_4006IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getOutgoingLinks(View view) {
		switch (ModelVisualIDRegistry.getVisualID(view)) {
		case JSPPageEditPart.VISUAL_ID:
			return getJSPPage_2001OutgoingLinks(view);
		case ServletEditPart.VISUAL_ID:
			return getServlet_2002OutgoingLinks(view);
		case HTML5EditPart.VISUAL_ID:
			return getHTML5_2003OutgoingLinks(view);
		case XMLConfigEditPart.VISUAL_ID:
			return getXMLConfig_2006OutgoingLinks(view);
		case StrutsEditPart.VISUAL_ID:
			return getStruts_2011OutgoingLinks(view);
		case StrutsGlobalEditPart.VISUAL_ID:
			return getStrutsGlobal_2014OutgoingLinks(view);
		case LinkElementEditPart.VISUAL_ID:
			return getLinkElement_3002OutgoingLinks(view);
		case StrutsOperationEditPart.VISUAL_ID:
			return getStrutsOperation_3001OutgoingLinks(view);
		case EventCallEditPart.VISUAL_ID:
			return getEventCall_3004OutgoingLinks(view);
		case ExceptionHandlingEditPart.VISUAL_ID:
			return getExceptionHandling_3007OutgoingLinks(view);
		case EventCall2EditPart.VISUAL_ID:
			return getEventCall_3009OutgoingLinks(view);
		case StaticRelationshipEditPart.VISUAL_ID:
			return getStaticRelationship_4001OutgoingLinks(view);
		case ActionRelationshipEditPart.VISUAL_ID:
			return getActionRelationship_4002OutgoingLinks(view);
		case LinkRelationshipEditPart.VISUAL_ID:
			return getLinkRelationship_4003OutgoingLinks(view);
		case StrutsLinkRelationEditPart.VISUAL_ID:
			return getStrutsLinkRelation_4004OutgoingLinks(view);
		case StrutsRelationEditPart.VISUAL_ID:
			return getStrutsRelation_4005OutgoingLinks(view);
		case WebModelRelationshipEditPart.VISUAL_ID:
			return getWebModelRelationship_4006OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getWebContainer_1000ContainedLinks(
			View view) {
		WebContainer modelElement = (WebContainer) view.getElement();
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_staticRelationship_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ActionRelationship_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_linkRelationship_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_strutsLinkRelation_4004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_StrutsRelation_4005(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_webModelRelationship_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getJSPPage_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getServlet_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getHTML5_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getXMLConfig_2006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getStruts_2011ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getStrutsGlobal_2014ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getLinkElement_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getStrutsOperation_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getEventCall_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getExceptionHandling_3007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getEventCall_3009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getStaticRelationship_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getActionRelationship_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getLinkRelationship_4003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getStrutsLinkRelation_4004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getStrutsRelation_4005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getWebModelRelationship_4006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getJSPPage_2001IncomingLinks(
			View view) {
		JSPPage modelElement = (JSPPage) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ActionRelationship_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_linkRelationship_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_webModelRelationship_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getServlet_2002IncomingLinks(
			View view) {
		Servlet modelElement = (Servlet) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_webModelRelationship_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getHTML5_2003IncomingLinks(View view) {
		components.HTML5 modelElement = (components.HTML5) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_staticRelationship_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getXMLConfig_2006IncomingLinks(
			View view) {
		XMLConfig modelElement = (XMLConfig) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_staticRelationship_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getStruts_2011IncomingLinks(
			View view) {
		Struts modelElement = (Struts) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_strutsLinkRelation_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_StrutsRelation_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getStrutsGlobal_2014IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getLinkElement_3002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getStrutsOperation_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getEventCall_3004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getExceptionHandling_3007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getEventCall_3009IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getStaticRelationship_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getActionRelationship_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getLinkRelationship_4003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getStrutsLinkRelation_4004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getStrutsRelation_4005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getWebModelRelationship_4006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getJSPPage_2001OutgoingLinks(
			View view) {
		JSPPage modelElement = (JSPPage) view.getElement();
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_staticRelationship_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_webModelRelationship_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getServlet_2002OutgoingLinks(
			View view) {
		Servlet modelElement = (Servlet) view.getElement();
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_staticRelationship_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_webModelRelationship_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getHTML5_2003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getXMLConfig_2006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getStruts_2011OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getStrutsGlobal_2014OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getLinkElement_3002OutgoingLinks(
			View view) {
		LinkElement modelElement = (LinkElement) view.getElement();
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_linkRelationship_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_strutsLinkRelation_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getStrutsOperation_3001OutgoingLinks(
			View view) {
		StrutsOperation modelElement = (StrutsOperation) view.getElement();
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActionRelationship_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_StrutsRelation_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getEventCall_3004OutgoingLinks(
			View view) {
		EventCall modelElement = (EventCall) view.getElement();
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActionRelationship_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_StrutsRelation_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getExceptionHandling_3007OutgoingLinks(
			View view) {
		ExceptionHandling modelElement = (ExceptionHandling) view.getElement();
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActionRelationship_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_StrutsRelation_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getEventCall_3009OutgoingLinks(
			View view) {
		EventCall modelElement = (EventCall) view.getElement();
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActionRelationship_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_StrutsRelation_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getStaticRelationship_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getActionRelationship_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getLinkRelationship_4003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getStrutsLinkRelation_4004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getStrutsRelation_4005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModelLinkDescriptor> getWebModelRelationship_4006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getContainedTypeModelFacetLinks_staticRelationship_4001(
			WebContainer container) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		for (Iterator<?> links = container.getWebrelations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof components.staticRelationship) {
				continue;
			}
			components.staticRelationship link = (components.staticRelationship) linkObject;
			if (StaticRelationshipEditPart.VISUAL_ID != ModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			StaticWebElement dst = link.getTarget();
			WebContainerElement src = link.getSource();
			result.add(new ModelLinkDescriptor(src, dst, link,
					ModelElementTypes.StaticRelationship_4001,
					StaticRelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getContainedTypeModelFacetLinks_ActionRelationship_4002(
			WebContainer container) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		for (Iterator<?> links = container.getWebrelations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ActionRelationship) {
				continue;
			}
			ActionRelationship link = (ActionRelationship) linkObject;
			if (ActionRelationshipEditPart.VISUAL_ID != ModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			JSPPage dst = link.getPageElem();
			Action src = link.getActionElem();
			result.add(new ModelLinkDescriptor(src, dst, link,
					ModelElementTypes.ActionRelationship_4002,
					ActionRelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getContainedTypeModelFacetLinks_linkRelationship_4003(
			WebContainer container) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		for (Iterator<?> links = container.getWebrelations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof components.linkRelationship) {
				continue;
			}
			components.linkRelationship link = (components.linkRelationship) linkObject;
			if (LinkRelationshipEditPart.VISUAL_ID != ModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			JSPPage dst = link.getTarget();
			LinkElement src = link.getSource();
			result.add(new ModelLinkDescriptor(src, dst, link,
					ModelElementTypes.LinkRelationship_4003,
					LinkRelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getContainedTypeModelFacetLinks_strutsLinkRelation_4004(
			WebContainer container) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		for (Iterator<?> links = container.getWebrelations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof components.strutsLinkRelation) {
				continue;
			}
			components.strutsLinkRelation link = (components.strutsLinkRelation) linkObject;
			if (StrutsLinkRelationEditPart.VISUAL_ID != ModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Struts dst = link.getTarget();
			LinkElement src = link.getSource();
			result.add(new ModelLinkDescriptor(src, dst, link,
					ModelElementTypes.StrutsLinkRelation_4004,
					StrutsLinkRelationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getContainedTypeModelFacetLinks_StrutsRelation_4005(
			WebContainer container) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		for (Iterator<?> links = container.getWebrelations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof StrutsRelation) {
				continue;
			}
			StrutsRelation link = (StrutsRelation) linkObject;
			if (StrutsRelationEditPart.VISUAL_ID != ModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Struts dst = link.getTarget();
			Action src = link.getSource();
			result.add(new ModelLinkDescriptor(src, dst, link,
					ModelElementTypes.StrutsRelation_4005,
					StrutsRelationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getContainedTypeModelFacetLinks_webModelRelationship_4006(
			WebContainer container) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		for (Iterator<?> links = container.getWebrelations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof components.webModelRelationship) {
				continue;
			}
			components.webModelRelationship link = (components.webModelRelationship) linkObject;
			if (WebModelRelationshipEditPart.VISUAL_ID != ModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			WebContainerElement dst = link.getTarget();
			WebContainerElement src = link.getSource();
			result.add(new ModelLinkDescriptor(src, dst, link,
					ModelElementTypes.WebModelRelationship_4006,
					WebModelRelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getIncomingTypeModelFacetLinks_staticRelationship_4001(
			StaticWebElement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ComponentsPackage.eINSTANCE
					.getstaticRelationship_Target()
					|| false == setting.getEObject() instanceof components.staticRelationship) {
				continue;
			}
			components.staticRelationship link = (components.staticRelationship) setting
					.getEObject();
			if (StaticRelationshipEditPart.VISUAL_ID != ModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			WebContainerElement src = link.getSource();
			result.add(new ModelLinkDescriptor(src, target, link,
					ModelElementTypes.StaticRelationship_4001,
					StaticRelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getIncomingTypeModelFacetLinks_ActionRelationship_4002(
			JSPPage target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ComponentsPackage.eINSTANCE
					.getActionRelationship_PageElem()
					|| false == setting.getEObject() instanceof ActionRelationship) {
				continue;
			}
			ActionRelationship link = (ActionRelationship) setting.getEObject();
			if (ActionRelationshipEditPart.VISUAL_ID != ModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Action src = link.getActionElem();
			result.add(new ModelLinkDescriptor(src, target, link,
					ModelElementTypes.ActionRelationship_4002,
					ActionRelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getIncomingTypeModelFacetLinks_linkRelationship_4003(
			JSPPage target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ComponentsPackage.eINSTANCE
					.getlinkRelationship_Target()
					|| false == setting.getEObject() instanceof components.linkRelationship) {
				continue;
			}
			components.linkRelationship link = (components.linkRelationship) setting
					.getEObject();
			if (LinkRelationshipEditPart.VISUAL_ID != ModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			LinkElement src = link.getSource();
			result.add(new ModelLinkDescriptor(src, target, link,
					ModelElementTypes.LinkRelationship_4003,
					LinkRelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getIncomingTypeModelFacetLinks_strutsLinkRelation_4004(
			Struts target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ComponentsPackage.eINSTANCE
					.getstrutsLinkRelation_Target()
					|| false == setting.getEObject() instanceof components.strutsLinkRelation) {
				continue;
			}
			components.strutsLinkRelation link = (components.strutsLinkRelation) setting
					.getEObject();
			if (StrutsLinkRelationEditPart.VISUAL_ID != ModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			LinkElement src = link.getSource();
			result.add(new ModelLinkDescriptor(src, target, link,
					ModelElementTypes.StrutsLinkRelation_4004,
					StrutsLinkRelationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getIncomingTypeModelFacetLinks_StrutsRelation_4005(
			Struts target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ComponentsPackage.eINSTANCE
					.getStrutsRelation_Target()
					|| false == setting.getEObject() instanceof StrutsRelation) {
				continue;
			}
			StrutsRelation link = (StrutsRelation) setting.getEObject();
			if (StrutsRelationEditPart.VISUAL_ID != ModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Action src = link.getSource();
			result.add(new ModelLinkDescriptor(src, target, link,
					ModelElementTypes.StrutsRelation_4005,
					StrutsRelationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getIncomingTypeModelFacetLinks_webModelRelationship_4006(
			WebContainerElement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ComponentsPackage.eINSTANCE
					.getwebModelRelationship_Target()
					|| false == setting.getEObject() instanceof components.webModelRelationship) {
				continue;
			}
			components.webModelRelationship link = (components.webModelRelationship) setting
					.getEObject();
			if (WebModelRelationshipEditPart.VISUAL_ID != ModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			WebContainerElement src = link.getSource();
			result.add(new ModelLinkDescriptor(src, target, link,
					ModelElementTypes.WebModelRelationship_4006,
					WebModelRelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getOutgoingTypeModelFacetLinks_staticRelationship_4001(
			WebContainerElement source) {
		WebContainer container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof WebContainer) {
				container = (WebContainer) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		for (Iterator<?> links = container.getWebrelations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof components.staticRelationship) {
				continue;
			}
			components.staticRelationship link = (components.staticRelationship) linkObject;
			if (StaticRelationshipEditPart.VISUAL_ID != ModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			StaticWebElement dst = link.getTarget();
			WebContainerElement src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ModelLinkDescriptor(src, dst, link,
					ModelElementTypes.StaticRelationship_4001,
					StaticRelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getOutgoingTypeModelFacetLinks_ActionRelationship_4002(
			Action source) {
		WebContainer container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof WebContainer) {
				container = (WebContainer) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		for (Iterator<?> links = container.getWebrelations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ActionRelationship) {
				continue;
			}
			ActionRelationship link = (ActionRelationship) linkObject;
			if (ActionRelationshipEditPart.VISUAL_ID != ModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			JSPPage dst = link.getPageElem();
			Action src = link.getActionElem();
			if (src != source) {
				continue;
			}
			result.add(new ModelLinkDescriptor(src, dst, link,
					ModelElementTypes.ActionRelationship_4002,
					ActionRelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getOutgoingTypeModelFacetLinks_linkRelationship_4003(
			LinkElement source) {
		WebContainer container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof WebContainer) {
				container = (WebContainer) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		for (Iterator<?> links = container.getWebrelations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof components.linkRelationship) {
				continue;
			}
			components.linkRelationship link = (components.linkRelationship) linkObject;
			if (LinkRelationshipEditPart.VISUAL_ID != ModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			JSPPage dst = link.getTarget();
			LinkElement src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ModelLinkDescriptor(src, dst, link,
					ModelElementTypes.LinkRelationship_4003,
					LinkRelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getOutgoingTypeModelFacetLinks_strutsLinkRelation_4004(
			LinkElement source) {
		WebContainer container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof WebContainer) {
				container = (WebContainer) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		for (Iterator<?> links = container.getWebrelations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof components.strutsLinkRelation) {
				continue;
			}
			components.strutsLinkRelation link = (components.strutsLinkRelation) linkObject;
			if (StrutsLinkRelationEditPart.VISUAL_ID != ModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Struts dst = link.getTarget();
			LinkElement src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ModelLinkDescriptor(src, dst, link,
					ModelElementTypes.StrutsLinkRelation_4004,
					StrutsLinkRelationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getOutgoingTypeModelFacetLinks_StrutsRelation_4005(
			Action source) {
		WebContainer container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof WebContainer) {
				container = (WebContainer) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		for (Iterator<?> links = container.getWebrelations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof StrutsRelation) {
				continue;
			}
			StrutsRelation link = (StrutsRelation) linkObject;
			if (StrutsRelationEditPart.VISUAL_ID != ModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Struts dst = link.getTarget();
			Action src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ModelLinkDescriptor(src, dst, link,
					ModelElementTypes.StrutsRelation_4005,
					StrutsRelationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModelLinkDescriptor> getOutgoingTypeModelFacetLinks_webModelRelationship_4006(
			WebContainerElement source) {
		WebContainer container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof WebContainer) {
				container = (WebContainer) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ModelLinkDescriptor> result = new LinkedList<ModelLinkDescriptor>();
		for (Iterator<?> links = container.getWebrelations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof components.webModelRelationship) {
				continue;
			}
			components.webModelRelationship link = (components.webModelRelationship) linkObject;
			if (WebModelRelationshipEditPart.VISUAL_ID != ModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			WebContainerElement dst = link.getTarget();
			WebContainerElement src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ModelLinkDescriptor(src, dst, link,
					ModelElementTypes.WebModelRelationship_4006,
					WebModelRelationshipEditPart.VISUAL_ID));
		}
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
