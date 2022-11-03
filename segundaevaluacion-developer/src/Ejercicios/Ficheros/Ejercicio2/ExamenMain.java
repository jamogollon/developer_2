package Ejercicios.Ficheros.Ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExamenMain {
	
	Scanner sc = new Scanner(System.in);
	public List<Asalariado> listaEmpleados = new ArrayList<Asalariado>();
	int opcion;
	
	public ExamenMain() {
		
	}
	
	public static void main(String[] args) {
		ExamenMain main = new ExamenMain();
		main.ejecutarMenu();

	}

	private void ejecutarMenu() {
		boolean sigue=true;

		try {
			do {
				showMenu();
				opcion = sc.nextInt();
				switch(opcion){
					case 1:
						altaEmpleado(1);
						break;
					case 2:
						altaEmpleado(2);
						break;
					case 3:
						//1 opción
						System.out.println(listaEmpleados);
						System.out.println();
						//2 opción
						//listar();
						break;
					case 4:
						borraUno();
						break;
					case 5:
						listaEmpleados.clear();
						break;
					case 6:
						FicheroEmpleadosTexto miFile = new FicheroEmpleadosTexto("Empleado.txt");
						miFile.guardar(listaEmpleados);
						break;
					case 7:
						listaEmpleados.clear();
						FicheroEmpleadosTexto miFile1 = new FicheroEmpleadosTexto("Empleado.txt");
						miFile1.cargar(listaEmpleados);
						break;
					case 8:
						sigue=false;
						break;
					default:
						System.out.println("Debes elegir una opción válida.");
				}
			}while(sigue);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	private void showMenu() {
		System.out.println("------------MENU----------");
		System.out.println("1- Alta empleado de producción");
		System.out.println("2- Alta empleado de distribución");
		System.out.println("3- Listar");
		System.out.println("4- Borrar un empleado");
		System.out.println("5- Borrar todo");
		System.out.println("6- Guardar");
		System.out.println("7- Cargar");
		System.out.println("8- Salir");
		System.out.println("Elige una opción");
	}
	
	private void altaEmpleado(int tipoEmpleado) {
		String nombre;
		String nif;
		double salarioBase;
		String turno;
		int kmRecorridos;
		
		System.out.println("---ALTAD DE EMPLEADO---");
		sc.nextLine();
		System.out.println("Introduce nombre de empleado:");
		nombre = sc.nextLine();
		System.out.println("Introduce nif del empleado:");
		nif = sc.nextLine();
		System.out.println("Introduce salario base:");
		salarioBase = sc.nextDouble();

		if (tipoEmpleado==1) {
			sc.nextLine();
			System.out.println("Introduce el turno:");
			turno = sc.nextLine();			
			listaEmpleados.add(new EmpleadoProduccion(nombre, nif, salarioBase, turno));
		}
		else {
			System.out.println("Introduce los kilómetros recorridos:");
			kmRecorridos = sc.nextInt();
			EmpleadoDistribucion empdist = new EmpleadoDistribucion(nombre, nif, salarioBase);
			empdist.setKmRecorridos(kmRecorridos);
			listaEmpleados.add(empdist);
		}
		System.out.println("OK");
	}
	private void listar() {
		if (!(listaEmpleados.isEmpty())) {
			for(Asalariado a: listaEmpleados) {
				System.out.println(a.toString());
			}
		}
		else {
			System.out.println("La lista está vacia");
		}
	}
	private void borraUno() {
		String nif;
		boolean b=false;
		sc.nextLine();
		System.out.println("Introduce nombre el nif del empleado a borrar:");		
		nif = sc.nextLine();
		Iterator<Asalariado> i = listaEmpleados.iterator();
		while(i.hasNext()) {
			if (i.next().getNif().equals(nif)) {
				i.remove();
				b=true;
				break;
			}				
		}
		if (!b)
			System.out.println("Este nif no se corresponde con ninguno de la lista.");
		else
			System.out.println("Empleado borrado.");
	}
	
}
