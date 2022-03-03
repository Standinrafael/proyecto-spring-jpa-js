package ec.edu.uce.service;

import java.math.BigDecimal;

public interface IGestorCajeroService {

	void consultarCuentaBancaria(String cedula);

	void consultarSaldo(String numero);
	
	void realizarRetiro(String numero, BigDecimal valorRetirar);

}
