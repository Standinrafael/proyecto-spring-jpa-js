package ec.edu.uce.modelo;

public class Equipo {
	private Integer id;
	private String nombre;
	private String ciudad;
	private String pais;
	private String presidente;
	private Integer numeroCampeonatos;
	
	
	//Metodos GET y SET
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getPresidente() {
		return presidente;
	}
	public void setPresidente(String presidente) {
		this.presidente = presidente;
	}
	public Integer getNumeroCampeonatos() {
		return numeroCampeonatos;
	}
	public void setNumeroCampeonatos(Integer numeroCampeonatos) {
		this.numeroCampeonatos = numeroCampeonatos;
	}
	
	
	
	@Override
	public String toString() {
		return "Equipo [id=" + id + ", nombre=" + nombre + ", ciudad=" + ciudad + ", pais=" + pais + ", presidente="
				+ presidente + ", numeroCampeonatos=" + numeroCampeonatos + "]";
	}
	
	

}
