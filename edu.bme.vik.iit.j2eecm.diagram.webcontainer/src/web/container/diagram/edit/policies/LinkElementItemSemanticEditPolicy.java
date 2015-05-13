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

import web.container.diagram.edit.commands.LinkRelationshipCreateCommand;
import web.container.diagram.edit.commands.LinkRelationshipReorientCommand;
import web.container.diagram.edit.commands.StrutsLinkRelationCreateCommand;
import web.container.diagram.edit.commands.StrutsLinkRelationReorientCommand;
import web.container.diagram.edit.parts.LinkRelationshipEditPart;
import web.container.diagram.edit.parts.StrutsLinkRelationEditPart;
import web.container.diagram.part.ModelVisualIDRegistry;
import web.container.diagram.providers.ModelElementTypes;

/**
 * @generated
 */
public class LinkElementItemSemanticEditPolicy extends
		ModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public LinkElementItemSemanticEditPolicy() {
		super(ModelElementTypes.LinkElement_3002);
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
			if (ModelVisualIDRegistry.getVisualID(outgoingLink) == LinkRelationshipEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ModelVisualIDRegistry.getVisualID(outgoingLink) == StrutsLinkRelationEditPart.VISUAL_ID) {
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
		if (ModelElementTypes.LinkRelationship_4003 == req.getElementType()) {
			return getGEFWrapper(new LinkRelationshipCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ModelElementTypes.StrutsLinkRelation_4004 == req.getElementType()) {
			return getGEFWrapper(new StrutsLinkRelationCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (ModelElementTypes.LinkRelationship_4003 == req.getElementType()) {
			return null;
		}
		if (ModelElementTypes.StrutsLinkRelation_4004 == req.getElementType()) {
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
		case LinkRelationshipEditPart.VISUAL_ID:
			return getGEFWrapper(new LinkRelationshipReorientCommand(req));
		case StrutsLinkRelationEditPart.VISUAL_ID:
			return getGEFWrapper(new StrutsLinkRelationReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
