package optional;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Objects;
import java.util.Optional;

import daw.com.Pantalla;
import daw.com.Teclado;

public class Alumno implements Comparable <Alumno>{
	
	private String nia;
	private String nombre;
	private Optional <LocalDate> fechaNacimiento;
	private float nota;
	
	public Alumno(String nia, String nombre, LocalDate fechaNacimiento, float nota) {
		this.nia = nia;
		this.nombre = nombre;
		setFechaNacimiento(fechaNacimiento);
		setNota(nota);
	}
	
	public Alumno(String nia) {
		this(nia, "", LocalDate.now(), 0);
	}

	public Alumno() {
		this("");
	}
	
	public String getNia() {
		return nia;
	}

	private void setNia(String nia) {
		this.nia = nia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento.orElse(LocalDate.now());
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		if(fechaNacimiento.isAfter(LocalDate.now()))
			this.fechaNacimiento = Optional.empty();
		else
			this.fechaNacimiento = Optional.of(fechaNacimiento);
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		if(nota > 10 || nota < 1)
			nota = 1;
		this.nota = nota;
	}
	
	public void leerDatos() {
		leerClave();
		leerOtrosDatos();
	}
	
	public void leerClave() {
		// TODO Auto-generated method stub
		this.nia = Teclado.leerString("\nnia");
	}
	
	public void leerOtrosDatos() {
		this.nombre = Teclado.leerString("\nnombre: ");
		if(Teclado.leerString("Desea ingresar su fecha de nacimiento? S/N").equalsIgnoreCase("s"))
			leerFechaNacimiento();
		this.nota = Teclado.leerFloat("\nnota: ");
	}

	private void leerFechaNacimiento() {
		// TODO Auto-generated method stub
		boolean exito;
		do {
			try {
				fechaNacimiento = Optional.of(LocalDate.parse(Teclado.leerString("\nfecha de nacimiento (YYYY-MM-DD): ")));
				exito = true;
			}catch(DateTimeParseException e) {
				exito = false;
			}
		}while(!exito);
	}

	public void mostrarDatos() {
		Pantalla.escribirString(this.toString());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nia);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(nia, other.nia);
	}

	@Override
	public String toString() {
		return "Alumno [nia=" + nia + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento.get() + ", nota=" + nota
				+ "]";
	}

	@Override
	public int compareTo(Alumno o) {
		// TODO Auto-generated method stub
		return this.nia.compareTo(o.nia);
	}
}
