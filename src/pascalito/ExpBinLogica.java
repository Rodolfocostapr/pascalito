/**
 */
package pascalito;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exp Bin Logica</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pascalito.ExpBinLogica#getOperador <em>Operador</em>}</li>
 *   <li>{@link pascalito.ExpBinLogica#getOperandoEsq <em>Operando Esq</em>}</li>
 *   <li>{@link pascalito.ExpBinLogica#getOperandoDir <em>Operando Dir</em>}</li>
 *   <li>{@link pascalito.ExpBinLogica#isComutativa <em>Comutativa</em>}</li>
 * </ul>
 *
 * @see pascalito.PascalitoPackage#getExpBinLogica()
 * @model
 * @generated
 */
public interface ExpBinLogica extends Expressao {
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
	 * @see pascalito.PascalitoPackage#getExpBinLogica_Operador()
	 * @model
	 * @generated
	 */
	String getOperador();

	/**
	 * Sets the value of the '{@link pascalito.ExpBinLogica#getOperador <em>Operador</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operador</em>' attribute.
	 * @see #getOperador()
	 * @generated
	 */
	void setOperador(String value);

	/**
	 * Returns the value of the '<em><b>Operando Esq</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operando Esq</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operando Esq</em>' containment reference.
	 * @see #setOperandoEsq(Expressao)
	 * @see pascalito.PascalitoPackage#getExpBinLogica_OperandoEsq()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expressao getOperandoEsq();

	/**
	 * Sets the value of the '{@link pascalito.ExpBinLogica#getOperandoEsq <em>Operando Esq</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operando Esq</em>' containment reference.
	 * @see #getOperandoEsq()
	 * @generated
	 */
	void setOperandoEsq(Expressao value);

	/**
	 * Returns the value of the '<em><b>Operando Dir</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operando Dir</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operando Dir</em>' containment reference.
	 * @see #setOperandoDir(Expressao)
	 * @see pascalito.PascalitoPackage#getExpBinLogica_OperandoDir()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expressao getOperandoDir();

	/**
	 * Sets the value of the '{@link pascalito.ExpBinLogica#getOperandoDir <em>Operando Dir</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operando Dir</em>' containment reference.
	 * @see #getOperandoDir()
	 * @generated
	 */
	void setOperandoDir(Expressao value);

	/**
	 * Returns the value of the '<em><b>Comutativa</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comutativa</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comutativa</em>' attribute.
	 * @see #setComutativa(boolean)
	 * @see pascalito.PascalitoPackage#getExpBinLogica_Comutativa()
	 * @model
	 * @generated
	 */
	boolean isComutativa();

	/**
	 * Sets the value of the '{@link pascalito.ExpBinLogica#isComutativa <em>Comutativa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comutativa</em>' attribute.
	 * @see #isComutativa()
	 * @generated
	 */
	void setComutativa(boolean value);

} // ExpBinLogica
