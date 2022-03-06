package ec.edu.uce.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import ec.edu.uce.modelo.jpa.ClienteGimnasio;
import ec.edu.uce.modelo.jpa.FacturaElectronica;
import ec.edu.uce.modelo.jpa.Membresia;

@Service
public class GestorGimnasioServiceImpl implements IGestorGimnasioService {

	private static final Logger LOG = LoggerFactory.getLogger(GestorGimnasioServiceImpl.class);

	@Autowired
	private IMembresiaService membresiaService;

	@Autowired
	private IClienteGimnasioService clienteService;

	@Autowired
	private IFacturaElectronicaService facturaService;

	@Override
	@Transactional
	public void registrarPago(String cedula, String codigo) {
		// TODO Auto-generated method stub

		ClienteGimnasio cliente = new ClienteGimnasio();
		FacturaElectronica factura = new FacturaElectronica();
		Membresia membresia = new Membresia();
		List<ClienteGimnasio> lista = new ArrayList<>();

		try {
			cliente = this.clienteService.buscarClientePorCedula(cedula);
			membresia = this.membresiaService.buscarMembresiaPorCodigo(codigo);
			
			cliente.setEstado("Pagado");
			cliente.setMembresia(membresia);
			lista.add(cliente);
			
			
			int cantidad = membresia.getCantidad() + 1;
			membresia.setCantidad(cantidad);
			membresia.setCliente(lista);
			
			this.clienteService.actualizarClienteGimnasio(cliente);
			this.membresiaService.actualizarMembresia(membresia);

		} catch (NullPointerException e) {
			LOG.error("No se encontro valor ya sea cliente o membresia");
		}	

		
		factura.setCedulaCliente(cliente.getCedula());
		factura.setFechaPago(LocalDateTime.now());
		factura.setValorPago(membresia.getValor());

		
		
		try {
			
			this.facturaService.insertarFacturaElectronica(factura);
			
		}catch(ArrayIndexOutOfBoundsException e){
			
			LOG.error("Error al crear la Factura Electronica del SRI");
		}
		
		

	}

	@Override
	@Transactional
	public void registroMembresia(String cedula) {
		// TODO Auto-generated method stub
		ClienteGimnasio cliente = new ClienteGimnasio();
		FacturaElectronica factura = new FacturaElectronica();
		
		
		try {
			cliente = this.clienteService.buscarClientePorCedula(cedula);
			factura=this.facturaService.buscarFacturaPorCedulaCliente(cedula);
			
			LOG.info("------------Registro de Membrecia del Cliente------------");
			LOG.info("ID de Registro de Membresia: "+factura.getId());
			LOG.info("Fecha Pago de membresia: "+factura.getFechaPago());
			LOG.info("Valor de membresia: "+factura.getValorPago());
			LOG.info("ID cliente: "+cliente.getId());
			LOG.info("ID de Membresia: "+cliente.getMembresia().getId());
			
			
			
		}catch(NullPointerException e) {
			LOG.error("No hay registro de esa membrecia");
		}
	}

}
