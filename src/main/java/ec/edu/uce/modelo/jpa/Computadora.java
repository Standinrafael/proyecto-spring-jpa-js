package ec.edu.uce.modelo.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="computadora")
@NamedQuery(name="Computadora.buscarPorMarca",query="select c from Computadora c where c.marca=:valor")
public class Computadora {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_computadora")
	@SequenceGenerator(name="seq_computadora",sequenceName="seq_computadora",allocationSize=1)
	@Column(name="id")
	private Integer id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="marca")
	private String marca;
	
	@Column(name="precio")
	private Double precio;
	
	//Metodos GET y SET
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
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Computadora [id=" + id + ", nombre=" + nombre + ", marca=" + marca + ", precio=" + precio + "]";
	}
	
	

}
