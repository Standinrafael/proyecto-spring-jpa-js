package ec.edu.uce.service;

import java.util.List;

import ec.edu.uce.modelo.jpa.Retiro;

public interface IRetiroService {

	void insertarReitro(Retiro retiro);
	void actualizarRetiro(Retiro retiro);
	Retiro buscarRetiroPorId(Integer id);
	void borrarRetiroPorId(Integer id);
	List<Retiro> traerRetiros();
	
}
