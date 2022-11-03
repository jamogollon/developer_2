package Ejercicios.Listas.Actividad1;
/**
 * Lee 10 números por teclado, insértalos en una lista ordenados ascendentemente y muéstralos por pantalla.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
/**
 * 
 * @author Antonio Moreno
 * Estructuras de almacenamiento, ejercicio2 de la actividad 1
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		List<Integer> listaNumeros = new ArrayList<Integer>();

		try {
			for (int i = 0; i <10; i++) {

				System.out.println("Dime un Numero: ");	
				listaNumeros.add(entrada.nextInt());
			}
/************ORDENACION DE ARRAYLIST***************************************/
			/*listaNumeros.sort(new Comparator<Integer>() { //complicado para este nivel

				@Override
				public int compare(Integer n1, Integer n2) {
					return n1.compareTo(n2);
				}
			});*/
			//listaNumeros.sort((n1,n2)->n1.compareTo(n2)); //lo mismo pero con expresión lambda
			
			Collections.sort(listaNumeros);//ordenación utilizando la clase Collections.
			
			//ORDENACION DE MAYOR A MENOR
			/*Comparator<Integer> miComparador = Collections.reverseOrder();
			Collections.sort(listaNumeros,miComparador);*/
			
			for(Integer numero: listaNumeros) {
				System.out.println(numero);
			}
		} catch (Exception e) {
			System.out.println("Ha ocurrida la siguiente excepción y el programa terminará:\n" + e.getMessage());
			e.printStackTrace();
		}

		entrada.close();
	}

}



