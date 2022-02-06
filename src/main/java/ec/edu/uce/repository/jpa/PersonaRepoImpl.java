package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Persona;

@Repository
@Transactional
public class PersonaRepoImpl implements IPersonaRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public void insertarPersona(Persona persona) {
		// TODO Auto-generated method stub
		this.entityManager.persist(persona);
	}

}
