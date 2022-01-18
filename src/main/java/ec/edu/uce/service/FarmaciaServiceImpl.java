package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Farmacia;
import ec.edu.uce.repository.jpa.IFarmaciaRepo;

@Service
public class FarmaciaServiceImpl implements IFarmaciaService {

	
	@Autowired
	private IFarmaciaRepo farmaciaRepo;
	
	@Override
	public void guardar(Farmacia farmacia) {
		// TODO Auto-generated method stub
		this.farmaciaRepo.insertarFarmacia(farmacia);
	}

	@Override
	public void actualizar(Farmacia farmacia) {
		// TODO Auto-generated method stub
		this.farmaciaRepo.actualizarFarmacia(farmacia);
	}

}
