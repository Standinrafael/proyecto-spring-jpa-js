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
@Table(name="empresa")
@NamedQuery(name="Empresa.buscarPorNombre",query="select e from Empresa e where e.nombre=:valor")
public class Empresa {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_empresa")
	@SequenceGenerator(name="seq_empresa",sequenceName="seq_empresa",allocationSize=1)
	@Column(name="id")
	private Integer id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="pais")
	private String pais;
	
	@Column(name="numempleados")
	private Integer numeroEmpleados;
	
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
	public Integer getNumeroEmpleados() {
		return numeroEmpleados;
	}
	public void setNumeroEmpleados(Integer numeroEmpleados) {
		this.numeroEmpleados = numeroEmpleados;
	}
	
	
	@Override
	public String toString() {
		return "Empresa [id=" + id + ", nombre=" + nombre + ", pais=" + pais + ", numeroEmpleados=" + numeroEmpleados
				+ "]";
	}
	
	
}
