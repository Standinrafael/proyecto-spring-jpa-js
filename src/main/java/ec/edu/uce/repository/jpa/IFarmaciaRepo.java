package ec.edu.uce.repository.jpa;

import ec.edu.uce.modelo.jpa.Farmacia;

public interface IFarmaciaRepo {

	void insertarFarmacia (Farmacia farmacia);
	void actualizarFarmacia(Farmacia farmacia);
	Farmacia buscarFarmaciaPorId(Integer id);
	void borrarFarmaciaPorId(Integer id);
	Farmacia buscarFarmaciaPorNombre(String nombre);
	//Type y Named
	Farmacia buscarFarmaciaPorNombreType(String nombre);
	Farmacia buscarFarmaciaPorNombreNamed(String nombre);
}
