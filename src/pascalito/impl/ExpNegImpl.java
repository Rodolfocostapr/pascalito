/**
 */
package pascalito.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pascalito.ExpNeg;
import pascalito.Expressao;
import pascalito.PascalitoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exp Neg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pascalito.impl.ExpNegImpl#getNega <em>Nega</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpNegImpl extends ExpressaoImpl implements ExpNeg {
	/**
	 * The cached value of the '{@link #getNega() <em>Nega</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNega()
	 * @generated
	 * @ordered
	 */
	protected Expressao nega;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpNegImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PascalitoPackage.Literals.EXP_NEG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expressao getNega() {
		return nega;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNega(Expressao newNega, NotificationChain msgs) {
		Expressao oldNega = nega;
		nega = newNega;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalitoPackage.EXP_NEG__NEGA, oldNega, newNega);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNega(Expressao newNega) {
		if (newNega != nega) {
			NotificationChain msgs = null;
			if (nega != null)
				msgs = ((InternalEObject)nega).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalitoPackage.EXP_NEG__NEGA, null, msgs);
			if (newNega != null)
				msgs = ((InternalEObject)newNega).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalitoPackage.EXP_NEG__NEGA, null, msgs);
			msgs = basicSetNega(newNega, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PascalitoPackage.EXP_NEG__NEGA, newNega, newNega));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PascalitoPackage.EXP_NEG__NEGA:
				return basicSetNega(null, msgs);
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
			case PascalitoPackage.EXP_NEG__NEGA:
				return getNega();
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
			case PascalitoPackage.EXP_NEG__NEGA:
				setNega((Expressao)newValue);
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
			case PascalitoPackage.EXP_NEG__NEGA:
				setNega((Expressao)null);
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
			case PascalitoPackage.EXP_NEG__NEGA:
				return nega != null;
		}
		return super.eIsSet(featureID);
	}

} //ExpNegImpl
