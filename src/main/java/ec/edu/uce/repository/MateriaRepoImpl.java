package ec.edu.uce.repository;

import ec.edu.uce.modelo.Equipo;
import ec.edu.uce.modelo.Materia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class MateriaRepoImpl implements IMateriaRepo {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void insertarMateria(Materia materia) {
		// TODO Auto-generated method stub
		
		Object [] datosAInsertar= new Object[] { materia.getId(),materia.getNombre(),materia.getProfesorImparteMateria(),
				materia.getFacultad(), materia.getNumeroEstudiantes(),materia.getHoras()
				
		};
		this.jdbcTemplate.update("insert into materia(id,nombre,profesormateria,facultad,numestudiantes,horas) values(?,?,?,?,?,?)",datosAInsertar);
	}

	@Override
	public Materia buscarMateria(Integer id) {
		// TODO Auto-generated method stub
		Object[] datoABuscar = new Object[] { id

		};
		return this.jdbcTemplate.queryForObject("select * from materia where id=?", datoABuscar,new BeanPropertyRowMapper<Materia>(Materia.class));
	}

	@Override
	public void actualizarMateria(Materia materia) {
		// TODO Auto-generated method stub
		Object[] datoAActualizar = new Object[] {  materia.getId(), materia.getNombre(), materia.getProfesorImparteMateria(),
				materia.getFacultad(), materia.getNumeroEstudiantes(), materia.getHoras(), materia.getId()

		};
	
		this.jdbcTemplate.update("update materia set id=?, nombre=?,profesormateria=?,facultad=?,numestudiantes=?,horas=? where id=?", datoAActualizar);
	}

	@Override
	public void borrarMateria(Integer id) {
		// TODO Auto-generated method stub
		Object[] datoABorrar = new Object[] { id

		};

		
		this.jdbcTemplate.update("delete from materia where id=?", datoABorrar);
	}

}
