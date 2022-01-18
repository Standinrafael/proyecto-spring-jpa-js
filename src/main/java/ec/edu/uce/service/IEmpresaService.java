package ec.edu.uce.service;

import ec.edu.uce.modelo.jpa.Empresa;

public interface IEmpresaService {
	void guardar(Empresa empresa);
	void actualizar(Empresa empresa);
}
