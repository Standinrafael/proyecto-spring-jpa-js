package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Supermercado;
import ec.edu.uce.repository.jpa.ISupermercadoRepo;

@Service
public class SupermercadoServiceImpl implements ISupermercadoService {

	
	@Autowired
	private ISupermercadoRepo supermercadoRepo;
	@Override
	public void guardar(Supermercado supermercado) {
		// TODO Auto-generated method stub
		this.supermercadoRepo.insertarSupermercado(supermercado);
	}

	@Override
	public void actualizar(Supermercado supermercado) {
		// TODO Auto-generated method stub
		this.supermercadoRepo.actualizarSupermercado(supermercado);
	}

	@Override
	public Supermercado buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.supermercadoRepo.buscarSupermercadoporId(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.supermercadoRepo.borrarSupermercadoPorId(id);
	}

	@Override
	public Supermercado buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.supermercadoRepo.buscarSupermercadoPorNombre(nombre);
	}

	@Override
	public Supermercado buscarSupermercadoPorNombreType(String nombre) {
		// TODO Auto-generated method stub
		return this.supermercadoRepo.buscarSupermercadoPorNombreType(nombre);
	}

	@Override
	public Supermercado buscarSupermercadoPorNombreNamed(String nombre) {
		// TODO Auto-generated method stub
		return this.supermercadoRepo.buscarSupermercadoPorNombreNamed(nombre);
	}

	@Override
	public Supermercado buscarSupermercadoPorNombreNative(String nombre) {
		// TODO Auto-generated method stub
		return this.supermercadoRepo.buscarSupermercadoPorNombreNative(nombre);
	}

	@Override
	public Supermercado buscarSupermercadoPorNombreCriteriaApi(String nombre) {
		// TODO Auto-generated method stub
		return this.supermercadoRepo.buscarSupermercadoPorNombreCriteriaApi(nombre);
	}

	
}
