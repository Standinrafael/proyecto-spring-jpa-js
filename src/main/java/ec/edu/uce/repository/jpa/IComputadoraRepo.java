package ec.edu.uce.repository.jpa;

import ec.edu.uce.modelo.jpa.Computadora;

public interface IComputadoraRepo {
	void insertarComputadora(Computadora computadora);
	void actualizarComputadora(Computadora computadora);
	Computadora buscarComputadoraPorId(Integer id);
	void borrarComputadoraPorId(Integer id);
	
	
	Computadora buscarComputadoraPorMarca(String marca);
	//Type y Named
	Computadora buscarComputadoraPorMarcaType(String marca);
	Computadora buscarComputadoraPorMarcaNamed(String marca);

}
