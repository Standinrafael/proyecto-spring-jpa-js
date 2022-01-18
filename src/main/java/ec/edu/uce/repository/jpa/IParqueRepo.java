package ec.edu.uce.repository.jpa;

import ec.edu.uce.modelo.jpa.Parque;

public interface IParqueRepo {
	void insertarParque(Parque parque);
	void actualizarParque(Parque parque);
	Parque buscarParquePorId(Integer id);
	void borrarParquePorId(Integer id);

}
