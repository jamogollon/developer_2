package Ejercicios.Listas.Actividad4;
/**
 * Este es un GestionAlumnos para los ejercicios 1 y 1.1
 * para el 2 y el 3 ver GestionAlumnos2
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Programa de gestión de alumnos.
 * @author MiPc
 *
 */
public class GestionAlumnos {
	private static final String CMD_CREAR = "crear";
	private static final String CMD_BUSCAR = "buscar";
	private static final String CMD_MEDIA = "media";
	private static final String CMD_FIN = "fin";
	
	private final String args[];
	private final List<Alumno> alumnos = new ArrayList<Alumno>();
	private Scanner sc;
	
	/**
	 * constructor
	 * @param args
	 */
	public GestionAlumnos(String args[]) {
		this.args=args;
	}
	/**
	 * ejecuta el programa
	 */
	public void ejecutar() {
		Scanner sc = new Scanner(System.in);
		boolean fin = false;
		String cmd = null;
		while (!fin) {
			cmd = sc.next();
			switch(cmd) {
			case CMD_CREAR:
				crearAlumno();
				break;
			case CMD_BUSCAR:
				buscarAlumno();
				break;
			case CMD_MEDIA:
				calcularMedia();
				break;
			case CMD_FIN:
				
				break;
			}
		}
		sc.close();
	}
	public static void main(String[] args) {
		GestionAlumnos gestion = new GestionAlumnos(args);
		gestion.ejecutar();

	}
	
	public void crearAlumno() {
		System.out.println("Introduce el nombre del alumno a crear:");
		String nombre=sc.next();
		Alumno alumno= new Alumno(nombre);
		
		while (true) {
			System.out.println("Introduce una asignatura o 0 para terminar:");
			//Si la cadena corresponde a fin se ha acabado
			String nombreAsignatura = sc.next();
			if(nombreAsignatura.equals(CMD_FIN)) {
				break;
			}
			System.out.println("Introduce nota:");
			int notaAsignatura = sc.nextInt();
			
			//crea la instancia de la asignatura
			//NotaAsignatura nota = new NotaAsignatura(nombreAsignatura, notaAsignatura);
			alumno.addNotasAsignatura(nombreAsignatura, notaAsignatura);
		}
		//añade el alumno al la lista de signaturas
		alumnos.add(alumno);
		

	}
	public void buscarAlumno() {
		System.out.println("Introduce el nombre a buscar:");
		String nombre = sc.next();
		boolean encontrado = false;
		
		for(Alumno alumno: alumnos) {
			if(alumno.getNombre().equals(nombre)) {
				System.out.println(alumno.getNombre());
				
				//Obtengo las calificaciones
				List<NotaAsignatura> notas = alumno.getNotas();
				
				//Muestra las notas de todas las asignaturas del alumno actual
				for(NotaAsignatura nota : notas) {
					System.out.println(nota.getAsignatura()+ " "+nota.getNota());					
				}
				encontrado=true;
				break;
			}
		}
		//Si no he encontrado el alumno mostrar mensaje de error
		if(!encontrado) {
			System.out.println("No se ha encontrado este alumno");
		}
	}
	public void calcularMedia() {
		System.out.println("Introduce el nombre del alumno:");
		String nombre = sc.next();
		boolean encontrado = false;
		
		for(Alumno alumno: alumnos) {
			if(alumno.getNombre().equals(nombre)) {
				System.out.println(alumno.getNombre());
				System.out.println(alumno.calculaNotaMedia());

				encontrado=true;
				break;
			}
		}
		//Si no he encontrado el alumno mostrar mensaje de error
		if(!encontrado) {
			System.out.println("No se ha encontrado este alumno");
		}	
	}

}
