package ejb.container.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import ejb.container.diagram.edit.commands.Property7CreateCommand;
import ejb.container.diagram.providers.ModelElementTypes;

/**
 * @generated
 */
public class ClassElementPropertyCompartment2ItemSemanticEditPolicy extends
		ModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ClassElementPropertyCompartment2ItemSemanticEditPolicy() {
		super(ModelElementTypes.ClassElement_3016);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ModelElementTypes.Property_3014 == req.getElementType()) {
			return getGEFWrapper(new Property7CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
