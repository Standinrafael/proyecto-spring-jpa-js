package ec.edu.uce.repository;

import ec.edu.uce.modelo.Ropa;

public interface IRopaRepo {

	void insertarRopa(Ropa ropa);
	Ropa buscarRopa(Integer id);
	void actualizarRopa(Ropa ropa);
	void borrarRopa(Integer id);
}
