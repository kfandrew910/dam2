package EjercicioEjemplo;

import java.util.Comparator;

public class ComparadorPorPrecio implements Comparator<Producto> {

	@Override
	public int compare(Producto o1, Producto o2) {
		// TODO Auto-generated method stub
		return Float.compare(o1.getPrecio(), o2.getPrecio());
	}

}
