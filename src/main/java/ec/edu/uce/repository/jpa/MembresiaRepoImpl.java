package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.ClienteGimnasio;
import ec.edu.uce.modelo.jpa.Membresia;

@Repository
@Transactional
public class MembresiaRepoImpl implements IMembresiaRepo {

	private static final Logger LOG = LoggerFactory.getLogger(MembresiaRepoImpl.class);
	
	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public void insertarMembresia(Membresia membresia) {
		// TODO Auto-generated method stub
		this.entityManager.persist(membresia);
	}

	@Override
	public void actualizarMembresia(Membresia membresia) {
		// TODO Auto-generated method stub
		this.entityManager.merge(membresia);
	}

	@Override
	public Membresia buscarMembresiaPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Membresia.class, id);
	}

	@Override
	public void borrarMembresiaPorId(Integer id) {
		// TODO Auto-generated method stub
		Membresia membresiaBorrar=this.buscarMembresiaPorId(id);
		this.entityManager.remove(membresiaBorrar);
	}

	@Override
	@Transactional(value=TxType.MANDATORY)
	public Membresia buscarMembresitaPorCodigo(String codigo) {
		// TODO Auto-generated method stub
		
		try {
			TypedQuery<Membresia> miTypedQuery = (TypedQuery<Membresia>) this.entityManager
					.createQuery("select m from Membresia m  where m.codigo=:codigo", Membresia.class);
			miTypedQuery.setParameter("codigo", codigo);
			return miTypedQuery.getSingleResult();
			
		}catch(NoResultException e) {
			
			LOG.warn("No existe membresia con el codigo: "+codigo);
			return null;
		}
		
	}

}
