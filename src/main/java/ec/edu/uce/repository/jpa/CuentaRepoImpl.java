package ec.edu.uce.repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.uce.ProyectoSpringJpaJsApplication;
import ec.edu.uce.modelo.jpa.Cuenta;

@Repository
@Transactional
public class CuentaRepoImpl implements ICuentaRepo {

	private static final Logger LOG = LoggerFactory.getLogger(CuentaRepoImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarCuenta(Cuenta cuenta) {
		// TODO Auto-generated method stub
		this.entityManager.persist(cuenta);
	}

	@Override
	public void actualizarCuenta(Cuenta cuenta) {
		// TODO Auto-generated method stub
		this.entityManager.merge(cuenta);
		//Error de NullPointer para la excepcion
		throw new NullPointerException();
	}

	@Override
	public Cuenta buscarCuentaPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Cuenta.class, id);
	}

	@Override
	public void borrarCuentaPorId(Integer id) {
		// TODO Auto-generated method stub
		Cuenta cuentaBorrar = this.buscarCuentaPorId(id);
		this.entityManager.remove(cuentaBorrar);
	}

	@Override
	@Transactional(value = TxType.REQUIRES_NEW)
	public List<Cuenta> buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		
		try {
			TypedQuery<Cuenta> myQuery = this.entityManager
					.createQuery("select c from Cuenta c,Habiente h WHERE h=c and h.cedula=:cedula", Cuenta.class);
			myQuery.setParameter("cedula", cedula);

			return myQuery.getResultList();
			
		}catch(NoResultException e) {
			LOG.warn("No existe cuentas bancarias para la cedula " + cedula);
			return null;
		}
		
	}

	@Override
	@Transactional
	public Cuenta buscarPorNumero(String numero) {
		// TODO Auto-generated method stub
		try {
			TypedQuery<Cuenta> myQuery = this.entityManager
					.createQuery("select c from Cuenta c where c.numeroCuenta=:numero", Cuenta.class);
			myQuery.setParameter("numero", numero);
			return myQuery.getSingleResult();
		} catch (NoResultException e) {
			LOG.warn("No existe la cuenta " + numero);
			return null;
		}

	}

}
