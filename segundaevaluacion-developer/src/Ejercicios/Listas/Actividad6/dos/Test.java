package Ejercicios.Listas.Actividad6.dos;

public class Test {

	public static void main(String[] args) {
		
		Animal anim =new Perro("Sultan");
		/*anim puede acceder a todos los miembros de Animal y
		de Perro que esten en Animal(implementados o abstractos),
		es decir si hay un método en Perro que no está en Animal
		entonces no se puede acceder a él*/
		
		
		Perro chuli = new Perro("Arturo");
		//chuli solo puede acceder a los miembros de Perro
		
		IAnimal animalPolimorfico = new Perro("Tary");
		/*animalPolimorfico puede acceder a todos los miembros de IAnimal y
		de Perro solo los que tiene en comun con IAnimal, es decir los que implementa.*/
		
		Animal gat = new Gato("Wilson");
		/*gat puede acceder a todos los miembros de Animal y
		de Gato que esten en Animal(implementados o abstractos)*/	
		
		Gato silvestre = new  Gato("silver");
		//silvestre solo accede a sus miembros
		
		IAnimal cat= new Gato("Frucho");
		/*cat puede acceder a todos los miembros de IAnimal y
		de Gato solo los que tiene en comun con IAnimal, es decir los que implementa.*/

		
		

	}

}
