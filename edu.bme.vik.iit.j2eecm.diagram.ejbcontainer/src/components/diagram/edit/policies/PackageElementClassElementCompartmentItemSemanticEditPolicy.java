package components.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import components.diagram.edit.commands.ClassElement2CreateCommand;
import components.diagram.providers.ModelElementTypes;

/**
 * @generated
 */
public class PackageElementClassElementCompartmentItemSemanticEditPolicy extends
		ModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public PackageElementClassElementCompartmentItemSemanticEditPolicy() {
		super(ModelElementTypes.PackageElement_2009);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ModelElementTypes.ClassElement_3016 == req.getElementType()) {
			return getGEFWrapper(new ClassElement2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
