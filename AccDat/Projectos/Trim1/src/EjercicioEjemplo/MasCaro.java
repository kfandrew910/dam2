package EjercicioEjemplo;

import java.util.function.Predicate;

public class MasCaro implements Predicate<Producto> {

	private float valor;
	
	public MasCaro(float valor) {
		setValor(valor);
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		if(valor < 0)
			valor = 0;
		this.valor = valor;
	}

	@Override
	public boolean test(Producto t) {
		// TODO Auto-generated method stub
		return t.getPrecio() > valor;
	}
	
}
