package ec.edu.uce.interfaces.funcionales;

@FunctionalInterface
public interface IPersonaUnaryOperator <T> extends IPersonaFunction<T,T> {

	public T apply (T arg1);
}
