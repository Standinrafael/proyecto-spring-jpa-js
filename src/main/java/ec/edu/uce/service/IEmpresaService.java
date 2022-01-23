package ec.edu.uce.service;

import ec.edu.uce.modelo.jpa.Empresa;

public interface IEmpresaService {
	void guardar(Empresa empresa);
	void actualizar(Empresa empresa);
	Empresa buscar(Integer id);
	void borrar (Integer id);
	Empresa buscarPorNombre(String nombre);
	//Typed y Named
	Empresa buscarEmpresaPorNombreType(String nombre);
	Empresa buscarEmpresaPorNombreNamed(String nombre);
	
}
