package components.diagram.part;

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

import components.diagram.providers.ModelElementTypes;

/**
 * @generated
 */
public class ModelPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createPhysicallayers1Group());
		paletteRoot.add(createBusinesscomponenttier2Group());
		paletteRoot.add(createClienttier3Group());
	}

	/**
	 * Creates "Physical layers" palette tool group
	 * @generated
	 */
	private PaletteContainer createPhysicallayers1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Physicallayers1Group_title);
		paletteContainer.setId("createPhysicallayers1Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.Physicallayers1Group_desc);
		paletteContainer.add(createClienttier1CreationTool());
		paletteContainer.add(createBusinesstier2CreationTool());
		paletteContainer.add(createDatabase3CreationTool());
		paletteContainer.add(createDatabaseconnection4CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Business component tier" palette tool group
	 * @generated
	 */
	private PaletteContainer createBusinesscomponenttier2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Businesscomponenttier2Group_title);
		paletteContainer.setId("createBusinesscomponenttier2Group"); //$NON-NLS-1$
		paletteContainer.add(createWebContainer1CreationTool());
		paletteContainer.add(createEJBContainer2CreationTool());
		paletteContainer.add(createContainerlink3CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Client tier" palette tool group
	 * @generated
	 */
	private PaletteContainer createClienttier3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Clienttier3Group_title);
		paletteContainer.setId("createClienttier3Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.Clienttier3Group_desc);
		paletteContainer.add(createBrowserclient1CreationTool());
		paletteContainer.add(createApplicationclient2CreationTool());
		paletteContainer.add(createWebconnection3CreationTool());
		paletteContainer.add(createApplicationconnection4CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createClienttier1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Clienttier1CreationTool_title,
				Messages.Clienttier1CreationTool_desc,
				Collections.singletonList(ModelElementTypes.Client_2001));
		entry.setId("createClienttier1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModelElementTypes
				.getImageDescriptor(ModelElementTypes.Client_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBusinesstier2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Businesstier2CreationTool_title,
				Messages.Businesstier2CreationTool_desc,
				Collections.singletonList(ModelElementTypes.J2EEServer_2003));
		entry.setId("createBusinesstier2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModelElementTypes
				.getImageDescriptor(ModelElementTypes.J2EEServer_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDatabase3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Database3CreationTool_title,
				Messages.Database3CreationTool_desc,
				Collections.singletonList(ModelElementTypes.Database_2002));
		entry.setId("createDatabase3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModelElementTypes
				.getImageDescriptor(ModelElementTypes.Database_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDatabaseconnection4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Databaseconnection4CreationTool_title,
				Messages.Databaseconnection4CreationTool_desc,
				Collections
						.singletonList(ModelElementTypes.DataReleationship_4002));
		entry.setId("createDatabaseconnection4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModelElementTypes
				.getImageDescriptor(ModelElementTypes.DataReleationship_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWebContainer1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.WebContainer1CreationTool_title,
				Messages.WebContainer1CreationTool_desc,
				Collections.singletonList(ModelElementTypes.WebContainer_3003));
		entry.setId("createWebContainer1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModelElementTypes
				.getImageDescriptor(ModelElementTypes.WebContainer_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEJBContainer2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.EJBContainer2CreationTool_title,
				Messages.EJBContainer2CreationTool_desc,
				Collections.singletonList(ModelElementTypes.EJBContainer_3004));
		entry.setId("createEJBContainer2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModelElementTypes
				.getImageDescriptor(ModelElementTypes.EJBContainer_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createContainerlink3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Containerlink3CreationTool_title,
				Messages.Containerlink3CreationTool_desc,
				Collections
						.singletonList(ModelElementTypes.ContainerReleationship_4004));
		entry.setId("createContainerlink3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModelElementTypes
				.getImageDescriptor(ModelElementTypes.ContainerReleationship_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBrowserclient1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Browserclient1CreationTool_title,
				Messages.Browserclient1CreationTool_desc,
				Collections.singletonList(ModelElementTypes.Browser_3001));
		entry.setId("createBrowserclient1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModelElementTypes
				.getImageDescriptor(ModelElementTypes.Browser_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createApplicationclient2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Applicationclient2CreationTool_title,
				Messages.Applicationclient2CreationTool_desc,
				Collections
						.singletonList(ModelElementTypes.ApplicationClient_3002));
		entry.setId("createApplicationclient2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModelElementTypes
				.getImageDescriptor(ModelElementTypes.ApplicationClient_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWebconnection3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Webconnection3CreationTool_title,
				Messages.Webconnection3CreationTool_desc,
				Collections
						.singletonList(ModelElementTypes.WebReleationship_4001));
		entry.setId("createWebconnection3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModelElementTypes
				.getImageDescriptor(ModelElementTypes.WebReleationship_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createApplicationconnection4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Applicationconnection4CreationTool_title,
				Messages.Applicationconnection4CreationTool_desc,
				Collections
						.singletonList(ModelElementTypes.AppReleationship_4003));
		entry.setId("createApplicationconnection4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModelElementTypes
				.getImageDescriptor(ModelElementTypes.AppReleationship_4003));
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
