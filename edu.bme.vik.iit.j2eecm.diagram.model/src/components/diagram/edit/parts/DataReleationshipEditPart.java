package components.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import components.diagram.edit.policies.DataReleationshipItemSemanticEditPolicy;

/**
 * @generated
 */
public class DataReleationshipEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4002;

	/**
	 * @generated
	 */
	public DataReleationshipEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new DataReleationshipItemSemanticEditPolicy());
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
		return new DataReleationshipFigure();
	}

	/**
	 * @generated
	 */
	public DataReleationshipFigure getPrimaryShape() {
		return (DataReleationshipFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class DataReleationshipFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureDataReleationshipProtocolFigure;

		/**
		 * @generated
		 */
		public DataReleationshipFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureDataReleationshipProtocolFigure = new WrappingLabel();

			fFigureDataReleationshipProtocolFigure.setText("<...>");

			this.add(fFigureDataReleationshipProtocolFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDataReleationshipProtocolFigure() {
			return fFigureDataReleationshipProtocolFigure;
		}

	}

}
