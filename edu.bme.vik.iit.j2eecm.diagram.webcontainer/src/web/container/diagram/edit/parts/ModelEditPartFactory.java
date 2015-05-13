package web.container.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import web.container.diagram.part.ModelVisualIDRegistry;

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

			case WebContainerEditPart.VISUAL_ID:
				return new WebContainerEditPart(view);

			case JSPPageEditPart.VISUAL_ID:
				return new JSPPageEditPart(view);

			case JSPPageNameEditPart.VISUAL_ID:
				return new JSPPageNameEditPart(view);

			case ServletEditPart.VISUAL_ID:
				return new ServletEditPart(view);

			case ServletNameEditPart.VISUAL_ID:
				return new ServletNameEditPart(view);

			case HTML5EditPart.VISUAL_ID:
				return new HTML5EditPart(view);

			case HTML5NameEditPart.VISUAL_ID:
				return new HTML5NameEditPart(view);

			case XMLConfigEditPart.VISUAL_ID:
				return new XMLConfigEditPart(view);

			case XMLConfigNameEditPart.VISUAL_ID:
				return new XMLConfigNameEditPart(view);

			case StrutsEditPart.VISUAL_ID:
				return new StrutsEditPart(view);

			case StrutsNameEditPart.VISUAL_ID:
				return new StrutsNameEditPart(view);

			case StrutsGlobalEditPart.VISUAL_ID:
				return new StrutsGlobalEditPart(view);

			case LinkElementEditPart.VISUAL_ID:
				return new LinkElementEditPart(view);

			case LinkElementLinkEditPart.VISUAL_ID:
				return new LinkElementLinkEditPart(view);

			case StrutsOperationEditPart.VISUAL_ID:
				return new StrutsOperationEditPart(view);

			case StrutsOperationNameEditPart.VISUAL_ID:
				return new StrutsOperationNameEditPart(view);

			case EventCallEditPart.VISUAL_ID:
				return new EventCallEditPart(view);

			case EventCallNameEditPart.VISUAL_ID:
				return new EventCallNameEditPart(view);

			case ExceptionHandlingEditPart.VISUAL_ID:
				return new ExceptionHandlingEditPart(view);

			case ExceptionHandlingNameEditPart.VISUAL_ID:
				return new ExceptionHandlingNameEditPart(view);

			case EventCall2EditPart.VISUAL_ID:
				return new EventCall2EditPart(view);

			case EventCallName2EditPart.VISUAL_ID:
				return new EventCallName2EditPart(view);

			case JSPPageLinkElementCompartmentEditPart.VISUAL_ID:
				return new JSPPageLinkElementCompartmentEditPart(view);

			case StrutsStructsOperationCompartmentEditPart.VISUAL_ID:
				return new StrutsStructsOperationCompartmentEditPart(view);

			case StrutsExceptionHandlingCompartmentEditPart.VISUAL_ID:
				return new StrutsExceptionHandlingCompartmentEditPart(view);

			case StrutsExceptionHandlingCompartment2EditPart.VISUAL_ID:
				return new StrutsExceptionHandlingCompartment2EditPart(view);

			case StrutsGlobalEventCallCompartmentEditPart.VISUAL_ID:
				return new StrutsGlobalEventCallCompartmentEditPart(view);

			case StaticRelationshipEditPart.VISUAL_ID:
				return new StaticRelationshipEditPart(view);

			case ActionRelationshipEditPart.VISUAL_ID:
				return new ActionRelationshipEditPart(view);

			case LinkRelationshipEditPart.VISUAL_ID:
				return new LinkRelationshipEditPart(view);

			case StrutsLinkRelationEditPart.VISUAL_ID:
				return new StrutsLinkRelationEditPart(view);

			case StrutsRelationEditPart.VISUAL_ID:
				return new StrutsRelationEditPart(view);

			case WebModelRelationshipEditPart.VISUAL_ID:
				return new WebModelRelationshipEditPart(view);

			case WebModelRelationshipLabelEditPart.VISUAL_ID:
				return new WebModelRelationshipLabelEditPart(view);

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
