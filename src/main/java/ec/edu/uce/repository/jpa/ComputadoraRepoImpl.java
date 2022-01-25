package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
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
		return this.entityManager.find(Computadora.class, id);
	}

	@Override
	public void borrarComputadoraPorId(Integer id) {
		// TODO Auto-generated method stub
		Computadora computadoraABorrar=this.buscarComputadoraPorId(id);
		this.entityManager.remove(computadoraABorrar);
	}

	@Override
	public Computadora buscarComputadoraPorMarca(String marca) {
		// TODO Auto-generated method stub
		Query miQuery=this.entityManager.createQuery("select c from Computadora c where c.marca=:valor");
		miQuery.setParameter("valor", marca);
		Computadora miComputadora=(Computadora)miQuery.getSingleResult();
		return miComputadora;
	}

	/**
	 * Este metodo es igual que el buscarComputadoraPorMarca nada mas que con TypedQuery
	 *
	 */
	
	@Override
	public Computadora buscarComputadoraPorMarcaType(String marca) {
		// TODO Auto-generated method stub
		TypedQuery<Computadora> miTypedQuery=(TypedQuery<Computadora>)this.entityManager.createQuery("select c from Computadora c where c.marca=:valor");
		miTypedQuery.setParameter("valor", marca);
		return miTypedQuery.getSingleResult();
	}

	/**
	 * Este metodo es igual que el buscarComputadoraPorMarca nada mas que con NamedQuery
	 *
	 */
	
	@Override
	public Computadora buscarComputadoraPorMarcaNamed(String marca) {
		// TODO Auto-generated method stub
		Query miQuery=this.entityManager.createNamedQuery("Computadora.buscarPorMarca");
		miQuery.setParameter("valor", marca);
		return (Computadora)miQuery.getSingleResult();
	}
	
	/**
	 * Este metodo es igual que el buscarComputadoraPorMarca nada mas que con NativeQuery
	 *
	 */

	@Override
	public Computadora buscarComputadoraPorMarcaNative(String marca) {
		// TODO Auto-generated method stub
		
		Query miQuery=this.entityManager.createNativeQuery("select * from computadora c where c.marca=:valor",Computadora.class);
		miQuery.setParameter("valor", marca);
		return (Computadora)miQuery.getSingleResult();
	}

}
