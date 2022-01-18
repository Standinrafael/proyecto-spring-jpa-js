package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Supermercado;
import ec.edu.uce.repository.jpa.ISupermercadoRepo;

@Service
public class SupermercadoServiceImpl implements ISupermercadoService {

	
	@Autowired
	private ISupermercadoRepo supermercadoRepo;
	@Override
	public void guardar(Supermercado supermercado) {
		// TODO Auto-generated method stub
		this.supermercadoRepo.insertarSupermercado(supermercado);
	}

	@Override
	public void actualizar(Supermercado supermercado) {
		// TODO Auto-generated method stub
		this.supermercadoRepo.actualizarSupermercado(supermercado);
	}

	
}
