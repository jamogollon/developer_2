package Ejercicios.Listas.Actividad1;
/**
 * Lee 10 n�meros por teclado. Gu�rdalos en una lista. Mu�strala. Elimina los n�meros pares. Mu�strala otra vez
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
/**
 * 
 * @author Antonio Moreno
 * Estructuras de almacenamiento, ejercicio3 de la actividad 1
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		int indice;
		Scanner entrada = new Scanner(System.in);
		List<Integer> listaNumeros = new ArrayList<Integer>();

		try {
			for (int i = 0; i <10; i++) {

				System.out.println("Dime un Numero: ");	
				listaNumeros.add(entrada.nextInt());
			}
			//mostrando lista
			for(Integer numero: listaNumeros) {
				System.out.println(numero);
			}
			
			//vamos a quitar los pares. NO HACER ASI, SE ACTUALIZA LA LISTA CADA VEZ QUE BORRAS UN ELEMENTO
			/*int tamanio= listaNumeros.size();
			for(int indice=0; indice<tamanio; indice++) { 
				if (listaNumeros.get(indice)%2==0) {
					listaNumeros.remove(indice);
				}
			}
			NI AS� TAMPOCO
			for (Integer numero: listaNumeros) {
				if (numero % 2 == 0) {
					indice=listaNumeros.indexOf(numero);//obtenci�n del indice que contiene ese n�mero
					listaNumeros.remove(indice);
				}
			}*/
			//SI QUEREMOS BORRAR VARIOS ELEMENTOS MIENTRAS RECORREMOS LA LISTA, UTILIZAR ITERATOR
			Iterator<Integer> i = listaNumeros.iterator();
			while(i.hasNext()) {
				if(i.next() % 2 == 0 ) {
					i.remove();
				}
			}
			//mostrar otra vez
			for(Integer numero: listaNumeros) {
				System.out.print(numero + ", ");
			}
			//TAMBIEN SE PUEDE MOSTRAR  TODA LA LISTA AS�, YA QUE SIEMPRE SE HEREDA ToString().
			//System.out.println(listaNumeros);
			
		} catch (Exception e) {
			System.out.println("Ha ocurrida la siguiente excepci�n y el programa terminar�:\n" + e.getMessage());
			e.printStackTrace();
		}

		entrada.close();

	}

}
