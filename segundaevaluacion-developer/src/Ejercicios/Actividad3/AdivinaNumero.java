package Ejercicios.Actividad3;

import java.util.Scanner;
/**
 * Escriba un programa para implementar un juego en el que el usuario tenga que
adivinar un número generado aleatoriamente dentro de un rango. 
Para ello vamos a crear las siguientes clases: 
• AdivinaNumero: Tiene dos atributos:
o Numero
o Vidas: se inicializan a 5. Controla las vidas que le quedan al usuario 
cuando juegue.
Escriba los métodos que considere oportuno. Dentro de estos métodos 
habrá uno que será generarNúmero. Le entrará por parámetro el rango en el que
estará el número (mínimo y máximo). 
• Clase AdivinaNumeroPar. Hereda de la clase AdivinaNumero. El número que
se genera en esta clase debe ser par. 
• Clase AdivinaNumeroImpar. Hereda de la clase AdivinaNumero. El número
que se genera en esta clase debe ser impar. 
El programa principal mostrará un menú que permitirá al usuario elegir la opción
que prefiera. 
1. Adivinar número
2. Adivinar número par
3. Adivinar número impar 

El usuario intentará adivinar el número en cuestión metiendo números por teclado. 
 
 * @author Antonio Moreno
 * 
 *
 */
public class AdivinaNumero {
	protected int numero;
	protected int vidas;
	protected Scanner ed= new Scanner(System.in);
	
	public AdivinaNumero() {
		this.vidas=5;
	}

	/**
	 * @return el numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @return el vidas
	 */
	public int getVidas() {
		return vidas;
	}
	/**
	 * 
	 * @return array de enteros con los números del rango
	 */
	public int[] elegirNumero() {
		int[] rango= new int[2];
		
		System.out.println("Introduce rango, entre que números?");
		System.out.println("Mínimo:");
		rango[0]=ed.nextInt();
		System.out.println("Máximo:");
		rango[1]=ed.nextInt();
		return rango;
	}
	/**
	 * @return array de enteros con los números del rango
	 * ademas llama al método para generar el número aleatorio.
	 */
	public void elegirNumeroGenerar() {
		int minimo, maximo;
		
		System.out.println("Introduce rango, entre que números?");
		System.out.println("Mínimo:");
		minimo=ed.nextInt();
		System.out.println("Máximo:");
		maximo=ed.nextInt();
		generaNumero(minimo, maximo);
	}
	/**
	 * 
	 * @param min
	 * @param max
	 * método que genera un número aleatorio dentro de un rango definido en los parámetros.
	 */
	public void generaNumero(int min, int max ) {
		
		numero = (int) ((Math.random() * (max-min))+min);
		
	}
	/**
	 * 
	 * @param num
	 * @return boolean resultado de la comparación. 
	 * Compara un número con el número generado y actualiza las vidas.
	 */
	public boolean comparaNumero(int num) {
		vidas--;
		if (num==numero)
			return true;
		return false;
	}

	
	
}
