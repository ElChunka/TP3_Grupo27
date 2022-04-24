package Ejercicio8;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio8 {
	static ArrayList<Alumno> listaAlumno = new ArrayList<Alumno>();
	
	
	public static void main(String[] args) {
		
		int opcion = 0;
		
		do {
			System.out.println("- - - - - - - -");
			System.out.println("1-Nuevo Alumno");
			System.out.println("2-Eliminar Alumno");
			System.out.println("3-Modificar notas Alumno");
			System.out.println("4-Mostrar todos los Alumno");
			System.out.println("5-Mostar los que superan el promedio de 6");
			System.out.println("6-Salir");
			System.out.println("- - - - - - - -");
		
			Scanner leer = new Scanner(System.in);
			System.out.println("Ingrese una opcion: ");
			opcion = leer.nextInt();
					
		switch(opcion) {
		case 1:
			System.out.println("Ingresar datos de un nuevo Alumno: ");
			ingresarDatosAlumno();
			break;
		case 2:
			System.out.println("Eliminar datos de un nuevo alumno ingresando su libreta universitaria: ");
			eliminarAlumno();
			break;
		case 3:
			System.out.println("Modificar las notas de del alumno ingresando su libreta universitaria");
			modificarNotasAlumno();
			break;
		case 4:
			System.out.println("Visualiza la lista de alumnos: ");
			mostrarAlumnos();
			break;
		case 5:
			System.out.println("Muestra la lista de alumnos que superen el promedio de 6: ");
			mostrarPromedio();
			break;
		case 6:
			System.out.println("Salir");
			break;
		default:
		System.out.println("Opcion incorrecta");
		}
		}while(opcion != 6);

	}
	
	public static void ingresarDatosAlumno() {
		Alumno alumno1 = new Alumno();
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese nombre del alumno: ");
		alumno1.setNombre(leer.nextLine());
		
		Scanner leer1 = new Scanner(System.in);
		System.out.println("Ingrese apellido del alumno: ");
		alumno1.setApellido(leer1.nextLine());
		
		Scanner leer2 = new Scanner(System.in);
		System.out.println("Ingrese libreta universitaria del alumno: ");
		alumno1.setLibretaUniversitaria(leer2.nextInt());
		
		ArrayList<Double> notaAlumno = new ArrayList<Double>();
		for(int i = 0; i <= 2; i++) {
			Scanner leer3 = new Scanner(System.in).useLocale(Locale.US);
			System.out.println("Ingrese nota del alumno: ");
			notaAlumno.add(leer3.nextDouble());		
		}
		alumno1.setNotas(notaAlumno);
		agregarAlumno(alumno1);
	}
	
	public static void agregarAlumno(Alumno alumnoNuevo){
		listaAlumno.add(alumnoNuevo);
		mostrarAlumnos();
		
	}
	
	public static void eliminarAlumno() {
		System.out.println("Ingrese Libreta: ");
		Scanner leer = new Scanner(System.in);
		int numLibreta = leer.nextInt();
		listaAlumno.remove(buscarAlumno(numLibreta));
	}
	
	public static Alumno buscarAlumno(int libretaUniversitaria) {
		//System.out.println("Ingrese Libreta: ");
		//Scanner leer = new Scanner(System.in);
		//int numLibreta = leer.nextInt();
		Alumno found = new Alumno();
		for(Alumno a: listaAlumno) {
			if (a.getLibretaUniversitaria() == libretaUniversitaria) {
				found = a;
				break;
			}
		}
		return found;
	}
	
	public static void modificarNotasAlumno() {
		System.out.println("Ingrese Libreta: ");
		Scanner leer = new Scanner(System.in);
		int numLibreta = leer.nextInt();
		Alumno alumno1 = buscarAlumno(numLibreta);
		ArrayList<Double> notaAlumno = new ArrayList<Double>();
		for(int i = 0; i <= 2; i++) {
			Scanner leer3 = new Scanner(System.in).useLocale(Locale.US);
			System.out.println("Ingrese nota del alumno: ");
			notaAlumno.add(leer3.nextDouble());		
		}
		alumno1.setNotas(notaAlumno);
	}
	
	public static void mostrarPromedio() {
		for(Alumno a: listaAlumno) {
			if (a.calcularPromedio() > 6) {
				System.out.println(a.toString());
			}
		}
	}
	
	public static void mostrarAlumnos() {
		for(Alumno a: listaAlumno) {
			System.out.println(a.toString());
		}
	}
}
