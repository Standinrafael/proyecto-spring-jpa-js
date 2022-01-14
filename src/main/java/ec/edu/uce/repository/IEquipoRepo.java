package ec.edu.uce.repository;

import ec.edu.uce.modelo.Equipo;

public interface IEquipoRepo {
	void insertarEquipo (Equipo equipo);
	Equipo buscarEquipo(Integer id);
	void actualizarEquipo(Equipo equipo);
	void borrarEquipo(Integer id);

}
