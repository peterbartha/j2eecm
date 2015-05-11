package components.diagram.edit.parts;

import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
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

import components.diagram.edit.policies.ClientItemSemanticEditPolicy;
import components.diagram.part.ModelVisualIDRegistry;
import components.diagram.providers.ModelElementTypes;

/**
 * @generated
 */
public class ClientEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2001;

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
	public ClientEditPart(View view) {
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
				new ClientItemSemanticEditPolicy());
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
		return primaryShape = new ClientFigure();
	}

	/**
	 * @generated
	 */
	public ClientFigure getPrimaryShape() {
		return (ClientFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ClientNameEditPart) {
			((ClientNameEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureClientNameFigure());
			return true;
		}
		if (childEditPart instanceof ClientOsEditPart) {
			((ClientOsEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureClientOsFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ClientNameEditPart) {
			return true;
		}
		if (childEditPart instanceof ClientOsEditPart) {
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
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(180, 360);
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
				.getType(ClientNameEditPart.VISUAL_ID));
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
			if (type == ModelElementTypes.Browser_3001) {
				return getChildBySemanticHint(ModelVisualIDRegistry
						.getType(ClientBrowserCompartmentEditPart.VISUAL_ID));
			}
			if (type == ModelElementTypes.ApplicationClient_3002) {
				return getChildBySemanticHint(ModelVisualIDRegistry
						.getType(ClientApplicationCompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class ClientFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureClientNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClientOsFigure;

		/**
		 * @generated
		 */
		public ClientFigure() {
			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(20),
					getMapMode().DPtoLP(20)));
			this.setForegroundColor(THIS_FORE);
			this.setBackgroundColor(THIS_BACK);
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(180),
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

			typeLabel1.setText("«Client tier»");

			GridData constraintTypeLabel1 = new GridData();
			constraintTypeLabel1.verticalAlignment = GridData.CENTER;
			constraintTypeLabel1.horizontalAlignment = GridData.CENTER;
			constraintTypeLabel1.horizontalIndent = 0;
			constraintTypeLabel1.horizontalSpan = 1;
			constraintTypeLabel1.verticalSpan = 1;
			constraintTypeLabel1.grabExcessHorizontalSpace = true;
			constraintTypeLabel1.grabExcessVerticalSpace = true;
			fig0.add(typeLabel1, constraintTypeLabel1);

			fFigureClientNameFigure = new WrappingLabel();

			fFigureClientNameFigure.setText("<...>");

			GridData constraintFFigureClientNameFigure = new GridData();
			constraintFFigureClientNameFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureClientNameFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureClientNameFigure.horizontalIndent = 0;
			constraintFFigureClientNameFigure.horizontalSpan = 1;
			constraintFFigureClientNameFigure.verticalSpan = 1;
			constraintFFigureClientNameFigure.grabExcessHorizontalSpace = true;
			constraintFFigureClientNameFigure.grabExcessVerticalSpace = true;
			fig0.add(fFigureClientNameFigure, constraintFFigureClientNameFigure);

			fFigureClientOsFigure = new WrappingLabel();

			fFigureClientOsFigure.setText("");

			GridData constraintFFigureClientOsFigure = new GridData();
			constraintFFigureClientOsFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureClientOsFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureClientOsFigure.horizontalIndent = 0;
			constraintFFigureClientOsFigure.horizontalSpan = 1;
			constraintFFigureClientOsFigure.verticalSpan = 1;
			constraintFFigureClientOsFigure.grabExcessHorizontalSpace = true;
			constraintFFigureClientOsFigure.grabExcessVerticalSpace = true;
			fig0.add(fFigureClientOsFigure, constraintFFigureClientOsFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClientNameFigure() {
			return fFigureClientNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClientOsFigure() {
			return fFigureClientOsFigure;
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
