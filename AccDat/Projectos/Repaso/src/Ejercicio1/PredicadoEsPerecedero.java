package Ejercicio1;

import java.util.function.Predicate;

public class PredicadoEsPerecedero implements Predicate<Producto> {

	@Override
	public boolean test(Producto t) {
		// TODO Auto-generated method stub
		return t.isPerecedero();
	}

}
