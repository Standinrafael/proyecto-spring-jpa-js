package ec.edu.uce.repository.jpa;

import java.time.LocalDateTime;
import java.util.List;

import ec.edu.uce.modelo.jpa.Carro;


public interface ICarroRepo {

	void insertarCarro(Carro carro);
	
	List<Carro> buscarPorFechaMatriculacionJOIN(LocalDateTime fecha);
	
	List<Carro> buscarPorFechaMatriculacionLEFTJOIN(LocalDateTime fecha);
	
	List<Carro> buscarPorFechaMatriculacionRIGHTJOIN(LocalDateTime fecha);
	
	List<Carro> buscarPorFechaMatriculacionWHERE(LocalDateTime fecha);
	
}
