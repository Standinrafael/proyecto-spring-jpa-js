package ec.edu.uce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Retiro;
import ec.edu.uce.repository.jpa.IRetiroRepo;

@Service
public class RetiroServiceImpl implements IRetiroService {

	@Autowired
	private IRetiroRepo retiroRepo;
	
	@Override
	public void insertarReitro(Retiro retiro) {
		// TODO Auto-generated method stub
		this.retiroRepo.insertarReitro(retiro);
	}

	@Override
	public void actualizarRetiro(Retiro retiro) {
		// TODO Auto-generated method stub
		this.retiroRepo.actualizarRetiro(retiro);
	}

	@Override
	public Retiro buscarRetiroPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.retiroRepo.buscarRetiroPorId(id);
	}

	@Override
	public void borrarRetiroPorId(Integer id) {
		// TODO Auto-generated method stub
		this.retiroRepo.borrarRetiroPorId(id);
	}

	@Override
	public List<Retiro> traerRetiros() {
		// TODO Auto-generated method stub
		return retiroRepo.traerRetiros();
	}

}
