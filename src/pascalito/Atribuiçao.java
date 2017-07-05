/**
 */
package pascalito;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atribuiçao</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pascalito.Atribuiçao#getAtribui <em>Atribui</em>}</li>
 *   <li>{@link pascalito.Atribuiçao#getAtribuiResultado <em>Atribui Resultado</em>}</li>
 * </ul>
 *
 * @see pascalito.PascalitoPackage#getAtribuiçao()
 * @model
 * @generated
 */
public interface Atribuiçao extends Comando {
	/**
	 * Returns the value of the '<em><b>Atribui</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atribui</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atribui</em>' reference.
	 * @see #setAtribui(Variavel)
	 * @see pascalito.PascalitoPackage#getAtribuiçao_Atribui()
	 * @model required="true"
	 * @generated
	 */
	Variavel getAtribui();

	/**
	 * Sets the value of the '{@link pascalito.Atribuiçao#getAtribui <em>Atribui</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atribui</em>' reference.
	 * @see #getAtribui()
	 * @generated
	 */
	void setAtribui(Variavel value);

	/**
	 * Returns the value of the '<em><b>Atribui Resultado</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atribui Resultado</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atribui Resultado</em>' containment reference.
	 * @see #setAtribuiResultado(Expressão)
	 * @see pascalito.PascalitoPackage#getAtribuiçao_AtribuiResultado()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expressão getAtribuiResultado();

	/**
	 * Sets the value of the '{@link pascalito.Atribuiçao#getAtribuiResultado <em>Atribui Resultado</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atribui Resultado</em>' containment reference.
	 * @see #getAtribuiResultado()
	 * @generated
	 */
	void setAtribuiResultado(Expressão value);

} // Atribuiçao
