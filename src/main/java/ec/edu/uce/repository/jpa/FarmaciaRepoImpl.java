package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Farmacia;

@Repository
@Transactional
public class FarmaciaRepoImpl implements IFarmaciaRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertarFarmacia(Farmacia farmacia) {
		// TODO Auto-generated method stub
		this.entityManager.persist(farmacia);
	}

	@Override
	public void actualizarFarmacia(Farmacia farmacia) {
		// TODO Auto-generated method stub
		this.entityManager.merge(farmacia);
	}

	@Override
	public Farmacia buscarFarmaciaPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Farmacia.class, id);
	}

	@Override
	public void borrarFarmaciaPorId(Integer id) {
		// TODO Auto-generated method stub
		Farmacia farmaciaABorrar=this.buscarFarmaciaPorId(id);
		this.entityManager.remove(farmaciaABorrar);
	}

	@Override
	public Farmacia buscarFarmaciaPorNombre(String nombre) {
		// TODO Auto-generated method stub
		Query miQuery=this.entityManager.createQuery("select f from Farmacia f where f.nombre=:valor");
		miQuery.setParameter("valor",nombre);
		Farmacia miFarmacia=(Farmacia)miQuery.getSingleResult();
		return miFarmacia;
	}

}
