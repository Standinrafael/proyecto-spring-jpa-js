package ec.edu.uce.modelo.jpa;

import java.math.BigDecimal;

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
@Table(name="detalle_multa")
public class DetalleMulta {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_detallemulta")
	@SequenceGenerator(name="seq_detallemulta",sequenceName="seq_detallemulta",allocationSize=1)
	@Column(name="demu_id")
	private Integer id;
	
	
	@Column(name="demu_descripcion")
	private String descirpcion;
	
	@Column(name="demu_costo")
	private BigDecimal costo;
	
	@ManyToOne
	@JoinColumn(name="mult_id")
	private Multa multa;
	
	
	//Metodos GET y SET

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescirpcion() {
		return descirpcion;
	}

	public void setDescirpcion(String descirpcion) {
		this.descirpcion = descirpcion;
	}

	public BigDecimal getCosto() {
		return costo;
	}

	public void setCosto(BigDecimal costo) {
		this.costo = costo;
	}

	public Multa getMulta() {
		return multa;
	}

	public void setMulta(Multa multa) {
		this.multa = multa;
	}
	
	
	

}
