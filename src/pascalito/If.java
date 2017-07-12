/**
 */
package pascalito;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pascalito.If#getIfExp <em>If Exp</em>}</li>
 *   <li>{@link pascalito.If#getDo <em>Do</em>}</li>
 *   <li>{@link pascalito.If#getElseCmd <em>Else Cmd</em>}</li>
 * </ul>
 *
 * @see pascalito.PascalitoPackage#getIf()
 * @model
 * @generated
 */
public interface If extends Command {
	/**
	 * Returns the value of the '<em><b>If Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If Exp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If Exp</em>' containment reference.
	 * @see #setIfExp(Expression)
	 * @see pascalito.PascalitoPackage#getIf_IfExp()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getIfExp();

	/**
	 * Sets the value of the '{@link pascalito.If#getIfExp <em>If Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Exp</em>' containment reference.
	 * @see #getIfExp()
	 * @generated
	 */
	void setIfExp(Expression value);

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
	 * @see pascalito.PascalitoPackage#getIf_Do()
	 * @model containment="true"
	 * @generated
	 */
	EList<Command> getDo();

	/**
	 * Returns the value of the '<em><b>Else Cmd</b></em>' containment reference list.
	 * The list contents are of type {@link pascalito.Command}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else Cmd</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Cmd</em>' containment reference list.
	 * @see pascalito.PascalitoPackage#getIf_ElseCmd()
	 * @model containment="true"
	 * @generated
	 */
	EList<Command> getElseCmd();

} // If
