package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Hotel;
import ec.edu.uce.repository.IHotelRepo;

@Service
public class HotelServiceRepo implements IHotelService {
	
	@Autowired
	private IHotelRepo hotelRepo;

	@Override
	public void insertarHotelNuevo(Hotel hotel) {
		// TODO Auto-generated method stub
		this.hotelRepo.insertarHotel(hotel);
	}

	@Override
	public void borrarHotelPorId(Integer id) {
		// TODO Auto-generated method stub
		this.hotelRepo.borrarHotel(id);
	}

	@Override
	public void actualizarHotelNuevo(Hotel hotel) {
		// TODO Auto-generated method stub
		this.hotelRepo.actualizarHotel(hotel);
	}

	@Override
	public Hotel buscarHotelPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.hotelRepo.buscarHotel(id);
	}

}
