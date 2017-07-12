/**
 */
package pascalito;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atribuition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pascalito.Atribuition#getSets <em>Sets</em>}</li>
 *   <li>{@link pascalito.Atribuition#getAtribuiResultado <em>Atribui Resultado</em>}</li>
 * </ul>
 *
 * @see pascalito.PascalitoPackage#getAtribuition()
 * @model
 * @generated
 */
public interface Atribuition extends Command {
	/**
	 * Returns the value of the '<em><b>Sets</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sets</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sets</em>' reference.
	 * @see #setSets(Variable)
	 * @see pascalito.PascalitoPackage#getAtribuition_Sets()
	 * @model required="true"
	 * @generated
	 */
	Variable getSets();

	/**
	 * Sets the value of the '{@link pascalito.Atribuition#getSets <em>Sets</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sets</em>' reference.
	 * @see #getSets()
	 * @generated
	 */
	void setSets(Variable value);

	/**
	 * Returns the value of the '<em><b>Atribui Resultado</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atribui Resultado</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atribui Resultado</em>' containment reference.
	 * @see #setAtribuiResultado(Expression)
	 * @see pascalito.PascalitoPackage#getAtribuition_AtribuiResultado()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getAtribuiResultado();

	/**
	 * Sets the value of the '{@link pascalito.Atribuition#getAtribuiResultado <em>Atribui Resultado</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atribui Resultado</em>' containment reference.
	 * @see #getAtribuiResultado()
	 * @generated
	 */
	void setAtribuiResultado(Expression value);

} // Atribuition
