package ec.edu.uce.service;

import ec.edu.uce.modelo.jpa.Poliza;

public interface IPolizaService {
	void insertarPoliza(Poliza poliza);
	void actualizarPoliza(Poliza poliza);
	Poliza buscarPoliza(Integer id);
	void eliminarPoliza(Integer id);
}
