package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Computadora;

@Repository
@Transactional
public class ComputadoraRepoImpl implements IComputadoraRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertarComputadora(Computadora computadora) {
		// TODO Auto-generated method stub
		this.entityManager.persist(computadora);
	}

	@Override
	public void actualizarComputadora(Computadora computadora) {
		// TODO Auto-generated method stub
		this.entityManager.merge(computadora);
	}

	@Override
	public Computadora buscarComputadoraPorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void borrarComputadoraPorId(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
