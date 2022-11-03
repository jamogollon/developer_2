package Ejercicios.Listas.Actividad6.dos;

public class Gato extends Animal{

	
	public Gato(String nombre) {
		super(nombre);
	}
	

	@Override
	public void comunicarse() {
		System.out.println("El gato maulla");
	}


	@Override
	public void tipoAnimal() {
		System.out.println("Este es un Gato");
		
	}

}
