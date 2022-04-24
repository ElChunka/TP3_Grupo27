package Ejercicio8;

import java.util.ArrayList;

public class Alumno {
	private String nombre, apellido;
	private int libretaUniversitaria;
	private ArrayList<Double> notas;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getLibretaUniversitaria() {
		return libretaUniversitaria;
	}
	public void setLibretaUniversitaria(int libretaUniversitaria) {
		this.libretaUniversitaria = libretaUniversitaria;
	}
	public ArrayList<Double> getNotas() {
		return notas;
	}
	public void setNotas(ArrayList<Double> notas) {
		this.notas = notas;
	}
	
	public Alumno(String nombre, String apellido, int libretaUniversitaria, ArrayList<Double> notas) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.libretaUniversitaria = libretaUniversitaria;
		this.notas = notas;
	}
	
	public Alumno() {
		super();
	}
	
	public Double calcularPromedio() {
		Double promedio = 0.0;
		for (Double nota : notas) {
			promedio = (promedio + nota);
		}
		return promedio/(double) notas.size();
	}
	
	public Double obtenerMaximaNota() {
		Double notaMaxima = 0.0;
		for (Double nota : notas) {
			if(nota > notaMaxima) {
			notaMaxima = nota;
			}
		}
		return notaMaxima;
	}
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", libretaUniversitaria=" + libretaUniversitaria
				+ ", notas=" + notas + "]";
	} 
	
	
	
	
}
