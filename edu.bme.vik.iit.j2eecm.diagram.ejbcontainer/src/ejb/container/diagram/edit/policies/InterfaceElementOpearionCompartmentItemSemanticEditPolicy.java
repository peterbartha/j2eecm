package ejb.container.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import ejb.container.diagram.edit.commands.Operation2CreateCommand;
import ejb.container.diagram.providers.ModelElementTypes;

/**
 * @generated
 */
public class InterfaceElementOpearionCompartmentItemSemanticEditPolicy extends
		ModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public InterfaceElementOpearionCompartmentItemSemanticEditPolicy() {
		super(ModelElementTypes.InterfaceElement_2012);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ModelElementTypes.Operation_3004 == req.getElementType()) {
			return getGEFWrapper(new Operation2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
