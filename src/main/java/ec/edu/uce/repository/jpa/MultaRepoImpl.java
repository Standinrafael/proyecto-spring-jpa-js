package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Multa;

@Repository
@Transactional
public class MultaRepoImpl implements IMultaRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public void insertarMulta(Multa multa) {
		// TODO Auto-generated method stub
		this.entityManager.persist(multa);
	}

}
