package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
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
		Farmacia farmaciaABorrar = this.buscarFarmaciaPorId(id);
		this.entityManager.remove(farmaciaABorrar);
	}

	@Override
	public Farmacia buscarFarmaciaPorNombre(String nombre) {
		// TODO Auto-generated method stub
		Query miQuery = this.entityManager.createQuery("select f from Farmacia f where f.nombre=:valor");
		miQuery.setParameter("valor", nombre);
		Farmacia miFarmacia = (Farmacia) miQuery.getSingleResult();
		return miFarmacia;
	}

	/**
	 * Este metodo es igual que el buscarFarmaciaPorNombre nada mas que con
	 * TypedQuery
	 *
	 */
	@Override
	public Farmacia buscarFarmaciaPorNombreType(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<Farmacia> miTypedQuery = (TypedQuery<Farmacia>) this.entityManager
				.createQuery("select f from Farmacia f where f.nombre=:valor");
		miTypedQuery.setParameter("valor", nombre);
		return miTypedQuery.getSingleResult();
	}

	/**
	 * Este metodo es igual que el buscarFarmaciaPorNombre nada mas que con
	 * NamedQuery
	 *
	 */

	@Override
	public Farmacia buscarFarmaciaPorNombreNamed(String nombre) {
		// TODO Auto-generated method stub
		Query miQuery = this.entityManager.createNamedQuery("Farmacia.buscarPorNombre");
		miQuery.setParameter("valor", nombre);
		return (Farmacia) miQuery.getSingleResult();
	}

	/**
	 * Este metodo es igual que el buscarFarmaciaPorNombre nada mas que con
	 * NativeQuery
	 *
	 */

	@Override
	public Farmacia buscarFarmaciaPorNombreNative(String nombre) {
		// TODO Auto-generated method stub
		Query miQuery = this.entityManager.createNativeQuery("select * from farmacia f where f.nombre=:valor",
				Farmacia.class);
		miQuery.setParameter("valor", nombre);
		return (Farmacia) miQuery.getSingleResult();
	}

	/**
	 * Este metodo es igual que el buscarFarmaciaPorNombre nada mas que con
	 * CriteriaApi
	 *
	 */

	@Override
	public Farmacia buscarFarmaciaPorNombreCriteriaApi(String nombre) {
		// TODO Auto-generated method stub

		// Especificar tipo de Query
		CriteriaBuilder myCriteria = this.entityManager.getCriteriaBuilder();

		// Especificar tipo de retorno
		CriteriaQuery<Farmacia> myQuery = myCriteria.createQuery(Farmacia.class);

		// Construir miSQL: select * from
		Root<Farmacia> myTable = myQuery.from(Farmacia.class);

		// where en criteria api se conoce como predicado
		Predicate p1 = myCriteria.equal(myTable.get("nombre"), nombre);

		// empezamos a conformar el select
		myQuery.select(myTable).where(p1);

		TypedQuery<Farmacia> typedQuery = this.entityManager.createQuery(myQuery);

		return typedQuery.getSingleResult();
	}

}
