/**
 */
package pascalito;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Proc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pascalito.CallProc#getDefined <em>Defined</em>}</li>
 *   <li>{@link pascalito.CallProc#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see pascalito.PascalitoPackage#getCallProc()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='number_of_parameters'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot number_of_parameters='self.defined.parameter->size() = parameter->size()'"
 * @generated
 */
public interface CallProc extends Command {
	/**
	 * Returns the value of the '<em><b>Defined</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defined</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defined</em>' reference.
	 * @see #setDefined(Procedure)
	 * @see pascalito.PascalitoPackage#getCallProc_Defined()
	 * @model required="true"
	 * @generated
	 */
	Procedure getDefined();

	/**
	 * Sets the value of the '{@link pascalito.CallProc#getDefined <em>Defined</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defined</em>' reference.
	 * @see #getDefined()
	 * @generated
	 */
	void setDefined(Procedure value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link pascalito.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see pascalito.PascalitoPackage#getCallProc_Parameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getParameter();

} // CallProc
