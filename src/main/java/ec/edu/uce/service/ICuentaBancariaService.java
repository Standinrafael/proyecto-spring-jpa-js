package ec.edu.uce.service;

import ec.edu.uce.modelo.jpa.CuentaBancaria;

public interface ICuentaBancariaService {

	void insertarCuentaBancaria(CuentaBancaria cuenta);
	void actualizarCuentaBancaria(CuentaBancaria cuenta);
}
