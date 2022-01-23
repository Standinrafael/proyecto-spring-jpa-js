package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Empresa;

@Repository
@Transactional
public class EmpresaRepoImpl implements IEmpresaRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertarEmpresa(Empresa empresa) {
		// TODO Auto-generated method stub
		this.entityManager.persist(empresa);
	}

	@Override
	public void actualizarEmpresa(Empresa empresa) {
		// TODO Auto-generated method stub
		this.entityManager.merge(empresa);
	}

	@Override
	public Empresa buscarEmpresaPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Empresa.class, id);
	}

	@Override
	public void borrarEmpresaPorId(Integer id) {
		// TODO Auto-generated method stub
		Empresa empresaABorrar=this.buscarEmpresaPorId(id);
		this.entityManager.remove(empresaABorrar);
	}

	@Override
	public Empresa buscarEmpresaPorNombre(String nombre) {
		// TODO Auto-generated method stub
		Query miQuery=this.entityManager.createQuery("select e from Empresa e where e.nombre=:valor");
		miQuery.setParameter("valor",nombre);
		Empresa miEmpresa=(Empresa)miQuery.getSingleResult();
		return miEmpresa;
	}
	
	/**
	 * Este metodo es igual que el buscarEmpresaPorNombre nada mas que con TypedQuery
	 *
	 */

	@Override
	public Empresa buscarEmpresaPorNombreType(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<Empresa> miTypedQuery=(TypedQuery<Empresa>)this.entityManager.createQuery("select e from Empresa e where e.nombre=:valor");
		miTypedQuery.setParameter("valor",nombre);
		return miTypedQuery.getSingleResult();
	}
	
	/**
	 * Este metodo es igual que el buscarEmpresaPorNombre nada mas que con NamedQuery
	 *
	 */

	@Override
	public Empresa buscarEmpresaPorNombreNamed(String nombre) {
		// TODO Auto-generated method stub
		Query miQuery=this.entityManager.createNamedQuery("Empresa.buscarPorNombre");
		miQuery.setParameter("valor", nombre);
		
		return (Empresa)miQuery.getSingleResult();
	}

}
