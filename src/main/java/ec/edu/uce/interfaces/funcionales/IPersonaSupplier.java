package ec.edu.uce.interfaces.funcionales;

//INTERFAZ GENERICA
@FunctionalInterface
public interface IPersonaSupplier <T>  {

	//Retorno generico T
	public T get();
	
	
}
