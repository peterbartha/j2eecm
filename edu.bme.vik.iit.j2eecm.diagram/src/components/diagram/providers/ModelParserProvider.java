package components.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import components.ComponentsPackage;
import components.diagram.edit.parts.AppReleationshipProtocolEditPart;
import components.diagram.edit.parts.ApplicationClientLanguageEditPart;
import components.diagram.edit.parts.ApplicationClientNameEditPart;
import components.diagram.edit.parts.BrowserNameEditPart;
import components.diagram.edit.parts.ClientNameEditPart;
import components.diagram.edit.parts.ClientOsEditPart;
import components.diagram.edit.parts.ContainerReleationshipProtocolEditPart;
import components.diagram.edit.parts.DataReleationshipProtocolEditPart;
import components.diagram.edit.parts.DatabaseDatabaseEngineEditPart;
import components.diagram.edit.parts.DatabaseNameEditPart;
import components.diagram.edit.parts.DatabaseOsEditPart;
import components.diagram.edit.parts.EJBContainerNameEditPart;
import components.diagram.edit.parts.J2EEServerNameEditPart;
import components.diagram.edit.parts.J2EEServerOsEditPart;
import components.diagram.edit.parts.WebContainerNameEditPart;
import components.diagram.edit.parts.WebContainerServerAppEditPart;
import components.diagram.edit.parts.WebReleationshipProtocolEditPart;
import components.diagram.parsers.MessageFormatParser;
import components.diagram.part.ModelVisualIDRegistry;

/**
 * @generated
 */
public class ModelParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser clientName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getClientName_5004Parser() {
		if (clientName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentsPackage.eINSTANCE
					.getClient_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			clientName_5004Parser = parser;
		}
		return clientName_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser clientOs_5005Parser;

	/**
	 * @generated
	 */
	private IParser getClientOs_5005Parser() {
		if (clientOs_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentsPackage.eINSTANCE
					.getClient_Os() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("OS: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("OS: {0}"); //$NON-NLS-1$
			parser.setEditPattern("OS: {0}"); //$NON-NLS-1$
			clientOs_5005Parser = parser;
		}
		return clientOs_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser databaseName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getDatabaseName_5006Parser() {
		if (databaseName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentsPackage.eINSTANCE
					.getDatabase_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			databaseName_5006Parser = parser;
		}
		return databaseName_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser databaseOs_5007Parser;

	/**
	 * @generated
	 */
	private IParser getDatabaseOs_5007Parser() {
		if (databaseOs_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentsPackage.eINSTANCE
					.getDatabase_Os() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("OS: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("OS: {0}"); //$NON-NLS-1$
			parser.setEditPattern("OS: {0}"); //$NON-NLS-1$
			databaseOs_5007Parser = parser;
		}
		return databaseOs_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser databaseDatabaseEngine_5008Parser;

	/**
	 * @generated
	 */
	private IParser getDatabaseDatabaseEngine_5008Parser() {
		if (databaseDatabaseEngine_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentsPackage.eINSTANCE
					.getDatabase_DatabaseEngine() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Engine: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Engine: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Engine: {0}"); //$NON-NLS-1$
			databaseDatabaseEngine_5008Parser = parser;
		}
		return databaseDatabaseEngine_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser j2EEServerName_5012Parser;

	/**
	 * @generated
	 */
	private IParser getJ2EEServerName_5012Parser() {
		if (j2EEServerName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentsPackage.eINSTANCE
					.getJ2EEServer_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			j2EEServerName_5012Parser = parser;
		}
		return j2EEServerName_5012Parser;
	}

	/**
	 * @generated
	 */
	private IParser j2EEServerOs_5013Parser;

	/**
	 * @generated
	 */
	private IParser getJ2EEServerOs_5013Parser() {
		if (j2EEServerOs_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentsPackage.eINSTANCE
					.getJ2EEServer_Os() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("OS: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("OS: {0}"); //$NON-NLS-1$
			parser.setEditPattern("OS: {0}"); //$NON-NLS-1$
			j2EEServerOs_5013Parser = parser;
		}
		return j2EEServerOs_5013Parser;
	}

	/**
	 * @generated
	 */
	private IParser browserName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getBrowserName_5001Parser() {
		if (browserName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentsPackage.eINSTANCE
					.getBrowser_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			browserName_5001Parser = parser;
		}
		return browserName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser applicationClientName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getApplicationClientName_5002Parser() {
		if (applicationClientName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentsPackage.eINSTANCE
					.getApplicationClient_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			applicationClientName_5002Parser = parser;
		}
		return applicationClientName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser applicationClientLanguage_5003Parser;

	/**
	 * @generated
	 */
	private IParser getApplicationClientLanguage_5003Parser() {
		if (applicationClientLanguage_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentsPackage.eINSTANCE
					.getApplicationClient_Language() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("language: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("language: {0}"); //$NON-NLS-1$
			parser.setEditPattern("language: {0}"); //$NON-NLS-1$
			applicationClientLanguage_5003Parser = parser;
		}
		return applicationClientLanguage_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser webContainerName_5009Parser;

	/**
	 * @generated
	 */
	private IParser getWebContainerName_5009Parser() {
		if (webContainerName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentsPackage.eINSTANCE
					.getWebContainer_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			webContainerName_5009Parser = parser;
		}
		return webContainerName_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser webContainerServerApp_5010Parser;

	/**
	 * @generated
	 */
	private IParser getWebContainerServerApp_5010Parser() {
		if (webContainerServerApp_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentsPackage.eINSTANCE
					.getWebContainer_ServerApp() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Engine: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Engine: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Engine: {0}"); //$NON-NLS-1$
			webContainerServerApp_5010Parser = parser;
		}
		return webContainerServerApp_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser eJBContainerName_5011Parser;

	/**
	 * @generated
	 */
	private IParser getEJBContainerName_5011Parser() {
		if (eJBContainerName_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentsPackage.eINSTANCE
					.getEJBContainer_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			eJBContainerName_5011Parser = parser;
		}
		return eJBContainerName_5011Parser;
	}

	/**
	 * @generated
	 */
	private IParser webReleationshipProtocol_6001Parser;

	/**
	 * @generated
	 */
	private IParser getWebReleationshipProtocol_6001Parser() {
		if (webReleationshipProtocol_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentsPackage.eINSTANCE
					.getWebReleationship_Protocol() };
			MessageFormatParser parser = new MessageFormatParser(features);
			webReleationshipProtocol_6001Parser = parser;
		}
		return webReleationshipProtocol_6001Parser;
	}

	/**
	 * @generated
	 */
	private IParser dataReleationshipProtocol_6002Parser;

	/**
	 * @generated
	 */
	private IParser getDataReleationshipProtocol_6002Parser() {
		if (dataReleationshipProtocol_6002Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentsPackage.eINSTANCE
					.getDataReleationship_Protocol() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dataReleationshipProtocol_6002Parser = parser;
		}
		return dataReleationshipProtocol_6002Parser;
	}

	/**
	 * @generated
	 */
	private IParser appReleationshipProtocol_6003Parser;

	/**
	 * @generated
	 */
	private IParser getAppReleationshipProtocol_6003Parser() {
		if (appReleationshipProtocol_6003Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentsPackage.eINSTANCE
					.getAppReleationship_Protocol() };
			MessageFormatParser parser = new MessageFormatParser(features);
			appReleationshipProtocol_6003Parser = parser;
		}
		return appReleationshipProtocol_6003Parser;
	}

	/**
	 * @generated
	 */
	private IParser containerReleationshipProtocol_6004Parser;

	/**
	 * @generated
	 */
	private IParser getContainerReleationshipProtocol_6004Parser() {
		if (containerReleationshipProtocol_6004Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentsPackage.eINSTANCE
					.getContainerReleationship_Protocol() };
			MessageFormatParser parser = new MessageFormatParser(features);
			containerReleationshipProtocol_6004Parser = parser;
		}
		return containerReleationshipProtocol_6004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ClientNameEditPart.VISUAL_ID:
			return getClientName_5004Parser();
		case ClientOsEditPart.VISUAL_ID:
			return getClientOs_5005Parser();
		case DatabaseNameEditPart.VISUAL_ID:
			return getDatabaseName_5006Parser();
		case DatabaseOsEditPart.VISUAL_ID:
			return getDatabaseOs_5007Parser();
		case DatabaseDatabaseEngineEditPart.VISUAL_ID:
			return getDatabaseDatabaseEngine_5008Parser();
		case J2EEServerNameEditPart.VISUAL_ID:
			return getJ2EEServerName_5012Parser();
		case J2EEServerOsEditPart.VISUAL_ID:
			return getJ2EEServerOs_5013Parser();
		case BrowserNameEditPart.VISUAL_ID:
			return getBrowserName_5001Parser();
		case ApplicationClientNameEditPart.VISUAL_ID:
			return getApplicationClientName_5002Parser();
		case ApplicationClientLanguageEditPart.VISUAL_ID:
			return getApplicationClientLanguage_5003Parser();
		case WebContainerNameEditPart.VISUAL_ID:
			return getWebContainerName_5009Parser();
		case WebContainerServerAppEditPart.VISUAL_ID:
			return getWebContainerServerApp_5010Parser();
		case EJBContainerNameEditPart.VISUAL_ID:
			return getEJBContainerName_5011Parser();
		case WebReleationshipProtocolEditPart.VISUAL_ID:
			return getWebReleationshipProtocol_6001Parser();
		case DataReleationshipProtocolEditPart.VISUAL_ID:
			return getDataReleationshipProtocol_6002Parser();
		case AppReleationshipProtocolEditPart.VISUAL_ID:
			return getAppReleationshipProtocol_6003Parser();
		case ContainerReleationshipProtocolEditPart.VISUAL_ID:
			return getContainerReleationshipProtocol_6004Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(ModelVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(ModelVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (ModelElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
