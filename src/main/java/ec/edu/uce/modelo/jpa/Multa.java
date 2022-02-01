package ec.edu.uce.modelo.jpa;

import java.time.LocalDateTime;
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
@Table(name="multa")
public class Multa {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_multa")
	@SequenceGenerator(name="seq_multa",sequenceName="seq_multa",allocationSize=1)
	@Column(name="mult_id")
	private Integer id;
	
	@Column(name="mult_cedula")
	private String cedula;
	
	@Column(name="mult_nombre")
	private String nombre;
	
	@Column(name="mult_apellido")
	private String apellido;
	
	@Column(name="mult_fecha", columnDefinition="TIMESTAMP")
	private LocalDateTime fecha;

	//Representar que una multa puede tener muchos detalles
	//rELACION UNO A MUCHOS
	
	@OneToMany(mappedBy="multa", cascade=CascadeType.ALL)
	private List<DetalleMulta> detalles;
	
	//Metodos GEY y SET

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
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

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public List<DetalleMulta> getDetalles() {
		return detalles;
	}

	public void setDetalles(List<DetalleMulta> detalles) {
		this.detalles = detalles;
	}
	
	
}
