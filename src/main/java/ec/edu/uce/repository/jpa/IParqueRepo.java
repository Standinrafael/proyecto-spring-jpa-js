package ec.edu.uce.repository.jpa;

import ec.edu.uce.modelo.jpa.Parque;

public interface IParqueRepo {
	void insertarParque(Parque parque);
	void actualizarParque(Parque parque);
	Parque buscarParquePorId(Integer id);
	void borrarParquePorId(Integer id);
	Parque buscarParquePorPais(String pais);
	//Type y Named
	Parque buscarParquePorPaisType(String pais);
	Parque buscarParquePorPaisNamed(String pais);
	//Native
	Parque buscarParquePorPaisNative(String pais);
	//Criteria Api
	Parque buscarParquePorPaisCriteriaApi(String pais);
	

}
