package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Libro;
import ec.edu.uce.repository.ILibroRepo;

@Service
public class LibroServiceRepo implements ILibroService {

	@Autowired
	private ILibroRepo libroRepo;
	
	@Override
	public void insertarLibroNuevo(Libro libro) {
		// TODO Auto-generated method stub
		this.libroRepo.insertarLibro(libro);
	}

	@Override
	public void borrarLibroPorId(Integer id) {
		// TODO Auto-generated method stub
		this.libroRepo.borrarLibro(id);
	}

	@Override
	public void actualizarLibroNuevo(Libro libro) {
		// TODO Auto-generated method stub
		this.libroRepo.actualizarLibro(libro);
	}

	@Override
	public Libro buscarLibroPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.libroRepo.buscarLibro(id);
	}

}
