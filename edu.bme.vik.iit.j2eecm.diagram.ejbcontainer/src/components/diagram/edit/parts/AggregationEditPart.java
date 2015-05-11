package components.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import components.diagram.edit.policies.AggregationItemSemanticEditPolicy;

/**
 * @generated
 */
public class AggregationEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4003;

	/**
	 * @generated
	 */
	public AggregationEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new AggregationItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof AggregationNameEditPart) {
			((AggregationNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureAggregationNameFigure());
			return true;
		}
		if (childEditPart instanceof AggregationLowerBoundUpperBoundEditPart) {
			((AggregationLowerBoundUpperBoundEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureAggregationBoundFigure());
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
		if (childEditPart instanceof AggregationNameEditPart) {
			return true;
		}
		if (childEditPart instanceof AggregationLowerBoundUpperBoundEditPart) {
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
		return new AggregationFigure();
	}

	/**
	 * @generated
	 */
	public AggregationFigure getPrimaryShape() {
		return (AggregationFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class AggregationFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureAggregationNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureAggregationBoundFigure;

		/**
		 * @generated
		 */
		public AggregationFigure() {

			createContents();
			setSourceDecoration(createSourceDecoration());
			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureAggregationNameFigure = new WrappingLabel();

			fFigureAggregationNameFigure.setText("<...>");

			this.add(fFigureAggregationNameFigure);

			fFigureAggregationBoundFigure = new WrappingLabel();

			fFigureAggregationBoundFigure.setText("<...>");

			this.add(fFigureAggregationBoundFigure);

		}

		/**
		 * @generated NOT
		 */
		private RotatableDecoration createSourceDecoration() {
			PolygonDecoration df = new PolygonDecoration();
			df.setBackgroundColor(DF_BACK);
			PointList pl = new PointList();
			pl.addPoint(getMapMode().DPtoLP(-4), getMapMode().DPtoLP(2));
			pl.addPoint(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0));
			pl.addPoint(getMapMode().DPtoLP(-4), getMapMode().DPtoLP(-2));
			pl.addPoint(getMapMode().DPtoLP(-8), getMapMode().DPtoLP(0));
			df.setTemplate(pl);
			df.setScale(getMapMode().DPtoLP(4), getMapMode().DPtoLP(3));
			return df;
		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			PolylineDecoration df = new PolylineDecoration();
			return df;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAggregationNameFigure() {
			return fFigureAggregationNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAggregationBoundFigure() {
			return fFigureAggregationBoundFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color DF_BACK = new Color(null, 255, 255, 255);

}
