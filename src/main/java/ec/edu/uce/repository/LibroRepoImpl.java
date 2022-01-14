package ec.edu.uce.repository;

import ec.edu.uce.modelo.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LibroRepoImpl implements ILibroRepo {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void insertarLibro(Libro libro) {
		// TODO Auto-generated method stub
		
		Object [] datosAInsertar= new Object [] { libro.getId(), libro.getNombre(),libro.getAutor(),
				libro.getCategoria(),libro.getSubcategoria(),libro.getEditorial()
				
		};
		
		this.jdbcTemplate.update("insert into libro (id,nombre,autor,categoria,subcategoria,editorial) values(?,?,?,?,?,?)",datosAInsertar);
	}

	@Override
	public Libro buscarLibro(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizarLibro(Libro libro) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrarLibro(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
