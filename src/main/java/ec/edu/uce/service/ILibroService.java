package ec.edu.uce.service;


import ec.edu.uce.modelo.Libro;

public interface ILibroService {

	void insertarLibroNuevo(Libro libro);
	void borrarLibroPorId(Integer id);
	void actualizarLibroNuevo(Libro libro);
	Libro buscarLibroPorId(Integer id);
}
