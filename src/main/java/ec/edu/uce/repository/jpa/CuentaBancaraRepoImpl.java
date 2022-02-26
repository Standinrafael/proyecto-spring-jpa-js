package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.CuentaBancaria;
import ec.edu.uce.modelo.jpa.Supermercado;
import ec.edu.uce.service.CuentaBancariaServiceImpl;

@Repository
@Transactional
public class CuentaBancaraRepoImpl implements ICuentaBancariaRepo {

	private static final Logger LOG = LoggerFactory.getLogger(CuentaBancaraRepoImpl.class);
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarCuentaBancaria(CuentaBancaria cuenta) {
		// TODO Auto-generated method stub
		this.entityManager.persist(cuenta);
	}

	@Override
	public void actualizarCuentaBancaria(CuentaBancaria cuenta)  {
		// TODO Auto-generated method stub
		
		this.entityManager.merge(cuenta);
		throw new ArrayIndexOutOfBoundsException();
	}

	@Override
	public CuentaBancaria buscarPorNumero(String numero) {
		TypedQuery<CuentaBancaria> miTypedQuery = (TypedQuery<CuentaBancaria>) this.entityManager
				.createQuery("select c from CuentaBancaria c where c.numero=: numero", CuentaBancaria.class);
		miTypedQuery.setParameter("numero", numero);
		return miTypedQuery.getSingleResult();

	}

	@Override
	@Transactional(value=TxType.REQUIRES_NEW)
	public void actualizarCuentaBancaria2(CuentaBancaria cuenta) {
		// TODO Auto-generated method stub
		this.entityManager.merge(cuenta);
//		throw new ArrayIndexOutOfBoundsException();
		//try {
	//		throw new ArrayIndexOutOfBoundsException();
	//	}catch(ArrayIndexOutOfBoundsException e){
		//	LOG.error("ERROR");
	//	}
		
	}

}
