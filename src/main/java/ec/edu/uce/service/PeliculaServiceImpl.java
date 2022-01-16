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


	@Override
	public void borrarPeliculaPorId(Integer id) {
		// TODO Auto-generated method stub
		this.peliculaRepo.borrarPelicula(id);
	}


	@Override
	public void actualizarPeliculaNuevo(Pelicula pelicula) {
		// TODO Auto-generated method stub
		this.peliculaRepo.actualizarPelicula(pelicula);
	}


	@Override
	public Pelicula buscarPeliculaPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.peliculaRepo.buscarPelicula(id);
	}

}
