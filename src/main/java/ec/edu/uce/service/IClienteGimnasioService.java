package ec.edu.uce.service;

import ec.edu.uce.modelo.jpa.ClienteGimnasio;

public interface IClienteGimnasioService {

	void insertarClienteGimnasio(ClienteGimnasio cliente);
	void actualizarClienteGimnasio(ClienteGimnasio cliente);
	ClienteGimnasio buscarClientePorId(Integer id);
	void eliminarClientePorId(Integer id);
	
	ClienteGimnasio buscarClientePorCedula(String cedula);
}
