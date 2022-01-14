package ec.edu.uce.repository;

import ec.edu.uce.modelo.Videojuego;

public interface IVideoJuegoRepo {

	void insertarVideojuego(Videojuego videojuego);
	Videojuego buscarVIdeojuego(Integer id);
	void actualizarVideojuego(Videojuego videojuego);
	void borrarVideojuego(Integer id);
}
