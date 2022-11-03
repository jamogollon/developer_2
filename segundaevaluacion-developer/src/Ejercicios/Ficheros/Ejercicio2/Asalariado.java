package Ejercicios.Ficheros.Ejercicio2;

public abstract class Asalariado {
	private String nombre;
	private String nif;
	private double salarioBase;
	
	public Asalariado(String nombre, String nif, double salarioBase) {

		this.nombre = nombre;
		this.nif = nif;
		this.salarioBase = salarioBase;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public abstract double calculaNomina();
	
}
