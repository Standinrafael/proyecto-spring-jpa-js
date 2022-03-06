package ec.edu.uce.repository.jpa;

import ec.edu.uce.modelo.jpa.Membresia;

public interface IMembresiaRepo {

	void insertarMembresia(Membresia membresia);
	void actualizarMembresia(Membresia membresia);
	Membresia buscarMembresiaPorId(Integer id);
	void borrarMembresiaPorId(Integer id);
	
	Membresia buscarMembresitaPorCodigo(String codigo);
}
