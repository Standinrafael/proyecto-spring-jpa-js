package ec.edu.uce.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Cuenta;
import ec.edu.uce.repository.jpa.ICuentaRepo;

@Service
public class CuentaServiceImpl implements ICuentaService {

	@Autowired
	private ICuentaRepo cuentaRepo;
	
	@Override
	public void insertarCuenta(Cuenta cuenta) {
		// TODO Auto-generated method stub
		this.cuentaRepo.insertarCuenta(cuenta);
	}

	@Override
	public void actualizarCuenta(Cuenta cuenta) {
		// TODO Auto-generated method stub
		this.cuentaRepo.actualizarCuenta(cuenta);
				
	}

	@Override
	public Cuenta buscarCuentaPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.cuentaRepo.buscarCuentaPorId(id);
	}

	@Override
	public void borrarCuentaPorId(Integer id) {
		// TODO Auto-generated method stub
		this.cuentaRepo.borrarCuentaPorId(id);
	}

	@Override
	public List<Cuenta> buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.cuentaRepo.buscarPorCedula(cedula);
	}

	@Override
	public Cuenta buscarPorNumero(String numero) {
		// TODO Auto-generated method stub
		return this.cuentaRepo.buscarPorNumero(numero);
	}

	@Override
	public List<Cuenta> traerCuentas() {
		// TODO Auto-generated method stub
		return this.cuentaRepo.traerCuentas();
	}

}
