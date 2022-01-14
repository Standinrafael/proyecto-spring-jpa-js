package ec.edu.uce.repository;

import ec.edu.uce.modelo.Libro;

public interface ILibroRepo {
	
	void insertarLibro(Libro libro);
	Libro buscarLibro(Integer id);
	void actualizarLibro(Libro libro);
	void borrarLibro(Integer id);

}
