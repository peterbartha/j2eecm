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
import org.eclipse.gmf.tooling.runtime.parsers.EnumParser;

import components.ComponentsPackage;
import components.diagram.edit.parts.AggregationLowerBoundUpperBoundEditPart;
import components.diagram.edit.parts.AggregationNameEditPart;
import components.diagram.edit.parts.AssociationLowerBoundUpperBoundEditPart;
import components.diagram.edit.parts.AssociationNameEditPart;
import components.diagram.edit.parts.ClassElementName2EditPart;
import components.diagram.edit.parts.ClassElementNameEditPart;
import components.diagram.edit.parts.EntityBeanNameEditPart;
import components.diagram.edit.parts.EntityBeanVisibilityEditPart;
import components.diagram.edit.parts.InterfaceElementNameEditPart;
import components.diagram.edit.parts.MessageDrivenBeanNameEditPart;
import components.diagram.edit.parts.MessageDrivenBeanVisibilityEditPart;
import components.diagram.edit.parts.OperationNameParametersOpeartion2EditPart;
import components.diagram.edit.parts.OperationNameParametersOpeartion3EditPart;
import components.diagram.edit.parts.OperationNameParametersOpeartion4EditPart;
import components.diagram.edit.parts.OperationNameParametersOpeartion5EditPart;
import components.diagram.edit.parts.OperationNameParametersOpeartion6EditPart;
import components.diagram.edit.parts.OperationNameParametersOpeartionEditPart;
import components.diagram.edit.parts.OperationNameVisibilityEditPart;
import components.diagram.edit.parts.PackageElementNameEditPart;
import components.diagram.edit.parts.PropertyNamePropertyType2EditPart;
import components.diagram.edit.parts.PropertyNamePropertyType3EditPart;
import components.diagram.edit.parts.PropertyNamePropertyType4EditPart;
import components.diagram.edit.parts.PropertyNamePropertyType5EditPart;
import components.diagram.edit.parts.PropertyNamePropertyType6EditPart;
import components.diagram.edit.parts.PropertyNamePropertyTypeEditPart;
import components.diagram.edit.parts.PropertyNameVisibilityEditPart;
import components.diagram.edit.parts.StatefulSessionBeanNameEditPart;
import components.diagram.edit.parts.StatefulSessionBeanVisibilityEditPart;
import components.diagram.edit.parts.StatelessSessionBeanNameEditPart;
import components.diagram.edit.parts.StatelessSessionBeanVisibilityEditPart;
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
	private IParser interfaceElementName_5012Parser;

	/**
	 * @generated
	 */
	private IParser getInterfaceElementName_5012Parser() {
		if (interfaceElementName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentsPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			interfaceElementName_5012Parser = parser;
		}
		return interfaceElementName_5012Parser;
	}

	/**
	 * @generated
	 */
	private IParser entityBeanName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getEntityBeanName_5002Parser() {
		if (entityBeanName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentsPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			entityBeanName_5002Parser = parser;
		}
		return entityBeanName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser entityBeanViewType_5020Parser;

	/**
	 * @generated
	 */
	private IParser getEntityBeanViewType_5020Parser() {
		if (entityBeanViewType_5020Parser == null) {
			EAttribute editableFeature = ComponentsPackage.eINSTANCE
					.getEJB_ViewType();
			EnumParser parser = new EnumParser(editableFeature);
			entityBeanViewType_5020Parser = parser;
		}
		return entityBeanViewType_5020Parser;
	}

	/**
	 * @generated
	 */
	private IParser messageDrivenBeanName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getMessageDrivenBeanName_5003Parser() {
		if (messageDrivenBeanName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentsPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			messageDrivenBeanName_5003Parser = parser;
		}
		return messageDrivenBeanName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser messageDrivenBeanViewType_5023Parser;

	/**
	 * @generated
	 */
	private IParser getMessageDrivenBeanViewType_5023Parser() {
		if (messageDrivenBeanViewType_5023Parser == null) {
			EAttribute editableFeature = ComponentsPackage.eINSTANCE
					.getEJB_ViewType();
			EnumParser parser = new EnumParser(editableFeature);
			messageDrivenBeanViewType_5023Parser = parser;
		}
		return messageDrivenBeanViewType_5023Parser;
	}

	/**
	 * @generated
	 */
	private IParser statefulSessionBeanName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getStatefulSessionBeanName_5006Parser() {
		if (statefulSessionBeanName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentsPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			statefulSessionBeanName_5006Parser = parser;
		}
		return statefulSessionBeanName_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser statefulSessionBeanViewType_5026Parser;

	/**
	 * @generated
	 */
	private IParser getStatefulSessionBeanViewType_5026Parser() {
		if (statefulSessionBeanViewType_5026Parser == null) {
			EAttribute editableFeature = ComponentsPackage.eINSTANCE
					.getEJB_ViewType();
			EnumParser parser = new EnumParser(editableFeature);
			statefulSessionBeanViewType_5026Parser = parser;
		}
		return statefulSessionBeanViewType_5026Parser;
	}

	/**
	 * @generated
	 */
	private IParser statelessSessionBeanName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getStatelessSessionBeanName_5007Parser() {
		if (statelessSessionBeanName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentsPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			statelessSessionBeanName_5007Parser = parser;
		}
		return statelessSessionBeanName_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser statelessSessionBeanViewType_5029Parser;

	/**
	 * @generated
	 */
	private IParser getStatelessSessionBeanViewType_5029Parser() {
		if (statelessSessionBeanViewType_5029Parser == null) {
			EAttribute editableFeature = ComponentsPackage.eINSTANCE
					.getEJB_ViewType();
			EnumParser parser = new EnumParser(editableFeature);
			statelessSessionBeanViewType_5029Parser = parser;
		}
		return statelessSessionBeanViewType_5029Parser;
	}

	/**
	 * @generated
	 */
	private IParser packageElementName_5009Parser;

	/**
	 * @generated
	 */
	private IParser getPackageElementName_5009Parser() {
		if (packageElementName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentsPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			packageElementName_5009Parser = parser;
		}
		return packageElementName_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser classElementName_5011Parser;

	/**
	 * @generated
	 */
	private IParser getClassElementName_5011Parser() {
		if (classElementName_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentsPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			classElementName_5011Parser = parser;
		}
		return classElementName_5011Parser;
	}

	/**
	 * @generated
	 */
	private IParser propertyNamePropertyType_5016Parser;

	/**
	 * @generated
	 */
	private IParser getPropertyNamePropertyType_5016Parser() {
		if (propertyNamePropertyType_5016Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComponentsPackage.eINSTANCE.getNamedElement_Name(),
					ComponentsPackage.eINSTANCE.getProperty_PropertyType() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}: {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}: {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}: {1}"); //$NON-NLS-1$
			propertyNamePropertyType_5016Parser = parser;
		}
		return propertyNamePropertyType_5016Parser;
	}

	/**
	 * @generated
	 */
	private IParser operationNameParametersOpeartionType_5017Parser;

	/**
	 * @generated
	 */
	private IParser getOperationNameParametersOpeartionType_5017Parser() {
		if (operationNameParametersOpeartionType_5017Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComponentsPackage.eINSTANCE.getNamedElement_Name(),
					ComponentsPackage.eINSTANCE.getOperation_Parameters(),
					ComponentsPackage.eINSTANCE.getOperation_OpeartionType() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}({1}): {2}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}({1}): {2}"); //$NON-NLS-1$
			parser.setEditPattern("{0}({1}): {2}"); //$NON-NLS-1$
			operationNameParametersOpeartionType_5017Parser = parser;
		}
		return operationNameParametersOpeartionType_5017Parser;
	}

	/**
	 * @generated
	 */
	private IParser propertyNamePropertyType_5018Parser;

	/**
	 * @generated
	 */
	private IParser getPropertyNamePropertyType_5018Parser() {
		if (propertyNamePropertyType_5018Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComponentsPackage.eINSTANCE.getNamedElement_Name(),
					ComponentsPackage.eINSTANCE.getProperty_PropertyType() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}: {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}: {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}: {1}"); //$NON-NLS-1$
			propertyNamePropertyType_5018Parser = parser;
		}
		return propertyNamePropertyType_5018Parser;
	}

	/**
	 * @generated
	 */
	private IParser operationNameParametersOpeartionType_5019Parser;

	/**
	 * @generated
	 */
	private IParser getOperationNameParametersOpeartionType_5019Parser() {
		if (operationNameParametersOpeartionType_5019Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComponentsPackage.eINSTANCE.getNamedElement_Name(),
					ComponentsPackage.eINSTANCE.getOperation_Parameters(),
					ComponentsPackage.eINSTANCE.getOperation_OpeartionType() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}({1}): {2}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}({1}): {2}"); //$NON-NLS-1$
			parser.setEditPattern("{0}({1}): {2}"); //$NON-NLS-1$
			operationNameParametersOpeartionType_5019Parser = parser;
		}
		return operationNameParametersOpeartionType_5019Parser;
	}

	/**
	 * @generated
	 */
	private IParser propertyNamePropertyType_5021Parser;

	/**
	 * @generated
	 */
	private IParser getPropertyNamePropertyType_5021Parser() {
		if (propertyNamePropertyType_5021Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComponentsPackage.eINSTANCE.getNamedElement_Name(),
					ComponentsPackage.eINSTANCE.getProperty_PropertyType() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}: {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}: {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}: {1}"); //$NON-NLS-1$
			propertyNamePropertyType_5021Parser = parser;
		}
		return propertyNamePropertyType_5021Parser;
	}

	/**
	 * @generated
	 */
	private IParser operationNameParametersOpeartionType_5022Parser;

	/**
	 * @generated
	 */
	private IParser getOperationNameParametersOpeartionType_5022Parser() {
		if (operationNameParametersOpeartionType_5022Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComponentsPackage.eINSTANCE.getNamedElement_Name(),
					ComponentsPackage.eINSTANCE.getOperation_Parameters(),
					ComponentsPackage.eINSTANCE.getOperation_OpeartionType() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}({1}): {2}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}({1}): {2}"); //$NON-NLS-1$
			parser.setEditPattern("{0}({1}): {2}"); //$NON-NLS-1$
			operationNameParametersOpeartionType_5022Parser = parser;
		}
		return operationNameParametersOpeartionType_5022Parser;
	}

	/**
	 * @generated
	 */
	private IParser propertyNamePropertyType_5024Parser;

	/**
	 * @generated
	 */
	private IParser getPropertyNamePropertyType_5024Parser() {
		if (propertyNamePropertyType_5024Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComponentsPackage.eINSTANCE.getNamedElement_Name(),
					ComponentsPackage.eINSTANCE.getProperty_PropertyType() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}: {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}: {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}: {1}"); //$NON-NLS-1$
			propertyNamePropertyType_5024Parser = parser;
		}
		return propertyNamePropertyType_5024Parser;
	}

	/**
	 * @generated
	 */
	private IParser operationNameParametersOpeartionType_5025Parser;

	/**
	 * @generated
	 */
	private IParser getOperationNameParametersOpeartionType_5025Parser() {
		if (operationNameParametersOpeartionType_5025Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComponentsPackage.eINSTANCE.getNamedElement_Name(),
					ComponentsPackage.eINSTANCE.getOperation_Parameters(),
					ComponentsPackage.eINSTANCE.getOperation_OpeartionType() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}({1}): {2}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}({1}): {2}"); //$NON-NLS-1$
			parser.setEditPattern("{0}({1}): {2}"); //$NON-NLS-1$
			operationNameParametersOpeartionType_5025Parser = parser;
		}
		return operationNameParametersOpeartionType_5025Parser;
	}

	/**
	 * @generated
	 */
	private IParser propertyNamePropertyType_5027Parser;

	/**
	 * @generated
	 */
	private IParser getPropertyNamePropertyType_5027Parser() {
		if (propertyNamePropertyType_5027Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComponentsPackage.eINSTANCE.getNamedElement_Name(),
					ComponentsPackage.eINSTANCE.getProperty_PropertyType() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}: {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}: {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}: {1}"); //$NON-NLS-1$
			propertyNamePropertyType_5027Parser = parser;
		}
		return propertyNamePropertyType_5027Parser;
	}

	/**
	 * @generated
	 */
	private IParser operationNameParametersOpeartionType_5028Parser;

	/**
	 * @generated
	 */
	private IParser getOperationNameParametersOpeartionType_5028Parser() {
		if (operationNameParametersOpeartionType_5028Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComponentsPackage.eINSTANCE.getNamedElement_Name(),
					ComponentsPackage.eINSTANCE.getOperation_Parameters(),
					ComponentsPackage.eINSTANCE.getOperation_OpeartionType() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}({1}): {2}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}({1}): {2}"); //$NON-NLS-1$
			parser.setEditPattern("{0}({1}): {2}"); //$NON-NLS-1$
			operationNameParametersOpeartionType_5028Parser = parser;
		}
		return operationNameParametersOpeartionType_5028Parser;
	}

	/**
	 * @generated
	 */
	private IParser classElementName_5013Parser;

	/**
	 * @generated
	 */
	private IParser getClassElementName_5013Parser() {
		if (classElementName_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentsPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			classElementName_5013Parser = parser;
		}
		return classElementName_5013Parser;
	}

	/**
	 * @generated
	 */
	private IParser propertyNamePropertyType_5030Parser;

	/**
	 * @generated
	 */
	private IParser getPropertyNamePropertyType_5030Parser() {
		if (propertyNamePropertyType_5030Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComponentsPackage.eINSTANCE.getNamedElement_Name(),
					ComponentsPackage.eINSTANCE.getProperty_PropertyType() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}: {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}: {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}: {1}"); //$NON-NLS-1$
			propertyNamePropertyType_5030Parser = parser;
		}
		return propertyNamePropertyType_5030Parser;
	}

	/**
	 * @generated
	 */
	private IParser operationNameParametersOpeartionType_5031Parser;

	/**
	 * @generated
	 */
	private IParser getOperationNameParametersOpeartionType_5031Parser() {
		if (operationNameParametersOpeartionType_5031Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComponentsPackage.eINSTANCE.getNamedElement_Name(),
					ComponentsPackage.eINSTANCE.getOperation_Parameters(),
					ComponentsPackage.eINSTANCE.getOperation_OpeartionType() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}({1}): {2}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}({1}): {2}"); //$NON-NLS-1$
			parser.setEditPattern("{0}({1}): {2}"); //$NON-NLS-1$
			operationNameParametersOpeartionType_5031Parser = parser;
		}
		return operationNameParametersOpeartionType_5031Parser;
	}

	/**
	 * @generated
	 */
	private IParser propertyNamePropertyType_5014Parser;

	/**
	 * @generated
	 */
	private IParser getPropertyNamePropertyType_5014Parser() {
		if (propertyNamePropertyType_5014Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComponentsPackage.eINSTANCE.getNamedElement_Name(),
					ComponentsPackage.eINSTANCE.getProperty_PropertyType() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}: {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}: {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}: {1}"); //$NON-NLS-1$
			propertyNamePropertyType_5014Parser = parser;
		}
		return propertyNamePropertyType_5014Parser;
	}

	/**
	 * @generated
	 */
	private IParser operationNameParametersOpeartionType_5015Parser;

	/**
	 * @generated
	 */
	private IParser getOperationNameParametersOpeartionType_5015Parser() {
		if (operationNameParametersOpeartionType_5015Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComponentsPackage.eINSTANCE.getNamedElement_Name(),
					ComponentsPackage.eINSTANCE.getOperation_Parameters(),
					ComponentsPackage.eINSTANCE.getOperation_OpeartionType() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}({1}): {2}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}({1}): {2}"); //$NON-NLS-1$
			parser.setEditPattern("{0}({1}): {2}"); //$NON-NLS-1$
			operationNameParametersOpeartionType_5015Parser = parser;
		}
		return operationNameParametersOpeartionType_5015Parser;
	}

	/**
	 * @generated
	 */
	private IParser aggregationName_6001Parser;

	/**
	 * @generated
	 */
	private IParser getAggregationName_6001Parser() {
		if (aggregationName_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentsPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			aggregationName_6001Parser = parser;
		}
		return aggregationName_6001Parser;
	}

	/**
	 * @generated
	 */
	private IParser aggregationLowerBoundUpperBound_6002Parser;

	/**
	 * @generated
	 */
	private IParser getAggregationLowerBoundUpperBound_6002Parser() {
		if (aggregationLowerBoundUpperBound_6002Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComponentsPackage.eINSTANCE.getAssociation_LowerBound(),
					ComponentsPackage.eINSTANCE.getAssociation_UpperBound() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}..{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}..{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}..{1}"); //$NON-NLS-1$
			aggregationLowerBoundUpperBound_6002Parser = parser;
		}
		return aggregationLowerBoundUpperBound_6002Parser;
	}

	/**
	 * @generated
	 */
	private IParser associationName_6003Parser;

	/**
	 * @generated
	 */
	private IParser getAssociationName_6003Parser() {
		if (associationName_6003Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentsPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			associationName_6003Parser = parser;
		}
		return associationName_6003Parser;
	}

	/**
	 * @generated
	 */
	private IParser associationLowerBoundUpperBound_6004Parser;

	/**
	 * @generated
	 */
	private IParser getAssociationLowerBoundUpperBound_6004Parser() {
		if (associationLowerBoundUpperBound_6004Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComponentsPackage.eINSTANCE.getAssociation_LowerBound(),
					ComponentsPackage.eINSTANCE.getAssociation_UpperBound() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}..{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}..{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}..{1}"); //$NON-NLS-1$
			associationLowerBoundUpperBound_6004Parser = parser;
		}
		return associationLowerBoundUpperBound_6004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case InterfaceElementNameEditPart.VISUAL_ID:
			return getInterfaceElementName_5012Parser();
		case EntityBeanNameEditPart.VISUAL_ID:
			return getEntityBeanName_5002Parser();

		case EntityBeanVisibilityEditPart.VISUAL_ID:
			return getEntityBeanViewType_5020Parser();
		case MessageDrivenBeanNameEditPart.VISUAL_ID:
			return getMessageDrivenBeanName_5003Parser();

		case MessageDrivenBeanVisibilityEditPart.VISUAL_ID:
			return getMessageDrivenBeanViewType_5023Parser();
		case StatefulSessionBeanNameEditPart.VISUAL_ID:
			return getStatefulSessionBeanName_5006Parser();

		case StatefulSessionBeanVisibilityEditPart.VISUAL_ID:
			return getStatefulSessionBeanViewType_5026Parser();
		case StatelessSessionBeanNameEditPart.VISUAL_ID:
			return getStatelessSessionBeanName_5007Parser();

		case StatelessSessionBeanVisibilityEditPart.VISUAL_ID:
			return getStatelessSessionBeanViewType_5029Parser();
		case PackageElementNameEditPart.VISUAL_ID:
			return getPackageElementName_5009Parser();
		case ClassElementNameEditPart.VISUAL_ID:
			return getClassElementName_5011Parser();
		case PropertyNamePropertyTypeEditPart.VISUAL_ID:
			return getPropertyNamePropertyType_5016Parser();
		case OperationNameParametersOpeartionEditPart.VISUAL_ID:
			return getOperationNameParametersOpeartionType_5017Parser();
		case PropertyNamePropertyType2EditPart.VISUAL_ID:
			return getPropertyNamePropertyType_5018Parser();
		case OperationNameParametersOpeartion2EditPart.VISUAL_ID:
			return getOperationNameParametersOpeartionType_5019Parser();
		case PropertyNamePropertyType3EditPart.VISUAL_ID:
			return getPropertyNamePropertyType_5021Parser();
		case OperationNameParametersOpeartion3EditPart.VISUAL_ID:
			return getOperationNameParametersOpeartionType_5022Parser();
		case PropertyNamePropertyType4EditPart.VISUAL_ID:
			return getPropertyNamePropertyType_5024Parser();
		case OperationNameParametersOpeartion4EditPart.VISUAL_ID:
			return getOperationNameParametersOpeartionType_5025Parser();
		case PropertyNamePropertyType5EditPart.VISUAL_ID:
			return getPropertyNamePropertyType_5027Parser();
		case OperationNameParametersOpeartion5EditPart.VISUAL_ID:
			return getOperationNameParametersOpeartionType_5028Parser();
		case ClassElementName2EditPart.VISUAL_ID:
			return getClassElementName_5013Parser();
		case PropertyNamePropertyType6EditPart.VISUAL_ID:
			return getPropertyNamePropertyType_5030Parser();
		case OperationNameParametersOpeartion6EditPart.VISUAL_ID:
			return getOperationNameParametersOpeartionType_5031Parser();
		case PropertyNameVisibilityEditPart.VISUAL_ID:
			return getPropertyNamePropertyType_5014Parser();
		case OperationNameVisibilityEditPart.VISUAL_ID:
			return getOperationNameParametersOpeartionType_5015Parser();
		case AggregationNameEditPart.VISUAL_ID:
			return getAggregationName_6001Parser();
		case AggregationLowerBoundUpperBoundEditPart.VISUAL_ID:
			return getAggregationLowerBoundUpperBound_6002Parser();
		case AssociationNameEditPart.VISUAL_ID:
			return getAssociationName_6003Parser();
		case AssociationLowerBoundUpperBoundEditPart.VISUAL_ID:
			return getAssociationLowerBoundUpperBound_6004Parser();
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
