package ec.edu.uce.repository.jpa;

import ec.edu.uce.modelo.jpa.FacturaElectronica;

public interface IFacturaElectronicaRepo {

	void insertarFacturaElectronica(FacturaElectronica factura);
	void actualizarFacturaElectronica(FacturaElectronica factura);
	FacturaElectronica buscarFacturaPorId(Integer id);
	void borrarFacturaPorId(Integer id);
	
	FacturaElectronica buscarFacturaPorCedulaCliente(String cedula);
}
