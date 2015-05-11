package components.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
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

import components.diagram.edit.policies.ApplicationClientItemSemanticEditPolicy;
import components.diagram.part.ModelVisualIDRegistry;
import components.diagram.providers.ModelElementTypes;

/**
 * @generated
 */
public class ApplicationClientEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3002;

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
	public ApplicationClientEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ApplicationClientItemSemanticEditPolicy());
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
		return primaryShape = new ApplicationClientFigure();
	}

	/**
	 * @generated
	 */
	public ApplicationClientFigure getPrimaryShape() {
		return (ApplicationClientFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ApplicationClientNameEditPart) {
			((ApplicationClientNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureApplicationClientNameFigure());
			return true;
		}
		if (childEditPart instanceof ApplicationClientLanguageEditPart) {
			((ApplicationClientLanguageEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureApplicationClientLanguageFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ApplicationClientNameEditPart) {
			return true;
		}
		if (childEditPart instanceof ApplicationClientLanguageEditPart) {
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
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(120, 120);
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
				.getType(ApplicationClientNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ModelElementTypes.AppReleationship_4003);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof EJBContainerEditPart) {
			types.add(ModelElementTypes.AppReleationship_4003);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == ModelElementTypes.AppReleationship_4003) {
			types.add(ModelElementTypes.EJBContainer_3004);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class ApplicationClientFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureApplicationClientNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureApplicationClientLanguageFigure;

		/**
		 * @generated
		 */
		public ApplicationClientFigure() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = true;
			this.setLayoutManager(layoutThis);

			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(120),
					getMapMode().DPtoLP(120)));
			this.setMaximumSize(new Dimension(getMapMode().DPtoLP(120),
					getMapMode().DPtoLP(120)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			WrappingLabel typeLabel0 = new WrappingLabel();

			typeLabel0.setText("«Application»");

			GridData constraintTypeLabel0 = new GridData();
			constraintTypeLabel0.verticalAlignment = GridData.CENTER;
			constraintTypeLabel0.horizontalAlignment = GridData.CENTER;
			constraintTypeLabel0.horizontalIndent = 0;
			constraintTypeLabel0.horizontalSpan = 1;
			constraintTypeLabel0.verticalSpan = 1;
			constraintTypeLabel0.grabExcessHorizontalSpace = true;
			constraintTypeLabel0.grabExcessVerticalSpace = true;
			this.add(typeLabel0, constraintTypeLabel0);

			fFigureApplicationClientNameFigure = new WrappingLabel();

			fFigureApplicationClientNameFigure.setText("<...>");

			GridData constraintFFigureApplicationClientNameFigure = new GridData();
			constraintFFigureApplicationClientNameFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureApplicationClientNameFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureApplicationClientNameFigure.horizontalIndent = 0;
			constraintFFigureApplicationClientNameFigure.horizontalSpan = 1;
			constraintFFigureApplicationClientNameFigure.verticalSpan = 1;
			constraintFFigureApplicationClientNameFigure.grabExcessHorizontalSpace = true;
			constraintFFigureApplicationClientNameFigure.grabExcessVerticalSpace = true;
			this.add(fFigureApplicationClientNameFigure,
					constraintFFigureApplicationClientNameFigure);

			fFigureApplicationClientLanguageFigure = new WrappingLabel();

			fFigureApplicationClientLanguageFigure.setText("<...>");

			GridData constraintFFigureApplicationClientLanguageFigure = new GridData();
			constraintFFigureApplicationClientLanguageFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureApplicationClientLanguageFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureApplicationClientLanguageFigure.horizontalIndent = 0;
			constraintFFigureApplicationClientLanguageFigure.horizontalSpan = 1;
			constraintFFigureApplicationClientLanguageFigure.verticalSpan = 1;
			constraintFFigureApplicationClientLanguageFigure.grabExcessHorizontalSpace = true;
			constraintFFigureApplicationClientLanguageFigure.grabExcessVerticalSpace = true;
			this.add(fFigureApplicationClientLanguageFigure,
					constraintFFigureApplicationClientLanguageFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureApplicationClientNameFigure() {
			return fFigureApplicationClientNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureApplicationClientLanguageFigure() {
			return fFigureApplicationClientLanguageFigure;
		}

	}

}
