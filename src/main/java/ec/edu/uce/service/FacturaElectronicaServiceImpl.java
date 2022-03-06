package ec.edu.uce.service;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.FacturaElectronica;
import ec.edu.uce.repository.jpa.IFacturaElectronicaRepo;

@Service
public class FacturaElectronicaServiceImpl implements IFacturaElectronicaService {

	@Autowired
	private IFacturaElectronicaRepo facturaRepo;
	
	@Override
	@Transactional(value=TxType.REQUIRES_NEW)
	public void insertarFacturaElectronica(FacturaElectronica factura) {
		// TODO Auto-generated method stub
		this.facturaRepo.insertarFacturaElectronica(factura);
	}

	@Override
	public void actualizarFacturaElectronica(FacturaElectronica factura) {
		// TODO Auto-generated method stub
		this.facturaRepo.actualizarFacturaElectronica(factura);
	}

	@Override
	public FacturaElectronica buscarFacturaPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.facturaRepo.buscarFacturaPorId(id);
	}

	@Override
	public void borrarFacturaPorId(Integer id) {
		// TODO Auto-generated method stub
		this.facturaRepo.borrarFacturaPorId(id);
	}

	@Override
	@Transactional(value=TxType.NOT_SUPPORTED)
	public FacturaElectronica buscarFacturaPorCedulaCliente(String cedula) {
		// TODO Auto-generated method stub
		return this.facturaRepo.buscarFacturaPorCedulaCliente(cedula);
	}

}
