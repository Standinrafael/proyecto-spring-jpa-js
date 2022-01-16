package ec.edu.uce.repository;

import ec.edu.uce.modelo.Equipo;
import ec.edu.uce.modelo.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
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
		Object[] datoABuscar = new Object[] { id

		};
		return this.jdbcTemplate.queryForObject("select * from libro where id=?", datoABuscar,new BeanPropertyRowMapper<Libro>(Libro.class));
	}

	@Override
	public void actualizarLibro(Libro libro) {
		// TODO Auto-generated method stub
		Object[] datoAActualizar = new Object[] { libro.getId(), libro.getNombre(), libro.getAutor(),
				libro.getCategoria(), libro.getSubcategoria(), libro.getEditorial(), libro.getId()

		};
	
		this.jdbcTemplate.update("update libro set id=?, nombre=?,autor=?,categoria=?,subcategoria=?,editorial=? where id=?", datoAActualizar);
	}

	@Override
	public void borrarLibro(Integer id) {
		// TODO Auto-generated method stub
		Object[] datoABorrar = new Object[] { id

		};

		
		this.jdbcTemplate.update("delete from libro where id=?", datoABorrar);
	}

}
