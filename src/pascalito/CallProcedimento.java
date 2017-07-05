/**
 */
package pascalito;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Procedimento</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pascalito.CallProcedimento#getDefinido <em>Definido</em>}</li>
 *   <li>{@link pascalito.CallProcedimento#getParametro <em>Parametro</em>}</li>
 * </ul>
 *
 * @see pascalito.PascalitoPackage#getCallProcedimento()
 * @model
 * @generated
 */
public interface CallProcedimento extends Comando {
	/**
	 * Returns the value of the '<em><b>Definido</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definido</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definido</em>' reference.
	 * @see #setDefinido(Procedimento)
	 * @see pascalito.PascalitoPackage#getCallProcedimento_Definido()
	 * @model required="true"
	 * @generated
	 */
	Procedimento getDefinido();

	/**
	 * Sets the value of the '{@link pascalito.CallProcedimento#getDefinido <em>Definido</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definido</em>' reference.
	 * @see #getDefinido()
	 * @generated
	 */
	void setDefinido(Procedimento value);

	/**
	 * Returns the value of the '<em><b>Parametro</b></em>' containment reference list.
	 * The list contents are of type {@link pascalito.Expressao}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parametro</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parametro</em>' containment reference list.
	 * @see pascalito.PascalitoPackage#getCallProcedimento_Parametro()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expressao> getParametro();

} // CallProcedimento
