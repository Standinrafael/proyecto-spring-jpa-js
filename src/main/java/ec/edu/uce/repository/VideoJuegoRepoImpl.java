package ec.edu.uce.repository;

import ec.edu.uce.modelo.Videojuego;
import org.springframework.beans.factory.annotation.Autowired;
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
		return null;
	}

	@Override
	public void actualizarVideojuego(Videojuego videojuego) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrarVideojuego(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
