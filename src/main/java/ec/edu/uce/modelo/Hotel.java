package ec.edu.uce.modelo;

public class Hotel {
	
	private Integer id;
	private String nombre;
	private String ciudad;
	private String pais;
	private Integer estrellas;
	private Double precioNoche;
	
	
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
	public Integer getEstrellas() {
		return estrellas;
	}
	public void setEstrellas(Integer estrellas) {
		this.estrellas = estrellas;
	}
	public Double getPrecioNoche() {
		return precioNoche;
	}
	public void setPrecioNoche(Double precioNoche) {
		this.precioNoche = precioNoche;
	}
	
	
	@Override
	public String toString() {
		return "Hotel [id=" + id + ", nombre=" + nombre + ", ciudad=" + ciudad + ", pais=" + pais + ", estrellas="
				+ estrellas + ", precioNoche=" + precioNoche + "]";
	}
	
	
	
	
		
	

}
