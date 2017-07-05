/**
 */
package pascalito;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Seq Comandos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pascalito.SeqComandos#getComando <em>Comando</em>}</li>
 * </ul>
 *
 * @see pascalito.PascalitoPackage#getSeqComandos()
 * @model
 * @generated
 */
public interface SeqComandos extends EObject {
	/**
	 * Returns the value of the '<em><b>Comando</b></em>' containment reference list.
	 * The list contents are of type {@link pascalito.Comando}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comando</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comando</em>' containment reference list.
	 * @see pascalito.PascalitoPackage#getSeqComandos_Comando()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Comando> getComando();

} // SeqComandos
