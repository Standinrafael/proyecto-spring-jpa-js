package ec.edu.uce.service;


import ec.edu.uce.modelo.Materia;

public interface IMateriaService {

	void insertarMateriaNueva(Materia materia);
	void borrarMateriaPorId(Integer id);
	void actualizarMateriaNuevo(Materia materia);
	Materia buscarMateriaPorId(Integer id);
}
