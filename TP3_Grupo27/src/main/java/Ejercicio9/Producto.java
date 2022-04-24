package Ejercicio9;

import java.util.ArrayList;

public class Producto {
	private String nombre, descripcion, marca;
	private int codigo;
	private ArrayList<Double> precio;
	
	
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public ArrayList<Double> getPrecio() {
		return precio;
	}

	public void setPrecio(ArrayList<Double> precio) {
		this.precio = precio;
	}

	public Producto() {
		super();
	}
	
	
	
	public Producto(String nombre, String descripcion, String marca, int codigo, ArrayList<Double> precio) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.marca = marca;
		this.codigo = codigo;
		this.precio = precio;
	}

	/*public Double calcularPrecioProducto() {
		Double precioProducto = 0.0;
		//for (Double precios : precio) {
			precioProducto = precio * 100.25;
		//}
		return precioProducto;
	}*/
	
	/*public Double precioFianlProducto() {
		double precioFinal = 0.0;
		for (Double precios : precio) {
			if(precio < precioFinal) {
			precioFinal = precio;
			}
		}
		return precioFinal;
	}*/
	
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", descripcion=" + descripcion + ", marca=" + marca + ", precio=" + precio
				+ ", codigo=" + codigo + "]";
	}
	
	
	
	
}
