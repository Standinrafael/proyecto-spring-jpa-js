package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Consumo;

@Repository
@Transactional
public class ConsumoRepoImpl implements IConsumoRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertarConsumo(Consumo consumo) {
		// TODO Auto-generated method stub
		this.entityManager.persist(consumo);
	}

	@Override
	public void actualizarConsumo(Consumo consumo) {
		// TODO Auto-generated method stub
		this.entityManager.merge(consumo);
	}

}
