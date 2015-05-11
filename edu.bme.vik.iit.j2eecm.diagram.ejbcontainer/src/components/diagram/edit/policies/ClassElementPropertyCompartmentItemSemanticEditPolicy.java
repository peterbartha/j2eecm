package components.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import components.diagram.edit.commands.Property8CreateCommand;
import components.diagram.providers.ModelElementTypes;

/**
 * @generated
 */
public class ClassElementPropertyCompartmentItemSemanticEditPolicy extends
		ModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ClassElementPropertyCompartmentItemSemanticEditPolicy() {
		super(ModelElementTypes.ClassElement_2011);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ModelElementTypes.Property_3017 == req.getElementType()) {
			return getGEFWrapper(new Property8CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
