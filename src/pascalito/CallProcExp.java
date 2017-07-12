/**
 */
package pascalito;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Proc Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pascalito.CallProcExp#getRepresent <em>Represent</em>}</li>
 *   <li>{@link pascalito.CallProcExp#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see pascalito.PascalitoPackage#getCallProcExp()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='number_of_parameters'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot number_of_parameters='self.represent.parameter->size() = parameter->size()'"
 * @generated
 */
public interface CallProcExp extends Expression {
	/**
	 * Returns the value of the '<em><b>Represent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Represent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Represent</em>' reference.
	 * @see #setRepresent(Procedure)
	 * @see pascalito.PascalitoPackage#getCallProcExp_Represent()
	 * @model required="true"
	 * @generated
	 */
	Procedure getRepresent();

	/**
	 * Sets the value of the '{@link pascalito.CallProcExp#getRepresent <em>Represent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Represent</em>' reference.
	 * @see #getRepresent()
	 * @generated
	 */
	void setRepresent(Procedure value);

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
	 * @see pascalito.PascalitoPackage#getCallProcExp_Parameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getParameter();

} // CallProcExp
