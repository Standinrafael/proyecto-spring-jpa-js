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
@Table(name="parque")
@NamedQuery(name="Parque.buscarPorPais",query="select p from Parque p where p.pais=:valor")
public class Parque {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_parque")
	@SequenceGenerator(name="seq_parque",sequenceName="seq_parque",allocationSize=1)
	@Column(name="id")
	private Integer id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="pais")
	private String pais;
	
	@Column(name="area")
	private Double area;
	
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
	public Double getArea() {
		return area;
	}
	public void setArea(Double area) {
		this.area = area;
	}
	
	
	@Override
	public String toString() {
		return "Parque [id=" + id + ", nombre=" + nombre + ", pais=" + pais + ", area=" + area + "]";
	}
	
	
}
