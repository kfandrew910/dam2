package Ejercicio1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import daw.com.Teclado;

public class AppProductos {

	public static void main(String[] args) {
		
		List<Producto>productos = new ArrayList<Producto>(),
					filtrados;
		Producto pr;
		Predicate<Producto> esPerecedero = new PredicadoEsPerecedero(), masCaro;
		Consumer<Producto> escribidor = new Escribidor();
		Comparator<Producto> porPrecio = new ComparadorPorPrecio();
		Consumer<Producto> incrementador = new Incrementador();
		float valor, valorFinal;
		do {
			pr = new Producto();
			do {
				pr.leerClave();
			}while(productos.contains(pr));
			pr.leerOtrosDatos();
			productos.add(pr);
		}while(Teclado.leerString("\n¿Desea seguir? (S/Cualquier otra tecla)").equals("s"));
		
		do {
			valor = Teclado.leerFloat("valor:");
		}while(valor <= 0);
		
		masCaro = new MasCaro(valor);
		
		productos.removeIf(esPerecedero);
		productos.removeIf(masCaro);
		productos.sort(porPrecio.reversed());
		productos.forEach(escribidor);
		System.out.println("---------------\n2da parte\n------------------");
		
		filtrados = new ArrayList<Producto>(productos);
		//filtrados.removeIf((p) -> p.getPrecio() > 10);
		filtrados.removeIf(new MasCaro(10));
		filtrados.forEach(incrementador);
		productos.forEach(escribidor);
	}
}
