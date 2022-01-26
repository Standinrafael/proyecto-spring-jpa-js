package ec.edu.uce.service;

import ec.edu.uce.modelo.jpa.Supermercado;

public interface ISupermercadoService {

	void guardar(Supermercado supermercado);
	void actualizar(Supermercado supermercado);
	Supermercado buscar(Integer id);
	void borrar(Integer id);
	Supermercado buscarPorNombre(String nombre);
	//Typed y Named
	Supermercado buscarSupermercadoPorNombreType(String nombre);
	Supermercado buscarSupermercadoPorNombreNamed(String nombre);
	//Native
	Supermercado buscarSupermercadoPorNombreNative(String nombre);
	//Criteria Api
	Supermercado buscarSupermercadoPorNombreCriteriaApi(String nombre);
}
