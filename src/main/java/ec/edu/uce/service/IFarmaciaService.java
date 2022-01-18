package ec.edu.uce.service;

import ec.edu.uce.modelo.jpa.Farmacia;

public interface IFarmaciaService {

	void guardar(Farmacia farmacia);
	void actualizar(Farmacia farmacia);
}
