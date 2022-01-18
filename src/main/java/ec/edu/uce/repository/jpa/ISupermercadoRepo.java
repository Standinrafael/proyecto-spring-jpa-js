package ec.edu.uce.repository.jpa;

import ec.edu.uce.modelo.jpa.Supermercado;

public interface ISupermercadoRepo {
	void insertarSupermercado(Supermercado supermercado);
	void actualizarSupermercado(Supermercado supermercado);
	Supermercado buscarSupermercadoporId(Integer id);
	void borrarSupermercadoPorId(Integer id);

}
