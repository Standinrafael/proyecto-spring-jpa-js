package ec.edu.uce.modelo.jpa;

import java.math.BigDecimal;
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
@Table(name="retiro")
public class Retiro {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_retiro")
	@SequenceGenerator(name="seq_retiro",sequenceName="seq_retiro",allocationSize=1)
	@Column(name="reti_id")
	private Integer id;
	
	@Column(name="reti_monto_retiro")
	private BigDecimal montoRetiro;
	
	@Column(name="reti_fecha_retiro", columnDefinition="TIMESTAMP")
	private LocalDateTime fechaRetiro;
	
	@ManyToOne
	@JoinColumn(name="cuen_id")
	private Cuenta cuenta1;
	
	@ManyToOne
	@JoinColumn(name="habi_id")
	private Habiente habiente1;
	
	

	//Metodos GET y SET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getMontoRetiro() {
		return montoRetiro;
	}

	public void setMontoRetiro(BigDecimal montoRetiro) {
		this.montoRetiro = montoRetiro;
	}

	public LocalDateTime getFechaRetiro() {
		return fechaRetiro;
	}

	public void setFechaRetiro(LocalDateTime fechaRetiro) {
		this.fechaRetiro = fechaRetiro;
	}

	public Cuenta getCuenta1() {
		return cuenta1;
	}

	public void setCuenta1(Cuenta cuenta1) {
		this.cuenta1 = cuenta1;
	}

	public Habiente getHabiente1() {
		return habiente1;
	}

	public void setHabiente1(Habiente habiente1) {
		this.habiente1 = habiente1;
	}

	@Override
	public String toString() {
		return "Retiro [id=" + id + ", montoRetiro=" + montoRetiro + ", fechaRetiro=" + fechaRetiro + ", cuenta1="
				+ cuenta1 + ", habiente1=" + habiente1 + "]";
	}
	
	
}
