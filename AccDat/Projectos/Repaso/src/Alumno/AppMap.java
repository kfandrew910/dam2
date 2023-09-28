package Alumno;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import daw.com.Teclado;

public class AppMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Alumno> alumnos = new TreeMap<String, Alumno>();
		Alumno al;
		String nia;
		do {
			do {
				nia = Teclado.leerString("\nnia: ");
			}while(alumnos.containsKey(nia));
			al = new Alumno(nia);
			al.leerOtrosDatos();
			alumnos.put(nia, al);
		}while(Teclado.leerString("\n¿Desea seguir? (S/Cualquier otra tecla)").equalsIgnoreCase("s"));
		
		for(Entry <String, Alumno> e: alumnos.entrySet())
			System.out.println(e.getKey() + "->" + e.getValue());
		
	}

}
