package ec.edu.uce.service;


import ec.edu.uce.modelo.Pelicula;

public interface IPeliculaService {

	void insertarPeliculaNueva(Pelicula pelcula);
	void borrarPeliculaPorId(Integer id);
	void actualizarPeliculaNuevo(Pelicula pelicula);
	Pelicula buscarPeliculaPorId(Integer id);
}
