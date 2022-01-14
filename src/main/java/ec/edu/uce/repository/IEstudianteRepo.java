package ec.edu.uce.repository;

import ec.edu.uce.modelo.Estudiante;

public interface IEstudianteRepo {
	void insertarEstudiante(Estudiante estudiante);
	Estudiante buscarEstudiante(Integer id);
	void actualizarEstudiante (Estudiante estudiante);
	void borrarEstudiante (Integer id);

}
