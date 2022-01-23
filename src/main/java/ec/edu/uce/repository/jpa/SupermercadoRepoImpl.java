package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Supermercado;

@Repository
@Transactional
public class SupermercadoRepoImpl implements ISupermercadoRepo {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarSupermercado(Supermercado supermercado) {
		// TODO Auto-generated method stub
		this.entityManager.persist(supermercado);
	}

	@Override
	public void actualizarSupermercado(Supermercado supermercado) {
		// TODO Auto-generated method stub
		this.entityManager.merge(supermercado);
	}

	@Override
	public Supermercado buscarSupermercadoporId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Supermercado.class, id);
	}

	@Override
	public void borrarSupermercadoPorId(Integer id) {
		// TODO Auto-generated method stub
		Supermercado supermercadoABorrar=this.buscarSupermercadoporId(id);
		this.entityManager.remove(supermercadoABorrar);
	}

	@Override
	public Supermercado buscarSupermercadoPorNombre(String nombre) {
		// TODO Auto-generated method stub
		Query miQuery=this.entityManager.createQuery("select s from Supermercado s where s.nombre=: valor");
		miQuery.setParameter("valor", nombre);
		Supermercado miSupermercado=(Supermercado)miQuery.getSingleResult();
		return miSupermercado;
	}

	/**
	 * Este metodo es igual que el buscarSupermercadoPorNombre nada mas que con TypedQuery
	 *
	 */
	
	@Override
	public Supermercado buscarSupermercadoPorNombreType(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<Supermercado> miTypedQuery=(TypedQuery<Supermercado>)this.entityManager.createQuery("select s from Supermercado s where s.nombre=: valor");
		miTypedQuery.setParameter("valor", nombre);
		return miTypedQuery.getSingleResult();
	}

	/**
	 * Este metodo es igual que el buscarSupermercadoPorNombre nada mas que con NamedQuery
	 *
	 */
	
	@Override
	public Supermercado buscarSupermercadoPorNombreNamed(String nombre) {
		// TODO Auto-generated method stub
		Query miQuery=this.entityManager.createNamedQuery("Supermercado.buscarPorNombre");
		miQuery.setParameter("valor", nombre);
		
		return (Supermercado)miQuery.getSingleResult();
	}

}
