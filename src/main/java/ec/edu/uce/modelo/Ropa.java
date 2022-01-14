package ec.edu.uce.modelo;

public class Ropa {
	
	private Integer id;
	private String nombre;
	private String temporada;
	private String marca;
	private String talla;
	private Double precio;
	
	
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
	public String getTemporada() {
		return temporada;
	}
	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	public String getTalla() {
		return talla;
	}
	public void setTalla(String talla) {
		this.talla = talla;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	
	@Override
	public String toString() {
		return "Ropa [id=" + id + ", nombre=" + nombre + ", temporada=" + temporada + ", marca=" + marca + ", talla="
				+ talla + ", precio=" + precio + "]";
	}
	
	
	
	
	
	
	

}
