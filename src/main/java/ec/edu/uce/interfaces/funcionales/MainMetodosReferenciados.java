package ec.edu.uce.interfaces.funcionales;

public class MainMetodosReferenciados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.Implementar por clases
		IPersonaSupplier<String> persona= new PersonaSupplierImpl();
		String mensaje =persona.get();
		System.out.println(mensaje);
		
		//2. Implmmentar por lambdas
		IPersonaSupplier<String> persona1=()->"Se implemento por Lambda";
		String mensaje1 =persona1.get();
		System.out.println(mensaje1);
		
		//3. Metodos referenciados
		PersonaSupplierImpl personaImpl=new PersonaSupplierImpl();
		//:: Permite referenciar metodo de esa instancia
		IPersonaSupplier<String> persona2=personaImpl :: get;
		String mensaje2=persona2.get();
		System.out.println(mensaje2);
		
		//3.1
		PersonaSupplierSinImpl personaSinImpl=new PersonaSupplierSinImpl();
		IPersonaSupplier<String> persona3=personaSinImpl :: get2;
		String mensaje3=persona3.get();
		System.out.println(mensaje3);
		
		//3.2
		PersonaPredicateImpl personaPredi=new PersonaPredicateImpl();
		IPersonaPredicate<String> personaPredi2= personaPredi::evaluar;
		boolean nombre=personaPredi2.evaluar("Mensaje");
	}
	
	public static void prueba(IPersonaPredicate<String>arg1) {
		
	}

}
