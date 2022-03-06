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
import ec.edu.uce.modelo.jpa.CuentaBancaria;

@Repository
@Transactional
public class ClienteGimnasioRepoImpl implements IClienteGimnasioRepo {

	private static final Logger LOG = LoggerFactory.getLogger(ClienteGimnasioRepoImpl.class);
	
	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public void insertarClienteGimnasio(ClienteGimnasio cliente) {
		// TODO Auto-generated method stub
		this.entityManager.persist(cliente);
	}

	@Override
	@Transactional(value=TxType.MANDATORY)
	public void actualizarClienteGimnasio(ClienteGimnasio cliente) {
		// TODO Auto-generated method stub
		this.entityManager.merge(cliente);
	}

	@Override
	public ClienteGimnasio buscarClientePorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(ClienteGimnasio.class, id);
	}

	@Override
	public void eliminarClientePorId(Integer id) {
		// TODO Auto-generated method stub
		ClienteGimnasio clienteBorrar=this.buscarClientePorId(id);
		this.entityManager.remove(clienteBorrar);
	}

	@Override
	
	public ClienteGimnasio buscarClientePorCedula(String cedula) {
		// TODO Auto-generated method stub
		
		try {
			TypedQuery<ClienteGimnasio> miTypedQuery = (TypedQuery<ClienteGimnasio>) this.entityManager
					.createQuery("select c from ClienteGimnasio c where c.cedula=:cedula", ClienteGimnasio.class);
			miTypedQuery.setParameter("cedula", cedula);
			return miTypedQuery.getSingleResult();
		}catch(NoResultException e) {
			LOG.warn("No existe en los registros el cliente con cedula: "+cedula);
			return null;
		}
		
	}

}
