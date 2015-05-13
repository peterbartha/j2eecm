package web.container.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import web.container.diagram.edit.commands.ActionRelationshipCreateCommand;
import web.container.diagram.edit.commands.ActionRelationshipReorientCommand;
import web.container.diagram.edit.commands.StrutsRelationCreateCommand;
import web.container.diagram.edit.commands.StrutsRelationReorientCommand;
import web.container.diagram.edit.parts.ActionRelationshipEditPart;
import web.container.diagram.edit.parts.StrutsRelationEditPart;
import web.container.diagram.part.ModelVisualIDRegistry;
import web.container.diagram.providers.ModelElementTypes;

/**
 * @generated
 */
public class EventCallItemSemanticEditPolicy extends
		ModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public EventCallItemSemanticEditPolicy() {
		super(ModelElementTypes.EventCall_3004);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (ModelVisualIDRegistry.getVisualID(outgoingLink) == ActionRelationshipEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ModelVisualIDRegistry.getVisualID(outgoingLink) == StrutsRelationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (ModelElementTypes.ActionRelationship_4002 == req.getElementType()) {
			return getGEFWrapper(new ActionRelationshipCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ModelElementTypes.StrutsRelation_4005 == req.getElementType()) {
			return getGEFWrapper(new StrutsRelationCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (ModelElementTypes.ActionRelationship_4002 == req.getElementType()) {
			return null;
		}
		if (ModelElementTypes.StrutsRelation_4005 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case ActionRelationshipEditPart.VISUAL_ID:
			return getGEFWrapper(new ActionRelationshipReorientCommand(req));
		case StrutsRelationEditPart.VISUAL_ID:
			return getGEFWrapper(new StrutsRelationReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
