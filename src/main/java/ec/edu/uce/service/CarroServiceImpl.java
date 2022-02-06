package ec.edu.uce.service;

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

}
