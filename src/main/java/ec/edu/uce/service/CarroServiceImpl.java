package ec.edu.uce.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Carro;
import ec.edu.uce.repository.jpa.ICarroRepo;

@Service
public class CarroServiceImpl implements ICarroService {

	@Autowired
	private ICarroRepo carroRepo;
	
	@Override
	public void guardarCarro(Carro carro) {
		// TODO Auto-generated method stub
		this.carroRepo.insertarCarro(carro);
	}
	
	@Override
	public List<Carro> buscarPorFechaMatriculacionJOIN(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		return this.carroRepo.buscarPorFechaMatriculacionJOIN(fecha);
	}

	@Override
	public List<Carro> buscarPorFechaMatriculacionLEFTJOIN(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		return this.carroRepo.buscarPorFechaMatriculacionLEFTJOIN(fecha);
	}

	@Override
	public List<Carro> buscarPorFechaMatriculacionRIGHTJOIN(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		return this.carroRepo.buscarPorFechaMatriculacionRIGHTJOIN(fecha);
	}

	@Override
	public List<Carro> buscarPorFechaMatriculacionWHERE(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		return this.carroRepo.buscarPorFechaMatriculacionWHERE(fecha);
	}



}
