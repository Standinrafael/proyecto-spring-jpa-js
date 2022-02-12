package ec.edu.uce.repository.jpa;

import java.math.BigDecimal;
import java.util.List;

import ec.edu.uce.modelo.jpa.Turista;

public interface ITuristaRepo {
	
	void insertarTurista(Turista turista);

	List<Turista> buscarTuristaPorValor();
}
