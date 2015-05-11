package components.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import components.diagram.edit.commands.Operation7CreateCommand;
import components.diagram.providers.ModelElementTypes;

/**
 * @generated
 */
public class ClassElementOpearionCompartment2ItemSemanticEditPolicy extends
		ModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ClassElementOpearionCompartment2ItemSemanticEditPolicy() {
		super(ModelElementTypes.ClassElement_3016);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ModelElementTypes.Operation_3015 == req.getElementType()) {
			return getGEFWrapper(new Operation7CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
