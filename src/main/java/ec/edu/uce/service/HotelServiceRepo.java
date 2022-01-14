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

}
