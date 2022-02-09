package ec.edu.uce.repository.jpa;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.DetalleFactura;
import ec.edu.uce.modelo.jpa.Factura;


@Transactional
@Repository
public class DetalleFacturaRepoImpl implements IDetalleFacturaRepo {

	private static final Logger LOG = LoggerFactory.getLogger(DetalleFacturaRepoImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<DetalleFactura> buscarProductors(BigDecimal valorMinimo, LocalDateTime fecha) {
		// TODO Auto-generated method stub
//		TypedQuery<DetalleFactura> myQuery=this.entityManager
//				.createQuery("select d from DetalleFactura d WHERE d.precio>=:valorMinimo",DetalleFactura.class);
//		myQuery.setParameter("valorMinimo", valorMinimo);
//		return myQuery.getResultList();
		
		TypedQuery<DetalleFactura> myQuery=this.entityManager.
				createQuery("select d from DetalleFactura d, Factura f WHERE f=d.factura AND f.fecha<=:fecha AND d.precio>=:valorMinimo ",DetalleFactura.class);
		myQuery.setParameter("fecha", fecha);
		myQuery.setParameter("valorMinimo", valorMinimo);
		
		List<DetalleFactura> miLista=myQuery.getResultList();
		for(DetalleFactura detalle : miLista) {
			
			LOG.info(detalle.toString());
		}
		return miLista;
	}

}
