package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Ropa;
import ec.edu.uce.repository.IRopaRepo;

@Service
public class RopaServiceImpl implements IRopaService {
	
	@Autowired
	private IRopaRepo ropaRepo;

	@Override
	public void insertarRopaNuevo(Ropa ropa) {
		// TODO Auto-generated method stub
		this.ropaRepo.insertarRopa(ropa);
	}

}
