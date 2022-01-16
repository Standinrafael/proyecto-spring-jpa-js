package ec.edu.uce.service;


import ec.edu.uce.modelo.Videojuego;

public interface IVideoJuegoService {

	void insertarVideojuegoNuevo(Videojuego videojuego);
	void borrarVideojuegoPorId(Integer id);
	void actualizarVideojuegoNuevo(Videojuego videojuego);
	Videojuego buscarVideojuegoPorId(Integer id);
}
