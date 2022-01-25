package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Parque;
import ec.edu.uce.repository.jpa.IParqueRepo;

@Service
public class ParqueServiceImpl implements IParqueService {

	
	@Autowired
	private IParqueRepo parqueRepo;
	
	@Override
	public void guardar(Parque parque) {
		// TODO Auto-generated method stub
		this.parqueRepo.insertarParque(parque);
	}

	@Override
	public void actualizar(Parque parque) {
		// TODO Auto-generated method stub
		this.parqueRepo.actualizarParque(parque);
	}

	@Override
	public Parque buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.parqueRepo.buscarParquePorId(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.parqueRepo.borrarParquePorId(id);
	}

	@Override
	public Parque buscarPorPais(String pais) {
		// TODO Auto-generated method stub
		return this.parqueRepo.buscarParquePorPais(pais);
	}

	@Override
	public Parque buscarParquePorPaisType(String pais) {
		// TODO Auto-generated method stub
		return this.parqueRepo.buscarParquePorPaisType(pais);
	}

	@Override
	public Parque buscarParquePorPaisNamed(String pais) {
		// TODO Auto-generated method stub
		return this.parqueRepo.buscarParquePorPaisNamed(pais);
	}

	@Override
	public Parque buscarParquePorPaisNative(String pais) {
		// TODO Auto-generated method stub
		return this.parqueRepo.buscarParquePorPaisNative(pais);
	}

}
