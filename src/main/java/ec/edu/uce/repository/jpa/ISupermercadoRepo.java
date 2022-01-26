package ec.edu.uce.repository.jpa;

import ec.edu.uce.modelo.jpa.Supermercado;

public interface ISupermercadoRepo {
	void insertarSupermercado(Supermercado supermercado);
	void actualizarSupermercado(Supermercado supermercado);
	Supermercado buscarSupermercadoporId(Integer id);
	void borrarSupermercadoPorId(Integer id);
	Supermercado buscarSupermercadoPorNombre(String nombre);
	//Type y Named
	Supermercado buscarSupermercadoPorNombreType(String nombre);
	Supermercado buscarSupermercadoPorNombreNamed(String nombre);
	//Native
	Supermercado buscarSupermercadoPorNombreNative(String nombre);
	//Criteria Api
	Supermercado buscarSupermercadoPorNombreCriteriaApi(String nombre);
}
