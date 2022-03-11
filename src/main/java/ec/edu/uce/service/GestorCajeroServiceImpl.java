package ec.edu.uce.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Cuenta;
import ec.edu.uce.modelo.jpa.Habiente;
import ec.edu.uce.modelo.jpa.HabienteVip;
import ec.edu.uce.modelo.jpa.Retiro;

@Service
public class GestorCajeroServiceImpl implements IGestorCajeroService {

	private static final Logger LOG = LoggerFactory.getLogger(GestorCajeroServiceImpl.class);

	@Autowired
	private ICuentaService cuentaService;

	@Autowired
	private IRetiroService retiroService;

	@Override
	@Transactional(value = TxType.REQUIRES_NEW)
	public void consultarCuentaBancaria(String cedula) {
		// TODO Auto-generated method stub

		try {
			List<Cuenta> miLista = this.cuentaService.buscarPorCedula(cedula);

			for (Cuenta c : miLista) {
				LOG.info(c.getHabiente().toString());
				LOG.info(miLista.toString());
			}
		} catch (NullPointerException e) {
			LOG.warn("La cedula: " + cedula + " no tiene cuentas");
		}

	}

	@Override
	@Transactional(value = TxType.REQUIRES_NEW)
	public void consultarSaldo(String numero) {
		// TODO Auto-generated method stub
		try {
			Cuenta cuenta = this.cuentaService.buscarPorNumero(numero);

			BigDecimal saldo = cuenta.getSaldo();
			String tipo = cuenta.getTipo();

			LOG.info("El saldo de la cuenta: " + numero + " tipo: " + tipo + " es: " + saldo);

		} catch (NullPointerException e) {

			LOG.warn("La cuenta " + numero + " no fue encontrada");
		}

	}

	@Override
	@Transactional
	public void realizarRetiro(String numero, BigDecimal valorRetirar) {
		// TODO Auto-generated method stub

		Cuenta cuenta = new Cuenta();
		try {
			cuenta = this.cuentaService.buscarPorNumero(numero);
			BigDecimal nuevoSaldo = cuenta.getSaldo().subtract(valorRetirar);
			cuenta.setSaldo(nuevoSaldo);

		} catch (NullPointerException e) {
			LOG.error("No se puede realizar el retiro por que no se encontro la cuenta");
		}

		Retiro retiro = new Retiro();
		retiro.setMontoRetiro(valorRetirar);
		retiro.setFechaRetiro(LocalDateTime.now());
		retiro.setCuenta1(cuenta);
		retiro.setHabiente1(cuenta.getHabiente());

		try {
			this.cuentaService.actualizarCuenta(cuenta);
		} catch (NullPointerException e) {

			LOG.error("Error actualizacion");
		}

		this.retiroService.insertarReitro(retiro);
	}

	@Override
	@Transactional
	public void consultaHabientes(BigDecimal saldo) {
		// TODO Auto-generated method stub

		// Hice un metodo para traer todas las cuentas de la base de datos

		List<Cuenta> lista = this.cuentaService.traerCuentas();
		List<HabienteVip> listaVip = new ArrayList<>();

		lista.forEach(c -> {
			HabienteVip a = new HabienteVip();
			Habiente b = c.getHabiente();
			a.setApellido(b.getApellido());
			a.setCedula(b.getCedula());
			a.setNombre(b.getNombre());
			a.setNumeroCuenta(c.getNumeroCuenta());
			a.setSaldo(c.getSaldo());
			a.setTipo(c.getTipo());
			listaVip.add(a);
		});

//		for(Cuenta c:lista) {
//			HabienteVip a= new HabienteVip();
//			Habiente b=c.getHabiente();
//			a.setApellido(b.getApellido());
//			a.setCedula(b.getCedula());
//			a.setNombre(b.getNombre());
//			a.setNumeroCuenta(c.getNumeroCuenta());
//			a.setSaldo(c.getSaldo());
//			a.setTipo(c.getTipo());
//			listaVip.add(a);
//		 
//		}

		Stream<HabienteVip> listaFiltrada = listaVip.stream()
				.filter(numero -> numero.getSaldo().floatValue() > saldo.floatValue());
		listaFiltrada.forEach(cuenta -> LOG.info(cuenta.toString()));

	}

	@Override
	@Transactional
	public void consultarHisotrial(LocalDateTime fecha, BigDecimal monto) {
		// TODO Auto-generated method stub
		List<Retiro> lista = this.retiroService.traerRetiros();
		Stream<Retiro> listaFiltrada = lista.stream()
				.filter(retiro -> retiro.getMontoRetiro().floatValue() > monto.floatValue()
						&& retiro.getFechaRetiro().isAfter(fecha));
		listaFiltrada.forEach(historial -> {
			Habiente habiente = historial.getHabiente1();

			LOG.info("Historial [cedula=" + habiente.getCedula() + ", nombre=" + habiente.getNombre() + ", apellido="
					+ habiente.getApellido() + ", monto=" + historial.getMontoRetiro() + ", fechaRetiro="
					+ historial.getFechaRetiro() + " ]");
		});

	}

}
