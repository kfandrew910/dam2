package Alumno;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Consumer;

import daw.com.Pantalla;
import daw.com.Teclado;

public class AppComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Alumno> alumnos = new ArrayList<Alumno>();
		Alumno al;
		Comparator<Alumno> porNota, porEdad;
		Consumer<Alumno> escribidor;
		do {
			al = new Alumno();
			do {
				al.leerClave();
			}while(alumnos.contains(al));
			al.leerOtrosDatos();
			alumnos.add(al);
		}while(Teclado.leerString("\n¿Desea seguir? (S/Cualquier otra tecla)").equalsIgnoreCase("s"));

		//Consumidor clase
		escribidor = new Escribidor();
		//Comparador clase
		porNota = new ComparadorPorNota();
		
		//Comparador anonimo
		porEdad = new Comparator<Alumno>()
				{

					@Override
					public int compare(Alumno o1, Alumno o2) {
						// TODO Auto-generated method stub
						return o1.getFechaNacimiento().compareTo(o2.getFechaNacimiento());
					}
			
				};
		alumnos.sort(porNota.thenComparing(porEdad));
		alumnos.forEach(escribidor);
		
	}

}
