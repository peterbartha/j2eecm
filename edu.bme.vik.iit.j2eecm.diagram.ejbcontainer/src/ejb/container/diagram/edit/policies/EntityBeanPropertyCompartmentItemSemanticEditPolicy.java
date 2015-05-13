package ejb.container.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import ejb.container.diagram.edit.commands.Property3CreateCommand;
import ejb.container.diagram.providers.ModelElementTypes;

/**
 * @generated
 */
public class EntityBeanPropertyCompartmentItemSemanticEditPolicy extends
		ModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public EntityBeanPropertyCompartmentItemSemanticEditPolicy() {
		super(ModelElementTypes.EntityBean_2002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ModelElementTypes.Property_3005 == req.getElementType()) {
			return getGEFWrapper(new Property3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
