/**
 */
package pascalito.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pascalito.Desvio;
import pascalito.Expressao;
import pascalito.PascalitoPackage;
import pascalito.SeqComandos;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Desvio</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pascalito.impl.DesvioImpl#getSe <em>Se</em>}</li>
 *   <li>{@link pascalito.impl.DesvioImpl#getFaca <em>Faca</em>}</li>
 *   <li>{@link pascalito.impl.DesvioImpl#getSeNao <em>Se Nao</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DesvioImpl extends ComandoImpl implements Desvio {
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
	 * The cached value of the '{@link #getSeNao() <em>Se Nao</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeNao()
	 * @generated
	 * @ordered
	 */
	protected SeqComandos seNao;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DesvioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PascalitoPackage.Literals.DESVIO;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalitoPackage.DESVIO__SE, oldSe, newSe);
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
				msgs = ((InternalEObject)se).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalitoPackage.DESVIO__SE, null, msgs);
			if (newSe != null)
				msgs = ((InternalEObject)newSe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalitoPackage.DESVIO__SE, null, msgs);
			msgs = basicSetSe(newSe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PascalitoPackage.DESVIO__SE, newSe, newSe));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalitoPackage.DESVIO__FACA, oldFaca, newFaca);
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
				msgs = ((InternalEObject)faca).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalitoPackage.DESVIO__FACA, null, msgs);
			if (newFaca != null)
				msgs = ((InternalEObject)newFaca).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalitoPackage.DESVIO__FACA, null, msgs);
			msgs = basicSetFaca(newFaca, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PascalitoPackage.DESVIO__FACA, newFaca, newFaca));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeqComandos getSeNao() {
		return seNao;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeNao(SeqComandos newSeNao, NotificationChain msgs) {
		SeqComandos oldSeNao = seNao;
		seNao = newSeNao;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalitoPackage.DESVIO__SE_NAO, oldSeNao, newSeNao);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeNao(SeqComandos newSeNao) {
		if (newSeNao != seNao) {
			NotificationChain msgs = null;
			if (seNao != null)
				msgs = ((InternalEObject)seNao).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalitoPackage.DESVIO__SE_NAO, null, msgs);
			if (newSeNao != null)
				msgs = ((InternalEObject)newSeNao).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalitoPackage.DESVIO__SE_NAO, null, msgs);
			msgs = basicSetSeNao(newSeNao, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PascalitoPackage.DESVIO__SE_NAO, newSeNao, newSeNao));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PascalitoPackage.DESVIO__SE:
				return basicSetSe(null, msgs);
			case PascalitoPackage.DESVIO__FACA:
				return basicSetFaca(null, msgs);
			case PascalitoPackage.DESVIO__SE_NAO:
				return basicSetSeNao(null, msgs);
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
			case PascalitoPackage.DESVIO__SE:
				return getSe();
			case PascalitoPackage.DESVIO__FACA:
				return getFaca();
			case PascalitoPackage.DESVIO__SE_NAO:
				return getSeNao();
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
			case PascalitoPackage.DESVIO__SE:
				setSe((Expressao)newValue);
				return;
			case PascalitoPackage.DESVIO__FACA:
				setFaca((SeqComandos)newValue);
				return;
			case PascalitoPackage.DESVIO__SE_NAO:
				setSeNao((SeqComandos)newValue);
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
			case PascalitoPackage.DESVIO__SE:
				setSe((Expressao)null);
				return;
			case PascalitoPackage.DESVIO__FACA:
				setFaca((SeqComandos)null);
				return;
			case PascalitoPackage.DESVIO__SE_NAO:
				setSeNao((SeqComandos)null);
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
			case PascalitoPackage.DESVIO__SE:
				return se != null;
			case PascalitoPackage.DESVIO__FACA:
				return faca != null;
			case PascalitoPackage.DESVIO__SE_NAO:
				return seNao != null;
		}
		return super.eIsSet(featureID);
	}

} //DesvioImpl
