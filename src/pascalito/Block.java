/**
 */
package pascalito;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pascalito.Block#getDefVariable <em>Def Variable</em>}</li>
 *   <li>{@link pascalito.Block#getDefprocedure <em>Defprocedure</em>}</li>
 *   <li>{@link pascalito.Block#getExecute <em>Execute</em>}</li>
 * </ul>
 *
 * @see pascalito.PascalitoPackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends EObject {
	/**
	 * Returns the value of the '<em><b>Def Variable</b></em>' containment reference list.
	 * The list contents are of type {@link pascalito.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Def Variable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Def Variable</em>' containment reference list.
	 * @see pascalito.PascalitoPackage#getBlock_DefVariable()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getDefVariable();

	/**
	 * Returns the value of the '<em><b>Defprocedure</b></em>' containment reference list.
	 * The list contents are of type {@link pascalito.Procedure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defprocedure</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defprocedure</em>' containment reference list.
	 * @see pascalito.PascalitoPackage#getBlock_Defprocedure()
	 * @model containment="true"
	 * @generated
	 */
	EList<Procedure> getDefprocedure();

	/**
	 * Returns the value of the '<em><b>Execute</b></em>' containment reference list.
	 * The list contents are of type {@link pascalito.Command}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execute</em>' containment reference list.
	 * @see pascalito.PascalitoPackage#getBlock_Execute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Command> getExecute();

} // Block
