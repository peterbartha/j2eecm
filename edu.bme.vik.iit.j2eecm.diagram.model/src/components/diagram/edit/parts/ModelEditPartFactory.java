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

			case DatabaseEditPart.VISUAL_ID:
				return new DatabaseEditPart(view);

			case J2EEServerEditPart.VISUAL_ID:
				return new J2EEServerEditPart(view);

			case BrowserEditPart.VISUAL_ID:
				return new BrowserEditPart(view);

			case ApplicationClientEditPart.VISUAL_ID:
				return new ApplicationClientEditPart(view);

			case WebContainerEditPart.VISUAL_ID:
				return new WebContainerEditPart(view);

			case EJBContainerEditPart.VISUAL_ID:
				return new EJBContainerEditPart(view);

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

			case DataReleationshipEditPart.VISUAL_ID:
				return new DataReleationshipEditPart(view);

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
