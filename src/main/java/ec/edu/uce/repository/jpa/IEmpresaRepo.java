package ec.edu.uce.repository.jpa;

import ec.edu.uce.modelo.jpa.Empresa;

public interface IEmpresaRepo {
	void insertarEmpresa(Empresa empresa);
	void actualizarEmpresa(Empresa empresa);
	Empresa buscarEmpresaPorId(Integer id);
	void borrarEmpresaPorId(Integer id);
	Empresa buscarEmpresaPorNombre(String nombre);
	//Type y Named
	Empresa buscarEmpresaPorNombreType(String nombre);
	Empresa buscarEmpresaPorNombreNamed(String nombre);
	//Native
	Empresa buscarEmpresaPorNombreNative(String nombre);
}
