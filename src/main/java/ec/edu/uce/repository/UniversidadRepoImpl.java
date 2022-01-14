package ec.edu.uce.repository;

import ec.edu.uce.modelo.Universidad;
import org.springframework.beans.factory.annotation.Autowired;
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
		return null;
	}

	@Override
	public void actualizarUniversidad(Universidad universidad) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrarUniversidad(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
