package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.TarjetaCredito;
import ec.edu.uce.repository.jpa.ITarjetaCreditoRepo;

@Service
public class TarjetaCreditoServiceImpl implements ITarjetaCreditoService {

	@Autowired
	private ITarjetaCreditoRepo tarjetaRepo;
	
	@Override
	public void insertarTarjetaCredito(TarjetaCredito tarjea) {
		// TODO Auto-generated method stub´
		this.tarjetaRepo.insertarTarjetaCredito(tarjea);
		
	}

	@Override
	public void actualizarTarjetaCredito(TarjetaCredito tarjeta) {
		// TODO Auto-generated method stub
		this.tarjetaRepo.actualizarTarjetaCredito(tarjeta);
	}

	@Override
	public TarjetaCredito buscarPorNumero(String numero) {
		// TODO Auto-generated method stub
		return this.tarjetaRepo.buscarPorNumero(numero);
	}

}
