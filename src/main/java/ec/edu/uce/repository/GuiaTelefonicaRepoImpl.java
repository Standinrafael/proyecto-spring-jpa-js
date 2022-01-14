package ec.edu.uce.repository;

import ec.edu.uce.modelo.GuiaTelefonica;
import org.springframework.beans.factory.annotation.Autowired;
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
		return null;
	}

	@Override
	public void actualizarUsuarioGuiaTelefonica(GuiaTelefonica guia) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrarUsuarioGuiaTelefonica(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
