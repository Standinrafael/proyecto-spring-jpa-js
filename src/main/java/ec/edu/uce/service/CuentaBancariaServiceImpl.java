package ec.edu.uce.service;

import java.math.BigDecimal;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import ec.edu.uce.modelo.jpa.CuentaBancaria;
import ec.edu.uce.repository.jpa.ICuentaBancariaRepo;


@Service
public class CuentaBancariaServiceImpl implements ICuentaBancariaService {

	private static final Logger LOG = LoggerFactory.getLogger(CuentaBancariaServiceImpl.class);

	
	@Autowired
	private ICuentaBancariaRepo cuentaRepo;

	@Override
	public void insertarCuentaBancaria(CuentaBancaria cuenta) {
		// TODO Auto-generated method stub
		this.cuentaRepo.insertarCuentaBancaria(cuenta);
	}

	@Override
	public void actualizarCuentaBancaria(CuentaBancaria cuenta) {
		// TODO Auto-generated method stub
		this.cuentaRepo.actualizarCuentaBancaria(cuenta);
	}

	@Override
	@Transactional(value=TxType.NOT_SUPPORTED)
	public CuentaBancaria buscarPorNumero(String numero) {
		// TODO Auto-generated method stub
		return this.cuentaRepo.buscarPorNumero(numero);
	}

	@Override
	@Transactional
	public void realizarTransferencia(String cuentaOrigen, String cuentaDestino, BigDecimal valorTransferir) {

		CuentaBancaria cuentaOri = this.buscarPorNumero(cuentaOrigen);
		CuentaBancaria cuentaDesti = this.buscarPorNumero(cuentaDestino);

		BigDecimal nuevoSaldoOrigen = cuentaOri.getSaldo().subtract(valorTransferir);
		cuentaOri.setSaldo(nuevoSaldoOrigen);

		BigDecimal nuevoSaldoDestino = cuentaDesti.getSaldo().add(valorTransferir);
		cuentaDesti.setSaldo(nuevoSaldoDestino);
		// cuentaDesti.setTipo(null);

		LOG.info("AA1");
		try {
			this.cuentaRepo.actualizarCuentaBancaria(cuentaOri);
		} catch (ArrayIndexOutOfBoundsException e) {
			LOG.error("ERROR TRANSACCION 1");
		}

		LOG.info("DA1");

		LOG.info("AA2");
		this.cuentaRepo.actualizarCuentaBancaria(cuentaDesti);
//		try {
//			this.cuentaRepo.actualizarCuentaBancaria2(cuentaDesti);
//		} catch (ArrayIndexOutOfBoundsException e) {
//			LOG.error("ERROR");
//		}

		LOG.info("DA2");

	}

	/**
	 * Support con Transaccion
	 *
	 */
	@Transactional
	public void realizarTransferenciaExpressInicial(String cuentaOrigen, String cuentaDestino, BigDecimal valorTransferir) {
		
		this.realizarTransferenciaExpress(cuentaOrigen, cuentaDestino, valorTransferir);
	}
	
	
	/**
	 * Support sin Transaccion
	 *
	 */
	//@Transactional
	public void realizarTransferenciaExpressInicialNoT(String cuentaOrigen, String cuentaDestino, BigDecimal valorTransferir) {
		
		this.realizarTransferenciaExpress(cuentaOrigen, cuentaDestino, valorTransferir);
	}
	
	//@Transactional(value=TxType.SUPPORTS)
	@Transactional(value=TxType.REQUIRES_NEW)
	public void realizarTransferenciaExpress(String cuentaOrigen, String cuentaDestino, BigDecimal valorTransferir) {

		LOG.info("Prueba 2:"+ TransactionSynchronizationManager.isActualTransactionActive());
		
		LOG.info("Ejecucion Support");
		CuentaBancaria cuentaOri = this.buscarPorNumero(cuentaOrigen);
		CuentaBancaria cuentaDesti = this.buscarPorNumero(cuentaDestino);

		BigDecimal nuevoSaldoOrigen = cuentaOri.getSaldo().subtract(valorTransferir);
		cuentaOri.setSaldo(nuevoSaldoOrigen);

		BigDecimal nuevoSaldoDestino = cuentaDesti.getSaldo().add(valorTransferir);
		cuentaDesti.setSaldo(nuevoSaldoDestino);

		LOG.info("Support Antes");
		this.cuentaRepo.actualizarCuentaBancaria(cuentaOri);

		this.cuentaRepo.actualizarCuentaBancaria(cuentaDesti);

	}
	
	@Transactional
	public void enviarEmail() {
		this.cuentaRepo.enviarMail("Correo de clases");
	}
	
	public void enviarEmailNoT() {
		this.cuentaRepo.enviarMail("Correo de clases NOT");
		
	}

	@Transactional(value = TxType.SUPPORTS)
	public void propagacionSupports() {

	}

	@Transactional(value = TxType.MANDATORY)
	public void propagacionMandatory() {

		LOG.info("Ejecucion Mandatoria");
	}

}
