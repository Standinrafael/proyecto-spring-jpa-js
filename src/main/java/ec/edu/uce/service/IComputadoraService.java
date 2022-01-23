package ec.edu.uce.service;

import ec.edu.uce.modelo.jpa.Computadora;

public interface IComputadoraService {

	void guardar(Computadora computadora);
	void actualizar(Computadora computadora);
	Computadora buscar(Integer id);
	void borrar(Integer id);
	Computadora buscarPorMarca(String marca);
	//Type y Named
	Computadora buscarComputadoraPorMarcaType(String marca);
	Computadora buscarComputadoraPorMarcaNamed(String marca);
}
