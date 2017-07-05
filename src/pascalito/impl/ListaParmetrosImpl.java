/**
 */
package pascalito.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pascalito.ListaParmetros;
import pascalito.PascalitoPackage;
import pascalito.Variavel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lista Parmetros</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pascalito.impl.ListaParmetrosImpl#getVariavel <em>Variavel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListaParmetrosImpl extends MinimalEObjectImpl.Container implements ListaParmetros {
	/**
	 * The cached value of the '{@link #getVariavel() <em>Variavel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariavel()
	 * @generated
	 * @ordered
	 */
	protected EList<Variavel> variavel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListaParmetrosImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PascalitoPackage.Literals.LISTA_PARMETROS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variavel> getVariavel() {
		if (variavel == null) {
			variavel = new EObjectContainmentEList<Variavel>(Variavel.class, this, PascalitoPackage.LISTA_PARMETROS__VARIAVEL);
		}
		return variavel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PascalitoPackage.LISTA_PARMETROS__VARIAVEL:
				return ((InternalEList<?>)getVariavel()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PascalitoPackage.LISTA_PARMETROS__VARIAVEL:
				return getVariavel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PascalitoPackage.LISTA_PARMETROS__VARIAVEL:
				getVariavel().clear();
				getVariavel().addAll((Collection<? extends Variavel>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PascalitoPackage.LISTA_PARMETROS__VARIAVEL:
				getVariavel().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PascalitoPackage.LISTA_PARMETROS__VARIAVEL:
				return variavel != null && !variavel.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListaParmetrosImpl
