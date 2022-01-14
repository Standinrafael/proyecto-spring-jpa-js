package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Universidad;
import ec.edu.uce.repository.IUniversidadRepo;

@Service
public class UniversidadServiceImpl implements IUniversidadService {

	@Autowired
	private IUniversidadRepo universidadRepo;
	
	@Override
	public void insertarUniversidadNuevo(Universidad universidad) {
		// TODO Auto-generated method stub
		this.universidadRepo.insertarUniversidad(universidad);
	}

}
