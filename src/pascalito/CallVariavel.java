/**
 */
package pascalito;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Variavel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pascalito.CallVariavel#getRepresenta <em>Representa</em>}</li>
 * </ul>
 *
 * @see pascalito.PascalitoPackage#getCallVariavel()
 * @model
 * @generated
 */
public interface CallVariavel extends Expressao {
	/**
	 * Returns the value of the '<em><b>Representa</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Representa</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representa</em>' reference.
	 * @see #setRepresenta(Variavel)
	 * @see pascalito.PascalitoPackage#getCallVariavel_Representa()
	 * @model required="true"
	 * @generated
	 */
	Variavel getRepresenta();

	/**
	 * Sets the value of the '{@link pascalito.CallVariavel#getRepresenta <em>Representa</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representa</em>' reference.
	 * @see #getRepresenta()
	 * @generated
	 */
	void setRepresenta(Variavel value);

} // CallVariavel
