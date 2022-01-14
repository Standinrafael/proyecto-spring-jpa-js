package ec.edu.uce.modelo;

public class Videojuego {
	
	private Integer id;
	private String nombre;
	private String distribuidor;
	private String genero;
	private String modoJuego;
	private String clasificacion;
	
	//Metods GET y SET
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
	public String getDistribuidor() {
		return distribuidor;
	}
	public void setDistribuidor(String distribuidor) {
		this.distribuidor = distribuidor;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getModoJuego() {
		return modoJuego;
	}
	public void setModoJuego(String modoJuego) {
		this.modoJuego = modoJuego;
	}
	
	
	public String getClasificacion() {
		return clasificacion;
	}
	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}
	
	@Override
	public String toString() {
		return "Videojuego [id=" + id + ", nombre=" + nombre + ", distribuidor=" + distribuidor + ", genero=" + genero
				+ ", modoJuego=" + modoJuego + ", clasificacion=" + clasificacion + "]";
	}
	
	
	
	
	

}
