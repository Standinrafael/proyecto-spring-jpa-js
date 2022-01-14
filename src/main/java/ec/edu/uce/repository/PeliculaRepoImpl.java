package ec.edu.uce.repository;

import ec.edu.uce.modelo.Pelicula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PeliculaRepoImpl implements IPeliculaRepo {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void insertarPelicula(Pelicula pelicula) {
		// TODO Auto-generated method stub
		
		Object[] datosAInsertar= new Object[] { pelicula.getId(), pelicula.getNombre(), pelicula.getDirector(),
				pelicula.getGenero(), pelicula.getProductora(), pelicula.getActorPrincipal(), pelicula.getActrizPrincipal()
				
		};
		this.jdbcTemplate.update("insert into pelicula(id,nombre,director,genero,productora,actorprincipal,actrizprincipal) values(?,?,?,?,?,?,?)",datosAInsertar);
	}

	@Override
	public Pelicula buscarPelicula(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizarPelicula(Pelicula pelicula) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrarPelicula(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
