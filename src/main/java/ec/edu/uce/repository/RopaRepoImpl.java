package ec.edu.uce.repository;

import ec.edu.uce.modelo.Ropa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class RopaRepoImpl implements IRopaRepo {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void insertarRopa(Ropa ropa) {
		// TODO Auto-generated method stub
		
		Object [] datosAInsertar= new Object [] { ropa.getId(),ropa.getNombre(),ropa.getTemporada(),
				ropa.getMarca(),ropa.getTalla(),ropa.getPrecio()
				
		};
		
		this.jdbcTemplate.update("insert into ropa(id,nombre,temporada,marca,talla,precio) values(?,?,?,?,?,?)",datosAInsertar);
	}

	@Override
	public Ropa buscarRopa(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizarRopa(Ropa ropa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrarRopa(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
