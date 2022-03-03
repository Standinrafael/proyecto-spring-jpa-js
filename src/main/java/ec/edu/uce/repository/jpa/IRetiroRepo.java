package ec.edu.uce.repository.jpa;

import ec.edu.uce.modelo.jpa.Retiro;

public interface IRetiroRepo {

	void insertarReitro(Retiro retiro);
	void actualizarRetiro(Retiro retiro);
	Retiro buscarRetiroPorId(Integer id);
	void borrarRetiroPorId(Integer id);
}
