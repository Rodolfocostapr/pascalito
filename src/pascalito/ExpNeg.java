/**
 */
package pascalito;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exp Neg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pascalito.ExpNeg#getNegate <em>Negate</em>}</li>
 * </ul>
 *
 * @see pascalito.PascalitoPackage#getExpNeg()
 * @model
 * @generated
 */
public interface ExpNeg extends Expression {
	/**
	 * Returns the value of the '<em><b>Negate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Negate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negate</em>' containment reference.
	 * @see #setNegate(Expression)
	 * @see pascalito.PascalitoPackage#getExpNeg_Negate()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getNegate();

	/**
	 * Sets the value of the '{@link pascalito.ExpNeg#getNegate <em>Negate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negate</em>' containment reference.
	 * @see #getNegate()
	 * @generated
	 */
	void setNegate(Expression value);

} // ExpNeg
