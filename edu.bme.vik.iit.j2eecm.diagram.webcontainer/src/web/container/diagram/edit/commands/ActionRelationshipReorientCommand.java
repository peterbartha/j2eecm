package web.container.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import web.container.diagram.edit.policies.ModelBaseItemSemanticEditPolicy;

import components.Action;
import components.ActionRelationship;
import components.JSPPage;
import components.WebContainer;

/**
 * @generated
 */
public class ActionRelationshipReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public ActionRelationshipReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof ActionRelationship) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Action && newEnd instanceof Action)) {
			return false;
		}
		JSPPage target = getLink().getPageElem();
		if (!(getLink().eContainer() instanceof WebContainer)) {
			return false;
		}
		WebContainer container = (WebContainer) getLink().eContainer();
		return ModelBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistActionRelationship_4002(container, getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof JSPPage && newEnd instanceof JSPPage)) {
			return false;
		}
		Action source = getLink().getActionElem();
		if (!(getLink().eContainer() instanceof WebContainer)) {
			return false;
		}
		WebContainer container = (WebContainer) getLink().eContainer();
		return ModelBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistActionRelationship_4002(container, getLink(), source,
						getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setActionElem(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setPageElem(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected ActionRelationship getLink() {
		return (ActionRelationship) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Action getOldSource() {
		return (Action) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Action getNewSource() {
		return (Action) newEnd;
	}

	/**
	 * @generated
	 */
	protected JSPPage getOldTarget() {
		return (JSPPage) oldEnd;
	}

	/**
	 * @generated
	 */
	protected JSPPage getNewTarget() {
		return (JSPPage) newEnd;
	}
}
