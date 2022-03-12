package ec.edu.uce.interfaces.funcionales;

public class ConsumoInterfacesFuncionales {

	//Recibe una interfaz
	//Metodos que reciben una funcion/comportamiento
	public String consumirSupplier(IPersonaSupplier<String> funcion) {
		return funcion.get();
			
	}
	
	public void consumirConsumer(IPersonaConsumer<Integer> funcion, Integer valor) {
		funcion.accept(valor);
	}
	
	public boolean consumirPredicate(IPersonaPredicate<String>funcion, String valor) {
		
		return funcion.evaluar(valor);
		 
	}
	
	public Integer consumirFunction(IPersonaFunction<String, Integer> funcion, String cadena) {
		
		 return funcion.apply(cadena);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
