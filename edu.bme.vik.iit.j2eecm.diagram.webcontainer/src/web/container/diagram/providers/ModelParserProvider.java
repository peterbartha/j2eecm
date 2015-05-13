package web.container.diagram.providers;

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

import web.container.diagram.edit.parts.EventCallName2EditPart;
import web.container.diagram.edit.parts.EventCallNameEditPart;
import web.container.diagram.edit.parts.ExceptionHandlingNameEditPart;
import web.container.diagram.edit.parts.HTML5NameEditPart;
import web.container.diagram.edit.parts.JSPPageNameEditPart;
import web.container.diagram.edit.parts.LinkElementLinkEditPart;
import web.container.diagram.edit.parts.ServletNameEditPart;
import web.container.diagram.edit.parts.StrutsNameEditPart;
import web.container.diagram.edit.parts.StrutsOperationNameEditPart;
import web.container.diagram.edit.parts.WebModelRelationshipLabelEditPart;
import web.container.diagram.edit.parts.XMLConfigNameEditPart;
import web.container.diagram.parsers.MessageFormatParser;
import web.container.diagram.part.ModelVisualIDRegistry;

import components.ComponentsPackage;

/**
 * @generated
 */
public class ModelParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser jSPPageName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getJSPPageName_5001Parser() {
		if (jSPPageName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentsPackage.eINSTANCE
					.getWebContainerElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			jSPPageName_5001Parser = parser;
		}
		return jSPPageName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser servletName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getServletName_5002Parser() {
		if (servletName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentsPackage.eINSTANCE
					.getWebContainerElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			servletName_5002Parser = parser;
		}
		return servletName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser hTML5Name_5007Parser;

	/**
	 * @generated
	 */
	private IParser getHTML5Name_5007Parser() {
		if (hTML5Name_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentsPackage.eINSTANCE
					.getStaticWebElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			hTML5Name_5007Parser = parser;
		}
		return hTML5Name_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser xMLConfigName_5008Parser;

	/**
	 * @generated
	 */
	private IParser getXMLConfigName_5008Parser() {
		if (xMLConfigName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentsPackage.eINSTANCE
					.getStaticWebElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			xMLConfigName_5008Parser = parser;
		}
		return xMLConfigName_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser strutsName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getStrutsName_5004Parser() {
		if (strutsName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentsPackage.eINSTANCE
					.getStruts_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			strutsName_5004Parser = parser;
		}
		return strutsName_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser linkElementLink_5006Parser;

	/**
	 * @generated
	 */
	private IParser getLinkElementLink_5006Parser() {
		if (linkElementLink_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentsPackage.eINSTANCE
					.getLinkElement_Link() };
			MessageFormatParser parser = new MessageFormatParser(features);
			linkElementLink_5006Parser = parser;
		}
		return linkElementLink_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser strutsOperationName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getStrutsOperationName_5005Parser() {
		if (strutsOperationName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentsPackage.eINSTANCE
					.getAction_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			strutsOperationName_5005Parser = parser;
		}
		return strutsOperationName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser eventCallName_5010Parser;

	/**
	 * @generated
	 */
	private IParser getEventCallName_5010Parser() {
		if (eventCallName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentsPackage.eINSTANCE
					.getAction_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			eventCallName_5010Parser = parser;
		}
		return eventCallName_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser exceptionHandlingName_5013Parser;

	/**
	 * @generated
	 */
	private IParser getExceptionHandlingName_5013Parser() {
		if (exceptionHandlingName_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentsPackage.eINSTANCE
					.getAction_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			exceptionHandlingName_5013Parser = parser;
		}
		return exceptionHandlingName_5013Parser;
	}

	/**
	 * @generated
	 */
	private IParser eventCallName_5015Parser;

	/**
	 * @generated
	 */
	private IParser getEventCallName_5015Parser() {
		if (eventCallName_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentsPackage.eINSTANCE
					.getAction_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			eventCallName_5015Parser = parser;
		}
		return eventCallName_5015Parser;
	}

	/**
	 * @generated
	 */
	private IParser webModelRelationshipLabel_6001Parser;

	/**
	 * @generated
	 */
	private IParser getWebModelRelationshipLabel_6001Parser() {
		if (webModelRelationshipLabel_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentsPackage.eINSTANCE
					.getwebModelRelationship_Label() };
			MessageFormatParser parser = new MessageFormatParser(features);
			webModelRelationshipLabel_6001Parser = parser;
		}
		return webModelRelationshipLabel_6001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case JSPPageNameEditPart.VISUAL_ID:
			return getJSPPageName_5001Parser();
		case ServletNameEditPart.VISUAL_ID:
			return getServletName_5002Parser();
		case HTML5NameEditPart.VISUAL_ID:
			return getHTML5Name_5007Parser();
		case XMLConfigNameEditPart.VISUAL_ID:
			return getXMLConfigName_5008Parser();
		case StrutsNameEditPart.VISUAL_ID:
			return getStrutsName_5004Parser();
		case LinkElementLinkEditPart.VISUAL_ID:
			return getLinkElementLink_5006Parser();
		case StrutsOperationNameEditPart.VISUAL_ID:
			return getStrutsOperationName_5005Parser();
		case EventCallNameEditPart.VISUAL_ID:
			return getEventCallName_5010Parser();
		case ExceptionHandlingNameEditPart.VISUAL_ID:
			return getExceptionHandlingName_5013Parser();
		case EventCallName2EditPart.VISUAL_ID:
			return getEventCallName_5015Parser();
		case WebModelRelationshipLabelEditPart.VISUAL_ID:
			return getWebModelRelationshipLabel_6001Parser();
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
