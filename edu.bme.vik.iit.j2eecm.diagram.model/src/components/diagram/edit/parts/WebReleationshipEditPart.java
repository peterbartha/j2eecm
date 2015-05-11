package components.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import components.diagram.edit.policies.WebReleationshipItemSemanticEditPolicy;

/**
 * @generated
 */
public class WebReleationshipEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4001;

	/**
	 * @generated
	 */
	public WebReleationshipEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new WebReleationshipItemSemanticEditPolicy());
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
		return new WebReleationshipFigure();
	}

	/**
	 * @generated
	 */
	public WebReleationshipFigure getPrimaryShape() {
		return (WebReleationshipFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class WebReleationshipFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureWebReleationshipNameFigure;

		/**
		 * @generated
		 */
		public WebReleationshipFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureWebReleationshipNameFigure = new WrappingLabel();

			fFigureWebReleationshipNameFigure.setText("<...>");

			this.add(fFigureWebReleationshipNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWebReleationshipNameFigure() {
			return fFigureWebReleationshipNameFigure;
		}

	}

}
