/**
 */
package pascalito.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;
import pascalito.Atribuicao;
import pascalito.Bloco;
import pascalito.CallProcedimento;
import pascalito.CallVariavel;
import pascalito.Comando;
import pascalito.Desvio;
import pascalito.ExpBin;
import pascalito.ExpBinLogica;
import pascalito.ExpNeg;
import pascalito.Expressao;
import pascalito.Loop;
import pascalito.PascalitoPackage;
import pascalito.Procedimento;
import pascalito.Programa;
import pascalito.Variavel;
import pascalito.newRole15;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see pascalito.PascalitoPackage
 * @generated
 */
public class PascalitoSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PascalitoPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PascalitoSwitch() {
		if (modelPackage == null) {
			modelPackage = PascalitoPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PascalitoPackage.PROGRAMA: {
				Programa programa = (Programa)theEObject;
				T result = casePrograma(programa);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PascalitoPackage.BLOCO: {
				Bloco bloco = (Bloco)theEObject;
				T result = caseBloco(bloco);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PascalitoPackage.CALL_VARIAVEL: {
				CallVariavel callVariavel = (CallVariavel)theEObject;
				T result = caseCallVariavel(callVariavel);
				if (result == null) result = caseExpressao(callVariavel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PascalitoPackage.COMANDO: {
				Comando comando = (Comando)theEObject;
				T result = caseComando(comando);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PascalitoPackage.CALL_PROCEDIMENTO: {
				CallProcedimento callProcedimento = (CallProcedimento)theEObject;
				T result = caseCallProcedimento(callProcedimento);
				if (result == null) result = caseComando(callProcedimento);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PascalitoPackage.ATRIBUICAO: {
				Atribuicao atribuicao = (Atribuicao)theEObject;
				T result = caseAtribuicao(atribuicao);
				if (result == null) result = caseComando(atribuicao);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PascalitoPackage.DESVIO: {
				Desvio desvio = (Desvio)theEObject;
				T result = caseDesvio(desvio);
				if (result == null) result = caseComando(desvio);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PascalitoPackage.LOOP: {
				Loop loop = (Loop)theEObject;
				T result = caseLoop(loop);
				if (result == null) result = caseComando(loop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PascalitoPackage.EXPRESSAO: {
				Expressao expressao = (Expressao)theEObject;
				T result = caseExpressao(expressao);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PascalitoPackage.NUMBER: {
				pascalito.Number number = (pascalito.Number)theEObject;
				T result = caseNumber(number);
				if (result == null) result = caseExpressao(number);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PascalitoPackage.EXP_BIN_LOGICA: {
				ExpBinLogica expBinLogica = (ExpBinLogica)theEObject;
				T result = caseExpBinLogica(expBinLogica);
				if (result == null) result = caseExpressao(expBinLogica);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PascalitoPackage.EXP_BIN: {
				ExpBin expBin = (ExpBin)theEObject;
				T result = caseExpBin(expBin);
				if (result == null) result = caseExpressao(expBin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PascalitoPackage.EXP_NEG: {
				ExpNeg expNeg = (ExpNeg)theEObject;
				T result = caseExpNeg(expNeg);
				if (result == null) result = caseExpressao(expNeg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PascalitoPackage.NEW_ROLE15: {
				newRole15 newRole15 = (newRole15)theEObject;
				T result = casenewRole15(newRole15);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PascalitoPackage.VARIAVEL: {
				Variavel variavel = (Variavel)theEObject;
				T result = caseVariavel(variavel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PascalitoPackage.PROCEDIMENTO: {
				Procedimento procedimento = (Procedimento)theEObject;
				T result = caseProcedimento(procedimento);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Programa</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Programa</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrograma(Programa object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bloco</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bloco</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBloco(Bloco object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Variavel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Variavel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallVariavel(CallVariavel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comando</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comando</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComando(Comando object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Procedimento</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Procedimento</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallProcedimento(CallProcedimento object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atribuicao</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atribuicao</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtribuicao(Atribuicao object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Desvio</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Desvio</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDesvio(Desvio object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoop(Loop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expressao</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expressao</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressao(Expressao object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber(pascalito.Number object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exp Bin Logica</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exp Bin Logica</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpBinLogica(ExpBinLogica object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exp Bin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exp Bin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpBin(ExpBin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exp Neg</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exp Neg</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpNeg(ExpNeg object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>new Role15</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>new Role15</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casenewRole15(newRole15 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variavel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variavel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariavel(Variavel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedimento</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedimento</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedimento(Procedimento object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PascalitoSwitch
