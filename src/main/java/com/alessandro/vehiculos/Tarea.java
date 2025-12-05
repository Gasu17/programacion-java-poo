package com.alessandro.vehiculos;

public class Tarea {
	// Atributos 
	public String titulo ;
	private int duracion ;
	private boolean estado ;
	
	// Constructor 
	public Tarea(String titulo, int duracion, boolean completada) {
		this.titulo = titulo;
		this.duracion = duracion;
		this.estado = completada;
		
		
	// Getter and Setters
		
		
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	} 
	
	public void cambiarEstado() {
		this.estado =! estado; 
	}
	
}
