package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Supermercado;

@Repository
@Transactional
public class SupermercadoRepoImpl implements ISupermercadoRepo {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarSupermercado(Supermercado supermercado) {
		// TODO Auto-generated method stub
		this.entityManager.persist(supermercado);
	}

	@Override
	public void actualizarSupermercado(Supermercado supermercado) {
		// TODO Auto-generated method stub
		this.entityManager.merge(supermercado);
	}

	@Override
	public Supermercado buscarSupermercadoporId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void borrarSupermercadoPorId(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
