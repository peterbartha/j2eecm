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
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

import components.diagram.edit.policies.OpenDiagramEditPolicyWeb;
import components.diagram.edit.policies.WebContainerItemSemanticEditPolicy;
import components.diagram.part.ModelVisualIDRegistry;
import components.diagram.providers.ModelElementTypes;

/**
 * @generated
 */
public class WebContainerEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3003;

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
	public WebContainerEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new WebContainerItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE,
				new OpenDiagramEditPolicyWeb());
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
		return primaryShape = new WebContainerFigure();
	}

	/**
	 * @generated
	 */
	public WebContainerFigure getPrimaryShape() {
		return (WebContainerFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WebContainerNameEditPart) {
			((WebContainerNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureWebContainerNameFigure());
			return true;
		}
		if (childEditPart instanceof WebContainerServerAppEditPart) {
			((WebContainerServerAppEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureWebContainerServerAppFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WebContainerNameEditPart) {
			return true;
		}
		if (childEditPart instanceof WebContainerServerAppEditPart) {
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
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(120, 100);
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
				.getType(WebContainerNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ModelElementTypes.ContainerReleationship_4004);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof EJBContainerEditPart) {
			types.add(ModelElementTypes.ContainerReleationship_4004);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == ModelElementTypes.ContainerReleationship_4004) {
			types.add(ModelElementTypes.EJBContainer_3004);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ModelElementTypes.WebReleationship_4001);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == ModelElementTypes.WebReleationship_4001) {
			types.add(ModelElementTypes.Browser_3001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class WebContainerFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureWebContainerNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWebContainerServerAppFigure;

		/**
		 * @generated
		 */
		public WebContainerFigure() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = true;
			this.setLayoutManager(layoutThis);

			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(120),
					getMapMode().DPtoLP(100)));
			this.setMaximumSize(new Dimension(getMapMode().DPtoLP(120),
					getMapMode().DPtoLP(120)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureWebContainerNameFigure = new WrappingLabel();

			fFigureWebContainerNameFigure.setText("<...>");

			GridData constraintFFigureWebContainerNameFigure = new GridData();
			constraintFFigureWebContainerNameFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureWebContainerNameFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureWebContainerNameFigure.horizontalIndent = 0;
			constraintFFigureWebContainerNameFigure.horizontalSpan = 1;
			constraintFFigureWebContainerNameFigure.verticalSpan = 1;
			constraintFFigureWebContainerNameFigure.grabExcessHorizontalSpace = true;
			constraintFFigureWebContainerNameFigure.grabExcessVerticalSpace = true;
			this.add(fFigureWebContainerNameFigure,
					constraintFFigureWebContainerNameFigure);

			fFigureWebContainerServerAppFigure = new WrappingLabel();

			fFigureWebContainerServerAppFigure.setText("<...>");

			GridData constraintFFigureWebContainerServerAppFigure = new GridData();
			constraintFFigureWebContainerServerAppFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureWebContainerServerAppFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureWebContainerServerAppFigure.horizontalIndent = 0;
			constraintFFigureWebContainerServerAppFigure.horizontalSpan = 1;
			constraintFFigureWebContainerServerAppFigure.verticalSpan = 1;
			constraintFFigureWebContainerServerAppFigure.grabExcessHorizontalSpace = true;
			constraintFFigureWebContainerServerAppFigure.grabExcessVerticalSpace = true;
			this.add(fFigureWebContainerServerAppFigure,
					constraintFFigureWebContainerServerAppFigure);

			WrappingLabel doubleClickHelper0 = new WrappingLabel();

			doubleClickHelper0.setText("Double click to open");

			doubleClickHelper0.setFont(DOUBLECLICKHELPER0_FONT);

			GridData constraintDoubleClickHelper0 = new GridData();
			constraintDoubleClickHelper0.verticalAlignment = GridData.CENTER;
			constraintDoubleClickHelper0.horizontalAlignment = GridData.CENTER;
			constraintDoubleClickHelper0.horizontalIndent = 0;
			constraintDoubleClickHelper0.horizontalSpan = 1;
			constraintDoubleClickHelper0.verticalSpan = 1;
			constraintDoubleClickHelper0.grabExcessHorizontalSpace = true;
			constraintDoubleClickHelper0.grabExcessVerticalSpace = true;
			this.add(doubleClickHelper0, constraintDoubleClickHelper0);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWebContainerNameFigure() {
			return fFigureWebContainerNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWebContainerServerAppFigure() {
			return fFigureWebContainerServerAppFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Font DOUBLECLICKHELPER0_FONT = new Font(Display.getCurrent(),
			Display.getDefault().getSystemFont().getFontData()[0].getName(), 9,
			SWT.ITALIC);

}
