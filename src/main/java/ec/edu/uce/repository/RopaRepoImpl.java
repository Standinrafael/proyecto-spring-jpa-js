package ec.edu.uce.repository;

import ec.edu.uce.modelo.Equipo;
import ec.edu.uce.modelo.Ropa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
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
		Object[] datoABuscar = new Object[] { id

		};
		return this.jdbcTemplate.queryForObject("select * from ropa where id=?", datoABuscar,new BeanPropertyRowMapper<Ropa>(Ropa.class));
	}

	@Override
	public void actualizarRopa(Ropa ropa) {
		// TODO Auto-generated method stub
		Object[] datoAActualizar = new Object[] { ropa.getId(), ropa.getNombre(), ropa.getTemporada(),
				ropa.getMarca(), ropa.getTalla(), ropa.getPrecio(), ropa.getId()

		};
	
		this.jdbcTemplate.update("update ropa set id=?, nombre=?,temporada=?,marca=?,talla=?,precio=? where id=?", datoAActualizar);
	}

	@Override
	public void borrarRopa(Integer id) {
		// TODO Auto-generated method stub
		Object[] datoABorrar = new Object[] { id

		};

		
		this.jdbcTemplate.update("delete from ropa where id=?", datoABorrar);
	}

}
