package Alumno;

import java.util.function.Consumer;

public class Escribidor implements Consumer<Alumno> {

	@Override
	public void accept(Alumno t) {
		// TODO Auto-generated method stub
		System.out.println(t);
	}
	
}
