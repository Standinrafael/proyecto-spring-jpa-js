package ec.edu.uce.repository;

import ec.edu.uce.modelo.Equipo;
import ec.edu.uce.modelo.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
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
		Object[] datoABuscar = new Object[] { id

		};
		return this.jdbcTemplate.queryForObject("select * from hotel where id=?", datoABuscar,new BeanPropertyRowMapper<Hotel>(Hotel.class));
	}

	@Override
	public void actualizarHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		Object[] datoAActualizar = new Object[] {  hotel.getId(), hotel.getNombre(), hotel.getCiudad(),
				hotel.getPais(), hotel.getEstrellas(), hotel.getPrecioNoche(), hotel.getId()

		};
	
		this.jdbcTemplate.update("update hotel set id=?, nombre=?,ciudad=?,pais=?,estrellas=?,precionoche=? where id=?", datoAActualizar);
	}

	@Override
	public void borrarHotel(Integer id) {
		// TODO Auto-generated method stub
		
		Object[] datoABorrar = new Object[] { id

		};

		
		this.jdbcTemplate.update("delete from hotel where id=?", datoABorrar);
	}

}
