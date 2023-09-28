package optional;

import java.util.ArrayList;
import java.util.Optional;
import java.util.function.Supplier;

import daw.com.Teclado;

public class LeerAlumnos implements Supplier<ArrayList<Alumno>> {

	@Override
	public ArrayList<Alumno> get() {
		// TODO Auto-generated method stub
		ArrayList <Alumno> as = new ArrayList<>();
		Optional <Alumno> a = Optional.empty();
		do {
			as.add(a.orElseGet(new LeerAlumno()));
		}while(Teclado.leerString("Desea continuar?(S/N) ").equalsIgnoreCase("s"));
		return as;
	}

}
