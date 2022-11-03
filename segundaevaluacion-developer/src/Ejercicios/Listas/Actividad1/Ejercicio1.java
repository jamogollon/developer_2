package Ejercicios.Listas.Actividad1;
/**
 * Lee 10 números por teclado, insértalos en una lista y muéstralos por pantalla.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * 
 * @author Antonio Moreno
 * Estructuras de almacenamiento, ejercicio1 de la actividad 1
 *
 */
public class Ejercicio1 {

	public static void main(String[] args) {

	Scanner entrada = new Scanner(System.in);
	
	List<Integer> listaNumeros = new ArrayList<Integer>();
	
	try {
		for (int i = 0; i <10; i++) {
			
			System.out.println("Dime un Numero: ");	
			listaNumeros.add(entrada.nextInt());
		}
		//System.out.println(listaNumeros);//también se puede hacer así en este caso.
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
