package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.CuentaBancaria;
import ec.edu.uce.repository.jpa.ICuentaBancariaRepo;

@Service
public class CuentaBancariaServiceImpl implements ICuentaBancariaService {

	@Autowired
	private ICuentaBancariaRepo cuentaRepo;
	
	@Override
	public void insertarCuentaBancaria(CuentaBancaria cuenta) {
		// TODO Auto-generated method stub
		this.cuentaRepo.insertarCuentaBancaria(cuenta);
	}

	@Override
	public void actualizarCuentaBancaria(CuentaBancaria cuenta) {
		// TODO Auto-generated method stub
		this.cuentaRepo.actualizarCuentaBancaria(cuenta);
	}

}
