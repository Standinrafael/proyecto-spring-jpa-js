package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Equipo;
import ec.edu.uce.modelo.Paciente;

@Repository
public class EquipoRepoImpl implements IEquipoRepo {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void insertarEquipo(Equipo equipo) {
		// TODO Auto-generated method stub
		
		Object [] datosAInsertar= new Object[] { equipo.getId(),equipo.getNombre(), equipo.getCiudad(),
				equipo.getPais(), equipo.getPresidente(),equipo.getNumeroCampeonatos()
								
		};
		
		this.jdbcTemplate.update("insert into equipo(id,nombre,ciudad,pais,presidente,numcampeonato) values(?,?,?,?,?,?)",datosAInsertar);
	}

	@Override
	public Equipo buscarEquipo(Integer id) {
		//select * from equipo where id=1
		
		Object[] datoABuscar = new Object[] { id

		};
		return this.jdbcTemplate.queryForObject("select * from equipo where id=?", datoABuscar,new BeanPropertyRowMapper<Equipo>(Equipo.class));
	}

	@Override
	public void actualizarEquipo(Equipo equipo) {
		
		//update equipo set id=1, nombre'Liga' where id=1
		Object[] datoAActualizar = new Object[] {  equipo.getId(), equipo.getNombre(),equipo.getCiudad(),equipo.getPais(),
				equipo.getPresidente(),equipo.getNumeroCampeonatos(), equipo.getId()

		};
	
		this.jdbcTemplate.update("update equipo set id=?, nombre=?,ciudad=?,pais=?,presidente=?,numcampeonato=? where id=?", datoAActualizar);
	}

	@Override
	public void borrarEquipo(Integer id) {
		
		//delete from equipo where id=1
		
		Object[] datoABorrar = new Object[] { id

		};

		
		this.jdbcTemplate.update("delete from equipo where id=?", datoABorrar);
		
	}

}
