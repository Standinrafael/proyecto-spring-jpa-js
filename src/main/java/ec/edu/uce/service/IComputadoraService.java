package ec.edu.uce.service;

import ec.edu.uce.modelo.jpa.Computadora;

public interface IComputadoraService {

	void guardar(Computadora computadora);
	void actualizar(Computadora computadora);
}
