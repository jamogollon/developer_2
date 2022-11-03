package Ejercicios.Actividad3;

import java.util.Scanner;

public class MainAdivinaNumero {
	private static AdivinaNumero elnum;
	static Scanner entrada=new Scanner(System.in);
	public static void main(String[] args) {
		
		char opcion;
		int[] rango = new int[2];
		
		do {
			imprimeMenu();
			opcion = entrada.next().toUpperCase().charAt(0);
			switch(opcion) {
			case 'A':
				elnum = new AdivinaNumero();
				elnum.elegirNumeroGenerar();
				juega();
				break;
			case 'B':
				elnum= new AdivinaNumeroPar();
				rango=elnum.elegirNumero();
				elnum.generaNumero(rango[0], rango[1]);
				juega();
				break;
			case 'C':
				elnum= new AdivinaNumeroImpar();
				rango=elnum.elegirNumero();
				elnum.generaNumero(rango[0], rango[1]);
				juega();
				break;
			case 'S':
				System.out.println("Hasta pronto");
				break;
			default:System.out.println("Debe elegir una opci�n del men�.");
			}
			//System.out.println("Seguir jugando S/N ?");
			
		}while(opcion !='S');
		
		entrada.close();
	}
	
	public static void imprimeMenu() {
		System.out.println("Elija una opci�n \n"
				+ "A Adivinar un n�mero \n"
				+ "B Adivinar un n�mero par \n"
				+ "C Adivinar un n�mero impar \n"
				+ "S Salir");

	}
	
	public static void juega() {
		int num;
		do {
			System.out.println("A si adivinas el n�mero");
			num=entrada.nextInt();
			if(elnum.comparaNumero(num)) {
				System.out.println("Enhorabuena has adivinado el n�mero!!!!\n");
				break;
			}
			System.out.println("Vuelve a intentarlo, te quedan:" + elnum.getVidas() + " vidas.\n");
		}while(elnum.getVidas()>0);
	}
}

