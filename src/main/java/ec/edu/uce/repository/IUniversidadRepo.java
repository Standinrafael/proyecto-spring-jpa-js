package ec.edu.uce.repository;

import ec.edu.uce.modelo.Universidad;

public interface IUniversidadRepo {
	
	void insertarUniversidad(Universidad universidad);
	Universidad buscarUniversidad(Integer id);
	void actualizarUniversidad (Universidad universidad);
	void borrarUniversidad(Integer id);

}
