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
import ec.edu.uce.modelo.jpa.FacturaElectronica;

@Repository
@Transactional
public class FacturaElectronicaRepoImpl implements IFacturaElectronicaRepo {

	private static final Logger LOG = LoggerFactory.getLogger(FacturaElectronicaRepoImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional(value = TxType.MANDATORY)
	public void insertarFacturaElectronica(FacturaElectronica factura) {
		// TODO Auto-generated method stub
		this.entityManager.persist(factura);
		throw new ArrayIndexOutOfBoundsException();
		
	}

	@Override
	public void actualizarFacturaElectronica(FacturaElectronica factura) {
		// TODO Auto-generated method stub
		this.entityManager.merge(factura);
	}

	@Override
	public FacturaElectronica buscarFacturaPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(FacturaElectronica.class, id);
	}

	@Override
	public void borrarFacturaPorId(Integer id) {
		// TODO Auto-generated method stub
		FacturaElectronica facturaBorrar = this.buscarFacturaPorId(id);
		this.entityManager.remove(facturaBorrar);
	}

	@Override
	@Transactional(value=TxType.MANDATORY)
	public FacturaElectronica buscarFacturaPorCedulaCliente(String cedula) {
		// TODO Auto-generated method stub
		try {
			TypedQuery<FacturaElectronica> miTypedQuery = (TypedQuery<FacturaElectronica>) this.entityManager
					.createQuery("select f from FacturaElectronica f where f.cedulaCliente=:cedula", FacturaElectronica.class);
			miTypedQuery.setParameter("cedula", cedula);
			return miTypedQuery.getSingleResult();
		}catch(NoResultException e) {
			LOG.warn("No existe en los registros el cliente con cedula: "+cedula);
			return null;
		}
	}

}
