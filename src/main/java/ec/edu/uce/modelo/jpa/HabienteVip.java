package ec.edu.uce.modelo.jpa;

import java.math.BigDecimal;



public class HabienteVip {

		
	private String cedula;
	
	private String nombre;
	
	private String apellido;
	
	
	private String numeroCuenta;
	
	
	private String tipo;
	
	
	private BigDecimal saldo;


	//Metodos Get y Set
	public String getCedula() {
		return cedula;
	}


	public void setCedula(String cedula) {
		this.cedula = cedula;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getNumeroCuenta() {
		return numeroCuenta;
	}


	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public BigDecimal getSaldo() {
		return saldo;
	}


	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public String toString() {
		return "HabienteVip [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", numeroCuenta="
				+ numeroCuenta + ", tipo=" + tipo + ", saldo=" + saldo + "]";
	}
	
	
	
}
