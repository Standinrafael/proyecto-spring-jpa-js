package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Equipo;

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
		return null;
	}

	@Override
	public void actualizarEquipo(Equipo equipo) {
		
		//update equipo set id=1, nombre'Liga' where id=1
	}

	@Override
	public void borrarEquipo(Integer id) {
		
		//delete from equipo where id=1
		
	}

}
