package EjercicioEjemplo;

import java.util.function.Consumer;

public class Escribidor implements Consumer<Producto> {

	@Override
	public void accept(Producto t) {
		// TODO Auto-generated method stub
		t.mostrarDatos();
		System.out.println("");
	}

}
