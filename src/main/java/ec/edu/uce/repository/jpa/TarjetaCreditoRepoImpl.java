package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.uce.ProyectoSpringJpaJsApplication;
import ec.edu.uce.modelo.jpa.CuentaBancaria;
import ec.edu.uce.modelo.jpa.TarjetaCredito;

@Repository
@Transactional
public class TarjetaCreditoRepoImpl implements ITarjetaCreditoRepo {

	private static final Logger LOG = LoggerFactory.getLogger(TarjetaCreditoRepoImpl.class);
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertarTarjetaCredito(TarjetaCredito tarjeta) {
		// TODO Auto-generated method stub
		this.entityManager.persist(tarjeta);
	}

	@Override
	public void actualizarTarjetaCredito(TarjetaCredito tarjeta) {
		// TODO Auto-generated method stub
		this.entityManager.merge(tarjeta);
	
	}

	@Override
	public TarjetaCredito buscarPorNumero(String numero) {
		// TODO Auto-generated method stub
		TypedQuery<TarjetaCredito> miTypedQuery = (TypedQuery<TarjetaCredito>) this.entityManager
				.createQuery("select t from TarjetaCredito t where t.numero=: numero", TarjetaCredito.class);
		miTypedQuery.setParameter("numero", numero);
		return miTypedQuery.getSingleResult();
	}

	@Override
	public void actualizarTarjetaCreditoException(TarjetaCredito tarjeta) {
		// TODO Auto-generated method stub
		this.entityManager.merge(tarjeta);
		
		try {
			throw new ArithmeticException();
		}catch(ArithmeticException e) {
			LOG.error("ERROR ARITMETICO");
		}
		
	}

}
