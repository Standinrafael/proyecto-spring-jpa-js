package ec.edu.uce.repository;


import ec.edu.uce.modelo.Videojuego;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class VideoJuegoRepoImpl implements IVideoJuegoRepo {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public void insertarVideojuego(Videojuego videojuego) {
		// TODO Auto-generated method stub
		
		Object[] datosAInsertar= new Object [] { videojuego.getId(),videojuego.getNombre(),videojuego.getDistribuidor(),
				videojuego.getGenero(),videojuego.getModoJuego(),videojuego.getClasificacion()
				
		};
		
		this.jdbcTemplate.update("insert into videojuego(id,nombre,distribuidor,genero,modo,clasificacion) values(?,?,?,?,?,?)",datosAInsertar);
	}

	@Override
	public Videojuego buscarVIdeojuego(Integer id) {
		// TODO Auto-generated method stub
		Object[] datoABuscar = new Object[] { id

		};
		return this.jdbcTemplate.queryForObject("select * from videojuego where id=?", datoABuscar,new BeanPropertyRowMapper<Videojuego>(Videojuego.class));
	}

	@Override
	public void actualizarVideojuego(Videojuego videojuego) {
		// TODO Auto-generated method stub
		Object[] datoAActualizar = new Object[] {  videojuego.getId(), videojuego.getNombre(), videojuego.getDistribuidor(),
				videojuego.getGenero(), videojuego.getModoJuego(), videojuego.getClasificacion(), videojuego.getId()

		};
	
		this.jdbcTemplate.update("update videojuego set id=?, nombre=?,distribuidor=?,genero=?,modo=?,clasificacion=? where id=?", datoAActualizar);
	}

	@Override
	public void borrarVideojuego(Integer id) {
		// TODO Auto-generated method stub
		Object[] datoABorrar = new Object[] { id

		};

		
		this.jdbcTemplate.update("delete from videojuego where id=?", datoABorrar);
	}

}
