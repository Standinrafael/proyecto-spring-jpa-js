package ec.edu.uce.service;


import ec.edu.uce.modelo.Universidad;

public interface IUniversidadService {

	void insertarUniversidadNuevo(Universidad universidad);
	void borrarUniversidadPorId(Integer id);
	void actualizarUniversidadNuevo(Universidad Universidad);
	Universidad buscarUniversidadPorId(Integer id);
}
