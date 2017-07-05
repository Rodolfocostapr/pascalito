/**
 */
package pascalito;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exp Bi NComutativa</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pascalito.ExpBiNComutativa#getOperador <em>Operador</em>}</li>
 *   <li>{@link pascalito.ExpBiNComutativa#getOperandoDir <em>Operando Dir</em>}</li>
 *   <li>{@link pascalito.ExpBiNComutativa#getOperandoEsq <em>Operando Esq</em>}</li>
 * </ul>
 *
 * @see pascalito.PascalitoPackage#getExpBiNComutativa()
 * @model
 * @generated
 */
public interface ExpBiNComutativa extends Expressao {
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
	 * @see pascalito.PascalitoPackage#getExpBiNComutativa_Operador()
	 * @model
	 * @generated
	 */
	String getOperador();

	/**
	 * Sets the value of the '{@link pascalito.ExpBiNComutativa#getOperador <em>Operador</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operador</em>' attribute.
	 * @see #getOperador()
	 * @generated
	 */
	void setOperador(String value);

	/**
	 * Returns the value of the '<em><b>Operando Dir</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operando Dir</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operando Dir</em>' containment reference.
	 * @see #setOperandoDir(Expressao)
	 * @see pascalito.PascalitoPackage#getExpBiNComutativa_OperandoDir()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expressao getOperandoDir();

	/**
	 * Sets the value of the '{@link pascalito.ExpBiNComutativa#getOperandoDir <em>Operando Dir</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operando Dir</em>' containment reference.
	 * @see #getOperandoDir()
	 * @generated
	 */
	void setOperandoDir(Expressao value);

	/**
	 * Returns the value of the '<em><b>Operando Esq</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operando Esq</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operando Esq</em>' containment reference.
	 * @see #setOperandoEsq(Expressao)
	 * @see pascalito.PascalitoPackage#getExpBiNComutativa_OperandoEsq()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expressao getOperandoEsq();

	/**
	 * Sets the value of the '{@link pascalito.ExpBiNComutativa#getOperandoEsq <em>Operando Esq</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operando Esq</em>' containment reference.
	 * @see #getOperandoEsq()
	 * @generated
	 */
	void setOperandoEsq(Expressao value);

} // ExpBiNComutativa
