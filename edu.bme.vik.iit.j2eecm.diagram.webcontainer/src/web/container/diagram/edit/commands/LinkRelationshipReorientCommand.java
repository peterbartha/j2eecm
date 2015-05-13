package web.container.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import web.container.diagram.edit.policies.ModelBaseItemSemanticEditPolicy;

import components.JSPPage;
import components.LinkElement;
import components.WebContainer;

/**
 * @generated
 */
public class LinkRelationshipReorientCommand extends EditElementCommand {

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
	public LinkRelationshipReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof components.linkRelationship) {
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
		if (!(oldEnd instanceof LinkElement && newEnd instanceof LinkElement)) {
			return false;
		}
		JSPPage target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof WebContainer)) {
			return false;
		}
		WebContainer container = (WebContainer) getLink().eContainer();
		return ModelBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistLinkRelationship_4003(container, getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof JSPPage && newEnd instanceof JSPPage)) {
			return false;
		}
		LinkElement source = getLink().getSource();
		if (!(getLink().eContainer() instanceof WebContainer)) {
			return false;
		}
		WebContainer container = (WebContainer) getLink().eContainer();
		return ModelBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistLinkRelationship_4003(container, getLink(), source,
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
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected components.linkRelationship getLink() {
		return (components.linkRelationship) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected LinkElement getOldSource() {
		return (LinkElement) oldEnd;
	}

	/**
	 * @generated
	 */
	protected LinkElement getNewSource() {
		return (LinkElement) newEnd;
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
