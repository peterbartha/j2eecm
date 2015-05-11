package components.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
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
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.swt.graphics.Color;

import components.diagram.edit.policies.J2EEServerItemSemanticEditPolicy;
import components.diagram.part.ModelVisualIDRegistry;
import components.diagram.providers.ModelElementTypes;

/**
 * @generated
 */
public class J2EEServerEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2003;

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
	public J2EEServerEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(
						ModelVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new J2EEServerItemSemanticEditPolicy());
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
		return primaryShape = new J2EEServerFigure();
	}

	/**
	 * @generated
	 */
	public J2EEServerFigure getPrimaryShape() {
		return (J2EEServerFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof J2EEServerNameEditPart) {
			((J2EEServerNameEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureJ2EEServerNameFigure());
			return true;
		}
		if (childEditPart instanceof J2EEServerOsEditPart) {
			((J2EEServerOsEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureJ2EEServerOsFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof J2EEServerNameEditPart) {
			return true;
		}
		if (childEditPart instanceof J2EEServerOsEditPart) {
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
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(260, 360);
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
				.getType(J2EEServerNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ModelElementTypes.DataReleationship_4002);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof DatabaseEditPart) {
			types.add(ModelElementTypes.DataReleationship_4002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == ModelElementTypes.DataReleationship_4002) {
			types.add(ModelElementTypes.Database_2002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request)
					.getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter
					.getAdapter(IElementType.class);
			if (type == ModelElementTypes.WebContainer_3003) {
				return getChildBySemanticHint(ModelVisualIDRegistry
						.getType(J2EEServerWebContainerCompartmentEditPart.VISUAL_ID));
			}
			if (type == ModelElementTypes.EJBContainer_3004) {
				return getChildBySemanticHint(ModelVisualIDRegistry
						.getType(J2EEServerEJBContainerCompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class J2EEServerFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureJ2EEServerNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureJ2EEServerOsFigure;

		/**
		 * @generated
		 */
		public J2EEServerFigure() {
			this.setForegroundColor(THIS_FORE);
			this.setBackgroundColor(THIS_BACK);
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(260),
					getMapMode().DPtoLP(360)));
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure fig0 = new RectangleFigure();

			fig0.setOutline(false);
			fig0.setFill(false);
			fig0.setOpaque(false);

			this.add(fig0);

			GridLayout layoutFig0 = new GridLayout();
			layoutFig0.numColumns = 1;
			layoutFig0.makeColumnsEqualWidth = true;
			fig0.setLayoutManager(layoutFig0);

			WrappingLabel typeLabel1 = new WrappingLabel();

			typeLabel1.setText("«Business component tier»");

			GridData constraintTypeLabel1 = new GridData();
			constraintTypeLabel1.verticalAlignment = GridData.CENTER;
			constraintTypeLabel1.horizontalAlignment = GridData.CENTER;
			constraintTypeLabel1.horizontalIndent = 0;
			constraintTypeLabel1.horizontalSpan = 1;
			constraintTypeLabel1.verticalSpan = 1;
			constraintTypeLabel1.grabExcessHorizontalSpace = true;
			constraintTypeLabel1.grabExcessVerticalSpace = true;
			fig0.add(typeLabel1, constraintTypeLabel1);

			fFigureJ2EEServerNameFigure = new WrappingLabel();

			fFigureJ2EEServerNameFigure.setText("<...>");

			GridData constraintFFigureJ2EEServerNameFigure = new GridData();
			constraintFFigureJ2EEServerNameFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureJ2EEServerNameFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureJ2EEServerNameFigure.horizontalIndent = 0;
			constraintFFigureJ2EEServerNameFigure.horizontalSpan = 1;
			constraintFFigureJ2EEServerNameFigure.verticalSpan = 1;
			constraintFFigureJ2EEServerNameFigure.grabExcessHorizontalSpace = true;
			constraintFFigureJ2EEServerNameFigure.grabExcessVerticalSpace = true;
			fig0.add(fFigureJ2EEServerNameFigure,
					constraintFFigureJ2EEServerNameFigure);

			fFigureJ2EEServerOsFigure = new WrappingLabel();

			fFigureJ2EEServerOsFigure.setText("");

			GridData constraintFFigureJ2EEServerOsFigure = new GridData();
			constraintFFigureJ2EEServerOsFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureJ2EEServerOsFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureJ2EEServerOsFigure.horizontalIndent = 0;
			constraintFFigureJ2EEServerOsFigure.horizontalSpan = 1;
			constraintFFigureJ2EEServerOsFigure.verticalSpan = 1;
			constraintFFigureJ2EEServerOsFigure.grabExcessHorizontalSpace = true;
			constraintFFigureJ2EEServerOsFigure.grabExcessVerticalSpace = true;
			fig0.add(fFigureJ2EEServerOsFigure,
					constraintFFigureJ2EEServerOsFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureJ2EEServerNameFigure() {
			return fFigureJ2EEServerNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureJ2EEServerOsFigure() {
			return fFigureJ2EEServerOsFigure;
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
