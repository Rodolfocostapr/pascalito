/**
 */
package pascalito;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Desvio</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pascalito.Desvio#getSe <em>Se</em>}</li>
 *   <li>{@link pascalito.Desvio#getFaca <em>Faca</em>}</li>
 *   <li>{@link pascalito.Desvio#getSeNao <em>Se Nao</em>}</li>
 * </ul>
 *
 * @see pascalito.PascalitoPackage#getDesvio()
 * @model
 * @generated
 */
public interface Desvio extends Comando {
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
	 * @see pascalito.PascalitoPackage#getDesvio_Se()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expressao getSe();

	/**
	 * Sets the value of the '{@link pascalito.Desvio#getSe <em>Se</em>}' containment reference.
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
	 * @see pascalito.PascalitoPackage#getDesvio_Faca()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SeqComandos getFaca();

	/**
	 * Sets the value of the '{@link pascalito.Desvio#getFaca <em>Faca</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Faca</em>' containment reference.
	 * @see #getFaca()
	 * @generated
	 */
	void setFaca(SeqComandos value);

	/**
	 * Returns the value of the '<em><b>Se Nao</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Se Nao</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Se Nao</em>' containment reference.
	 * @see #setSeNao(SeqComandos)
	 * @see pascalito.PascalitoPackage#getDesvio_SeNao()
	 * @model containment="true"
	 * @generated
	 */
	SeqComandos getSeNao();

	/**
	 * Sets the value of the '{@link pascalito.Desvio#getSeNao <em>Se Nao</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Se Nao</em>' containment reference.
	 * @see #getSeNao()
	 * @generated
	 */
	void setSeNao(SeqComandos value);

} // Desvio
