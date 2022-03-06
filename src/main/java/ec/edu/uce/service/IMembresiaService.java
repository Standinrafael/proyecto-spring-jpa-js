package ec.edu.uce.service;

import ec.edu.uce.modelo.jpa.Membresia;

public interface IMembresiaService {

	void insertarMembresia(Membresia membresia);
	void actualizarMembresia(Membresia membresia);
	Membresia buscarMembresiaPorId(Integer id);
	void borrarMembresiaPorId(Integer id);
	
	Membresia buscarMembresiaPorCodigo(String codigo);
}
