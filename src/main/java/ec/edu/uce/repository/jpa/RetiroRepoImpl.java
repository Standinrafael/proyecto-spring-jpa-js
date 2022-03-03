package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Retiro;

@Repository
@Transactional
public class RetiroRepoImpl implements IRetiroRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertarReitro(Retiro retiro) {
		// TODO Auto-generated method stub
		this.entityManager.persist(retiro);
	}

	@Override
	public void actualizarRetiro(Retiro retiro) {
		// TODO Auto-generated method stub
		this.entityManager.merge(retiro);
	}

	@Override
	public Retiro buscarRetiroPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Retiro.class, id);
	}

	@Override
	public void borrarRetiroPorId(Integer id) {
		// TODO Auto-generated method stub
		Retiro retiroBorrar=this.buscarRetiroPorId(id);
		this.entityManager.remove(retiroBorrar);
	}

}
