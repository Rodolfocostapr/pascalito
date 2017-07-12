/**
 */
package pascalito;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pascalito.Loop#getWhile <em>While</em>}</li>
 *   <li>{@link pascalito.Loop#getDo <em>Do</em>}</li>
 * </ul>
 *
 * @see pascalito.PascalitoPackage#getLoop()
 * @model
 * @generated
 */
public interface Loop extends Command {
	/**
	 * Returns the value of the '<em><b>While</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>While</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>While</em>' containment reference.
	 * @see #setWhile(Expression)
	 * @see pascalito.PascalitoPackage#getLoop_While()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getWhile();

	/**
	 * Sets the value of the '{@link pascalito.Loop#getWhile <em>While</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>While</em>' containment reference.
	 * @see #getWhile()
	 * @generated
	 */
	void setWhile(Expression value);

	/**
	 * Returns the value of the '<em><b>Do</b></em>' containment reference list.
	 * The list contents are of type {@link pascalito.Command}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Do</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Do</em>' containment reference list.
	 * @see pascalito.PascalitoPackage#getLoop_Do()
	 * @model containment="true"
	 * @generated
	 */
	EList<Command> getDo();

} // Loop
