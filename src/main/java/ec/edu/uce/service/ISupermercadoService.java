package ec.edu.uce.service;

import ec.edu.uce.modelo.jpa.Supermercado;

public interface ISupermercadoService {

	void guardar(Supermercado supermercado);
	void actualizar(Supermercado supermercado);
}
