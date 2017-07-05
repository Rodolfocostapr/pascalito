/**
 */
package pascalito;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bloco</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pascalito.Bloco#getDefvariavel <em>Defvariavel</em>}</li>
 *   <li>{@link pascalito.Bloco#getDefprocedimento <em>Defprocedimento</em>}</li>
 *   <li>{@link pascalito.Bloco#getSeqcomando <em>Seqcomando</em>}</li>
 * </ul>
 *
 * @see pascalito.PascalitoPackage#getBloco()
 * @model
 * @generated
 */
public interface Bloco extends EObject {
	/**
	 * Returns the value of the '<em><b>Defvariavel</b></em>' containment reference list.
	 * The list contents are of type {@link pascalito.Variavel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defvariavel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defvariavel</em>' containment reference list.
	 * @see pascalito.PascalitoPackage#getBloco_Defvariavel()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variavel> getDefvariavel();

	/**
	 * Returns the value of the '<em><b>Defprocedimento</b></em>' containment reference list.
	 * The list contents are of type {@link pascalito.Procedimento}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defprocedimento</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defprocedimento</em>' containment reference list.
	 * @see pascalito.PascalitoPackage#getBloco_Defprocedimento()
	 * @model containment="true"
	 * @generated
	 */
	EList<Procedimento> getDefprocedimento();

	/**
	 * Returns the value of the '<em><b>Seqcomando</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seqcomando</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seqcomando</em>' containment reference.
	 * @see #setSeqcomando(SeqComandos)
	 * @see pascalito.PascalitoPackage#getBloco_Seqcomando()
	 * @model containment="true"
	 * @generated
	 */
	SeqComandos getSeqcomando();

	/**
	 * Sets the value of the '{@link pascalito.Bloco#getSeqcomando <em>Seqcomando</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seqcomando</em>' containment reference.
	 * @see #getSeqcomando()
	 * @generated
	 */
	void setSeqcomando(SeqComandos value);

} // Bloco
