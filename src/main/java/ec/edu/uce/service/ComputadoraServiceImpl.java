package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Computadora;
import ec.edu.uce.repository.jpa.IComputadoraRepo;

@Service
public class ComputadoraServiceImpl implements IComputadoraService {

	@Autowired
	IComputadoraRepo computadoraRepo;
	
	
	@Override
	public void guardar(Computadora computadora) {
		// TODO Auto-generated method stub
		this.computadoraRepo.insertarComputadora(computadora);
	}

	@Override
	public void actualizar(Computadora computadora) {
		// TODO Auto-generated method stub
		this.computadoraRepo.actualizarComputadora(computadora);
	}

}
