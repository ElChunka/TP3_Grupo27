package Ejercicio9;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import Ejercicio8.Alumno;

public class Ejercicio9 {
	static ArrayList<Producto> listaProducto = new ArrayList<Producto>();
	
	public static void main(String[] args) {
		int opcion = 0;
		do {
			System.out.println("-----------------------");
			System.out.println("Nuevo Producto");
			System.out.println("Mostrar todos los productos");
			System.out.println("Incrementar precio a todos los productos");
			System.out.println("Monto total de todos los productos");
			System.out.println("Salir");
			System.out.println("-----------------------");
			
			Scanner leer = new Scanner(System.in);
			System.out.println("Ingrese una opcion: ");
			opcion = leer.nextInt();
			
		switch(opcion) {
		case 1:
			System.out.println("Ingrese un nuevo producto: ");
			ingresarProducto();
			break;
		case 2:
			System.out.println("Mostrar los productos: ");
			mostrarProductos();
			break;
		case 3:
			System.out.println("Incrementar precio de los productos: ");
			incrementarPrecio();
			break;
		case 4:
			System.out.println("Monto total de todos los productos: ");
			montoTotalProducto();
			break;
		case 5:
			System.out.println("Salir");
			
			break;
		default:
			System.out.println("Opcion incorrecta");
		}
		}while(opcion != 5);
	}
	
		public static void ingresarProducto() {
			Producto productoNuevo = new Producto();
			Scanner leer1 = new Scanner(System.in);
			System.out.println("Ingrese un nuevo producto: ");
			productoNuevo.setNombre(leer1.nextLine());
			
			Scanner leer2 = new Scanner(System.in).useLocale(Locale.US);
				System.out.println("Ingrese el precio del producto");
				
			
			productoNuevo.setPrecio(leer2.nextDouble());
			agregarProducto(productoNuevo);
		}

		public static void agregarProducto(Producto nuevoProducto){
			listaProducto.add(nuevoProducto);
			mostrarProductos();
			
		}
		
		public static void mostrarProductos() {
			for(Producto a: listaProducto) {
				System.out.println(a.toString());
			}
			
		
		}
		
		public static void incrementarPrecio() {
			for(Producto a: listaProducto) {
			a.incrementarPrecio();
			}
			mostrarProductos();
		}
		
		public static void montoTotalProducto(){
			double total = 0.0;
			for(Producto producto: listaProducto) {
				total = total + producto.getPrecio();
			}
			System.out.println("El monto total es: " + total);
		}
		
}