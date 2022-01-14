package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Paciente;

@Repository
public class PacienteRepoImpl implements IPacienteRepo {
	
	//JDBC Template-Gestiona el contenedor
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void insertarPaciente(Paciente paciente) {
		
		
		//insert into paciente ( id, nombre, apellido, edad) values (1,'Jorge','Sanchez',23)
		
		//Arreglo de objetos a enviar
		Object [] datosAInsertar=new Object[] { paciente.getId(),paciente.getNombre(),paciente.getApellido(),
				paciente.getEdad()	
		};
		
		//utiliza mismo metodo para actualizar e insertar
		this.jdbcTemplate.update("insert into paciente ( id, nombre, apellido, edad) values (?,?,?,?)", datosAInsertar);
		
	}

	@Override
	public Paciente buscarPaciente(Integer id) {
		
		//select *from paciente where id=1
		return null;
	}

	@Override
	public void actualizarPaciente(Paciente paciente) {
		
		
		//update paciente set id=1,nombre='Luis',apellido='Iniguez', edad=24 where id=1 
	}

	@Override
	public void borrarPaciente(Integer id) {
		
		
		//delete  from paciente where id=1
	}

}
