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
import pascalito.Comando;
import pascalito.PascalitoPackage;
import pascalito.SeqComandos;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Seq Comandos</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pascalito.impl.SeqComandosImpl#getComando <em>Comando</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SeqComandosImpl extends MinimalEObjectImpl.Container implements SeqComandos {
	/**
	 * The cached value of the '{@link #getComando() <em>Comando</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComando()
	 * @generated
	 * @ordered
	 */
	protected EList<Comando> comando;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SeqComandosImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PascalitoPackage.Literals.SEQ_COMANDOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comando> getComando() {
		if (comando == null) {
			comando = new EObjectContainmentEList<Comando>(Comando.class, this, PascalitoPackage.SEQ_COMANDOS__COMANDO);
		}
		return comando;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PascalitoPackage.SEQ_COMANDOS__COMANDO:
				return ((InternalEList<?>)getComando()).basicRemove(otherEnd, msgs);
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
			case PascalitoPackage.SEQ_COMANDOS__COMANDO:
				return getComando();
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
			case PascalitoPackage.SEQ_COMANDOS__COMANDO:
				getComando().clear();
				getComando().addAll((Collection<? extends Comando>)newValue);
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
			case PascalitoPackage.SEQ_COMANDOS__COMANDO:
				getComando().clear();
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
			case PascalitoPackage.SEQ_COMANDOS__COMANDO:
				return comando != null && !comando.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SeqComandosImpl
