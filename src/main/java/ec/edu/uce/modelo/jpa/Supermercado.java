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
@Table(name="supermercado")
@NamedQuery(name="Supermercado.buscarPorNombre",query="select s from Supermercado s where s.nombre=: valor")
public class Supermercado {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_supermercado")
	@SequenceGenerator(name="seq_supermercado",sequenceName="seq_supermercado",allocationSize=1)
	@Column(name="id")
	private Integer id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="pais")
	private String pais;
	
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
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public Integer getNumeroSucursales() {
		return numeroSucursales;
	}
	public void setNumeroSucursales(Integer numeroSucursales) {
		this.numeroSucursales = numeroSucursales;
	}
	
	
	@Override
	public String toString() {
		return "Supermercado [id=" + id + ", nombre=" + nombre + ", pais=" + pais + ", numeroSucursales="
				+ numeroSucursales + "]";
	}
	
	
}
