package ejb.container.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import ejb.container.diagram.edit.commands.Property2CreateCommand;
import ejb.container.diagram.providers.ModelElementTypes;

/**
 * @generated
 */
public class InterfaceElementPropertyCompartmentItemSemanticEditPolicy extends
		ModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public InterfaceElementPropertyCompartmentItemSemanticEditPolicy() {
		super(ModelElementTypes.InterfaceElement_2012);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ModelElementTypes.Property_3003 == req.getElementType()) {
			return getGEFWrapper(new Property2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
