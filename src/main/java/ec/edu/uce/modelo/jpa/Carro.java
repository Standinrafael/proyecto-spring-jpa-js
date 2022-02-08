package ec.edu.uce.modelo.jpa;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="carro")
public class Carro {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_carro")
	@SequenceGenerator(name="seq_carro",sequenceName="seq_carro",allocationSize=1)
	@Column(name="carr_id")
	private Integer id;
	

	@Column(name="carr_marca")
	private String marca;
	
	@Column(name="carr_fechamatricula")
	private LocalDateTime fechaMatricula;
	
	
	@Column(name="carr_nombrepropietario")
	private String nombrePropietario;
	
	@Column(name="carr_apellidopropietario")
	private String apellidoPropietario;
	
	@OneToOne(mappedBy="carro", cascade=CascadeType.ALL)
	private Taxi taxi;


	//Metodos GET y SET
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public LocalDateTime getFechaMatricula() {
		return fechaMatricula;
	}


	public void setFechaMatricula(LocalDateTime fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}


	public String getNombrePropietario() {
		return nombrePropietario;
	}


	public void setNombrePropietario(String nombrePropietario) {
		this.nombrePropietario = nombrePropietario;
	}


	public String getApellidoPropietario() {
		return apellidoPropietario;
	}


	public void setApellidoPropietario(String apellidoPropietario) {
		this.apellidoPropietario = apellidoPropietario;
	}


	public Taxi getTaxi() {
		return taxi;
	}


	public void setTaxi(Taxi taxi) {
		this.taxi = taxi;
	}


	@Override
	public String toString() {
		return "Carro [id=" + id + ", marca=" + marca + ", fechaMatricula=" + fechaMatricula + ", nombrePropietario="
				+ nombrePropietario + ", apellidoPropietario=" + apellidoPropietario + ", taxi=" + taxi + "]";
	}

	
}
