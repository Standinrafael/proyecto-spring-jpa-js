package ec.edu.uce.modelo.jpa;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="habiente")
public class Habiente {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_habiente")
	@SequenceGenerator(name="seq_habiente",sequenceName="seq_habiente",allocationSize=1)
	@Column(name="habi_id")
	private Integer id;
	
	@Column(name="habi_nombre")
	private String nombre;
	
	@Column(name="habi_apellido")
	private String apellido;
	
	@Column(name="habi_cedula")
	private String cedula;
	
	@OneToMany(mappedBy="habiente", cascade=CascadeType.ALL)
	private List<Cuenta> cuenta;
	
	@OneToMany(mappedBy="habiente1", cascade=CascadeType.ALL)
	private List<Retiro> retiro2;

	
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public List<Cuenta> getCuenta() {
		return cuenta;
	}

	public void setCuenta(List<Cuenta> cuenta) {
		this.cuenta = cuenta;
	}

	public List<Retiro> getRetiro2() {
		return retiro2;
	}

	public void setRetiro2(List<Retiro> retiro2) {
		this.retiro2 = retiro2;
	}

	@Override
	public String toString() {
		return "Habiente [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula
				+  "]";
	}
	
	
}
