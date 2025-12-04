package com.alessandro.vehiculos;

public class MainTarea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tarea objeto1 = new Tarea("Tarea 1", 2 , true);
		objeto1.setTitulo("KLK");
		System.out.println(objeto1.titulo);
		
		Tarea objeto2 = new Tarea("Otra tarea", 2 , false);
		System.out.println(objeto2.getDuracion());
		
		objeto2.cambiarEstado();
	}

		
}
	