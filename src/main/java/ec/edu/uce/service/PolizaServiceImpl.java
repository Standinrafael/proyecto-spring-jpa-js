package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Poliza;
import ec.edu.uce.repository.jpa.IPolizaRepo;
@Service
public class PolizaServiceImpl implements IPolizaService {

	@Autowired
	private IPolizaRepo polizaRepo;
	
	@Override
	public void insertarPoliza(Poliza poliza) {
		// TODO Auto-generated method stub
		this.polizaRepo.insertarPoliza(poliza);
	}

	@Override
	public void actualizarPoliza(Poliza poliza) {
		// TODO Auto-generated method stub
		this.polizaRepo.actualizarPoliza(poliza);
	}

	@Override
	public Poliza buscarPoliza(Integer id) {
		// TODO Auto-generated method stub
		return this.polizaRepo.buscarPoliza(id);
	}

	@Override
	public void eliminarPoliza(Integer id) {
		// TODO Auto-generated method stub
		this.polizaRepo.eliminarPoliza(id);
	}

}
