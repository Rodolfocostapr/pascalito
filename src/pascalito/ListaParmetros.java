/**
 */
package pascalito;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lista Parmetros</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pascalito.ListaParmetros#getVariavel <em>Variavel</em>}</li>
 * </ul>
 *
 * @see pascalito.PascalitoPackage#getListaParmetros()
 * @model
 * @generated
 */
public interface ListaParmetros extends EObject {
	/**
	 * Returns the value of the '<em><b>Variavel</b></em>' containment reference list.
	 * The list contents are of type {@link pascalito.Variavel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variavel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variavel</em>' containment reference list.
	 * @see pascalito.PascalitoPackage#getListaParmetros_Variavel()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variavel> getVariavel();

} // ListaParmetros
