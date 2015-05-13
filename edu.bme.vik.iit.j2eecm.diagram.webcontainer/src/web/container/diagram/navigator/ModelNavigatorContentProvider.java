package web.container.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

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
import web.container.diagram.part.Messages;
import web.container.diagram.part.ModelVisualIDRegistry;

/**
 * @generated
 */
public class ModelNavigatorContentProvider implements ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public ModelNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet()
				.getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay()
					.asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			ArrayList<ModelNavigatorItem> result = new ArrayList<ModelNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews, WebContainerEditPart.MODEL_ID),
					file, false));
			return result.toArray();
		}

		if (parentElement instanceof ModelNavigatorGroup) {
			ModelNavigatorGroup group = (ModelNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof ModelNavigatorItem) {
			ModelNavigatorItem navigatorItem = (ModelNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (ModelVisualIDRegistry.getVisualID(view)) {

		case LinkRelationshipEditPart.VISUAL_ID: {
			LinkedList<ModelAbstractNavigatorItem> result = new LinkedList<ModelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ModelNavigatorGroup target = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_LinkRelationship_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ModelNavigatorGroup source = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_LinkRelationship_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(JSPPageEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ModelVisualIDRegistry
							.getType(LinkElementEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case WebModelRelationshipEditPart.VISUAL_ID: {
			LinkedList<ModelAbstractNavigatorItem> result = new LinkedList<ModelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ModelNavigatorGroup target = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_WebModelRelationship_4006_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ModelNavigatorGroup source = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_WebModelRelationship_4006_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(JSPPageEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(ServletEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(JSPPageEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(ServletEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case StrutsEditPart.VISUAL_ID: {
			LinkedList<ModelAbstractNavigatorItem> result = new LinkedList<ModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			ModelNavigatorGroup incominglinks = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_Struts_2011_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ModelVisualIDRegistry
							.getType(StrutsStructsOperationCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ModelVisualIDRegistry
							.getType(StrutsOperationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ModelVisualIDRegistry
							.getType(StrutsExceptionHandlingCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ModelVisualIDRegistry.getType(EventCallEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ModelVisualIDRegistry
							.getType(StrutsExceptionHandlingCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ModelVisualIDRegistry
							.getType(ExceptionHandlingEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry
							.getType(StrutsLinkRelationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry
							.getType(StrutsRelationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ServletEditPart.VISUAL_ID: {
			LinkedList<ModelAbstractNavigatorItem> result = new LinkedList<ModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			ModelNavigatorGroup outgoinglinks = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_Servlet_2002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ModelNavigatorGroup incominglinks = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_Servlet_2002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry
							.getType(StaticRelationshipEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry
							.getType(WebModelRelationshipEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry
							.getType(WebModelRelationshipEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case StrutsLinkRelationEditPart.VISUAL_ID: {
			LinkedList<ModelAbstractNavigatorItem> result = new LinkedList<ModelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ModelNavigatorGroup target = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_StrutsLinkRelation_4004_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ModelNavigatorGroup source = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_StrutsLinkRelation_4004_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(StrutsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ModelVisualIDRegistry
							.getType(LinkElementEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case XMLConfigEditPart.VISUAL_ID: {
			LinkedList<ModelAbstractNavigatorItem> result = new LinkedList<ModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			ModelNavigatorGroup incominglinks = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_XMLConfig_2006_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry
							.getType(StaticRelationshipEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ExceptionHandlingEditPart.VISUAL_ID: {
			LinkedList<ModelAbstractNavigatorItem> result = new LinkedList<ModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			ModelNavigatorGroup outgoinglinks = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_ExceptionHandling_3007_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry
							.getType(ActionRelationshipEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry
							.getType(StrutsRelationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case StaticRelationshipEditPart.VISUAL_ID: {
			LinkedList<ModelAbstractNavigatorItem> result = new LinkedList<ModelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ModelNavigatorGroup target = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_StaticRelationship_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ModelNavigatorGroup source = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_StaticRelationship_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(HTML5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(XMLConfigEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(JSPPageEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(ServletEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case EventCall2EditPart.VISUAL_ID: {
			LinkedList<ModelAbstractNavigatorItem> result = new LinkedList<ModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			ModelNavigatorGroup outgoinglinks = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_EventCall_3009_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry
							.getType(ActionRelationshipEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry
							.getType(StrutsRelationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case HTML5EditPart.VISUAL_ID: {
			LinkedList<ModelAbstractNavigatorItem> result = new LinkedList<ModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			ModelNavigatorGroup incominglinks = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_HTML5_2003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry
							.getType(StaticRelationshipEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case LinkElementEditPart.VISUAL_ID: {
			LinkedList<ModelAbstractNavigatorItem> result = new LinkedList<ModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			ModelNavigatorGroup outgoinglinks = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_LinkElement_3002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry
							.getType(LinkRelationshipEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry
							.getType(StrutsLinkRelationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case JSPPageEditPart.VISUAL_ID: {
			LinkedList<ModelAbstractNavigatorItem> result = new LinkedList<ModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			ModelNavigatorGroup outgoinglinks = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_JSPPage_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ModelNavigatorGroup incominglinks = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_JSPPage_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ModelVisualIDRegistry
							.getType(JSPPageLinkElementCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ModelVisualIDRegistry
							.getType(LinkElementEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry
							.getType(StaticRelationshipEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry
							.getType(ActionRelationshipEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry
							.getType(LinkRelationshipEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry
							.getType(WebModelRelationshipEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry
							.getType(WebModelRelationshipEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case StrutsRelationEditPart.VISUAL_ID: {
			LinkedList<ModelAbstractNavigatorItem> result = new LinkedList<ModelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ModelNavigatorGroup target = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_StrutsRelation_4005_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ModelNavigatorGroup source = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_StrutsRelation_4005_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(StrutsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ModelVisualIDRegistry
							.getType(StrutsOperationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(EventCallEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ModelVisualIDRegistry
							.getType(ExceptionHandlingEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(EventCall2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case WebContainerEditPart.VISUAL_ID: {
			LinkedList<ModelAbstractNavigatorItem> result = new LinkedList<ModelAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			ModelNavigatorGroup links = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_WebContainer_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(JSPPageEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(ServletEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(HTML5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(XMLConfigEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(StrutsEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ModelVisualIDRegistry
							.getType(StrutsGlobalEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry
							.getType(StaticRelationshipEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry
							.getType(ActionRelationshipEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry
							.getType(LinkRelationshipEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry
							.getType(StrutsLinkRelationEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry
							.getType(StrutsRelationEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry
							.getType(WebModelRelationshipEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case StrutsGlobalEditPart.VISUAL_ID: {
			LinkedList<ModelAbstractNavigatorItem> result = new LinkedList<ModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ModelVisualIDRegistry
							.getType(StrutsGlobalEventCallCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ModelVisualIDRegistry.getType(EventCall2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ActionRelationshipEditPart.VISUAL_ID: {
			LinkedList<ModelAbstractNavigatorItem> result = new LinkedList<ModelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ModelNavigatorGroup target = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_ActionRelationship_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ModelNavigatorGroup source = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_ActionRelationship_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(JSPPageEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ModelVisualIDRegistry
							.getType(StrutsOperationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(EventCallEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ModelVisualIDRegistry
							.getType(ExceptionHandlingEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ModelVisualIDRegistry.getType(EventCall2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case StrutsOperationEditPart.VISUAL_ID: {
			LinkedList<ModelAbstractNavigatorItem> result = new LinkedList<ModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			ModelNavigatorGroup outgoinglinks = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_StrutsOperation_3001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry
							.getType(ActionRelationshipEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry
							.getType(StrutsRelationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case EventCallEditPart.VISUAL_ID: {
			LinkedList<ModelAbstractNavigatorItem> result = new LinkedList<ModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			ModelNavigatorGroup outgoinglinks = new ModelNavigatorGroup(
					Messages.NavigatorGroupName_EventCall_3004_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry
							.getType(ActionRelationshipEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ModelVisualIDRegistry
							.getType(StrutsRelationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(
			Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views,
			String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return WebContainerEditPart.MODEL_ID.equals(ModelVisualIDRegistry
				.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<ModelNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<ModelNavigatorItem> result = new ArrayList<ModelNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new ModelNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof ModelAbstractNavigatorItem) {
			ModelAbstractNavigatorItem abstractNavigatorItem = (ModelAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
