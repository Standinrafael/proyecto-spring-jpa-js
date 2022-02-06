package ec.edu.uce.modelo.jpa;

import java.time.LocalDateTime;

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
@Table(name="taxi")
public class Taxi {

	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_taxi")
	@SequenceGenerator(name="seq_taxi",sequenceName="seq_taxi",allocationSize=1)
	@Column(name="taxi_id")
	private Integer id;
	
	@Column(name="taxi_empresa")
	private String empresa;
	
	@Column(name="taxi_fechaingreso")
	private LocalDateTime fechaIngreso;
	
	@OneToOne
	@JoinColumn(name="taxi_id_carro")
	private Carro carro;

	//Metodos GET y SET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public LocalDateTime getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDateTime fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	
	
}
