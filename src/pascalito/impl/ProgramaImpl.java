/**
 */
package pascalito.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import pascalito.Bloco;
import pascalito.PascalitoPackage;
import pascalito.Programa;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Programa</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pascalito.impl.ProgramaImpl#getIdent <em>Ident</em>}</li>
 *   <li>{@link pascalito.impl.ProgramaImpl#getBloco <em>Bloco</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramaImpl extends MinimalEObjectImpl.Container implements Programa {
	/**
	 * The default value of the '{@link #getIdent() <em>Ident</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdent()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdent() <em>Ident</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdent()
	 * @generated
	 * @ordered
	 */
	protected String ident = IDENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBloco() <em>Bloco</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBloco()
	 * @generated
	 * @ordered
	 */
	protected Bloco bloco;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PascalitoPackage.Literals.PROGRAMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdent() {
		return ident;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdent(String newIdent) {
		String oldIdent = ident;
		ident = newIdent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PascalitoPackage.PROGRAMA__IDENT, oldIdent, ident));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bloco getBloco() {
		return bloco;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBloco(Bloco newBloco, NotificationChain msgs) {
		Bloco oldBloco = bloco;
		bloco = newBloco;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalitoPackage.PROGRAMA__BLOCO, oldBloco, newBloco);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBloco(Bloco newBloco) {
		if (newBloco != bloco) {
			NotificationChain msgs = null;
			if (bloco != null)
				msgs = ((InternalEObject)bloco).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalitoPackage.PROGRAMA__BLOCO, null, msgs);
			if (newBloco != null)
				msgs = ((InternalEObject)newBloco).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalitoPackage.PROGRAMA__BLOCO, null, msgs);
			msgs = basicSetBloco(newBloco, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PascalitoPackage.PROGRAMA__BLOCO, newBloco, newBloco));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PascalitoPackage.PROGRAMA__BLOCO:
				return basicSetBloco(null, msgs);
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
			case PascalitoPackage.PROGRAMA__IDENT:
				return getIdent();
			case PascalitoPackage.PROGRAMA__BLOCO:
				return getBloco();
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
			case PascalitoPackage.PROGRAMA__IDENT:
				setIdent((String)newValue);
				return;
			case PascalitoPackage.PROGRAMA__BLOCO:
				setBloco((Bloco)newValue);
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
			case PascalitoPackage.PROGRAMA__IDENT:
				setIdent(IDENT_EDEFAULT);
				return;
			case PascalitoPackage.PROGRAMA__BLOCO:
				setBloco((Bloco)null);
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
			case PascalitoPackage.PROGRAMA__IDENT:
				return IDENT_EDEFAULT == null ? ident != null : !IDENT_EDEFAULT.equals(ident);
			case PascalitoPackage.PROGRAMA__BLOCO:
				return bloco != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Ident: ");
		result.append(ident);
		result.append(')');
		return result.toString();
	}

} //ProgramaImpl
