package ec.edu.uce.service;

import java.time.LocalDateTime;
import java.util.List;

import ec.edu.uce.modelo.jpa.Carro;

public interface ICarroService {

	void guardarCarro(Carro carro);
	
	List<Carro> buscarPorFechaMatriculacionJOIN(LocalDateTime fecha);
	
	List<Carro> buscarPorFechaMatriculacionLEFTJOIN(LocalDateTime fecha);
	
	List<Carro> buscarPorFechaMatriculacionRIGHTJOIN(LocalDateTime fecha);
	
	List<Carro> buscarPorFechaMatriculacionWHERE(LocalDateTime fecha);
}
