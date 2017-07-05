/**
 */
package pascalito;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atribui�ao</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pascalito.Atribui�ao#getAtribui <em>Atribui</em>}</li>
 *   <li>{@link pascalito.Atribui�ao#getAtribuiResultado <em>Atribui Resultado</em>}</li>
 * </ul>
 *
 * @see pascalito.PascalitoPackage#getAtribui�ao()
 * @model
 * @generated
 */
public interface Atribui�ao extends Comando {
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
	 * @see pascalito.PascalitoPackage#getAtribui�ao_Atribui()
	 * @model required="true"
	 * @generated
	 */
	Variavel getAtribui();

	/**
	 * Sets the value of the '{@link pascalito.Atribui�ao#getAtribui <em>Atribui</em>}' reference.
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
	 * @see #setAtribuiResultado(Express�o)
	 * @see pascalito.PascalitoPackage#getAtribui�ao_AtribuiResultado()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Express�o getAtribuiResultado();

	/**
	 * Sets the value of the '{@link pascalito.Atribui�ao#getAtribuiResultado <em>Atribui Resultado</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atribui Resultado</em>' containment reference.
	 * @see #getAtribuiResultado()
	 * @generated
	 */
	void setAtribuiResultado(Express�o value);

} // Atribui�ao
