package ejb.container.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import components.ClassElement;
import components.EJBContainer;
import components.InterfaceElement;
import components.Realization;

import ejb.container.diagram.edit.policies.ModelBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class RealizationReorientCommand extends EditElementCommand {

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
	public RealizationReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Realization) {
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
		if (!(oldEnd instanceof ClassElement && newEnd instanceof ClassElement)) {
			return false;
		}
		InterfaceElement target = getLink().getInterfaceElem();
		if (!(getLink().eContainer() instanceof EJBContainer)) {
			return false;
		}
		EJBContainer container = (EJBContainer) getLink().eContainer();
		return ModelBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistRealization_4001(container, getLink(), getNewSource(),
						target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof InterfaceElement && newEnd instanceof InterfaceElement)) {
			return false;
		}
		ClassElement source = getLink().getClassElem();
		if (!(getLink().eContainer() instanceof EJBContainer)) {
			return false;
		}
		EJBContainer container = (EJBContainer) getLink().eContainer();
		return ModelBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistRealization_4001(container, getLink(), source,
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
		getLink().setClassElem(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setInterfaceElem(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected Realization getLink() {
		return (Realization) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected ClassElement getOldSource() {
		return (ClassElement) oldEnd;
	}

	/**
	 * @generated
	 */
	protected ClassElement getNewSource() {
		return (ClassElement) newEnd;
	}

	/**
	 * @generated
	 */
	protected InterfaceElement getOldTarget() {
		return (InterfaceElement) oldEnd;
	}

	/**
	 * @generated
	 */
	protected InterfaceElement getNewTarget() {
		return (InterfaceElement) newEnd;
	}
}
