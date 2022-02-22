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
@Table(name="consumo")
public class Consumo {
	 
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_consumo")
	@SequenceGenerator(name="seq_consumo",sequenceName="seq_consumo",allocationSize=1)
	@Column(name="cons_id")
	private Integer id;
	
	@Column(name="cons_consumo")
	private BigDecimal consumo;
	
	@Column(name="cons_fecha_consumo", columnDefinition="TIMESTAMP")
	private LocalDateTime fechaConsumo;
	
	@ManyToOne
	@JoinColumn(name="tacr_id")
	private TarjetaCredito tarjeta;
	
	

	//Metodos Get y Set
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getConsumo() {
		return consumo;
	}

	public void setConsumo(BigDecimal consumo) {
		this.consumo = consumo;
	}

	public LocalDateTime getFechaConsumo() {
		return fechaConsumo;
	}

	public void setFechaConsumo(LocalDateTime fechaConsumo) {
		this.fechaConsumo = fechaConsumo;
	}

	public TarjetaCredito getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(TarjetaCredito tarjeta) {
		this.tarjeta = tarjeta;
	}

	@Override
	public String toString() {
		return "Consumo [id=" + id + ", consumo=" + consumo + ", fechaConsumo=" + fechaConsumo + ", tarjeta=" + tarjeta
				+ "]";
	}
	
	

}
