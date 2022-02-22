package ec.edu.uce.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Consumo;
import ec.edu.uce.modelo.jpa.TarjetaCredito;
import ec.edu.uce.repository.jpa.IConsumoRepo;

@Service
public class ConsumoServiceImpl implements IConsumoService {

	@Autowired
	private IConsumoRepo consumoRepo;
	
	@Autowired
	private ITarjetaCreditoService tarjetaService;
	
	@Override
	public void insertarConsumo(Consumo consumo) {
		// TODO Auto-generated method stub
		this.consumoRepo.insertarConsumo(consumo);
	}

	@Override
	public void actualizarConsumo(Consumo consumo) {
		// TODO Auto-generated method stub
		this.consumoRepo.actualizarConsumo(consumo);
	}

	@Override
	@Transactional
	public void realizarTransferencia(String tarjeta,LocalDateTime fechaConsumo, BigDecimal valorTransferencia) {
		// TODO Auto-generated method stub
		TarjetaCredito tarjetaCre= this.tarjetaService.buscarPorNumero(tarjeta);
		BigDecimal nuevoValor=tarjetaCre.getCupo().subtract(valorTransferencia);
		tarjetaCre.setCupo(nuevoValor);
		
		Consumo consumo= new Consumo();
		consumo.setFechaConsumo(fechaConsumo);
		consumo.setConsumo(valorTransferencia);
		consumo.setTarjeta(tarjetaCre);
		consumo.setFechaConsumo(null);
		
		
		this.consumoRepo.insertarConsumo(consumo);
		this.tarjetaService.actualizarTarjetaCredito(tarjetaCre);
		
	}

}
