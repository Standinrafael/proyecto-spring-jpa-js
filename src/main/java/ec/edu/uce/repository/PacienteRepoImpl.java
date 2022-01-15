package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Paciente;

@Repository
public class PacienteRepoImpl implements IPacienteRepo {

	// JDBC Template-Gestiona el contenedor
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void insertarPaciente(Paciente paciente) {

		// insert into paciente ( id, nombre, apellido, edad) values
		// (1,'Jorge','Sanchez',23)

		// Arreglo de objetos a enviar
		Object[] datosAInsertar = new Object[] { paciente.getId(), paciente.getNombre(), paciente.getApellido(),
				paciente.getEdad() };

		// utiliza mismo metodo para actualizar e insertar
		this.jdbcTemplate.update("insert into paciente ( id, nombre, apellido, edad) values (?,?,?,?)", datosAInsertar);

	}

	@Override
	public Paciente buscarPaciente(Integer id) {

		// select *from paciente where id=1

		Object[] datoABuscar = new Object[] { id

		};
		return this.jdbcTemplate.queryForObject("select * from paciente where id=?", datoABuscar,new BeanPropertyRowMapper<Paciente>(Paciente.class));
		
	}

	@Override
	public void actualizarPaciente(Paciente paciente) {

		Object[] datoAActualizar = new Object[] { paciente.getId(), paciente.getNombre(), paciente.getApellido(),
				paciente.getEdad(), paciente.getId()

		};
		// update paciente set id=1,nombre='Luis',apellido='Iniguez', edad=24 where id=1
		this.jdbcTemplate.update("update paciente set id=?, nombre=?,apellido=?,edad=? where id=?", datoAActualizar);
	}

	@Override
	public void borrarPaciente(Integer id) {

		Object[] datoABorrar = new Object[] { id

		};

		// delete from paciente where id=1
		this.jdbcTemplate.update("delete from paciente where id=?", datoABorrar);
	}

}
