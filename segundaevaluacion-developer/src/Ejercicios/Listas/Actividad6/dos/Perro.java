package Ejercicios.Listas.Actividad6.dos;

public class Perro extends Animal{
	
	public Perro(String nombre) {
		super(nombre);
	}
	

	@Override
	public void comunicarse() {
		System.out.println("El perro ladra");
	}


	@Override
	public void tipoAnimal() {
		System.out.println("Este es un perro");
		
	}

}
