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
			default:System.out.println("Debe elegir una opción del menú.");
			}
			//System.out.println("Seguir jugando S/N ?");
			
		}while(opcion !='S');
		
		entrada.close();
	}
	
	public static void imprimeMenu() {
		System.out.println("Elija una opción \n"
				+ "A Adivinar un número \n"
				+ "B Adivinar un número par \n"
				+ "C Adivinar un número impar \n"
				+ "S Salir");

	}
	
	public static void juega() {
		int num;
		do {
			System.out.println("A si adivinas el número");
			num=entrada.nextInt();
			if(elnum.comparaNumero(num)) {
				System.out.println("Enhorabuena has adivinado el número!!!!\n");
				break;
			}
			System.out.println("Vuelve a intentarlo, te quedan:" + elnum.getVidas() + " vidas.\n");
		}while(elnum.getVidas()>0);
	}
}

