package ec.edu.uce.modelo.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="farmacia")
public class Farmacia {

	@Id
	@GeneratedValue
	@Column(name="id")
	private Integer id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="ciudad")
	private String ciudad;
	
	@Column(name="numsucursales")
	private Integer numeroSucursales;
	
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
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public Integer getNumeroSucursales() {
		return numeroSucursales;
	}
	public void setNumeroSucursales(Integer numeroSucursales) {
		this.numeroSucursales = numeroSucursales;
	}
	
	
	@Override
	public String toString() {
		return "Farmacia [id=" + id + ", nombre=" + nombre + ", ciudad=" + ciudad + ", numeroSucursales="
				+ numeroSucursales + "]";
	}
	
	
}
