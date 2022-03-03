package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Habiente;

@Repository
@Transactional
public class HabienteRepoImpl implements IHabienteRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertarHabiente(Habiente habiente) {
		// TODO Auto-generated method stub
		this.entityManager.persist(habiente);
	}

	@Override
	public void actualizarHabiente(Habiente habiente) {
		// TODO Auto-generated method stub
		this.entityManager.merge(habiente);
	}

	@Override
	public Habiente buscarHabientePorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Habiente.class, id);
	}

	@Override
	public void borrarHabientePorId(Integer id) {
		// TODO Auto-generated method stub
		Habiente habienteBorrar=this.buscarHabientePorId(id);
		this.entityManager.remove(habienteBorrar);
	}

}
