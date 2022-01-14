package ec.edu.uce.repository;

import ec.edu.uce.modelo.Hotel;

public interface IHotelRepo {

	void insertarHotel(Hotel hotel);
	Hotel buscarHotel(Integer id);
	void actualizarHotel(Hotel hotel);
	void borrarHotel(Integer id);
}
