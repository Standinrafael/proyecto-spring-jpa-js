package ec.edu.uce.repository.jpa;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Turista;

@Repository
@Transactional
public class TuristaRepoImpl implements ITuristaRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertarTurista(Turista turista) {
		// TODO Auto-generated method stub
		this.entityManager.persist(turista);
	}

	@Override
	public List<Turista> buscarTuristaPorValor() {
		// TODO Auto-generated method stub
		TypedQuery<Turista> myTypedQuery=(TypedQuery<Turista>) this.entityManager.createQuery("select t from Turista t ");
		
		return myTypedQuery.getResultList();
	}

}
