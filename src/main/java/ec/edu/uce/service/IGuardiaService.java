package ec.edu.uce.service;

import ec.edu.uce.modelo.jpa.Guardia;

public interface IGuardiaService {

	void guardarGuardia(Guardia guardia);
	void actualizar(Guardia guardia);
	Guardia buscar(Integer id);
	void borrar(Integer id);
	Guardia buscarPorApellido(String apellido);	
	Guardia buscarGuardiaPorApellidoType(String apellido);
	Guardia buscarGuardiaPorApellidoNamed(String apellido);
	Guardia buscarGuardiaPorApellidoLista(String apellido);
	//Native 
	Guardia buscarGuardiaPorApellidoNative(String apellido);
}
