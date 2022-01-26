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
		return this.entityManager.find(Parque.class, id);
	}

	@Override
	public void borrarParquePorId(Integer id) {
		// TODO Auto-generated method stub
		Parque parqueABorrar = this.buscarParquePorId(id);
		this.entityManager.remove(parqueABorrar);
	}

	@Override
	public Parque buscarParquePorPais(String pais) {
		// TODO Auto-generated method stub
		Query miQuery = this.entityManager.createQuery("select p from Parque p where p.pais=:valor");
		miQuery.setParameter("valor", pais);
		Parque miParque = (Parque) miQuery.getSingleResult();
		return miParque;
	}

	/**
	 * Este metodo es igual que el buscarParquePorPais nada mas que con TypedQuery
	 *
	 */

	@Override
	public Parque buscarParquePorPaisType(String pais) {
		// TODO Auto-generated method stub
		TypedQuery<Parque> miTypedQuery = (TypedQuery<Parque>) this.entityManager
				.createQuery("select p from Parque p where p.pais=:valor");
		miTypedQuery.setParameter("valor", pais);
		return miTypedQuery.getSingleResult();
	}

	/**
	 * Este metodo es igual que el buscarParquePorPais nada mas que con NamedQuery
	 *
	 */

	@Override
	public Parque buscarParquePorPaisNamed(String pais) {
		// TODO Auto-generated method stub
		Query miQuery = this.entityManager.createNamedQuery("Parque.buscarPorPais");
		miQuery.setParameter("valor", pais);
		return (Parque) miQuery.getSingleResult();
	}

	/**
	 * Este metodo es igual que el buscarParquePorPais nada mas que con NativeQuery
	 *
	 */

	@Override
	public Parque buscarParquePorPaisNative(String pais) {
		// TODO Auto-generated method stub
		Query miQuery = this.entityManager.createNativeQuery("select * from parque p where p.pais=:valor",
				Parque.class);
		miQuery.setParameter("valor", pais);
		return (Parque) miQuery.getSingleResult();
	}

	/**
	 * Este metodo es igual que el buscarParquePorPais nada mas que con CriteriaApi
	 *
	 */

	@Override
	public Parque buscarParquePorPaisCriteriaApi(String pais) {
		// TODO Auto-generated method stub
		// Especificar tipo de Query
		CriteriaBuilder myCriteria = this.entityManager.getCriteriaBuilder();

		// Especificar tipo de retorno
		CriteriaQuery<Parque> myQuery = myCriteria.createQuery(Parque.class);

		// Construir miSQL: select * from
		Root<Parque> myTable = myQuery.from(Parque.class);

		// where en criteria api se conoce como predicado
		Predicate p1 = myCriteria.equal(myTable.get("pais"), pais);

		// empezamos a conformar el select
		myQuery.select(myTable).where(p1);

		TypedQuery<Parque> typedQuery = this.entityManager.createQuery(myQuery);

		return typedQuery.getSingleResult();
	}

}
