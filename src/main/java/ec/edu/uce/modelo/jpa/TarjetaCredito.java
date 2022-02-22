package ec.edu.uce.modelo.jpa;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tarjeta_credito")
public class TarjetaCredito {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_tarjeta_credito")
	@SequenceGenerator(name="seq_tarjeta_credito",sequenceName="seq_tarjeta_credito",allocationSize=1)
	@Column(name="tacr_id")
	private Integer id;
	
	@Column(name="tacr_numero")
	private String numero;
	
	@Column(name="tacr_cedula")
	private String cedula;
	
	@Column(name="tacr_cupo")
	private BigDecimal cupo;

	@OneToMany(mappedBy="tarjeta")
	private List<Consumo> consumoClase;
	

	//Metodos Get y Set
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public BigDecimal getCupo() {
		return cupo;
	}

	public void setCupo(BigDecimal cupo) {
		this.cupo = cupo;
	}

	public List<Consumo> getConsumoClase() {
		return consumoClase;
	}

	public void setConsumoClase(List<Consumo> consumoClase) {
		this.consumoClase = consumoClase;
	}

	@Override
	public String toString() {
		return "TarjetaCredito [id=" + id + ", numero=" + numero + ", cedula=" + cedula + ", cupo=" + cupo
				+ ", consumoClase=" + consumoClase + "]";
	}
	
	
	
}
