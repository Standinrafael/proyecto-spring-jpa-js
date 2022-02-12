package ec.edu.uce.service;

import java.util.List;

import ec.edu.uce.modelo.jpa.Turista;

public interface ITuristaService {

	void insertarTurista(Turista turista);
	List<Turista> obtenerTodosTuristas();
}
