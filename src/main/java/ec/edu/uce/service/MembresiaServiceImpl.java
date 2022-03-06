package ec.edu.uce.service;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Membresia;
import ec.edu.uce.repository.jpa.IMembresiaRepo;

@Service
public class MembresiaServiceImpl implements IMembresiaService {

	@Autowired
	private IMembresiaRepo membresiaRepo;
	
	@Override
	public void insertarMembresia(Membresia membresia) {
		// TODO Auto-generated method stub
		this.membresiaRepo.insertarMembresia(membresia);
	}

	@Override
	public void actualizarMembresia(Membresia membresia) {
		// TODO Auto-generated method stub
		this.membresiaRepo.actualizarMembresia(membresia);
	}

	@Override
	public Membresia buscarMembresiaPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.membresiaRepo.buscarMembresiaPorId(id);
	}

	@Override
	public void borrarMembresiaPorId(Integer id) {
		// TODO Auto-generated method stub
		this.membresiaRepo.borrarMembresiaPorId(id);
	}

	@Override
	@Transactional(value=TxType.SUPPORTS)
	public Membresia buscarMembresiaPorCodigo(String codigo) {
		// TODO Auto-generated method stub
		return this.membresiaRepo.buscarMembresitaPorCodigo(codigo);
	}

}
