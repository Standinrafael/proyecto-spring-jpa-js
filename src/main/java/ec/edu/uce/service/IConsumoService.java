package ec.edu.uce.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import ec.edu.uce.modelo.jpa.Consumo;

public interface IConsumoService {

	void insertarConsumo(Consumo consumo);
	void actualizarConsumo(Consumo consumo);
	
	void realizarTransferencia(String tarjeta,LocalDateTime fechaConsumo,BigDecimal valorTransferencia);
}
