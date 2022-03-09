package ec.edu.uce.interfaces.funcionales;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MainFuncional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//new de la implementacion, no de la interfaz
		System.out.println("SUPPLIER");
		//SUPPLIER
		IPersonaSupplier<String>supplier=new PersonaSupplier();
		System.out.println(supplier.get());
		
		IPersonaSupplier<String>supplier1=()->{return "HOLA MUNDO adicional la llave";};
		System.out.println(supplier1.get());
		
		IPersonaSupplier<String>supplierChino1=()->"asdasdasd";
		System.out.println(supplierChino1.get());
		
		ConsumoInterfacesFuncionales consumo=new ConsumoInterfacesFuncionales();
		String resultado=consumo.consumirSupplier(()->"Holaaa");
		System.out.println(resultado);
		
		//Supplier con Java
		Stream<String> test=Stream.generate(()->"Hola generate").limit(10);
		
		//---------------------------------------------------------------------------------------------------------------------
		
		System.out.println("CONSUMER");
		//CONSUMER
		IPersonaConsumer<Integer> personaConsumer= number -> System.out.println(number);
		personaConsumer.accept(7);
		
		IPersonaConsumer<Integer> personaConsumer1= number -> System.out.println(number.intValue()+1);
		personaConsumer1.accept(7);
		
		consumo.consumirConsumer(number -> System.out.println(number+10), 2);
		
		//Consumer Java
		
		List<Integer> listaNumeros=Arrays.asList(1,2,3,4,5,6);
		listaNumeros.forEach(number->System.out.println(number));
		
		//for each recibe un consumer
		test.forEach(x->System.out.println(x +"prueba"));
		
		//---------------------------------------------------------------------------------------------------------------------
		System.out.println("PREDICATE");
		//PREDICATE
		boolean  resultado2=consumo.consumirPredicate(cadena-> cadena.contains("J"), "Jorge");
		System.out.println(resultado2);
		
		//Predicate java
		Stream<Integer> numerosFiltrados=listaNumeros.stream().filter(numero1-> numero1>4);
		numerosFiltrados.forEach(num->System.out.println(num));
		
		//---------------------------------------------------------------------------------------------------------------------
		
		System.out.println("FUNCTION");
		
		//FUNCTION		
		Integer a=consumo.consumirFunction(cadena -> Integer.parseInt(cadena)+17, "3");
		System.out.println(a);
		
		//Function en java
		Stream<String> listaCambiada=listaNumeros.stream().map(numeroLista ->numeroLista.toString()+"--");
		listaCambiada.forEach(cadena->System.out.println(cadena));
		
		
		//UnaryOperator en java
		//listaNumeros.stream().reduce(null);
	}
	

}
