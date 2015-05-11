package components.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import components.diagram.edit.policies.ContainerReleationshipItemSemanticEditPolicy;

/**
 * @generated
 */
public class ContainerReleationshipEditPart extends ConnectionNodeEditPart
		implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4004;

	/**
	 * @generated
	 */
	public ContainerReleationshipEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ContainerReleationshipItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ContainerReleationshipProtocolEditPart) {
			((ContainerReleationshipProtocolEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureContainerReleationshipProtocolFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, index);
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ContainerReleationshipProtocolEditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new ContainerReleationshipFigure();
	}

	/**
	 * @generated
	 */
	public ContainerReleationshipFigure getPrimaryShape() {
		return (ContainerReleationshipFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class ContainerReleationshipFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureContainerReleationshipProtocolFigure;

		/**
		 * @generated
		 */
		public ContainerReleationshipFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureContainerReleationshipProtocolFigure = new WrappingLabel();

			fFigureContainerReleationshipProtocolFigure.setText("<...>");

			this.add(fFigureContainerReleationshipProtocolFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureContainerReleationshipProtocolFigure() {
			return fFigureContainerReleationshipProtocolFigure;
		}

	}

}
