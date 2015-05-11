package components.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import components.diagram.edit.commands.Property4CreateCommand;
import components.diagram.providers.ModelElementTypes;

/**
 * @generated
 */
public class MessageDrivenBeanPropertyCompartmentItemSemanticEditPolicy extends
		ModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MessageDrivenBeanPropertyCompartmentItemSemanticEditPolicy() {
		super(ModelElementTypes.MessageDrivenBean_2003);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ModelElementTypes.Property_3007 == req.getElementType()) {
			return getGEFWrapper(new Property4CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
