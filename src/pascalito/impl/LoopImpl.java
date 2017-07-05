/**
 */
package pascalito.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pascalito.Expressao;
import pascalito.Loop;
import pascalito.PascalitoPackage;
import pascalito.SeqComandos;

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
	 * The cached value of the '{@link #getFaca() <em>Faca</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaca()
	 * @generated
	 * @ordered
	 */
	protected SeqComandos faca;

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
	public SeqComandos getFaca() {
		return faca;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFaca(SeqComandos newFaca, NotificationChain msgs) {
		SeqComandos oldFaca = faca;
		faca = newFaca;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalitoPackage.LOOP__FACA, oldFaca, newFaca);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFaca(SeqComandos newFaca) {
		if (newFaca != faca) {
			NotificationChain msgs = null;
			if (faca != null)
				msgs = ((InternalEObject)faca).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalitoPackage.LOOP__FACA, null, msgs);
			if (newFaca != null)
				msgs = ((InternalEObject)newFaca).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalitoPackage.LOOP__FACA, null, msgs);
			msgs = basicSetFaca(newFaca, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PascalitoPackage.LOOP__FACA, newFaca, newFaca));
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
				return basicSetFaca(null, msgs);
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PascalitoPackage.LOOP__SE:
				setSe((Expressao)newValue);
				return;
			case PascalitoPackage.LOOP__FACA:
				setFaca((SeqComandos)newValue);
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
				setFaca((SeqComandos)null);
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
				return faca != null;
		}
		return super.eIsSet(featureID);
	}

} //LoopImpl
