package ec.edu.uce.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Cuenta;
import ec.edu.uce.modelo.jpa.Retiro;

@Service
public class GestorCajeroServiceImpl implements IGestorCajeroService {

	private static final Logger LOG = LoggerFactory.getLogger(GestorCajeroServiceImpl.class);
	
	@Autowired
	private ICuentaService cuentaService;
	
	@Autowired
	private IRetiroService retiroService;

	@Override
	@Transactional(value=TxType.REQUIRES_NEW)
	public void consultarCuentaBancaria(String cedula) {
		// TODO Auto-generated method stub
			
		try {
			List<Cuenta> miLista =this.cuentaService.buscarPorCedula(cedula);
			
			for (Cuenta c : miLista) {
				LOG.info(c.getHabiente().toString());
				LOG.info(miLista.toString());
			}
		}catch(NullPointerException e) {
			LOG.warn("La cedula: "+cedula+ " no tiene cuentas");
		}
		

		
	}

	@Override
	@Transactional(value=TxType.REQUIRES_NEW)
	public void consultarSaldo(String numero) {
		// TODO Auto-generated method stub
		try {
			Cuenta cuenta= this.cuentaService.buscarPorNumero(numero);
			
			BigDecimal saldo = cuenta.getSaldo();
			String tipo= cuenta.getTipo();
			
			LOG.info("El saldo de la cuenta: "+numero+ " tipo: "+tipo+ " es: "+saldo);
			
		}catch(NullPointerException e) {
			
			LOG.warn("La cuenta "+ numero+ " no fue encontrada");
		}
		
				
	
		
		
	}

	@Override
	@Transactional
	public void realizarRetiro(String numero, BigDecimal valorRetirar) {
		// TODO Auto-generated method stub
		
		Cuenta cuenta= new Cuenta();
		try {
			 cuenta=this.cuentaService.buscarPorNumero(numero);
			BigDecimal nuevoSaldo=cuenta.getSaldo().subtract(valorRetirar);
			cuenta.setSaldo(nuevoSaldo);
			
		}catch(NullPointerException e) {
			LOG.error("No se puede realizar el retiro por que no se encontro la cuenta");
		}
		
						
		Retiro retiro= new Retiro();
		retiro.setMontoRetiro(valorRetirar);
		retiro.setFechaRetiro(LocalDateTime.now());
		retiro.setCuenta1(cuenta);
		retiro.setHabiente1(cuenta.getHabiente());
		
		try {
			this.cuentaService.actualizarCuenta(cuenta);
		}catch(NullPointerException e) {
			
			LOG.error("Error actualizacion");
		}
		
		this.retiroService.insertarReitro(retiro);
	}
	
	

}
