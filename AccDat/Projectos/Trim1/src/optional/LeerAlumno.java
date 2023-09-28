package optional;

import java.util.function.Supplier;

public class LeerAlumno implements Supplier<Alumno> {

	@Override
	public Alumno get() {
		// TODO Auto-generated method stub
		Alumno a = new Alumno();
		
		a.leerDatos();
		
		return a;
	}

}
