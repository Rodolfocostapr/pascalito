/**
 */
package pascalito;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programa</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pascalito.Programa#getIdent <em>Ident</em>}</li>
 *   <li>{@link pascalito.Programa#getBloco <em>Bloco</em>}</li>
 * </ul>
 *
 * @see pascalito.PascalitoPackage#getPrograma()
 * @model
 * @generated
 */
public interface Programa extends EObject {
	/**
	 * Returns the value of the '<em><b>Ident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ident</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ident</em>' attribute.
	 * @see #setIdent(String)
	 * @see pascalito.PascalitoPackage#getPrograma_Ident()
	 * @model required="true"
	 * @generated
	 */
	String getIdent();

	/**
	 * Sets the value of the '{@link pascalito.Programa#getIdent <em>Ident</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ident</em>' attribute.
	 * @see #getIdent()
	 * @generated
	 */
	void setIdent(String value);

	/**
	 * Returns the value of the '<em><b>Bloco</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bloco</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bloco</em>' containment reference.
	 * @see #setBloco(Bloco)
	 * @see pascalito.PascalitoPackage#getPrograma_Bloco()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Bloco getBloco();

	/**
	 * Sets the value of the '{@link pascalito.Programa#getBloco <em>Bloco</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bloco</em>' containment reference.
	 * @see #getBloco()
	 * @generated
	 */
	void setBloco(Bloco value);

} // Programa
