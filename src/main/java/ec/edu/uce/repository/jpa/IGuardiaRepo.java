package ec.edu.uce.repository.jpa;

import ec.edu.uce.modelo.jpa.Guardia;

public interface IGuardiaRepo {

	void insertarGuardia(Guardia guardia);
	
	void actualizarGuardia(Guardia guardia);
	
	Guardia buscarGuardiaPorId(Integer id);
	
	void borrarGuardiaPorId(Integer id);
	
	Guardia buscarGuardiaPorApellido(String apellido);	
	
	Guardia buscarGuardiaPorApellidoType(String apellido);
	
	Guardia buscarGuardiaPorApellidoNamed(String apellido);
	
	Guardia buscarGuardiaPorApellidoLista(String apellido);
	
	//Native
	Guardia buscarGuardiaPorApellidoNative(String apellido);
	
	//NameNative
	Guardia buscarGuardiaPorApellidoNamedNative(String apellido);
	
	//Criteria API
	Guardia buscarGuardiaPorApellidoCriteriaApi(String apellido);
	Guardia buscarGuardiaPorApellidoCriteriaApiAnd(String apellido, String edificio);
	Guardia buscarGuardiaPorApellidoCriteriaApiOr(String apellido, String edificio);
	
}
