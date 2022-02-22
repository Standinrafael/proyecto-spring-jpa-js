package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.CuentaBancaria;
import ec.edu.uce.modelo.jpa.Supermercado;

@Repository
@Transactional
public class CuentaBancaraRepoImpl implements ICuentaBancariaRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarCuentaBancaria(CuentaBancaria cuenta) {
		// TODO Auto-generated method stub
		this.entityManager.persist(cuenta);
	}

	@Override
	public void actualizarCuentaBancaria(CuentaBancaria cuenta) {
		// TODO Auto-generated method stub
		this.entityManager.merge(cuenta);
	}

	@Override
	public CuentaBancaria buscarPorNumero(String numero) {
		TypedQuery<CuentaBancaria> miTypedQuery = (TypedQuery<CuentaBancaria>) this.entityManager
				.createQuery("select c from CuentaBancaria c where c.numero=: numero", CuentaBancaria.class);
		miTypedQuery.setParameter("numero", numero);
		return miTypedQuery.getSingleResult();

	}

}
