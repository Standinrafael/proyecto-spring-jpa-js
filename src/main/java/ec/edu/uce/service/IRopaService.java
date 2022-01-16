package ec.edu.uce.service;


import ec.edu.uce.modelo.Ropa;

public interface IRopaService {

	void insertarRopaNuevo(Ropa ropa);
	void borrarRopaPorId(Integer id);
	void actualizarRopaNuevo(Ropa ropa);
	Ropa buscarRopaPorId(Integer id);
}
