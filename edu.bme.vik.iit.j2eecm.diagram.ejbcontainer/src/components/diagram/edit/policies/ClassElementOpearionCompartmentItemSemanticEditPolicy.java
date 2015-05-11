package components.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import components.diagram.edit.commands.Operation8CreateCommand;
import components.diagram.providers.ModelElementTypes;

/**
 * @generated
 */
public class ClassElementOpearionCompartmentItemSemanticEditPolicy extends
		ModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ClassElementOpearionCompartmentItemSemanticEditPolicy() {
		super(ModelElementTypes.ClassElement_2011);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ModelElementTypes.Operation_3018 == req.getElementType()) {
			return getGEFWrapper(new Operation8CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
