package ec.edu.uce.repository.jpa;

import ec.edu.uce.modelo.jpa.Habiente;

public interface IHabienteRepo {

	void insertarHabiente(Habiente habiente);
	void actualizarHabiente(Habiente habiente);
	Habiente buscarHabientePorId(Integer id);
	void borrarHabientePorId(Integer id);
}
