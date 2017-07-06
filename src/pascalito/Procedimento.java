/**
 */
package pascalito;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedimento</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pascalito.Procedimento#getBloco <em>Bloco</em>}</li>
 *   <li>{@link pascalito.Procedimento#getName <em>Name</em>}</li>
 *   <li>{@link pascalito.Procedimento#getParametro <em>Parametro</em>}</li>
 * </ul>
 *
 * @see pascalito.PascalitoPackage#getProcedimento()
 * @model
 * @generated
 */
public interface Procedimento extends EObject {
	/**
	 * Returns the value of the '<em><b>Bloco</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bloco</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bloco</em>' containment reference.
	 * @see #setBloco(Bloco)
	 * @see pascalito.PascalitoPackage#getProcedimento_Bloco()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Bloco getBloco();

	/**
	 * Sets the value of the '{@link pascalito.Procedimento#getBloco <em>Bloco</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bloco</em>' containment reference.
	 * @see #getBloco()
	 * @generated
	 */
	void setBloco(Bloco value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pascalito.PascalitoPackage#getProcedimento_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pascalito.Procedimento#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parametro</b></em>' containment reference list.
	 * The list contents are of type {@link pascalito.Variavel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parametro</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parametro</em>' containment reference list.
	 * @see pascalito.PascalitoPackage#getProcedimento_Parametro()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variavel> getParametro();

} // Procedimento
