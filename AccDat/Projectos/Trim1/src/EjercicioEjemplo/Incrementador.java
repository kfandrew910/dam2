package EjercicioEjemplo;

import java.util.function.Consumer;

public class Incrementador implements Consumer<Producto> {

	@Override
	public void accept(Producto t) {
		// TODO Auto-generated method stubs
			t.setPrecio(t.getPrecio() * 1.1f);
	}

}
