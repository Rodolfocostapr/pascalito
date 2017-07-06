/**
 */
package pascalito;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Proc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pascalito.CallProc#getRepresentaProc <em>Representa Proc</em>}</li>
 * </ul>
 *
 * @see pascalito.PascalitoPackage#getCallProc()
 * @model
 * @generated
 */
public interface CallProc extends Expressao {
	/**
	 * Returns the value of the '<em><b>Representa Proc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Representa Proc</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representa Proc</em>' reference.
	 * @see #setRepresentaProc(Procedimento)
	 * @see pascalito.PascalitoPackage#getCallProc_RepresentaProc()
	 * @model required="true"
	 * @generated
	 */
	Procedimento getRepresentaProc();

	/**
	 * Sets the value of the '{@link pascalito.CallProc#getRepresentaProc <em>Representa Proc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representa Proc</em>' reference.
	 * @see #getRepresentaProc()
	 * @generated
	 */
	void setRepresentaProc(Procedimento value);

} // CallProc
