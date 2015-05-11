package components.diagram.navigator;

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

import components.diagram.edit.parts.AppReleationshipEditPart;
import components.diagram.edit.parts.AppReleationshipProtocolEditPart;
import components.diagram.edit.parts.ApplicationClientEditPart;
import components.diagram.edit.parts.ApplicationClientNameEditPart;
import components.diagram.edit.parts.BrowserEditPart;
import components.diagram.edit.parts.BrowserNameEditPart;
import components.diagram.edit.parts.ClientEditPart;
import components.diagram.edit.parts.ClientNameEditPart;
import components.diagram.edit.parts.ContainerReleationshipEditPart;
import components.diagram.edit.parts.ContainerReleationshipProtocolEditPart;
import components.diagram.edit.parts.DataReleationshipEditPart;
import components.diagram.edit.parts.DataReleationshipProtocolEditPart;
import components.diagram.edit.parts.DatabaseEditPart;
import components.diagram.edit.parts.DatabaseNameEditPart;
import components.diagram.edit.parts.EJBContainerEditPart;
import components.diagram.edit.parts.EJBContainerNameEditPart;
import components.diagram.edit.parts.J2EEServerEditPart;
import components.diagram.edit.parts.J2EEServerNameEditPart;
import components.diagram.edit.parts.ModelEditPart;
import components.diagram.edit.parts.WebContainerEditPart;
import components.diagram.edit.parts.WebContainerNameEditPart;
import components.diagram.edit.parts.WebReleationshipEditPart;
import components.diagram.edit.parts.WebReleationshipProtocolEditPart;
import components.diagram.part.ModelDiagramEditorPlugin;
import components.diagram.part.ModelVisualIDRegistry;
import components.diagram.providers.ModelElementTypes;
import components.diagram.providers.ModelParserProvider;

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
		case WebReleationshipEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?components?WebReleationship", ModelElementTypes.WebReleationship_4001); //$NON-NLS-1$
		case J2EEServerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?components?J2EEServer", ModelElementTypes.J2EEServer_2003); //$NON-NLS-1$
		case DatabaseEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?components?Database", ModelElementTypes.Database_2002); //$NON-NLS-1$
		case ClientEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?components?Client", ModelElementTypes.Client_2001); //$NON-NLS-1$
		case EJBContainerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?components?EJBContainer", ModelElementTypes.EJBContainer_3004); //$NON-NLS-1$
		case WebContainerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?components?WebContainer", ModelElementTypes.WebContainer_3003); //$NON-NLS-1$
		case DataReleationshipEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?components?DataReleationship", ModelElementTypes.DataReleationship_4002); //$NON-NLS-1$
		case ContainerReleationshipEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?components?ContainerReleationship", ModelElementTypes.ContainerReleationship_4004); //$NON-NLS-1$
		case BrowserEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?components?Browser", ModelElementTypes.Browser_3001); //$NON-NLS-1$
		case ApplicationClientEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?components?ApplicationClient", ModelElementTypes.ApplicationClient_3002); //$NON-NLS-1$
		case ModelEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?components?Model", ModelElementTypes.Model_1000); //$NON-NLS-1$
		case AppReleationshipEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?components?AppReleationship", ModelElementTypes.AppReleationship_4003); //$NON-NLS-1$
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
		case WebReleationshipEditPart.VISUAL_ID:
			return getWebReleationship_4001Text(view);
		case J2EEServerEditPart.VISUAL_ID:
			return getJ2EEServer_2003Text(view);
		case DatabaseEditPart.VISUAL_ID:
			return getDatabase_2002Text(view);
		case ClientEditPart.VISUAL_ID:
			return getClient_2001Text(view);
		case EJBContainerEditPart.VISUAL_ID:
			return getEJBContainer_3004Text(view);
		case WebContainerEditPart.VISUAL_ID:
			return getWebContainer_3003Text(view);
		case DataReleationshipEditPart.VISUAL_ID:
			return getDataReleationship_4002Text(view);
		case ContainerReleationshipEditPart.VISUAL_ID:
			return getContainerReleationship_4004Text(view);
		case BrowserEditPart.VISUAL_ID:
			return getBrowser_3001Text(view);
		case ApplicationClientEditPart.VISUAL_ID:
			return getApplicationClient_3002Text(view);
		case ModelEditPart.VISUAL_ID:
			return getModel_1000Text(view);
		case AppReleationshipEditPart.VISUAL_ID:
			return getAppReleationship_4003Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getApplicationClient_3002Text(View view) {
		IParser parser = ModelParserProvider.getParser(
				ModelElementTypes.ApplicationClient_3002,
				view.getElement() != null ? view.getElement() : view,
				ModelVisualIDRegistry
						.getType(ApplicationClientNameEditPart.VISUAL_ID));
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
	private String getDataReleationship_4002Text(View view) {
		IParser parser = ModelParserProvider.getParser(
				ModelElementTypes.DataReleationship_4002,
				view.getElement() != null ? view.getElement() : view,
				ModelVisualIDRegistry
						.getType(DataReleationshipProtocolEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWebContainer_3003Text(View view) {
		IParser parser = ModelParserProvider.getParser(
				ModelElementTypes.WebContainer_3003,
				view.getElement() != null ? view.getElement() : view,
				ModelVisualIDRegistry
						.getType(WebContainerNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBrowser_3001Text(View view) {
		IParser parser = ModelParserProvider.getParser(
				ModelElementTypes.Browser_3001,
				view.getElement() != null ? view.getElement() : view,
				ModelVisualIDRegistry.getType(BrowserNameEditPart.VISUAL_ID));
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
	private String getWebReleationship_4001Text(View view) {
		IParser parser = ModelParserProvider.getParser(
				ModelElementTypes.WebReleationship_4001,
				view.getElement() != null ? view.getElement() : view,
				ModelVisualIDRegistry
						.getType(WebReleationshipProtocolEditPart.VISUAL_ID));
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
	private String getDatabase_2002Text(View view) {
		IParser parser = ModelParserProvider.getParser(
				ModelElementTypes.Database_2002,
				view.getElement() != null ? view.getElement() : view,
				ModelVisualIDRegistry.getType(DatabaseNameEditPart.VISUAL_ID));
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
	private String getJ2EEServer_2003Text(View view) {
		IParser parser = ModelParserProvider
				.getParser(ModelElementTypes.J2EEServer_2003,
						view.getElement() != null ? view.getElement() : view,
						ModelVisualIDRegistry
								.getType(J2EEServerNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAppReleationship_4003Text(View view) {
		IParser parser = ModelParserProvider.getParser(
				ModelElementTypes.AppReleationship_4003,
				view.getElement() != null ? view.getElement() : view,
				ModelVisualIDRegistry
						.getType(AppReleationshipProtocolEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEJBContainer_3004Text(View view) {
		IParser parser = ModelParserProvider.getParser(
				ModelElementTypes.EJBContainer_3004,
				view.getElement() != null ? view.getElement() : view,
				ModelVisualIDRegistry
						.getType(EJBContainerNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getContainerReleationship_4004Text(View view) {
		IParser parser = ModelParserProvider
				.getParser(
						ModelElementTypes.ContainerReleationship_4004,
						view.getElement() != null ? view.getElement() : view,
						ModelVisualIDRegistry
								.getType(ContainerReleationshipProtocolEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getModel_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getClient_2001Text(View view) {
		IParser parser = ModelParserProvider.getParser(
				ModelElementTypes.Client_2001,
				view.getElement() != null ? view.getElement() : view,
				ModelVisualIDRegistry.getType(ClientNameEditPart.VISUAL_ID));
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
		return ModelEditPart.MODEL_ID.equals(ModelVisualIDRegistry
				.getModelID(view));
	}

}
