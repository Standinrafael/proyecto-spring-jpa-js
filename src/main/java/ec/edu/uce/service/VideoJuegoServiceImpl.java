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

	
}
