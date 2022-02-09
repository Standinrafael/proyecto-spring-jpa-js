package ec.edu.uce.modelo.jpa;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_cliente")
	@SequenceGenerator(name="seq_cliente",sequenceName="seq_cliente",allocationSize=1)
	@Column(name="clie_id")
	private Integer id;
	
	@Column(name="clie_nombre")
	private String nombre;
	
	
	//lista
	@ElementCollection
	private List<String> telefono;
	
	
	//Metodos Get y Set
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<String> getTelefono() {
		return telefono;
	}
	public void setTelefono(List<String> telefono) {
		this.telefono = telefono;
	}
	
	
}
