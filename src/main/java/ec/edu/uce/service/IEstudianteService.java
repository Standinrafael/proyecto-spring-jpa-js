package ec.edu.uce.service;


import ec.edu.uce.modelo.Estudiante;

public interface IEstudianteService {

	void insertarEstudianteNuevo(Estudiante estudiante);
	void borrarEstudiantePorId(Integer id);
	void actualizarEstudianteNuevo(Estudiante estudiante);
	Estudiante buscarEstudiantePorId(Integer id);
}
