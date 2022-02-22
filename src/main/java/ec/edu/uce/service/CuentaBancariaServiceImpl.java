package ec.edu.uce.service;

import java.math.BigDecimal;

import javax.transaction.Transactional;

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

	@Override
	public CuentaBancaria buscarPorNumero(String numero) {
		// TODO Auto-generated method stub
		return this.cuentaRepo.buscarPorNumero(numero);
	}

	@Override
	@Transactional
	public void realizarTransferencia(String cuentaOrigen, String cuentaDestino, BigDecimal valorTransferir) {
		
		CuentaBancaria cuentaOri=this.buscarPorNumero(cuentaOrigen);
		CuentaBancaria cuentaDesti=this.buscarPorNumero(cuentaDestino);
		
		BigDecimal nuevoSaldoOrigen=cuentaOri.getSaldo().subtract(valorTransferir);
		cuentaOri.setSaldo(nuevoSaldoOrigen);
		
		BigDecimal nuevoSaldoDestino=cuentaDesti.getSaldo().add(valorTransferir);		
		cuentaDesti.setSaldo(nuevoSaldoDestino);
		cuentaDesti.setTipo(null);
		
		this.cuentaRepo.actualizarCuentaBancaria(cuentaOri);
		this.cuentaRepo.actualizarCuentaBancaria(cuentaDesti);
		
		
		
	}

}
