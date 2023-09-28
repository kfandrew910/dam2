package optional;

import java.util.function.Supplier;

import EjercicioEjemplo.Producto;

public class CreadorProducto implements Supplier<Producto> {

	@Override
	public Producto get() {
		// TODO Auto-generated method stub
		Producto p = new Producto();
		p.leerDatos();
		return p;
	}

}
