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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pascalito.Bloco;
import pascalito.PascalitoPackage;
import pascalito.Procedimento;
import pascalito.SeqComandos;
import pascalito.Variavel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bloco</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pascalito.impl.BlocoImpl#getDefvariavel <em>Defvariavel</em>}</li>
 *   <li>{@link pascalito.impl.BlocoImpl#getDefprocedimento <em>Defprocedimento</em>}</li>
 *   <li>{@link pascalito.impl.BlocoImpl#getSeqcomando <em>Seqcomando</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlocoImpl extends MinimalEObjectImpl.Container implements Bloco {
	/**
	 * The cached value of the '{@link #getDefvariavel() <em>Defvariavel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefvariavel()
	 * @generated
	 * @ordered
	 */
	protected EList<Variavel> defvariavel;

	/**
	 * The cached value of the '{@link #getDefprocedimento() <em>Defprocedimento</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefprocedimento()
	 * @generated
	 * @ordered
	 */
	protected EList<Procedimento> defprocedimento;

	/**
	 * The cached value of the '{@link #getSeqcomando() <em>Seqcomando</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeqcomando()
	 * @generated
	 * @ordered
	 */
	protected SeqComandos seqcomando;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlocoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PascalitoPackage.Literals.BLOCO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variavel> getDefvariavel() {
		if (defvariavel == null) {
			defvariavel = new EObjectContainmentEList<Variavel>(Variavel.class, this, PascalitoPackage.BLOCO__DEFVARIAVEL);
		}
		return defvariavel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Procedimento> getDefprocedimento() {
		if (defprocedimento == null) {
			defprocedimento = new EObjectContainmentEList<Procedimento>(Procedimento.class, this, PascalitoPackage.BLOCO__DEFPROCEDIMENTO);
		}
		return defprocedimento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeqComandos getSeqcomando() {
		return seqcomando;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeqcomando(SeqComandos newSeqcomando, NotificationChain msgs) {
		SeqComandos oldSeqcomando = seqcomando;
		seqcomando = newSeqcomando;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalitoPackage.BLOCO__SEQCOMANDO, oldSeqcomando, newSeqcomando);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeqcomando(SeqComandos newSeqcomando) {
		if (newSeqcomando != seqcomando) {
			NotificationChain msgs = null;
			if (seqcomando != null)
				msgs = ((InternalEObject)seqcomando).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalitoPackage.BLOCO__SEQCOMANDO, null, msgs);
			if (newSeqcomando != null)
				msgs = ((InternalEObject)newSeqcomando).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalitoPackage.BLOCO__SEQCOMANDO, null, msgs);
			msgs = basicSetSeqcomando(newSeqcomando, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PascalitoPackage.BLOCO__SEQCOMANDO, newSeqcomando, newSeqcomando));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PascalitoPackage.BLOCO__DEFVARIAVEL:
				return ((InternalEList<?>)getDefvariavel()).basicRemove(otherEnd, msgs);
			case PascalitoPackage.BLOCO__DEFPROCEDIMENTO:
				return ((InternalEList<?>)getDefprocedimento()).basicRemove(otherEnd, msgs);
			case PascalitoPackage.BLOCO__SEQCOMANDO:
				return basicSetSeqcomando(null, msgs);
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
			case PascalitoPackage.BLOCO__DEFVARIAVEL:
				return getDefvariavel();
			case PascalitoPackage.BLOCO__DEFPROCEDIMENTO:
				return getDefprocedimento();
			case PascalitoPackage.BLOCO__SEQCOMANDO:
				return getSeqcomando();
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
			case PascalitoPackage.BLOCO__DEFVARIAVEL:
				getDefvariavel().clear();
				getDefvariavel().addAll((Collection<? extends Variavel>)newValue);
				return;
			case PascalitoPackage.BLOCO__DEFPROCEDIMENTO:
				getDefprocedimento().clear();
				getDefprocedimento().addAll((Collection<? extends Procedimento>)newValue);
				return;
			case PascalitoPackage.BLOCO__SEQCOMANDO:
				setSeqcomando((SeqComandos)newValue);
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
			case PascalitoPackage.BLOCO__DEFVARIAVEL:
				getDefvariavel().clear();
				return;
			case PascalitoPackage.BLOCO__DEFPROCEDIMENTO:
				getDefprocedimento().clear();
				return;
			case PascalitoPackage.BLOCO__SEQCOMANDO:
				setSeqcomando((SeqComandos)null);
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
			case PascalitoPackage.BLOCO__DEFVARIAVEL:
				return defvariavel != null && !defvariavel.isEmpty();
			case PascalitoPackage.BLOCO__DEFPROCEDIMENTO:
				return defprocedimento != null && !defprocedimento.isEmpty();
			case PascalitoPackage.BLOCO__SEQCOMANDO:
				return seqcomando != null;
		}
		return super.eIsSet(featureID);
	}

} //BlocoImpl
