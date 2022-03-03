package ec.edu.uce.service;

import ec.edu.uce.modelo.jpa.Habiente;

public interface IHabienteService {

	void insertarHabiente(Habiente habiente);
	void actualizarHabiente(Habiente habiente);
	Habiente buscarHabientePorId(Integer id);
	void borrarHabientePorId(Integer id);
}
