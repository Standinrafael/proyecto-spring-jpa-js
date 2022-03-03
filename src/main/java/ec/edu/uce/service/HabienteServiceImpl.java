package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Habiente;
import ec.edu.uce.repository.jpa.IHabienteRepo;

@Service
public class HabienteServiceImpl implements IHabienteService {

	@Autowired
	private IHabienteRepo habienteRepo;
	
	@Override
	public void insertarHabiente(Habiente habiente) {
		// TODO Auto-generated method stub
		this.habienteRepo.insertarHabiente(habiente);
	}

	@Override
	public void actualizarHabiente(Habiente habiente) {
		// TODO Auto-generated method stub
		this.habienteRepo.actualizarHabiente(habiente);
	}

	@Override
	public Habiente buscarHabientePorId(Integer id) {
		// TODO Auto-generated method stub
		return this.habienteRepo.buscarHabientePorId(id);
	}

	@Override
	public void borrarHabientePorId(Integer id) {
		// TODO Auto-generated method stub
		this.habienteRepo.borrarHabientePorId(id);
	}

}
