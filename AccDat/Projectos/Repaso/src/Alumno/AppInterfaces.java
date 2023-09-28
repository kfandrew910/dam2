package Alumno;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.function.Consumer;
import java.util.function.Predicate;

import daw.com.Teclado;

public class AppInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Alumno> alumnos = new TreeMap<String, Alumno>();
		Alumno al;
		String nia;
		Consumer<Alumno> consumidor, subirNota;
		Predicate<Alumno> estaAprobado, mayorDeEdad;
		
		do {
			do {
				nia = Teclado.leerString("\nnia: ");
			}while(alumnos.containsKey(nia));
			al = new Alumno(nia);
			al.leerOtrosDatos();
			alumnos.put(nia, al);
		}while(Teclado.leerString("\n¿Desea seguir? (S/Cualquier otra tecla)").equalsIgnoreCase("s"));
		
		//Consumidor anonimo
		subirNota = new Consumer<Alumno>()
				{
					@Override
					public void accept(Alumno t) {
						// TODO Auto-generated method stub
						t.setNota(t.getNota() + 1);
					}
				};
		alumnos.values().forEach(subirNota);
		
		//Predicado clase
		estaAprobado = new Aprobado();
		alumnos.values().removeIf(estaAprobado.negate());
		
		//Predicado anonima
		mayorDeEdad = new Predicate<Alumno>()
				{
					@Override
					public boolean test(Alumno t) {
						// TODO Auto-generated method stub
						return t.getFechaNacimiento().isBefore(LocalDate.now().minusYears(18));
					}
				};
		//Consumidor clase
		consumidor = new Escribidor();
		alumnos.values().forEach(consumidor);
		
	}

}
