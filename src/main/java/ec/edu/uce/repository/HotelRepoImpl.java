package ec.edu.uce.repository;

import ec.edu.uce.modelo.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class HotelRepoImpl implements IHotelRepo {

	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void insertarHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		
		Object[] datosAInsertar= new Object[] { hotel.getId(),hotel.getNombre(),hotel.getCiudad(),
				hotel.getPais(),hotel.getEstrellas(),hotel.getPrecioNoche()
				
		};
		
		this.jdbcTemplate.update("insert into hotel (id,nombre,ciudad,pais,estrellas,precionoche) values(?,?,?,?,?,?)",datosAInsertar);
	}

	@Override
	public Hotel buscarHotel(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizarHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrarHotel(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
