package ec.edu.uce.service;

import ec.edu.uce.modelo.jpa.TarjetaCredito;

public interface ITarjetaCreditoService {
	void insertarTarjetaCredito(TarjetaCredito tarjea);
	void actualizarTarjetaCredito(TarjetaCredito tarjeta);
	TarjetaCredito buscarPorNumero(String numero);

}
