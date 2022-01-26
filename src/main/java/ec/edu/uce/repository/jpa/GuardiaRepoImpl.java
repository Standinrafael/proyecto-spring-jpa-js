package ec.edu.uce.repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.uce.ProyectoSpringJpaJsApplication;
import ec.edu.uce.modelo.jpa.Guardia;




@Repository
@Transactional
public class GuardiaRepoImpl implements IGuardiaRepo {
	
	private static final Logger LOG = LoggerFactory.getLogger(GuardiaRepoImpl.class);
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarGuardia(Guardia guardia) {
		// TODO Auto-generated method stub
		this.entityManager.persist(guardia);
	}

	@Override
	public void actualizarGuardia(Guardia guardia) {
		// TODO Auto-generated method stub
		this.entityManager.merge(guardia);
	}

	@Override
	public Guardia buscarGuardiaPorId(Integer id) {
		// TODO Auto-generated method stub
		
		return this.entityManager.find(Guardia.class, id);
	}

	@Override
	public void borrarGuardiaPorId(Integer id) {
		// TODO Auto-generated method stub
		Guardia guardiaABorrar=this.buscarGuardiaPorId(id);
		this.entityManager.remove(guardiaABorrar);
	}

	@Override
	public Guardia buscarGuardiaPorApellido(String apellido) {
		// TODO Auto-generated method stub
		
		//SQL = select * from guardia where apellido=MVN
		
		//JPQL =select g from Guardia g where g.apellido=:valor
		
		Guardia miGuardia=null;
		try {
			Query miQuery=this.entityManager.createQuery("select g from Guardia g where g.apellido=:valor");
			miQuery.setParameter("valor",apellido);
			miGuardia=(Guardia)miQuery.getSingleResult();
		}catch(NoResultException e) {
			LOG.error("No existe un resultado para:"+apellido,e);
		}
	
		
		return miGuardia;
	}
	
	/**
	 * Este metodo es igual que el buscarGuardiaPorApellido nada mas que con TypedQuery
	 *
	 */
	
	@Override
	public Guardia buscarGuardiaPorApellidoType(String apellido) {
		// TODO Auto-generated method stub
		TypedQuery<Guardia> myTypedQuery=(TypedQuery<Guardia>)this.entityManager.createQuery("select g from Guardia g where g.apellido=:valor");
		myTypedQuery.setParameter("valor",apellido);
		return myTypedQuery.getSingleResult();
	}
	
	/**
	 * Este metodo es igual que el buscarGuardiaPorApellido nada mas que con NamedQuery
	 *
	 */
	
	@Override
	public Guardia buscarGuardiaPorApellidoNamed(String apellido) {
		// TODO Auto-generated method stub
		
		Query miQuery=this.entityManager.createNamedQuery("Guardia.buscarPorApellido");
		miQuery.setParameter("valor",apellido);
		
		return (Guardia)miQuery.getSingleResult();
	}

	/**
	 * Este metodo es igual que el buscarGuardiaPorApellido nada mas que con NativeQuery
	 *
	 */
	
	@Override
	public Guardia buscarGuardiaPorApellidoNative(String apellido) {
		// TODO Auto-generated method stub
		Query miQuery=this.entityManager.createNativeQuery("select * from guardia g where g.apellido=:valor", Guardia.class);
		miQuery.setParameter("valor",apellido);
		
		return (Guardia)miQuery.getSingleResult();
	}
	
	/**
	 * Este metodo es igual que el buscarGuardiaPorApellido nada mas que con NamedNativeQuery
	 *
	 */
	
	@Override
	public Guardia buscarGuardiaPorApellidoNamedNative(String apellido) {
		// TODO Auto-generated method stub
		//Se llama igual que el NamedQuery
		Query miQuery=this.entityManager.createNamedQuery("Guardia.buscarPorApellidoNative", Guardia.class);
		miQuery.setParameter("valor", apellido);
		return (Guardia)miQuery.getSingleResult();
	}
	/**
	 * Este metodo es igual que el buscarGuardiaPorApellido nada mas que con Criteria Api
	 *
	 */
	@Override
	public Guardia buscarGuardiaPorApellidoCriteriaApi(String apellido) {
		// TODO Auto-generated method stub
		
		//Especificar tipo de quey 
		CriteriaBuilder myCriteria=this.entityManager.getCriteriaBuilder();
		
		//Especificar el tipo de retorno
		CriteriaQuery<Guardia>  myQuery=myCriteria.createQuery(Guardia.class);
		
		
		//Construir miSQl : select * from 
		Root<Guardia> myTable=myQuery.from(Guardia.class);
		
		//where en criteria api se conocen como Predicados
		Predicate p1= myCriteria.equal(myTable.get("apellido"),apellido);
		
		//empezamos a conformas el select 
		myQuery.select(myTable).where(p1);
		
		TypedQuery <Guardia> typedQuery=this.entityManager.createQuery(myQuery);
		
		return typedQuery.getSingleResult();
	}
	
	@Override
	public Guardia buscarGuardiaPorApellidoCriteriaApiAnd(String apellido, String edificio) {
		// TODO Auto-generated method stub
		// Especificar tipo de quey
		CriteriaBuilder myCriteria = this.entityManager.getCriteriaBuilder();

		// Especificar el tipo de retorno
		CriteriaQuery<Guardia> myQuery = myCriteria.createQuery(Guardia.class);

		// Construir miSQl : select * from
		Root<Guardia> myTable = myQuery.from(Guardia.class);

		// where en criteria api se conocen como Predicados
		Predicate p1 = myCriteria.equal(myTable.get("apellido"), apellido);
		Predicate p2 = myCriteria.equal(myTable.get("edificio"), edificio);
		Predicate predicadoFinal=myCriteria.and(p1,p2);

		// empezamos a conformas el select
		//por defecto un and
		myQuery.select(myTable).where(predicadoFinal);

		TypedQuery<Guardia> typedQuery = this.entityManager.createQuery(myQuery);

		return typedQuery.getSingleResult();
		
		
	}
	
	@Override
	public Guardia buscarGuardiaPorApellidoCriteriaApiOr(String apellido, String edificio) {
		// TODO Auto-generated method stub
		// Especificar tipo de quey
		CriteriaBuilder myCriteria = this.entityManager.getCriteriaBuilder();

		// Especificar el tipo de retorno
		CriteriaQuery<Guardia> myQuery = myCriteria.createQuery(Guardia.class);

		// Construir miSQl : select * from
		Root<Guardia> myTable = myQuery.from(Guardia.class);

		// where en criteria api se conocen como Predicados
		Predicate p1 = myCriteria.equal(myTable.get("apellido"), apellido);
		Predicate p2 = myCriteria.equal(myTable.get("edificio"), edificio);
		Predicate predicadoFinal = myCriteria.or(p1, p2);

		// empezamos a conformas el select
		// por defecto un and
		myQuery.select(myTable).where(predicadoFinal);

		TypedQuery<Guardia> typedQuery = this.entityManager.createQuery(myQuery);

		return typedQuery.getSingleResult();
	}
	
	
	@Override
	public Guardia buscarGuardiaPorApellidoLista(String apellido) {
		// TODO Auto-generated method stub
		Query miQuery=this.entityManager.createQuery("select g from Guardia g where g.apellido=:valor");
		miQuery.setParameter("valor",apellido);
		List<Guardia> listaDeGuardias=miQuery.getResultList();
		
		if(!listaDeGuardias.isEmpty()) {
			LOG.info("Tiene mas de un registro:"+listaDeGuardias.size());
			return listaDeGuardias.get(0);
		}else {
			return null;
		}
		
	}

	

	

	

	

	

	

	

}
