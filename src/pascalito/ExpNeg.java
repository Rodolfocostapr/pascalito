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
 *   <li>{@link pascalito.ExpNeg#getOperador <em>Operador</em>}</li>
 *   <li>{@link pascalito.ExpNeg#getNega <em>Nega</em>}</li>
 * </ul>
 *
 * @see pascalito.PascalitoPackage#getExpNeg()
 * @model
 * @generated
 */
public interface ExpNeg extends Expressao {
	/**
	 * Returns the value of the '<em><b>Operador</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operador</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operador</em>' attribute.
	 * @see #setOperador(String)
	 * @see pascalito.PascalitoPackage#getExpNeg_Operador()
	 * @model
	 * @generated
	 */
	String getOperador();

	/**
	 * Sets the value of the '{@link pascalito.ExpNeg#getOperador <em>Operador</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operador</em>' attribute.
	 * @see #getOperador()
	 * @generated
	 */
	void setOperador(String value);

	/**
	 * Returns the value of the '<em><b>Nega</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nega</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nega</em>' containment reference.
	 * @see #setNega(Expressao)
	 * @see pascalito.PascalitoPackage#getExpNeg_Nega()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expressao getNega();

	/**
	 * Sets the value of the '{@link pascalito.ExpNeg#getNega <em>Nega</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nega</em>' containment reference.
	 * @see #getNega()
	 * @generated
	 */
	void setNega(Expressao value);

} // ExpNeg
