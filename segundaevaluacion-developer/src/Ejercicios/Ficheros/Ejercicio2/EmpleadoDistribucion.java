package Ejercicios.Ficheros.Ejercicio2;

public class EmpleadoDistribucion extends Asalariado implements Idieta {
	private int kmRecorridos;

		

	public EmpleadoDistribucion(String nombre, String nif, double salarioBase) {
		super(nombre, nif, salarioBase);
		
	}

	public EmpleadoDistribucion(String nombre, String nif, double salarioBase, int kmRecorridos) {
		super(nombre, nif, salarioBase);
		this.kmRecorridos=kmRecorridos;
	}

	public int getKmRecorridos() {
		return kmRecorridos;
	}

	public void setKmRecorridos(int kmRecorridos) {
		this.kmRecorridos = kmRecorridos;
	}

	@Override
	public double calculoDietaKm() {
		return this.getKmRecorridos()*EmpleadoDistribucion.precioKm;
	}

	@Override
	public double calculaNomina() {
		return this.getSalarioBase()*1.10+ calculoDietaKm();

	}
	@Override
	public String toString() {
		return "" + 
				getNombre() + ":" + 
				getNif() + ":" +
				getSalarioBase() + ":" + 
				kmRecorridos +":"	+
				calculaNomina();
	}
}
