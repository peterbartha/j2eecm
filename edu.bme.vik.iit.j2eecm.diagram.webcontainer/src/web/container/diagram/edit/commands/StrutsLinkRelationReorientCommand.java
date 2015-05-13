package web.container.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import web.container.diagram.edit.policies.ModelBaseItemSemanticEditPolicy;

import components.LinkElement;
import components.Struts;
import components.WebContainer;

/**
 * @generated
 */
public class StrutsLinkRelationReorientCommand extends EditElementCommand {

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
	public StrutsLinkRelationReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof components.strutsLinkRelation) {
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
		Struts target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof WebContainer)) {
			return false;
		}
		WebContainer container = (WebContainer) getLink().eContainer();
		return ModelBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistStrutsLinkRelation_4004(container, getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Struts && newEnd instanceof Struts)) {
			return false;
		}
		LinkElement source = getLink().getSource();
		if (!(getLink().eContainer() instanceof WebContainer)) {
			return false;
		}
		WebContainer container = (WebContainer) getLink().eContainer();
		return ModelBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistStrutsLinkRelation_4004(container, getLink(), source,
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
	protected components.strutsLinkRelation getLink() {
		return (components.strutsLinkRelation) getElementToEdit();
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
	protected Struts getOldTarget() {
		return (Struts) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Struts getNewTarget() {
		return (Struts) newEnd;
	}
}
