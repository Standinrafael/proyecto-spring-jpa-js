package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Multa;
import ec.edu.uce.repository.jpa.IMultaRepo;

@Service
public class MultaServiceImpl implements IMultaService {
	
	@Autowired
	private IMultaRepo multaRepo;

	@Override
	public void guardarMulta(Multa multa) {
		// TODO Auto-generated method stub
		this.multaRepo.insertarMulta(multa);
	}

}
