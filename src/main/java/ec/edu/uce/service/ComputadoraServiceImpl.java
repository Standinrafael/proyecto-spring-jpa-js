package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Computadora;
import ec.edu.uce.repository.jpa.IComputadoraRepo;

@Service
public class ComputadoraServiceImpl implements IComputadoraService {

	@Autowired
	IComputadoraRepo computadoraRepo;
	
	
	@Override
	public void guardar(Computadora computadora) {
		// TODO Auto-generated method stub
		this.computadoraRepo.insertarComputadora(computadora);
	}

	@Override
	public void actualizar(Computadora computadora) {
		// TODO Auto-generated method stub
		this.computadoraRepo.actualizarComputadora(computadora);
	}

	@Override
	public Computadora buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.computadoraRepo.buscarComputadoraPorId(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.computadoraRepo.borrarComputadoraPorId(id);
	}

	@Override
	public Computadora buscarPorMarca(String marca) {
		// TODO Auto-generated method stub
		return this.computadoraRepo.buscarComputadoraPorMarca(marca);
	}

	@Override
	public Computadora buscarComputadoraPorMarcaType(String marca) {
		// TODO Auto-generated method stub
		return this.computadoraRepo.buscarComputadoraPorMarcaType(marca);
	}

	@Override
	public Computadora buscarComputadoraPorMarcaNamed(String marca) {
		// TODO Auto-generated method stub
		return this.computadoraRepo.buscarComputadoraPorMarcaNamed(marca);
	}

	@Override
	public Computadora buscarComputadoraPorMarcaNative(String marca) {
		// TODO Auto-generated method stub
		return this.computadoraRepo.buscarComputadoraPorMarcaNative(marca);
	}

	@Override
	public Computadora buscarComputadoraPorMarcaCriteriaApi(String marca) {
		// TODO Auto-generated method stub
		return this.computadoraRepo.buscarComputadoraPorMarcaCriteriaApi(marca);
	}

}
