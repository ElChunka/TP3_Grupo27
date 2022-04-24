package Ejercicio9;

import java.util.ArrayList;

public class Producto {
	private String nombre, descripcion, marca;
	private int codigo;
	private Double precio;
	
	
	
	
	
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

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Producto() {
		super();
	}
	
	
	
	public Producto(String nombre, String descripcion, String marca, int codigo, Double precio) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.marca = marca;
		this.codigo = codigo;
		this.precio = precio;
	}

	public void incrementarPrecio() {
		precio = precio + 100.25;
	}
	
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", descripcion=" + descripcion + ", marca=" + marca + ", precio=" + precio
				+ ", codigo=" + codigo + "]";
	}
	
	
	
	
}
