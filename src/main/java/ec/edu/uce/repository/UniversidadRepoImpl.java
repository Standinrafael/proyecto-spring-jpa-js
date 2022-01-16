package ec.edu.uce.repository;

import ec.edu.uce.modelo.Equipo;
import ec.edu.uce.modelo.Universidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class UniversidadRepoImpl implements IUniversidadRepo {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void insertarUniversidad(Universidad universidad) {
		// TODO Auto-generated method stub
		
		Object [] datosAInsertar= new Object[] { universidad.getId(), universidad.getNombre(), universidad.getCiudad(),
				universidad.getNumeroCarreras(), universidad.getNumeroEstudiantes(), universidad.getCalificacion()
				
		};
		this.jdbcTemplate.update("insert into universidad (id,nombre,ciudad,numcarreras,numestudiantes,calificacion) values(?,?,?,?,?,?)",datosAInsertar);
	}

	@Override
	public Universidad buscarUniversidad(Integer id) {
		// TODO Auto-generated method stub
		Object[] datoABuscar = new Object[] { id

		};
		return this.jdbcTemplate.queryForObject("select * from  universidad where id=?", datoABuscar,new BeanPropertyRowMapper<Universidad>(Universidad.class));
	}

	@Override
	public void actualizarUniversidad(Universidad universidad) {
		// TODO Auto-generated method stub
		Object[] datoAActualizar = new Object[] { universidad.getId(), universidad.getNombre(), universidad.getCiudad(),
				universidad.getNumeroCarreras(), universidad.getNumeroEstudiantes(), universidad.getCalificacion(), universidad.getId()

		};
	
		this.jdbcTemplate.update("update universidad set id=?, nombre=?,ciudad=?,numcarreras=?,numestudiantes=?,calificacion=? where id=?", datoAActualizar);
	}

	@Override
	public void borrarUniversidad(Integer id) {
		// TODO Auto-generated method stub
		Object[] datoABorrar = new Object[] { id

		};

		
		this.jdbcTemplate.update("delete from universidad where id=?", datoABorrar);
	}

}
