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
			case PascalitoPackage.PROGRAMA:
				return validatePrograma((Programa)value, diagnostics, context);
			case PascalitoPackage.BLOCO:
				return validateBloco((Bloco)value, diagnostics, context);
			case PascalitoPackage.CALL_VARIAVEL:
				return validateCallVariavel((CallVariavel)value, diagnostics, context);
			case PascalitoPackage.COMANDO:
				return validateComando((Comando)value, diagnostics, context);
			case PascalitoPackage.CALL_PROCEDIMENTO:
				return validateCallProcedimento((CallProcedimento)value, diagnostics, context);
			case PascalitoPackage.ATRIBUICAO:
				return validateAtribuicao((Atribuicao)value, diagnostics, context);
			case PascalitoPackage.DESVIO:
				return validateDesvio((Desvio)value, diagnostics, context);
			case PascalitoPackage.LOOP:
				return validateLoop((Loop)value, diagnostics, context);
			case PascalitoPackage.EXPRESSAO:
				return validateExpressao((Expressao)value, diagnostics, context);
			case PascalitoPackage.EXP_BIN_LOGICA:
				return validateExpBinLogica((ExpBinLogica)value, diagnostics, context);
			case PascalitoPackage.EXP_NEG:
				return validateExpNeg((ExpNeg)value, diagnostics, context);
			case PascalitoPackage.NEW_ROLE15:
				return validatenewRole15((newRole15)value, diagnostics, context);
			case PascalitoPackage.VARIAVEL:
				return validateVariavel((Variavel)value, diagnostics, context);
			case PascalitoPackage.PROCEDIMENTO:
				return validateProcedimento((Procedimento)value, diagnostics, context);
			case PascalitoPackage.CALL_PROC:
				return validateCallProc((CallProc)value, diagnostics, context);
			case PascalitoPackage.NCOMUTATIVA:
				return validateN_Comutativa((N_Comutativa)value, diagnostics, context);
			case PascalitoPackage.COMUTATIVA:
				return validateComutativa((Comutativa)value, diagnostics, context);
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
	public boolean validatePrograma(Programa programa, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(programa, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBloco(Bloco bloco, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bloco, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallVariavel(CallVariavel callVariavel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(callVariavel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComando(Comando comando, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(comando, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallProcedimento(CallProcedimento callProcedimento, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(callProcedimento, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(callProcedimento, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(callProcedimento, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(callProcedimento, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(callProcedimento, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(callProcedimento, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(callProcedimento, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(callProcedimento, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(callProcedimento, diagnostics, context);
		if (result || diagnostics != null) result &= validateCallProcedimento_numeroParametros(callProcedimento, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the numeroParametros constraint of '<em>Call Procedimento</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CALL_PROCEDIMENTO__NUMERO_PARAMETROS__EEXPRESSION = "self.definido.parametro->size() = parametro->size()";

	/**
	 * Validates the numeroParametros constraint of '<em>Call Procedimento</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallProcedimento_numeroParametros(CallProcedimento callProcedimento, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PascalitoPackage.Literals.CALL_PROCEDIMENTO,
				 callProcedimento,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "numeroParametros",
				 CALL_PROCEDIMENTO__NUMERO_PARAMETROS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAtribuicao(Atribuicao atribuicao, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(atribuicao, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDesvio(Desvio desvio, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(desvio, diagnostics, context);
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
	public boolean validateExpressao(Expressao expressao, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(expressao, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpBinLogica(ExpBinLogica expBinLogica, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(expBinLogica, diagnostics, context);
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
	public boolean validateVariavel(Variavel variavel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variavel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedimento(Procedimento procedimento, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(procedimento, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateCallProc_numeroParametros(callProc, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the numeroParametros constraint of '<em>Call Proc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CALL_PROC__NUMERO_PARAMETROS__EEXPRESSION = "self.representaProc.parametro->size() = parametro->size()";

	/**
	 * Validates the numeroParametros constraint of '<em>Call Proc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallProc_numeroParametros(CallProc callProc, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PascalitoPackage.Literals.CALL_PROC,
				 callProc,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "numeroParametros",
				 CALL_PROC__NUMERO_PARAMETROS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateN_Comutativa(N_Comutativa n_Comutativa, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(n_Comutativa, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComutativa(Comutativa comutativa, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(comutativa, diagnostics, context);
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
