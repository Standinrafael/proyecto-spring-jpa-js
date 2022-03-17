package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Poliza;

@Repository
@Transactional
public class PolizaRepoImpl implements IPolizaRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertarPoliza(Poliza poliza) {
		// TODO Auto-generated method stub
		this.entityManager.persist(poliza);
	}

	@Override
	public void actualizarPoliza(Poliza poliza) {
		// TODO Auto-generated method stub
		this.entityManager.merge(poliza);
	}

	@Override
	public Poliza buscarPoliza(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Poliza.class, id);
	}

	@Override
	public void eliminarPoliza(Integer id) {
		// TODO Auto-generated method stub
		Poliza polizaBorrar= this.buscarPoliza(id);
		this.entityManager.remove(polizaBorrar);
	}

}
