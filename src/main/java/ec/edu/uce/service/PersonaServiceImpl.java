package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Persona;
import ec.edu.uce.repository.jpa.IPersonaRepo;

@Service
public class PersonaServiceImpl implements IPersonaService {

	@Autowired
	private IPersonaRepo personaRepo;
	
	@Override
	public void guardarPersona(Persona persona) {
		// TODO Auto-generated method stub
		this.personaRepo.insertarPersona(persona);
	}

}
