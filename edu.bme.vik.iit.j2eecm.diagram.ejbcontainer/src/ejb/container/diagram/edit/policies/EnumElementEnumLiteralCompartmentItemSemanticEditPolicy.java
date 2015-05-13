package ejb.container.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import ejb.container.diagram.edit.commands.EnumLiteralCreateCommand;
import ejb.container.diagram.providers.ModelElementTypes;

/**
 * @generated
 */
public class EnumElementEnumLiteralCompartmentItemSemanticEditPolicy extends
		ModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public EnumElementEnumLiteralCompartmentItemSemanticEditPolicy() {
		super(ModelElementTypes.EnumElement_2013);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ModelElementTypes.EnumLiteral_3019 == req.getElementType()) {
			return getGEFWrapper(new EnumLiteralCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
