/**
 */
package pascalito;

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
 *   <li>{@link pascalito.Procedimento#getIdentificador <em>Identificador</em>}</li>
 *   <li>{@link pascalito.Procedimento#getListaparmetros <em>Listaparmetros</em>}</li>
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
	 * Returns the value of the '<em><b>Identificador</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identificador</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identificador</em>' attribute.
	 * @see #setIdentificador(String)
	 * @see pascalito.PascalitoPackage#getProcedimento_Identificador()
	 * @model
	 * @generated
	 */
	String getIdentificador();

	/**
	 * Sets the value of the '{@link pascalito.Procedimento#getIdentificador <em>Identificador</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identificador</em>' attribute.
	 * @see #getIdentificador()
	 * @generated
	 */
	void setIdentificador(String value);

	/**
	 * Returns the value of the '<em><b>Listaparmetros</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Listaparmetros</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listaparmetros</em>' containment reference.
	 * @see #setListaparmetros(ListaParmetros)
	 * @see pascalito.PascalitoPackage#getProcedimento_Listaparmetros()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ListaParmetros getListaparmetros();

	/**
	 * Sets the value of the '{@link pascalito.Procedimento#getListaparmetros <em>Listaparmetros</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Listaparmetros</em>' containment reference.
	 * @see #getListaparmetros()
	 * @generated
	 */
	void setListaparmetros(ListaParmetros value);

} // Procedimento
