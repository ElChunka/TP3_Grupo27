package Ejercicio3;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import Ejercicio8.Alumno;

public class Ejercicio3 {


	public static void main(String[] args) {
		ingresarDatosAlumno();
		

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
		for(int i = 0; i <= 5; i++) {
			Scanner leer3 = new Scanner(System.in).useLocale(Locale.US);
			System.out.println("Ingrese nota del alumno: ");
			notaAlumno.add(leer3.nextDouble());		
		}
		alumno1.setNotas(notaAlumno);
		System.out.println("El promedio es: " + alumno1.calcularPromedio());
		System.out.println("La nota maxima es: " + alumno1.obtenerMaximaNota());
		
	}
}
