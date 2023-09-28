package optional;

import java.util.function.Function;

import EjercicioEjemplo.Producto;

public class SacarReferencia implements Function<Producto, String> {

	@Override
	public String apply(Producto t) {
		// TODO Auto-generated method stub
		return t.getReferencia();
	}

}
