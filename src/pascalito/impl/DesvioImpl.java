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
import pascalito.Desvio;
import pascalito.Expressao;
import pascalito.PascalitoPackage;

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
	 * The cached value of the '{@link #getFaca() <em>Faca</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaca()
	 * @generated
	 * @ordered
	 */
	protected EList<Comando> faca;

	/**
	 * The cached value of the '{@link #getSeNao() <em>Se Nao</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeNao()
	 * @generated
	 * @ordered
	 */
	protected EList<Comando> seNao;

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
	public EList<Comando> getFaca() {
		if (faca == null) {
			faca = new EObjectContainmentEList<Comando>(Comando.class, this, PascalitoPackage.DESVIO__FACA);
		}
		return faca;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comando> getSeNao() {
		if (seNao == null) {
			seNao = new EObjectContainmentEList<Comando>(Comando.class, this, PascalitoPackage.DESVIO__SE_NAO);
		}
		return seNao;
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
				return ((InternalEList<?>)getFaca()).basicRemove(otherEnd, msgs);
			case PascalitoPackage.DESVIO__SE_NAO:
				return ((InternalEList<?>)getSeNao()).basicRemove(otherEnd, msgs);
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PascalitoPackage.DESVIO__SE:
				setSe((Expressao)newValue);
				return;
			case PascalitoPackage.DESVIO__FACA:
				getFaca().clear();
				getFaca().addAll((Collection<? extends Comando>)newValue);
				return;
			case PascalitoPackage.DESVIO__SE_NAO:
				getSeNao().clear();
				getSeNao().addAll((Collection<? extends Comando>)newValue);
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
				getFaca().clear();
				return;
			case PascalitoPackage.DESVIO__SE_NAO:
				getSeNao().clear();
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
				return faca != null && !faca.isEmpty();
			case PascalitoPackage.DESVIO__SE_NAO:
				return seNao != null && !seNao.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DesvioImpl
