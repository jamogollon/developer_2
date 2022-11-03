package Ejercicios.Listas.Actividad3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		Set <Integer> carton = new HashSet<Integer>();
		Set <Integer> acertados = new HashSet<Integer>();
		Set <Integer> bolas = new HashSet<Integer>();
		int bola;
		boolean finJuego=false;
		//Rellenar Carton
		do {
			//bola=(int)(Math.random()*100);
			carton.add((int)(Math.random()*100));
		}while(carton.size()!=10);//la lista set no admite elementos duplicados
		
		//juego
		while(!finJuego) {

			bola=(int)(Math.random()*100);
			//comprobar que no est� repetida
			if (!bolas.contains(bola)) {//si el n�mero no es repetido lo guarda
				bolas.add(bola);
				System.out.println("Presiona enter para sacar n�mero:\n");
				entrada.nextLine();
				System.out.println("Numero: " + bola);
				System.out.println("cart�n: "+carton);
				System.out.println("acertados: "+acertados);
				if(carton.contains(bola)) { //si el n�mero est� en el cart�n
					acertados.add(bola);
					System.out.println("Este n�mero lo tienes!!!");
					
					if(carton.containsAll(bolas)) { //si todos los n�meros del cart�n est�n.
						finJuego=true;
						System.out.println("Enhorabuena has conseguido bingo!!!!");
					}
					else if(bolas.size()==50) {//si la lista ya tiene 50 bolas
						finJuego=true;
						System.out.println("El juego ha finalizado, lo siento no has sacado bingo.");
					}
				}
				else {
					System.out.println("Este n�mero no lo tienes.");
					if(bolas.size()==50) {//si la lista ya tiene 50 bolas
						finJuego=true;
						System.out.println("El juego ha finalizado, lo siento no has sacado bingo.");
					}
				}

			}
		}
		entrada.close();

	}

}
