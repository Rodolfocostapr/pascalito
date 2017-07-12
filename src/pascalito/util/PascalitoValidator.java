/**
 */
package pascalito.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import pascalito.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see pascalito.PascalitoPackage
 * @generated
 */
public class PascalitoValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PascalitoValidator INSTANCE = new PascalitoValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "pascalito";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PascalitoValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return PascalitoPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case PascalitoPackage.PROGRAM:
				return validateProgram((Program)value, diagnostics, context);
			case PascalitoPackage.BLOCK:
				return validateBlock((Block)value, diagnostics, context);
			case PascalitoPackage.CALL_VARIABLE:
				return validateCallVariable((CallVariable)value, diagnostics, context);
			case PascalitoPackage.COMMAND:
				return validateCommand((Command)value, diagnostics, context);
			case PascalitoPackage.CALL_PROC:
				return validateCallProc((CallProc)value, diagnostics, context);
			case PascalitoPackage.ATRIBUITION:
				return validateAtribuition((Atribuition)value, diagnostics, context);
			case PascalitoPackage.IF:
				return validateIf((If)value, diagnostics, context);
			case PascalitoPackage.LOOP:
				return validateLoop((Loop)value, diagnostics, context);
			case PascalitoPackage.EXPRESSION:
				return validateExpression((Expression)value, diagnostics, context);
			case PascalitoPackage.EXP_BIN_LOGICAL:
				return validateExpBinLogical((ExpBinLogical)value, diagnostics, context);
			case PascalitoPackage.EXP_NEG:
				return validateExpNeg((ExpNeg)value, diagnostics, context);
			case PascalitoPackage.NEW_ROLE15:
				return validatenewRole15((newRole15)value, diagnostics, context);
			case PascalitoPackage.VARIABLE:
				return validateVariable((Variable)value, diagnostics, context);
			case PascalitoPackage.PROCEDURE:
				return validateProcedure((Procedure)value, diagnostics, context);
			case PascalitoPackage.CALL_PROC_EXP:
				return validateCallProcExp((CallProcExp)value, diagnostics, context);
			case PascalitoPackage.EXP_BIN_NV1:
				return validateExpBinNv1((ExpBinNv1)value, diagnostics, context);
			case PascalitoPackage.EXP_BIN_NV0:
				return validateExpBinNv0((ExpBinNv0)value, diagnostics, context);
			case PascalitoPackage.NUMBER_LITERAL:
				return validateNumberLiteral((NumberLiteral)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgram(Program program, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(program, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBlock(Block block, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(block, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallVariable(CallVariable callVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(callVariable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommand(Command command, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(command, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoop(Loop loop, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(loop, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpression(Expression expression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(expression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpBinLogical(ExpBinLogical expBinLogical, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(expBinLogical, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpNeg(ExpNeg expNeg, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(expNeg, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatenewRole15(newRole15 newRole15, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(newRole15, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariable(Variable variable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedure(Procedure procedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(procedure, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallProcExp(CallProcExp callProcExp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(callProcExp, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(callProcExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(callProcExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(callProcExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(callProcExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(callProcExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(callProcExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(callProcExp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(callProcExp, diagnostics, context);
		if (result || diagnostics != null) result &= validateCallProcExp_number_of_parameters(callProcExp, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the number_of_parameters constraint of '<em>Call Proc Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CALL_PROC_EXP__NUMBER_OF_PARAMETERS__EEXPRESSION = "self.represent.parameter->size() = parameter->size()";

	/**
	 * Validates the number_of_parameters constraint of '<em>Call Proc Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallProcExp_number_of_parameters(CallProcExp callProcExp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PascalitoPackage.Literals.CALL_PROC_EXP,
				 callProcExp,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "number_of_parameters",
				 CALL_PROC_EXP__NUMBER_OF_PARAMETERS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpBinNv1(ExpBinNv1 expBinNv1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(expBinNv1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpBinNv0(ExpBinNv0 expBinNv0, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(expBinNv0, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallProc(CallProc callProc, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(callProc, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(callProc, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(callProc, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(callProc, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(callProc, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(callProc, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(callProc, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(callProc, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(callProc, diagnostics, context);
		if (result || diagnostics != null) result &= validateCallProc_number_of_parameters(callProc, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the number_of_parameters constraint of '<em>Call Proc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CALL_PROC__NUMBER_OF_PARAMETERS__EEXPRESSION = "self.defined.parameter->size() = parameter->size()";

	/**
	 * Validates the number_of_parameters constraint of '<em>Call Proc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallProc_number_of_parameters(CallProc callProc, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PascalitoPackage.Literals.CALL_PROC,
				 callProc,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "number_of_parameters",
				 CALL_PROC__NUMBER_OF_PARAMETERS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAtribuition(Atribuition atribuition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(atribuition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIf(If if_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(if_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberLiteral(NumberLiteral numberLiteral, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(numberLiteral, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //PascalitoValidator
