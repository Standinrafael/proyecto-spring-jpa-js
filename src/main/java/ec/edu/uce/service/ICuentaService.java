package ec.edu.uce.service;

import java.util.List;

import ec.edu.uce.modelo.jpa.Cuenta;

public interface ICuentaService {

	void insertarCuenta(Cuenta cuenta);
	void actualizarCuenta(Cuenta cuenta);
	Cuenta buscarCuentaPorId(Integer id);
	void borrarCuentaPorId(Integer id);
	
	List<Cuenta> buscarPorCedula(String cedula);
	Cuenta buscarPorNumero(String numero);

}
