package ec.edu.uce.repository.jpa;

import ec.edu.uce.modelo.jpa.Consumo;

public interface IConsumoRepo {
	void insertarConsumo(Consumo consumo);
	void actualizarConsumo(Consumo consumo);

}
