package Alumno;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import daw.com.Pantalla;
import daw.com.Teclado;

public class AppSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Alumno> alumnos = new TreeSet<Alumno>();
		Alumno al;
		
		do {
			al = new Alumno();
			al.leerClave();
			if(alumnos.add(al)) {
				al.leerOtrosDatos();
			}else
				System.out.println("Alumno repetido");
		}while(Teclado.leerString("\n¿Desea seguir? (S/Cualquier otra tecla)").equalsIgnoreCase("s"));
		
		for(Alumno a: alumnos)
			System.out.println(a);
	}

}
