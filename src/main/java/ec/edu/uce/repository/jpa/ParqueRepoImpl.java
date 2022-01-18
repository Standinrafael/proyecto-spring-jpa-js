package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Parque;

@Repository
@Transactional
public class ParqueRepoImpl implements IParqueRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertarParque(Parque parque) {
		// TODO Auto-generated method stub
		this.entityManager.persist(parque);
	}

	@Override
	public void actualizarParque(Parque parque) {
		// TODO Auto-generated method stub
		this.entityManager.merge(parque);
	}

	@Override
	public Parque buscarParquePorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void borrarParquePorId(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
