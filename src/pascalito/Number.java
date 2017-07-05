/**
 */
package pascalito;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pascalito.Number#getValor <em>Valor</em>}</li>
 * </ul>
 *
 * @see pascalito.PascalitoPackage#getNumber()
 * @model
 * @generated
 */
public interface Number extends Expressao {
	/**
	 * Returns the value of the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valor</em>' attribute.
	 * @see #setValor(int)
	 * @see pascalito.PascalitoPackage#getNumber_Valor()
	 * @model
	 * @generated
	 */
	int getValor();

	/**
	 * Sets the value of the '{@link pascalito.Number#getValor <em>Valor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valor</em>' attribute.
	 * @see #getValor()
	 * @generated
	 */
	void setValor(int value);

} // Number
