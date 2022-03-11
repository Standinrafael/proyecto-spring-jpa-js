package ec.edu.uce.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import ec.edu.uce.modelo.jpa.HabienteVip;

public interface IGestorCajeroService {

	void consultarCuentaBancaria(String cedula);

	void consultarSaldo(String numero);
	
	void realizarRetiro(String numero, BigDecimal valorRetirar);
	
	void consultaHabientes(BigDecimal saldo);
	
	void consultarHisotrial(LocalDateTime fecha, BigDecimal monto);

}
