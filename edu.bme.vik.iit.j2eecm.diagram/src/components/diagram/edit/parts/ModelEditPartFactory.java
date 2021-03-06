package components.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import components.diagram.part.ModelVisualIDRegistry;

/**
 * @generated
 */
public class ModelEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (ModelVisualIDRegistry.getVisualID(view)) {

			case ModelEditPart.VISUAL_ID:
				return new ModelEditPart(view);

			case ClientEditPart.VISUAL_ID:
				return new ClientEditPart(view);

			case ClientNameEditPart.VISUAL_ID:
				return new ClientNameEditPart(view);

			case ClientOsEditPart.VISUAL_ID:
				return new ClientOsEditPart(view);

			case DatabaseEditPart.VISUAL_ID:
				return new DatabaseEditPart(view);

			case DatabaseNameEditPart.VISUAL_ID:
				return new DatabaseNameEditPart(view);

			case DatabaseOsEditPart.VISUAL_ID:
				return new DatabaseOsEditPart(view);

			case DatabaseDatabaseEngineEditPart.VISUAL_ID:
				return new DatabaseDatabaseEngineEditPart(view);

			case J2EEServerEditPart.VISUAL_ID:
				return new J2EEServerEditPart(view);

			case J2EEServerNameEditPart.VISUAL_ID:
				return new J2EEServerNameEditPart(view);

			case J2EEServerOsEditPart.VISUAL_ID:
				return new J2EEServerOsEditPart(view);

			case BrowserEditPart.VISUAL_ID:
				return new BrowserEditPart(view);

			case BrowserNameEditPart.VISUAL_ID:
				return new BrowserNameEditPart(view);

			case ApplicationClientEditPart.VISUAL_ID:
				return new ApplicationClientEditPart(view);

			case ApplicationClientNameEditPart.VISUAL_ID:
				return new ApplicationClientNameEditPart(view);

			case ApplicationClientLanguageEditPart.VISUAL_ID:
				return new ApplicationClientLanguageEditPart(view);

			case WebContainerEditPart.VISUAL_ID:
				return new WebContainerEditPart(view);

			case WebContainerNameEditPart.VISUAL_ID:
				return new WebContainerNameEditPart(view);

			case WebContainerServerAppEditPart.VISUAL_ID:
				return new WebContainerServerAppEditPart(view);

			case EJBContainerEditPart.VISUAL_ID:
				return new EJBContainerEditPart(view);

			case EJBContainerNameEditPart.VISUAL_ID:
				return new EJBContainerNameEditPart(view);

			case ClientBrowserCompartmentEditPart.VISUAL_ID:
				return new ClientBrowserCompartmentEditPart(view);

			case ClientApplicationCompartmentEditPart.VISUAL_ID:
				return new ClientApplicationCompartmentEditPart(view);

			case J2EEServerWebContainerCompartmentEditPart.VISUAL_ID:
				return new J2EEServerWebContainerCompartmentEditPart(view);

			case J2EEServerEJBContainerCompartmentEditPart.VISUAL_ID:
				return new J2EEServerEJBContainerCompartmentEditPart(view);

			case WebReleationshipEditPart.VISUAL_ID:
				return new WebReleationshipEditPart(view);

			case WebReleationshipProtocolEditPart.VISUAL_ID:
				return new WebReleationshipProtocolEditPart(view);

			case DataReleationshipEditPart.VISUAL_ID:
				return new DataReleationshipEditPart(view);

			case DataReleationshipProtocolEditPart.VISUAL_ID:
				return new DataReleationshipProtocolEditPart(view);

			case AppReleationshipEditPart.VISUAL_ID:
				return new AppReleationshipEditPart(view);

			case AppReleationshipProtocolEditPart.VISUAL_ID:
				return new AppReleationshipProtocolEditPart(view);

			case ContainerReleationshipEditPart.VISUAL_ID:
				return new ContainerReleationshipEditPart(view);

			case ContainerReleationshipProtocolEditPart.VISUAL_ID:
				return new ContainerReleationshipProtocolEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
