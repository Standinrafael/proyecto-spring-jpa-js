package ec.edu.uce.service;

import ec.edu.uce.modelo.jpa.Farmacia;

public interface IFarmaciaService {

	void guardar(Farmacia farmacia);
	void actualizar(Farmacia farmacia);
	Farmacia buscar(Integer id);
	void borrar(Integer id);
	Farmacia buscarPorNombre(String nombre);
	//Typed y Named
	Farmacia buscarFarmaciaPorNombreType(String nombre);
	Farmacia buscarFarmaciaPorNombreNamed(String nombre);
	//Native
	Farmacia buscarFarmaciaPorNombreNative(String nombre);
}
