package ec.edu.uce.repository.jpa;

import ec.edu.uce.modelo.jpa.CuentaBancaria;

public interface ICuentaBancariaRepo {

	void insertarCuentaBancaria(CuentaBancaria cuenta);
	void actualizarCuentaBancaria(CuentaBancaria cuenta);
}
