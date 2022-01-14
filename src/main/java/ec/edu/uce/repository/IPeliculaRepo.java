package ec.edu.uce.repository;

import ec.edu.uce.modelo.Pelicula;

public interface IPeliculaRepo {

	void insertarPelicula(Pelicula pelicula);
	Pelicula buscarPelicula(Integer id);
	void actualizarPelicula(Pelicula pelicula);
	void borrarPelicula(Integer id);
}
