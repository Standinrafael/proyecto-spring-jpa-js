package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Estudiante;
import ec.edu.uce.repository.IEstudianteRepo;

@Service
public class EstudianteServiceImpl implements IEstudianteService {

	@Autowired
	private IEstudianteRepo estudianteRepo;
	
	@Override
	public void insertarEstudianteNuevo(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudianteRepo.insertarEstudiante(estudiante);
	}

}
