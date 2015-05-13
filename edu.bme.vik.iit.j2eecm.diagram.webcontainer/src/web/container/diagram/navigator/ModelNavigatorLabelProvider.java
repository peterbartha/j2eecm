package web.container.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

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
import web.container.diagram.edit.parts.JSPPageNameEditPart;
import web.container.diagram.edit.parts.LinkElementEditPart;
import web.container.diagram.edit.parts.LinkElementLinkEditPart;
import web.container.diagram.edit.parts.LinkRelationshipEditPart;
import web.container.diagram.edit.parts.ServletEditPart;
import web.container.diagram.edit.parts.ServletNameEditPart;
import web.container.diagram.edit.parts.StaticRelationshipEditPart;
import web.container.diagram.edit.parts.StrutsEditPart;
import web.container.diagram.edit.parts.StrutsGlobalEditPart;
import web.container.diagram.edit.parts.StrutsLinkRelationEditPart;
import web.container.diagram.edit.parts.StrutsNameEditPart;
import web.container.diagram.edit.parts.StrutsOperationEditPart;
import web.container.diagram.edit.parts.StrutsOperationNameEditPart;
import web.container.diagram.edit.parts.StrutsRelationEditPart;
import web.container.diagram.edit.parts.WebContainerEditPart;
import web.container.diagram.edit.parts.WebModelRelationshipEditPart;
import web.container.diagram.edit.parts.WebModelRelationshipLabelEditPart;
import web.container.diagram.edit.parts.XMLConfigEditPart;
import web.container.diagram.edit.parts.XMLConfigNameEditPart;
import web.container.diagram.part.ModelDiagramEditorPlugin;
import web.container.diagram.part.ModelVisualIDRegistry;
import web.container.diagram.providers.ModelElementTypes;
import web.container.diagram.providers.ModelParserProvider;

import components.WebContainer;

/**
 * @generated
 */
public class ModelNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		ModelDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		ModelDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof ModelNavigatorItem
				&& !isOwnView(((ModelNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof ModelNavigatorGroup) {
			ModelNavigatorGroup group = (ModelNavigatorGroup) element;
			return ModelDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof ModelNavigatorItem) {
			ModelNavigatorItem navigatorItem = (ModelNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (ModelVisualIDRegistry.getVisualID(view)) {
		case LinkRelationshipEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?components?linkRelationship", ModelElementTypes.LinkRelationship_4003); //$NON-NLS-1$
		case WebModelRelationshipEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?components?webModelRelationship", ModelElementTypes.WebModelRelationship_4006); //$NON-NLS-1$
		case StrutsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?components?Struts", ModelElementTypes.Struts_2011); //$NON-NLS-1$
		case ServletEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?components?Servlet", ModelElementTypes.Servlet_2002); //$NON-NLS-1$
		case StrutsLinkRelationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?components?strutsLinkRelation", ModelElementTypes.StrutsLinkRelation_4004); //$NON-NLS-1$
		case XMLConfigEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?components?XMLConfig", ModelElementTypes.XMLConfig_2006); //$NON-NLS-1$
		case ExceptionHandlingEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?components?ExceptionHandling", ModelElementTypes.ExceptionHandling_3007); //$NON-NLS-1$
		case StaticRelationshipEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?components?staticRelationship", ModelElementTypes.StaticRelationship_4001); //$NON-NLS-1$
		case EventCall2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?components?EventCall", ModelElementTypes.EventCall_3009); //$NON-NLS-1$
		case HTML5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?components?HTML5", ModelElementTypes.HTML5_2003); //$NON-NLS-1$
		case LinkElementEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?components?LinkElement", ModelElementTypes.LinkElement_3002); //$NON-NLS-1$
		case JSPPageEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?components?JSPPage", ModelElementTypes.JSPPage_2001); //$NON-NLS-1$
		case StrutsRelationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?components?StrutsRelation", ModelElementTypes.StrutsRelation_4005); //$NON-NLS-1$
		case WebContainerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?components?WebContainer", ModelElementTypes.WebContainer_1000); //$NON-NLS-1$
		case StrutsGlobalEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?components?StrutsGlobal", ModelElementTypes.StrutsGlobal_2014); //$NON-NLS-1$
		case ActionRelationshipEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?components?ActionRelationship", ModelElementTypes.ActionRelationship_4002); //$NON-NLS-1$
		case StrutsOperationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?components?StrutsOperation", ModelElementTypes.StrutsOperation_3001); //$NON-NLS-1$
		case EventCallEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?components?EventCall", ModelElementTypes.EventCall_3004); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = ModelDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& ModelElementTypes.isKnownElementType(elementType)) {
			image = ModelElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof ModelNavigatorGroup) {
			ModelNavigatorGroup group = (ModelNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof ModelNavigatorItem) {
			ModelNavigatorItem navigatorItem = (ModelNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (ModelVisualIDRegistry.getVisualID(view)) {
		case LinkRelationshipEditPart.VISUAL_ID:
			return getLinkRelationship_4003Text(view);
		case WebModelRelationshipEditPart.VISUAL_ID:
			return getWebModelRelationship_4006Text(view);
		case StrutsEditPart.VISUAL_ID:
			return getStruts_2011Text(view);
		case ServletEditPart.VISUAL_ID:
			return getServlet_2002Text(view);
		case StrutsLinkRelationEditPart.VISUAL_ID:
			return getStrutsLinkRelation_4004Text(view);
		case XMLConfigEditPart.VISUAL_ID:
			return getXMLConfig_2006Text(view);
		case ExceptionHandlingEditPart.VISUAL_ID:
			return getExceptionHandling_3007Text(view);
		case StaticRelationshipEditPart.VISUAL_ID:
			return getStaticRelationship_4001Text(view);
		case EventCall2EditPart.VISUAL_ID:
			return getEventCall_3009Text(view);
		case HTML5EditPart.VISUAL_ID:
			return getHTML5_2003Text(view);
		case LinkElementEditPart.VISUAL_ID:
			return getLinkElement_3002Text(view);
		case JSPPageEditPart.VISUAL_ID:
			return getJSPPage_2001Text(view);
		case StrutsRelationEditPart.VISUAL_ID:
			return getStrutsRelation_4005Text(view);
		case WebContainerEditPart.VISUAL_ID:
			return getWebContainer_1000Text(view);
		case StrutsGlobalEditPart.VISUAL_ID:
			return getStrutsGlobal_2014Text(view);
		case ActionRelationshipEditPart.VISUAL_ID:
			return getActionRelationship_4002Text(view);
		case StrutsOperationEditPart.VISUAL_ID:
			return getStrutsOperation_3001Text(view);
		case EventCallEditPart.VISUAL_ID:
			return getEventCall_3004Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getLinkRelationship_4003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getWebModelRelationship_4006Text(View view) {
		IParser parser = ModelParserProvider.getParser(
				ModelElementTypes.WebModelRelationship_4006,
				view.getElement() != null ? view.getElement() : view,
				ModelVisualIDRegistry
						.getType(WebModelRelationshipLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStruts_2011Text(View view) {
		IParser parser = ModelParserProvider.getParser(
				ModelElementTypes.Struts_2011,
				view.getElement() != null ? view.getElement() : view,
				ModelVisualIDRegistry.getType(StrutsNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getServlet_2002Text(View view) {
		IParser parser = ModelParserProvider.getParser(
				ModelElementTypes.Servlet_2002,
				view.getElement() != null ? view.getElement() : view,
				ModelVisualIDRegistry.getType(ServletNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStrutsLinkRelation_4004Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getXMLConfig_2006Text(View view) {
		IParser parser = ModelParserProvider.getParser(
				ModelElementTypes.XMLConfig_2006,
				view.getElement() != null ? view.getElement() : view,
				ModelVisualIDRegistry.getType(XMLConfigNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExceptionHandling_3007Text(View view) {
		IParser parser = ModelParserProvider.getParser(
				ModelElementTypes.ExceptionHandling_3007,
				view.getElement() != null ? view.getElement() : view,
				ModelVisualIDRegistry
						.getType(ExceptionHandlingNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStaticRelationship_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getEventCall_3009Text(View view) {
		IParser parser = ModelParserProvider
				.getParser(ModelElementTypes.EventCall_3009,
						view.getElement() != null ? view.getElement() : view,
						ModelVisualIDRegistry
								.getType(EventCallName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHTML5_2003Text(View view) {
		IParser parser = ModelParserProvider.getParser(
				ModelElementTypes.HTML5_2003,
				view.getElement() != null ? view.getElement() : view,
				ModelVisualIDRegistry.getType(HTML5NameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLinkElement_3002Text(View view) {
		IParser parser = ModelParserProvider.getParser(
				ModelElementTypes.LinkElement_3002,
				view.getElement() != null ? view.getElement() : view,
				ModelVisualIDRegistry
						.getType(LinkElementLinkEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getJSPPage_2001Text(View view) {
		IParser parser = ModelParserProvider.getParser(
				ModelElementTypes.JSPPage_2001,
				view.getElement() != null ? view.getElement() : view,
				ModelVisualIDRegistry.getType(JSPPageNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStrutsRelation_4005Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getWebContainer_1000Text(View view) {
		WebContainer domainModelElement = (WebContainer) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStrutsGlobal_2014Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getActionRelationship_4002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getStrutsOperation_3001Text(View view) {
		IParser parser = ModelParserProvider.getParser(
				ModelElementTypes.StrutsOperation_3001,
				view.getElement() != null ? view.getElement() : view,
				ModelVisualIDRegistry
						.getType(StrutsOperationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEventCall_3004Text(View view) {
		IParser parser = ModelParserProvider.getParser(
				ModelElementTypes.EventCall_3004,
				view.getElement() != null ? view.getElement() : view,
				ModelVisualIDRegistry.getType(EventCallNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
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
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return WebContainerEditPart.MODEL_ID.equals(ModelVisualIDRegistry
				.getModelID(view));
	}

}
