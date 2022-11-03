package Ejercicios.Listas.Actividad6.uno;

public class Persona {
	private final String nombre;
	private int edad;
	
	public Persona(String nombre) {
		this.nombre=nombre;
	}
	
	
	public String getNombre() {
		return nombre;
	}


	public int getEdad() {
		return edad;
	}
	
	public void cambiarEdad(int e) {//este sería el setEdad()
		this.edad=e;
	}
	
	@Override
	public String toString() {
		return this.nombre + ", "+ this.edad;
	}

}
