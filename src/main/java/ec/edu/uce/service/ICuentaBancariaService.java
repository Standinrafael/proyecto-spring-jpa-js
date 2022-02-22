package ec.edu.uce.service;

import java.math.BigDecimal;

import ec.edu.uce.modelo.jpa.CuentaBancaria;

public interface ICuentaBancariaService {

	void insertarCuentaBancaria(CuentaBancaria cuenta);
	void actualizarCuentaBancaria(CuentaBancaria cuenta);
	CuentaBancaria buscarPorNumero(String numero);
	
	 void realizarTransferencia(String cuentaOrigen, String cuentaDestino, BigDecimal valorTransferir);
}
