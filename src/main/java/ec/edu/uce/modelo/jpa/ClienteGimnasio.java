package ec.edu.uce.modelo.jpa;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="cliente_gimnasio")
public class ClienteGimnasio {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_cliente_gimnasio")
	@SequenceGenerator(name="seq_cliente_gimnasio",sequenceName="seq_cliente_gimnasio",allocationSize=1)
	@Column(name="clgi_id")
	private Integer id;
	
	@Column(name="clgi_nombre")
	private String nommbre;
	
	@Column(name="clgi_apellido")
	private String apellido;
	
	@Column(name="clgi_cedula")
	private String cedula;
	
	@Column(name="clgi_fecha_nacimiento", columnDefinition="TIMESTAMP")
	private LocalDateTime fechaNacimiento;
	
	@Column(name="clgi_estado")
	private String estado;
	
	
	@ManyToOne
	@JoinColumn(name="memb_id")
	private Membresia membresia;


	//Metods Get y Set
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNommbre() {
		return nommbre;
	}


	public void setNommbre(String nommbre) {
		this.nommbre = nommbre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public LocalDateTime getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public Membresia getMembresia() {
		return membresia;
	}


	public void setMembresia(Membresia membresia) {
		this.membresia = membresia;
	}


	public String getCedula() {
		return cedula;
	}


	public void setCedula(String cedula) {
		this.cedula = cedula;
	}


	@Override
	public String toString() {
		return "ClienteGimnasio [id=" + id + ", nommbre=" + nommbre + ", apellido=" + apellido + ", cedula=" + cedula
				+ ", fechaNacimiento=" + fechaNacimiento + ", estado=" + estado  + "]";
	}


	
	
	
	
}
