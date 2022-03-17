package ec.edu.uce.repository.jpa;

import ec.edu.uce.modelo.jpa.Poliza;

public interface IPolizaRepo {

	void insertarPoliza(Poliza poliza);
	void actualizarPoliza(Poliza poliza);
	Poliza buscarPoliza(Integer id);
	void eliminarPoliza(Integer id);
}
