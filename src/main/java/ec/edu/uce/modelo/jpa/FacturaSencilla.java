package ec.edu.uce.modelo.jpa;

public class FacturaSencilla {

	//Columnas que deben aparecer en el reporte
	private String numero;
	private String cedula;
	
	//Constructor por defecto
	public FacturaSencilla() {
		
	}
	
	
	//OBLIGATORIO CREAR UN CONSTRUCTOR CON LOS ATRIBUTOS
	public FacturaSencilla(String numero, String cedula) {
		super();
		this.numero = numero;
		this.cedula = cedula;
	}
	
	//Metodos SET y GET
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


	@Override
	public String toString() {
		return "FacturaSencilla [numero=" + numero + ", cedula=" + cedula + "]";
	}
	
}
