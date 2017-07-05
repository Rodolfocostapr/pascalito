/**
 */
package pascalito;

import java.math.BigDecimal;

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
 *   <li>{@link pascalito.Expressao#getPrioridade <em>Prioridade</em>}</li>
 * </ul>
 *
 * @see pascalito.PascalitoPackage#getExpressao()
 * @model abstract="true"
 * @generated
 */
public interface Expressao extends EObject {
	/**
	 * Returns the value of the '<em><b>Prioridade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prioridade</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prioridade</em>' attribute.
	 * @see #setPrioridade(BigDecimal)
	 * @see pascalito.PascalitoPackage#getExpressao_Prioridade()
	 * @model
	 * @generated
	 */
	BigDecimal getPrioridade();

	/**
	 * Sets the value of the '{@link pascalito.Expressao#getPrioridade <em>Prioridade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prioridade</em>' attribute.
	 * @see #getPrioridade()
	 * @generated
	 */
	void setPrioridade(BigDecimal value);

} // Expressao
