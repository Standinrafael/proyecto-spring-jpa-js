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
import ec.edu.uce.modelo.jpa.Carro;
import ec.edu.uce.modelo.jpa.Taxi;

@Repository
@Transactional
public class CarroRepoImpl implements ICarroRepo {

	private static final Logger LOG = LoggerFactory.getLogger(CarroRepoImpl.class);
	
	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public void insertarCarro(Carro carro) {
		// TODO Auto-generated method stub
		this.entityManager.persist(carro);
	}


	@Override
	public List<Carro> buscarPorFechaMatriculacionJOIN(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		TypedQuery<Carro>myQuery=this.entityManager.createQuery("select c from Carro c JOIN c.taxi t where c.fechaMatricula<=:fecha", Carro.class);
		myQuery.setParameter("fecha", fecha);
		List<Carro>miLista=myQuery.getResultList();
		for(Carro carro:miLista) {
			LOG.info("Informacion taxi:"+ carro.getTaxi());
			LOG.info(carro.toString());
		}
		return miLista;
	}


	@Override
	public List<Carro> buscarPorFechaMatriculacionLEFTJOIN(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		TypedQuery<Carro>myQuery=this.entityManager.createQuery("select c from Carro c LEFT JOIN c.taxi t where c.fechaMatricula<=:fecha", Carro.class);
		myQuery.setParameter("fecha", fecha);
		List<Carro>miLista=myQuery.getResultList();
		for(Carro carro:miLista) {
			LOG.info("Informacion taxi:"+ carro.getTaxi());
			LOG.info(carro.toString());
		}
		return miLista;
	}


	@Override
	public List<Carro> buscarPorFechaMatriculacionRIGHTJOIN(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		TypedQuery<Carro>myQuery=this.entityManager.createQuery("select c from Carro c RIGHT JOIN c.taxi t where c.fechaMatricula<=:fecha", Carro.class);
		myQuery.setParameter("fecha", fecha);
		List<Carro>miLista=myQuery.getResultList();
		for(Carro carro:miLista) {
			LOG.info("Informacion taxi:"+ carro.getTaxi());
			LOG.info(carro.toString());
		}
		return miLista;
	}


	@Override
	public List<Carro> buscarPorFechaMatriculacionWHERE(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		TypedQuery<Carro>myQuery=this.entityManager.createQuery("select c from Carro c, Taxi t WHERE c=t.carro AND c.fechaMatricula<=:fecha", Carro.class);
		myQuery.setParameter("fecha", fecha);
		List<Carro>miLista=myQuery.getResultList();
		for(Carro carro:miLista) {
			LOG.info("Informacion taxi:"+ carro.getTaxi());
			LOG.info(carro.toString());
		}
		return miLista;
	}

}
