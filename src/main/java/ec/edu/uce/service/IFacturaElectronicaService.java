package ec.edu.uce.service;

import ec.edu.uce.modelo.jpa.FacturaElectronica;

public interface IFacturaElectronicaService {

	void insertarFacturaElectronica(FacturaElectronica factura);
	void actualizarFacturaElectronica(FacturaElectronica factura);
	FacturaElectronica buscarFacturaPorId(Integer id);
	void borrarFacturaPorId(Integer id);
	
	FacturaElectronica buscarFacturaPorCedulaCliente(String cedula);
}
