package ec.edu.uce.service;

import ec.edu.uce.modelo.jpa.Parque;

public interface IParqueService {

	void guardar(Parque parque);
	void actualizar(Parque parque);
}
