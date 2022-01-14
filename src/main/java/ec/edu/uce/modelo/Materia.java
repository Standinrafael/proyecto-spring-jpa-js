package ec.edu.uce.modelo;

public class Materia {

	private Integer id;
	private String nombre;
	private String profesorImparteMateria;
	private String facultad;
	private Integer numeroEstudiantes;
	private Integer horas;
	
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
	public String getProfesorImparteMateria() {
		return profesorImparteMateria;
	}
	public void setProfesorImparteMateria(String profesorImparteMateria) {
		this.profesorImparteMateria = profesorImparteMateria;
	}
	public String getFacultad() {
		return facultad;
	}
	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}
	public Integer getNumeroEstudiantes() {
		return numeroEstudiantes;
	}
	public void setNumeroEstudiantes(Integer numeroEstudiantes) {
		this.numeroEstudiantes = numeroEstudiantes;
	}
	public Integer getHoras() {
		return horas;
	}
	public void setHoras(Integer horas) {
		this.horas = horas;
	}
	
	
	@Override
	public String toString() {
		return "Materia [id=" + id + ", nombre=" + nombre + ", profesorImparteMateria=" + profesorImparteMateria
				+ ", facultad=" + facultad + ", numeroEstudiantes=" + numeroEstudiantes + ", horas=" + horas + "]";
	}
	
	
	
	
}
