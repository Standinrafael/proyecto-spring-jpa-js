package ec.edu.uce.repository.jpa;

import java.util.List;

import ec.edu.uce.modelo.jpa.Cuenta;

public interface ICuentaRepo {

	void insertarCuenta(Cuenta cuenta);
	void actualizarCuenta(Cuenta cuenta);
	Cuenta buscarCuentaPorId(Integer id);
	void borrarCuentaPorId(Integer id);
	
	List<Cuenta> buscarPorCedula(String cedula);
	
	Cuenta buscarPorNumero(String numero);
	
	List<Cuenta> traerCuentas();
}
