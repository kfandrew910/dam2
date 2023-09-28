package Ejercicio1;

import java.util.Objects;
import daw.com.Teclado;

public class Producto {
	public static final boolean PERECEDERO = true;
	public static final boolean NO_PERECEDERO = false;
	
	private String referencia;
	private float precio;
	private boolean perecedero;
	
	public Producto(String referencia, float precio, boolean perecedero) {
		this.referencia = referencia;
		this.precio = precio;
		this.perecedero = perecedero;
	}
	
	public Producto(String referencia) {
		this(referencia, 0, Producto.PERECEDERO);
	}
	
	public Producto() {
		this("");
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		if(precio < 0)
			precio = 0;
		this.precio = precio;
	}

	public boolean isPerecedero() {
		return perecedero;
	}

	public void setPerecedero(boolean perecedero) {
		this.perecedero = perecedero;
	}
	
	public void leerDatos()
	{
		leerClave();
		leerOtrosDatos();
	}

	public void leerClave() {
		// TODO Auto-generated method stub
		this.setReferencia(Teclado.leerString("Referencia: "));
	}
	
	public void leerOtrosDatos() {
		// TODO Auto-generated method stub
		this.setPrecio(Teclado.leerFloat("Precio: "));
		this.setPerecedero(Teclado.leerString("Perecedero?(S/Cualquier tecla): ").equalsIgnoreCase("s"));
	}

	@Override
	public String toString() {
		return "Producto [referencia=" + referencia + ", precio=" + precio + ", perecedero=" + perecedero + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(referencia);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return Objects.equals(referencia, other.referencia);
	}
	public void mostrarDatos()
	{
		System.out.println("ref: " + referencia);
		System.out.println("precio: " + precio);
	}

}
