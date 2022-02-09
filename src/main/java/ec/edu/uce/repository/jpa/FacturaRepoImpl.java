package ec.edu.uce.repository.jpa;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.uce.ProyectoSpringJpaJsApplication;
import ec.edu.uce.modelo.jpa.Factura;
import ec.edu.uce.modelo.jpa.FacturaSencilla;

@Repository
@Transactional
public class FacturaRepoImpl implements IFacturaRepo {

	private static final Logger LOG = LoggerFactory.getLogger(FacturaRepoImpl.class);
	
	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public void insertarFactura(Factura factura) {
		// TODO Auto-generated method stub
		this.entityManager.persist(factura);
	}


	@Override
	public List<Factura> buscarPorFechaJOIN(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		//mismo atributo con lo que se está relacionando
		TypedQuery<Factura> myQuery=this.entityManager.createQuery("select f from Factura f JOIN f.detalles d where f.fecha<=:fecha",Factura.class);
		myQuery.setParameter("fecha", fecha);
		return myQuery.getResultList();
	}
	

	@Override
	public List<Factura> buscarPorFechaLEFTJOIN(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		//mismo atributo con lo que se está relacionando
		TypedQuery<Factura> myQuery=this.entityManager.createQuery("select f from Factura f LEFT JOIN f.detalles d where f.fecha<=:fecha",Factura.class);
		myQuery.setParameter("fecha", fecha);
		
		List<Factura> miLista=myQuery.getResultList();
		for(Factura factura : miLista) {
			LOG.info("detalles:" +factura.getDetalles());
			LOG.info(factura.toString());
		}
		return miLista;
	}


	@Override
	public List<Factura> buscarPorFechaWHERE(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		//tal cual como sql, primero las tablas
		//el de la clave primaria se hace relacionamiento solo con el objeto para comparar con objeto factura de detallesfactura
		TypedQuery<Factura> myQuery=this.entityManager.createQuery("select f from Factura f,DetalleFactura d WHERE f=d.factura AND f.fecha<=:fecha ",Factura.class);
		myQuery.setParameter("fecha", fecha);
		
		
		List<Factura> miLista=myQuery.getResultList();
		for(Factura factura : miLista) {
			LOG.info("detalles:" +factura.getDetalles());
			LOG.info(factura.toString());
		}
		return miLista;
	}

	@Override
	public List<Factura> buscarPorFechaJOINFETCH(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		//mismo atributo con lo que se está relacionando
		TypedQuery<Factura> myQuery=this.entityManager.createQuery("select f from Factura f JOIN FETCH f.detalles d where f.fecha<=:fecha",Factura.class);
		myQuery.setParameter("fecha", fecha);
		return myQuery.getResultList();
	}


	@Override
	public List<FacturaSencilla> buscarPorFechaSencilla(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		
		//FacturaSencilla(String numero, String cedula)
		TypedQuery<FacturaSencilla> myQuery=this.entityManager
				.createQuery("select NEW ec.edu.uce.modelo.jpa.FacturaSencilla(f.numero,f.cedula) from Factura f JOIN  f.detalles d where f.fecha<=:fecha",FacturaSencilla.class);
		myQuery.setParameter("fecha", fecha);
		return myQuery.getResultList();
		
		
	}
}
