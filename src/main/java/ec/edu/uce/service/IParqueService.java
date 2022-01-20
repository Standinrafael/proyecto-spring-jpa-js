package ec.edu.uce.service;

import ec.edu.uce.modelo.jpa.Parque;

public interface IParqueService {

	void guardar(Parque parque);
	void actualizar(Parque parque);
	Parque buscar(Integer id);
	void borrar (Integer id);
	Parque buscarPorPais(String pais);
	
}
