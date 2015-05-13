package web.container.diagram.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import web.container.diagram.providers.ModelElementTypes;

/**
 * @generated
 */
public class ModelPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createElements1Group());
		paletteRoot.add(createFeatures2Group());
		paletteRoot.add(createStaticcontent3Group());
		paletteRoot.add(createLinks4Group());
	}

	/**
	 * Creates "Elements" palette tool group
	 * @generated
	 */
	private PaletteContainer createElements1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Elements1Group_title);
		paletteContainer.setId("createElements1Group"); //$NON-NLS-1$
		paletteContainer.add(createServlet1CreationTool());
		paletteContainer.add(createJSP2CreationTool());
		paletteContainer.add(createStruts3CreationTool());
		paletteContainer.add(createStrutsGlobal4CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Features" palette tool group
	 * @generated
	 */
	private PaletteContainer createFeatures2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Features2Group_title);
		paletteContainer.setId("createFeatures2Group"); //$NON-NLS-1$
		paletteContainer.add(createStrutsOperation1CreationTool());
		paletteContainer.add(createExceptionHandler2CreationTool());
		paletteContainer.add(createStrutsEvent3CreationTool());
		paletteContainer.add(createLink4CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Static content" palette tool group
	 * @generated
	 */
	private PaletteContainer createStaticcontent3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Staticcontent3Group_title);
		paletteContainer.setId("createStaticcontent3Group"); //$NON-NLS-1$
		paletteContainer.add(createXMLConfig1CreationTool());
		paletteContainer.add(createHTML52CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Links" palette tool group
	 * @generated
	 */
	private PaletteContainer createLinks4Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Links4Group_title);
		paletteContainer.setId("createLinks4Group"); //$NON-NLS-1$
		paletteContainer.add(createJSPAssociation1CreationTool());
		paletteContainer.add(createStructsactionlink2CreationTool());
		paletteContainer.add(createDescribes3CreationTool());
		paletteContainer.add(createJSPlinking4CreationTool());
		paletteContainer.add(createStrutsEventLink5CreationTool());
		paletteContainer.add(createStrutsAssociation6CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createServlet1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Servlet1CreationTool_title,
				Messages.Servlet1CreationTool_desc,
				Collections.singletonList(ModelElementTypes.Servlet_2002));
		entry.setId("createServlet1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModelElementTypes
				.getImageDescriptor(ModelElementTypes.Servlet_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createJSP2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.JSP2CreationTool_title,
				Messages.JSP2CreationTool_desc,
				Collections.singletonList(ModelElementTypes.JSPPage_2001));
		entry.setId("createJSP2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModelElementTypes
				.getImageDescriptor(ModelElementTypes.JSPPage_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStruts3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Struts3CreationTool_title,
				Messages.Struts3CreationTool_desc,
				Collections.singletonList(ModelElementTypes.Struts_2011));
		entry.setId("createStruts3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModelElementTypes
				.getImageDescriptor(ModelElementTypes.Struts_2011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStrutsGlobal4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.StrutsGlobal4CreationTool_title,
				Messages.StrutsGlobal4CreationTool_desc,
				Collections.singletonList(ModelElementTypes.StrutsGlobal_2014));
		entry.setId("createStrutsGlobal4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModelElementTypes
				.getImageDescriptor(ModelElementTypes.StrutsGlobal_2014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStrutsOperation1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.StrutsOperation1CreationTool_title,
				Messages.StrutsOperation1CreationTool_desc,
				Collections
						.singletonList(ModelElementTypes.StrutsOperation_3001));
		entry.setId("createStrutsOperation1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModelElementTypes
				.getImageDescriptor(ModelElementTypes.StrutsOperation_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createExceptionHandler2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ExceptionHandler2CreationTool_title,
				Messages.ExceptionHandler2CreationTool_desc,
				Collections
						.singletonList(ModelElementTypes.ExceptionHandling_3007));
		entry.setId("createExceptionHandler2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModelElementTypes
				.getImageDescriptor(ModelElementTypes.ExceptionHandling_3007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStrutsEvent3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ModelElementTypes.EventCall_3004);
		types.add(ModelElementTypes.EventCall_3009);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.StrutsEvent3CreationTool_title,
				Messages.StrutsEvent3CreationTool_desc, types);
		entry.setId("createStrutsEvent3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModelElementTypes
				.getImageDescriptor(ModelElementTypes.EventCall_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLink4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Link4CreationTool_title,
				Messages.Link4CreationTool_desc,
				Collections.singletonList(ModelElementTypes.LinkElement_3002));
		entry.setId("createLink4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModelElementTypes
				.getImageDescriptor(ModelElementTypes.LinkElement_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createXMLConfig1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.XMLConfig1CreationTool_title,
				Messages.XMLConfig1CreationTool_desc,
				Collections.singletonList(ModelElementTypes.XMLConfig_2006));
		entry.setId("createXMLConfig1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModelElementTypes
				.getImageDescriptor(ModelElementTypes.XMLConfig_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHTML52CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.HTML52CreationTool_title,
				Messages.HTML52CreationTool_desc,
				Collections.singletonList(ModelElementTypes.HTML5_2003));
		entry.setId("createHTML52CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModelElementTypes
				.getImageDescriptor(ModelElementTypes.HTML5_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createJSPAssociation1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.JSPAssociation1CreationTool_title,
				Messages.JSPAssociation1CreationTool_desc,
				Collections
						.singletonList(ModelElementTypes.WebModelRelationship_4006));
		entry.setId("createJSPAssociation1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModelElementTypes
				.getImageDescriptor(ModelElementTypes.WebModelRelationship_4006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStructsactionlink2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Structsactionlink2CreationTool_title,
				Messages.Structsactionlink2CreationTool_desc,
				Collections
						.singletonList(ModelElementTypes.ActionRelationship_4002));
		entry.setId("createStructsactionlink2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModelElementTypes
				.getImageDescriptor(ModelElementTypes.ActionRelationship_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDescribes3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Describes3CreationTool_title,
				Messages.Describes3CreationTool_desc,
				Collections
						.singletonList(ModelElementTypes.StaticRelationship_4001));
		entry.setId("createDescribes3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModelElementTypes
				.getImageDescriptor(ModelElementTypes.StaticRelationship_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createJSPlinking4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.JSPlinking4CreationTool_title,
				Messages.JSPlinking4CreationTool_desc,
				Collections
						.singletonList(ModelElementTypes.LinkRelationship_4003));
		entry.setId("createJSPlinking4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModelElementTypes
				.getImageDescriptor(ModelElementTypes.LinkRelationship_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStrutsEventLink5CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.StrutsEventLink5CreationTool_title,
				Messages.StrutsEventLink5CreationTool_desc,
				Collections
						.singletonList(ModelElementTypes.StrutsLinkRelation_4004));
		entry.setId("createStrutsEventLink5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModelElementTypes
				.getImageDescriptor(ModelElementTypes.StrutsLinkRelation_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStrutsAssociation6CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.StrutsAssociation6CreationTool_title,
				Messages.StrutsAssociation6CreationTool_desc,
				Collections
						.singletonList(ModelElementTypes.StrutsRelation_4005));
		entry.setId("createStrutsAssociation6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModelElementTypes
				.getImageDescriptor(ModelElementTypes.StrutsRelation_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
