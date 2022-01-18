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

}
