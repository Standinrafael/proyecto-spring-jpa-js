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

	@Override
	public Farmacia buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.farmaciaRepo.buscarFarmaciaPorId(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.farmaciaRepo.borrarFarmaciaPorId(id);
	}

	@Override
	public Farmacia buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.farmaciaRepo.buscarFarmaciaPorNombre(nombre);
	}

	@Override
	public Farmacia buscarFarmaciaPorNombreType(String nombre) {
		// TODO Auto-generated method stub
		return this.farmaciaRepo.buscarFarmaciaPorNombreType(nombre);
	}

	@Override
	public Farmacia buscarFarmaciaPorNombreNamed(String nombre) {
		// TODO Auto-generated method stub
		return this.farmaciaRepo.buscarFarmaciaPorNombreNamed(nombre);
	}

	@Override
	public Farmacia buscarFarmaciaPorNombreNative(String nombre) {
		// TODO Auto-generated method stub
		return this.farmaciaRepo.buscarFarmaciaPorNombreNative(nombre);
	}

}
