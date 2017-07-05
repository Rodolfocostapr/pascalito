/**
 */
package pascalito.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import pascalito.Comando;
import pascalito.Expressao;
import pascalito.Loop;
import pascalito.PascalitoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pascalito.impl.LoopImpl#getSe <em>Se</em>}</li>
 *   <li>{@link pascalito.impl.LoopImpl#getFaca <em>Faca</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoopImpl extends ComandoImpl implements Loop {
	/**
	 * The cached value of the '{@link #getSe() <em>Se</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSe()
	 * @generated
	 * @ordered
	 */
	protected Expressao se;

	/**
	 * The cached value of the '{@link #getFaca() <em>Faca</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaca()
	 * @generated
	 * @ordered
	 */
	protected EList<Comando> faca;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoopImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PascalitoPackage.Literals.LOOP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expressao getSe() {
		return se;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSe(Expressao newSe, NotificationChain msgs) {
		Expressao oldSe = se;
		se = newSe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalitoPackage.LOOP__SE, oldSe, newSe);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSe(Expressao newSe) {
		if (newSe != se) {
			NotificationChain msgs = null;
			if (se != null)
				msgs = ((InternalEObject)se).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalitoPackage.LOOP__SE, null, msgs);
			if (newSe != null)
				msgs = ((InternalEObject)newSe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalitoPackage.LOOP__SE, null, msgs);
			msgs = basicSetSe(newSe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PascalitoPackage.LOOP__SE, newSe, newSe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comando> getFaca() {
		if (faca == null) {
			faca = new EObjectContainmentEList<Comando>(Comando.class, this, PascalitoPackage.LOOP__FACA);
		}
		return faca;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PascalitoPackage.LOOP__SE:
				return basicSetSe(null, msgs);
			case PascalitoPackage.LOOP__FACA:
				return ((InternalEList<?>)getFaca()).basicRemove(otherEnd, msgs);
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
			case PascalitoPackage.LOOP__SE:
				return getSe();
			case PascalitoPackage.LOOP__FACA:
				return getFaca();
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
			case PascalitoPackage.LOOP__SE:
				setSe((Expressao)newValue);
				return;
			case PascalitoPackage.LOOP__FACA:
				getFaca().clear();
				getFaca().addAll((Collection<? extends Comando>)newValue);
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
			case PascalitoPackage.LOOP__SE:
				setSe((Expressao)null);
				return;
			case PascalitoPackage.LOOP__FACA:
				getFaca().clear();
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
			case PascalitoPackage.LOOP__SE:
				return se != null;
			case PascalitoPackage.LOOP__FACA:
				return faca != null && !faca.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LoopImpl
