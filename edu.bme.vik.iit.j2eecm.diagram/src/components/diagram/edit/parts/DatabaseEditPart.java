package components.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import components.diagram.edit.policies.DatabaseItemSemanticEditPolicy;
import components.diagram.part.ModelVisualIDRegistry;
import components.diagram.providers.ModelElementTypes;

/**
 * @generated
 */
public class DatabaseEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2002;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public DatabaseEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new DatabaseItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new DatabaseFigure();
	}

	/**
	 * @generated
	 */
	public DatabaseFigure getPrimaryShape() {
		return (DatabaseFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof DatabaseNameEditPart) {
			((DatabaseNameEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureDatabaseNameFigure());
			return true;
		}
		if (childEditPart instanceof DatabaseOsEditPart) {
			((DatabaseOsEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureDatabaseOsFigure());
			return true;
		}
		if (childEditPart instanceof DatabaseDatabaseEngineEditPart) {
			((DatabaseDatabaseEngineEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureDatabaseDatabaseEngineFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof DatabaseNameEditPart) {
			return true;
		}
		if (childEditPart instanceof DatabaseOsEditPart) {
			return true;
		}
		if (childEditPart instanceof DatabaseDatabaseEngineEditPart) {
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
		super.addChildVisual(childEditPart, -1);
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
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(130, 150);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(ModelVisualIDRegistry
				.getType(DatabaseNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ModelElementTypes.DataReleationship_4002);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == ModelElementTypes.DataReleationship_4002) {
			types.add(ModelElementTypes.J2EEServer_2003);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class DatabaseFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureDatabaseNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDatabaseOsFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDatabaseDatabaseEngineFigure;

		/**
		 * @generated
		 */
		public DatabaseFigure() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = true;
			this.setLayoutManager(layoutThis);

			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(20),
					getMapMode().DPtoLP(20)));
			this.setForegroundColor(THIS_FORE);
			this.setBackgroundColor(THIS_BACK);
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(130),
					getMapMode().DPtoLP(150)));
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			WrappingLabel typeLabel0 = new WrappingLabel();

			typeLabel0.setText("«Database»");

			GridData constraintTypeLabel0 = new GridData();
			constraintTypeLabel0.verticalAlignment = GridData.CENTER;
			constraintTypeLabel0.horizontalAlignment = GridData.CENTER;
			constraintTypeLabel0.horizontalIndent = 0;
			constraintTypeLabel0.horizontalSpan = 1;
			constraintTypeLabel0.verticalSpan = 1;
			constraintTypeLabel0.grabExcessHorizontalSpace = true;
			constraintTypeLabel0.grabExcessVerticalSpace = true;
			this.add(typeLabel0, constraintTypeLabel0);

			fFigureDatabaseNameFigure = new WrappingLabel();

			fFigureDatabaseNameFigure.setText("<...>");

			GridData constraintFFigureDatabaseNameFigure = new GridData();
			constraintFFigureDatabaseNameFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureDatabaseNameFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureDatabaseNameFigure.horizontalIndent = 0;
			constraintFFigureDatabaseNameFigure.horizontalSpan = 1;
			constraintFFigureDatabaseNameFigure.verticalSpan = 1;
			constraintFFigureDatabaseNameFigure.grabExcessHorizontalSpace = true;
			constraintFFigureDatabaseNameFigure.grabExcessVerticalSpace = true;
			this.add(fFigureDatabaseNameFigure,
					constraintFFigureDatabaseNameFigure);

			fFigureDatabaseOsFigure = new WrappingLabel();

			fFigureDatabaseOsFigure.setText("<...>");

			GridData constraintFFigureDatabaseOsFigure = new GridData();
			constraintFFigureDatabaseOsFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureDatabaseOsFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureDatabaseOsFigure.horizontalIndent = 0;
			constraintFFigureDatabaseOsFigure.horizontalSpan = 1;
			constraintFFigureDatabaseOsFigure.verticalSpan = 1;
			constraintFFigureDatabaseOsFigure.grabExcessHorizontalSpace = true;
			constraintFFigureDatabaseOsFigure.grabExcessVerticalSpace = true;
			this.add(fFigureDatabaseOsFigure, constraintFFigureDatabaseOsFigure);

			fFigureDatabaseDatabaseEngineFigure = new WrappingLabel();

			fFigureDatabaseDatabaseEngineFigure.setText("<...>");

			GridData constraintFFigureDatabaseDatabaseEngineFigure = new GridData();
			constraintFFigureDatabaseDatabaseEngineFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureDatabaseDatabaseEngineFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureDatabaseDatabaseEngineFigure.horizontalIndent = 0;
			constraintFFigureDatabaseDatabaseEngineFigure.horizontalSpan = 1;
			constraintFFigureDatabaseDatabaseEngineFigure.verticalSpan = 1;
			constraintFFigureDatabaseDatabaseEngineFigure.grabExcessHorizontalSpace = true;
			constraintFFigureDatabaseDatabaseEngineFigure.grabExcessVerticalSpace = true;
			this.add(fFigureDatabaseDatabaseEngineFigure,
					constraintFFigureDatabaseDatabaseEngineFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDatabaseNameFigure() {
			return fFigureDatabaseNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDatabaseOsFigure() {
			return fFigureDatabaseOsFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDatabaseDatabaseEngineFigure() {
			return fFigureDatabaseDatabaseEngineFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 170, 170, 170);

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 239, 239, 239);

}
