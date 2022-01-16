package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Videojuego;
import ec.edu.uce.repository.IVideoJuegoRepo;


@Service
public class VideoJuegoServiceImpl implements IVideoJuegoService {
	
	@Autowired
	private IVideoJuegoRepo videojuegoRepo;

	@Override
	public void insertarVideojuegoNuevo(Videojuego videojuego) {
		// TODO Auto-generated method stub
		this.videojuegoRepo.insertarVideojuego(videojuego);
	}

	@Override
	public void borrarVideojuegoPorId(Integer id) {
		// TODO Auto-generated method stub
		this.videojuegoRepo.borrarVideojuego(id);
	}

	@Override
	public void actualizarVideojuegoNuevo(Videojuego videojuego) {
		// TODO Auto-generated method stub
		this.videojuegoRepo.actualizarVideojuego(videojuego);
	}

	@Override
	public Videojuego buscarVideojuegoPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.videojuegoRepo.buscarVIdeojuego(id);
	}

	
}
