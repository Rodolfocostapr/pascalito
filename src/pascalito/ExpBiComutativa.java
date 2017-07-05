/**
 */
package pascalito;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exp Bi Comutativa</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pascalito.ExpBiComutativa#getOperador <em>Operador</em>}</li>
 *   <li>{@link pascalito.ExpBiComutativa#getOperando1 <em>Operando1</em>}</li>
 *   <li>{@link pascalito.ExpBiComutativa#getOperando2 <em>Operando2</em>}</li>
 * </ul>
 *
 * @see pascalito.PascalitoPackage#getExpBiComutativa()
 * @model
 * @generated
 */
public interface ExpBiComutativa extends Expressao {
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
	 * @see pascalito.PascalitoPackage#getExpBiComutativa_Operador()
	 * @model
	 * @generated
	 */
	String getOperador();

	/**
	 * Sets the value of the '{@link pascalito.ExpBiComutativa#getOperador <em>Operador</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operador</em>' attribute.
	 * @see #getOperador()
	 * @generated
	 */
	void setOperador(String value);

	/**
	 * Returns the value of the '<em><b>Operando1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operando1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operando1</em>' containment reference.
	 * @see #setOperando1(Expressao)
	 * @see pascalito.PascalitoPackage#getExpBiComutativa_Operando1()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expressao getOperando1();

	/**
	 * Sets the value of the '{@link pascalito.ExpBiComutativa#getOperando1 <em>Operando1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operando1</em>' containment reference.
	 * @see #getOperando1()
	 * @generated
	 */
	void setOperando1(Expressao value);

	/**
	 * Returns the value of the '<em><b>Operando2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operando2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operando2</em>' containment reference.
	 * @see #setOperando2(Expressao)
	 * @see pascalito.PascalitoPackage#getExpBiComutativa_Operando2()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expressao getOperando2();

	/**
	 * Sets the value of the '{@link pascalito.ExpBiComutativa#getOperando2 <em>Operando2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operando2</em>' containment reference.
	 * @see #getOperando2()
	 * @generated
	 */
	void setOperando2(Expressao value);

} // ExpBiComutativa
