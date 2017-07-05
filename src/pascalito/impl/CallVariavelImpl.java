/**
 */
package pascalito.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pascalito.CallVariavel;
import pascalito.PascalitoPackage;
import pascalito.Variavel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Variavel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pascalito.impl.CallVariavelImpl#getRepresenta <em>Representa</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CallVariavelImpl extends ExpressaoImpl implements CallVariavel {
	/**
	 * The cached value of the '{@link #getRepresenta() <em>Representa</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresenta()
	 * @generated
	 * @ordered
	 */
	protected Variavel representa;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallVariavelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PascalitoPackage.Literals.CALL_VARIAVEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variavel getRepresenta() {
		if (representa != null && representa.eIsProxy()) {
			InternalEObject oldRepresenta = (InternalEObject)representa;
			representa = (Variavel)eResolveProxy(oldRepresenta);
			if (representa != oldRepresenta) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PascalitoPackage.CALL_VARIAVEL__REPRESENTA, oldRepresenta, representa));
			}
		}
		return representa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variavel basicGetRepresenta() {
		return representa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresenta(Variavel newRepresenta) {
		Variavel oldRepresenta = representa;
		representa = newRepresenta;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PascalitoPackage.CALL_VARIAVEL__REPRESENTA, oldRepresenta, representa));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PascalitoPackage.CALL_VARIAVEL__REPRESENTA:
				if (resolve) return getRepresenta();
				return basicGetRepresenta();
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
			case PascalitoPackage.CALL_VARIAVEL__REPRESENTA:
				setRepresenta((Variavel)newValue);
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
			case PascalitoPackage.CALL_VARIAVEL__REPRESENTA:
				setRepresenta((Variavel)null);
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
			case PascalitoPackage.CALL_VARIAVEL__REPRESENTA:
				return representa != null;
		}
		return super.eIsSet(featureID);
	}

} //CallVariavelImpl
