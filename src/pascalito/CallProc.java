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
 *   <li>{@link pascalito.CallProc#getRepresentaProc <em>Representa Proc</em>}</li>
 *   <li>{@link pascalito.CallProc#getParametro <em>Parametro</em>}</li>
 * </ul>
 *
 * @see pascalito.PascalitoPackage#getCallProc()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='numeroParametros'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot numeroParametros='self.representaProc.parametro->size() = parametro->size()'"
 * @generated
 */
public interface CallProc extends Expressao {
	/**
	 * Returns the value of the '<em><b>Representa Proc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Representa Proc</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representa Proc</em>' reference.
	 * @see #setRepresentaProc(Procedimento)
	 * @see pascalito.PascalitoPackage#getCallProc_RepresentaProc()
	 * @model required="true"
	 * @generated
	 */
	Procedimento getRepresentaProc();

	/**
	 * Sets the value of the '{@link pascalito.CallProc#getRepresentaProc <em>Representa Proc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representa Proc</em>' reference.
	 * @see #getRepresentaProc()
	 * @generated
	 */
	void setRepresentaProc(Procedimento value);

	/**
	 * Returns the value of the '<em><b>Parametro</b></em>' containment reference list.
	 * The list contents are of type {@link pascalito.Expressao}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parametro</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parametro</em>' containment reference list.
	 * @see pascalito.PascalitoPackage#getCallProc_Parametro()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expressao> getParametro();

} // CallProc
