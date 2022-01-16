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

	@Override
	public void borrarEstudiantePorId(Integer id) {
		// TODO Auto-generated method stub
		this.estudianteRepo.borrarEstudiante(id);
	}

	@Override
	public void actualizarEstudianteNuevo(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudianteRepo.actualizarEstudiante(estudiante);
	}

	@Override
	public Estudiante buscarEstudiantePorId(Integer id) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarEstudiante(id);
	}

}
