package ec.edu.uce.modelo.jpa;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="cuenta")
public class Cuenta {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_cuenta")
	@SequenceGenerator(name="seq_cuenta",sequenceName="seq_cuenta",allocationSize=1)
	@Column(name="cuen_id")
	private Integer id;
	
	@Column(name="cuen_numero_cuenta")
	private String numeroCuenta;
	
	@Column(name="cuen_saldo")
	private BigDecimal saldo;
	
	@Column(name="cuen_tipo")
	private String tipo;
	
	
	@ManyToOne
	@JoinColumn(name="habi_id")
	private Habiente habiente;
	
	@OneToMany(mappedBy="cuenta1", cascade=CascadeType.ALL)
	private List<Retiro> retiro1;

	
	//Metodos GET y SET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Habiente getHabiente() {
		return habiente;
	}

	public void setHabiente(Habiente habiente) {
		this.habiente = habiente;
	}

	public List<Retiro> getRetiro1() {
		return retiro1;
	}

	public void setRetiro1(List<Retiro> retiro1) {
		this.retiro1 = retiro1;
	}

	@Override
	public String toString() {
		return "Cuenta [id=" + id + ", numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", tipo=" + tipo
				 + "]";
	}
	
	
}
