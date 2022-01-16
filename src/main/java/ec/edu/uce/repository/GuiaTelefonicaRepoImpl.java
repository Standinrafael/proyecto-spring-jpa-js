package ec.edu.uce.repository;

import ec.edu.uce.modelo.GuiaTelefonica;
import ec.edu.uce.modelo.Paciente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class GuiaTelefonicaRepoImpl implements IGuiaTelefonicaRepo {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void insertarUsuarioGuiaTelefonica(GuiaTelefonica guia) {
		// TODO Auto-generated method stub
		
		Object[] datosAInsertar= new Object[] { guia.getId(),guia.getNombre(),guia.getApellido(),
				guia.getCiudad(),guia.getDireccion(),guia.getTelefono()
				
		};
		
		this.jdbcTemplate.update("insert into guiatelefonica (id,nombre,apellido,ciudad,direccion,telefono) values(?,?,?,?,?,?)",datosAInsertar);
	}

	@Override
	public GuiaTelefonica buscarUsuarioGuiaTelefonica(Integer id) {
		// TODO Auto-generated method stub
		Object[] datoABuscar = new Object[] { id

		};
		return this.jdbcTemplate.queryForObject("select * from guiatelefonica where id=?", datoABuscar,new BeanPropertyRowMapper<GuiaTelefonica>(GuiaTelefonica.class));
	}

	@Override
	public void actualizarUsuarioGuiaTelefonica(GuiaTelefonica guia) {
		// TODO Auto-generated method stub
		
		Object[] datoAActualizar = new Object[] { guia.getId(), guia.getNombre(), guia.getApellido(),
				guia.getCiudad(), guia.getDireccion(), guia.getTelefono(), guia.getId()

		};
		
		this.jdbcTemplate.update("update guiatelefonica set id=?, nombre=?,apellido=?,ciudad=?, direccion=?, telefono=?  where id=?", datoAActualizar);
	}

	@Override
	public void borrarUsuarioGuiaTelefonica(Integer id) {
		// TODO Auto-generated method stub
		
		Object[] datoABorrar = new Object[] { id

		};

		
		this.jdbcTemplate.update("delete from guiatelefonica where id=?", datoABorrar);
	}

}
