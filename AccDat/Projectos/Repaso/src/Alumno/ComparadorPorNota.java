package Alumno;

import java.util.Comparator;

public class ComparadorPorNota implements Comparator<Alumno> {

	@Override
	public int compare(Alumno o1, Alumno o2) {
		// TODO Auto-generated method stub
		return Float.compare(o1.getNota(), o2.getNota());
		}

}
