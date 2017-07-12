/**
 */
package pascalito;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pascalito.CallVariable#getRepresent <em>Represent</em>}</li>
 * </ul>
 *
 * @see pascalito.PascalitoPackage#getCallVariable()
 * @model
 * @generated
 */
public interface CallVariable extends Expression {
	/**
	 * Returns the value of the '<em><b>Represent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Represent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Represent</em>' reference.
	 * @see #setRepresent(Variable)
	 * @see pascalito.PascalitoPackage#getCallVariable_Represent()
	 * @model required="true"
	 * @generated
	 */
	Variable getRepresent();

	/**
	 * Sets the value of the '{@link pascalito.CallVariable#getRepresent <em>Represent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Represent</em>' reference.
	 * @see #getRepresent()
	 * @generated
	 */
	void setRepresent(Variable value);

} // CallVariable
