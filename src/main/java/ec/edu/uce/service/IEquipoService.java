package ec.edu.uce.service;

import ec.edu.uce.modelo.Equipo;

public interface IEquipoService {
	void insertarEquipoNuevo(Equipo equipo);
	void borrarEquipoPorId(Integer id);
	void actualizarEquipoNuevo(Equipo equipo);
	Equipo buscarEquipoPorId(Integer id);

}
