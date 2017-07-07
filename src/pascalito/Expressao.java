/**
 */
package pascalito;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expressao</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pascalito.Expressao#getLeft <em>Left</em>}</li>
 *   <li>{@link pascalito.Expressao#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see pascalito.PascalitoPackage#getExpressao()
 * @model abstract="true"
 * @generated
 */
public interface Expressao extends EObject {

	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(Expressao)
	 * @see pascalito.PascalitoPackage#getExpressao_Left()
	 * @model containment="true"
	 * @generated
	 */
	Expressao getLeft();

	/**
	 * Sets the value of the '{@link pascalito.Expressao#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Expressao value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(Expressao)
	 * @see pascalito.PascalitoPackage#getExpressao_Right()
	 * @model containment="true"
	 * @generated
	 */
	Expressao getRight();

	/**
	 * Sets the value of the '{@link pascalito.Expressao#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Expressao value);

} // Expressao
