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

}
