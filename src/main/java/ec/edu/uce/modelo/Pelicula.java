package ec.edu.uce.modelo;

public class Pelicula {

	private Integer id;
	private String nombre;
	private String director;
	private String genero;
	private String productora;
	private String actorPrincipal;
	private String actrizPrincipal;
	
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
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getProductora() {
		return productora;
	}
	public void setProductora(String productora) {
		this.productora = productora;
	}
	public String getActorPrincipal() {
		return actorPrincipal;
	}
	public void setActorPrincipal(String actorPrincipal) {
		this.actorPrincipal = actorPrincipal;
	}
	public String getActrizPrincipal() {
		return actrizPrincipal;
	}
	public void setActrizPrincipal(String actrizPrincipal) {
		this.actrizPrincipal = actrizPrincipal;
	}
	
	
	@Override
	public String toString() {
		return "Pelicula [id=" + id + ", nombre=" + nombre + ", director=" + director + ", genero=" + genero
				+ ", productora=" + productora + ", actorPrincipal=" + actorPrincipal + ", actrizPrincipal="
				+ actrizPrincipal + "]";
	}
	
	
	
	
}
