package Alumno;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import daw.com.Pantalla;
import daw.com.Teclado;

public class AppList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Alumno> alumnos = new ArrayList<Alumno>();
		Alumno al;
		
		do {
			al = new Alumno();
			do {
				al.leerClave();
			}while(alumnos.contains(al));
			al.leerOtrosDatos();
			alumnos.add(al);
		}while(Teclado.leerString("\n¿Desea seguir? (S/Cualquier otra tecla)").equalsIgnoreCase("s"));

		alumnos.sort((a, b) -> b.compareTo(a));
		
		for(Alumno a: alumnos)
			Pantalla.escribirString(a.toString() + "\n");
		
	}

}
