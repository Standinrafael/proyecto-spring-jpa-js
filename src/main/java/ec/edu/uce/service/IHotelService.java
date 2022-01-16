package ec.edu.uce.service;


import ec.edu.uce.modelo.Hotel;

public interface IHotelService {

	void insertarHotelNuevo(Hotel hotel);
	void borrarHotelPorId(Integer id);
	void actualizarHotelNuevo(Hotel hotel);
	Hotel buscarHotelPorId(Integer id);
}
