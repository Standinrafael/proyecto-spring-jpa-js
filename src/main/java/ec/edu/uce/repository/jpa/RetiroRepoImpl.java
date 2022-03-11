package ec.edu.uce.repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Cuenta;
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

	@Override
	public List<Retiro> traerRetiros() {
		// TODO Auto-generated method stub
		TypedQuery<Retiro> myQuery = this.entityManager
				.createQuery("select r from Retiro r,Habiente h WHERE h=r ", Retiro.class);
		

		return myQuery.getResultList();
	}

}
