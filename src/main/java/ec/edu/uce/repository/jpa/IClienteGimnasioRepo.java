package ec.edu.uce.repository.jpa;

import ec.edu.uce.modelo.jpa.ClienteGimnasio;

public interface IClienteGimnasioRepo {

	void insertarClienteGimnasio(ClienteGimnasio cliente);
	void actualizarClienteGimnasio(ClienteGimnasio cliente);
	ClienteGimnasio buscarClientePorId(Integer id);
	void eliminarClientePorId(Integer id);
	
	ClienteGimnasio buscarClientePorCedula(String cedula);
}
