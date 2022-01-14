package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Pelicula;
import ec.edu.uce.repository.IPeliculaRepo;

@Service
public class PeliculaServiceImpl implements IPeliculaService {

	@Autowired
	private IPeliculaRepo peliculaRepo;
	
	
	@Override
	public void insertarPeliculaNueva(Pelicula pelcula) {
		// TODO Auto-generated method stub
		this.peliculaRepo.insertarPelicula(pelcula);
	}

}
