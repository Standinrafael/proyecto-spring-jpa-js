package ec.edu.uce.modelo.jpa;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="profesor")
public class Profesor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_profesor")
	@SequenceGenerator(name="seq_profesor",sequenceName="seq_profesor",allocationSize=1)
	@Column(name="prof_id")
	private Integer id;
	
	@Column(name="prof_universidad")
	private String universidad;
	
	@Column(name="prof_carrera")
	private String carrera;
	
	@Column(name="prof_materia")
	private String materia;
	
	@Column(name="prof_sueldo")
	private BigDecimal sueldo;
	
	
	@OneToOne
	@JoinColumn(name="prof_id_persona")
	private Persona persona;

	//Metodos GET y SET

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getUniversidad() {
		return universidad;
	}


	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}


	public String getCarrera() {
		return carrera;
	}


	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}


	public BigDecimal getSueldo() {
		return sueldo;
	}


	public void setSueldo(BigDecimal sueldo) {
		this.sueldo = sueldo;
	}


	public Persona getPersona() {
		return persona;
	}


	public void setPersona(Persona persona) {
		this.persona = persona;
	}


	public String getMateria() {
		return materia;
	}


	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	

}
