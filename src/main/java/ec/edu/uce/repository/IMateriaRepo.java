package ec.edu.uce.repository;

import ec.edu.uce.modelo.Materia;

public interface IMateriaRepo {
	
	void insertarMateria(Materia materia);
	Materia buscarMateria (Integer id);
	void actualizarMateria(Materia materia);
	void borrarMateria(Integer id);

}
