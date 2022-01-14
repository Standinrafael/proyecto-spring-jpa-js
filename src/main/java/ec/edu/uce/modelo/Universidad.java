package ec.edu.uce.modelo;

public class Universidad {
	
	private Integer id;
	private String nombre;
	private String ciudad;
	private Integer numeroCarreras;
	private Integer numeroEstudiantes;
	private Character calificacion;
	
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
	public Integer getNumeroCarreras() {
		return numeroCarreras;
	}
	public void setNumeroCarreras(Integer numeroCarreras) {
		this.numeroCarreras = numeroCarreras;
	}
	public Integer getNumeroEstudiantes() {
		return numeroEstudiantes;
	}
	public void setNumeroEstudiantes(Integer numeroEstudiantes) {
		this.numeroEstudiantes = numeroEstudiantes;
	}
	public Character getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(Character calificacion) {
		this.calificacion = calificacion;
	}
	
	
	@Override
	public String toString() {
		return "Universidad [id=" + id + ", nombre=" + nombre + ", ciudad=" + ciudad + ", numeroCarreras="
				+ numeroCarreras + ", numeroEstudiantes=" + numeroEstudiantes + ", calificacion=" + calificacion + "]";
	}
	
	

}
