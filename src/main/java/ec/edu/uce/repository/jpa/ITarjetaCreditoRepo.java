package ec.edu.uce.repository.jpa;

import ec.edu.uce.modelo.jpa.TarjetaCredito;

public interface ITarjetaCreditoRepo {

	void insertarTarjetaCredito(TarjetaCredito tarjeta);
	void actualizarTarjetaCredito(TarjetaCredito tarjeta);
	void actualizarTarjetaCreditoException(TarjetaCredito tarjeta);
	
	TarjetaCredito buscarPorNumero(String numero);
}
