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
		paletteRoot.add(createServercomponents2Group());
		paletteRoot.add(createClientsphere3Group());
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
		paletteContainer.add(createClient1CreationTool());
		paletteContainer.add(createJ2EEServer2CreationTool());
		paletteContainer.add(createDatabase3CreationTool());
		paletteContainer.add(createDataReleationship4CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Server components" palette tool group
	 * @generated
	 */
	private PaletteContainer createServercomponents2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Servercomponents2Group_title);
		paletteContainer.setId("createServercomponents2Group"); //$NON-NLS-1$
		paletteContainer.add(createWebContainer1CreationTool());
		paletteContainer.add(createEJBContainer2CreationTool());
		paletteContainer.add(createContainerReleationship3CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Client sphere" palette tool group
	 * @generated
	 */
	private PaletteContainer createClientsphere3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Clientsphere3Group_title);
		paletteContainer.setId("createClientsphere3Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.Clientsphere3Group_desc);
		paletteContainer.add(createBrowser1CreationTool());
		paletteContainer.add(createApplication2CreationTool());
		paletteContainer.add(createWebReleationship3CreationTool());
		paletteContainer.add(createAppReleationship4CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createClient1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Client1CreationTool_title,
				Messages.Client1CreationTool_desc,
				Collections.singletonList(ModelElementTypes.Client_2001));
		entry.setId("createClient1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModelElementTypes
				.getImageDescriptor(ModelElementTypes.Client_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createJ2EEServer2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.J2EEServer2CreationTool_title,
				Messages.J2EEServer2CreationTool_desc,
				Collections.singletonList(ModelElementTypes.J2EEServer_2003));
		entry.setId("createJ2EEServer2CreationTool"); //$NON-NLS-1$
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
	private ToolEntry createDataReleationship4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.DataReleationship4CreationTool_title,
				Messages.DataReleationship4CreationTool_desc,
				Collections
						.singletonList(ModelElementTypes.DataReleationship_4002));
		entry.setId("createDataReleationship4CreationTool"); //$NON-NLS-1$
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
	private ToolEntry createContainerReleationship3CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.ContainerReleationship3CreationTool_title,
				Messages.ContainerReleationship3CreationTool_desc, null, null) {
		};
		entry.setId("createContainerReleationship3CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBrowser1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Browser1CreationTool_title,
				Messages.Browser1CreationTool_desc,
				Collections.singletonList(ModelElementTypes.Browser_3001));
		entry.setId("createBrowser1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModelElementTypes
				.getImageDescriptor(ModelElementTypes.Browser_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createApplication2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Application2CreationTool_title,
				Messages.Application2CreationTool_desc,
				Collections
						.singletonList(ModelElementTypes.ApplicationClient_3002));
		entry.setId("createApplication2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModelElementTypes
				.getImageDescriptor(ModelElementTypes.ApplicationClient_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWebReleationship3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.WebReleationship3CreationTool_title,
				Messages.WebReleationship3CreationTool_desc,
				Collections
						.singletonList(ModelElementTypes.WebReleationship_4001));
		entry.setId("createWebReleationship3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModelElementTypes
				.getImageDescriptor(ModelElementTypes.WebReleationship_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAppReleationship4CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.AppReleationship4CreationTool_title,
				Messages.AppReleationship4CreationTool_desc, null, null) {
		};
		entry.setId("createAppReleationship4CreationTool"); //$NON-NLS-1$
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
