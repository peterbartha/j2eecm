package ejb.container.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import ejb.container.diagram.edit.commands.Operation3CreateCommand;
import ejb.container.diagram.providers.ModelElementTypes;

/**
 * @generated
 */
public class EntityBeanOpearionCompartmentItemSemanticEditPolicy extends
		ModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public EntityBeanOpearionCompartmentItemSemanticEditPolicy() {
		super(ModelElementTypes.EntityBean_2002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ModelElementTypes.Operation_3006 == req.getElementType()) {
			return getGEFWrapper(new Operation3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
