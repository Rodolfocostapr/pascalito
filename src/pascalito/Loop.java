/**
 */
package pascalito;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pascalito.Loop#getSe <em>Se</em>}</li>
 *   <li>{@link pascalito.Loop#getFaca <em>Faca</em>}</li>
 * </ul>
 *
 * @see pascalito.PascalitoPackage#getLoop()
 * @model
 * @generated
 */
public interface Loop extends Comando {
	/**
	 * Returns the value of the '<em><b>Se</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Se</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Se</em>' containment reference.
	 * @see #setSe(Expressao)
	 * @see pascalito.PascalitoPackage#getLoop_Se()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expressao getSe();

	/**
	 * Sets the value of the '{@link pascalito.Loop#getSe <em>Se</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Se</em>' containment reference.
	 * @see #getSe()
	 * @generated
	 */
	void setSe(Expressao value);

	/**
	 * Returns the value of the '<em><b>Faca</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Faca</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Faca</em>' containment reference.
	 * @see #setFaca(SeqComandos)
	 * @see pascalito.PascalitoPackage#getLoop_Faca()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SeqComandos getFaca();

	/**
	 * Sets the value of the '{@link pascalito.Loop#getFaca <em>Faca</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Faca</em>' containment reference.
	 * @see #getFaca()
	 * @generated
	 */
	void setFaca(SeqComandos value);

} // Loop
