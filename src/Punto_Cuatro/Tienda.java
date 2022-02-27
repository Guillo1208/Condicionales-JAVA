package Punto_Cuatro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tienda {
private pelicula[] peliculas;
	
	public Tienda() {
		this.peliculas = new pelicula[3];	
	}
	
	public Tienda(int tamno) {
		this.peliculas = new pelicula[tamno];
	}
	
public void llenar() {
	peliculas[0]= new pelicula("amor",2);
	peliculas[1]= new pelicula("juan",3);
	peliculas[2]= new pelicula("pedro",4);
}	


public void listar() {
	llenar();
	for (int i=0 ; i<peliculas.length ; i++) {
		System.out.println(peliculas[i]);
		}
	}

public void bucar (String nombre) {
	llenar();
	boolean encontrado = false;
	for (int i=0 ; i<peliculas.length && !encontrado; i++) {
		if(peliculas[i] != null && peliculas[i].getNombre().equalsIgnoreCase(nombre)) {
			System.out.println("Pelicula encontrada, Disponibles: "  + peliculas[i].getCantida());
			encontrado = true;
		}
	}
	if(!encontrado) {
		System.out.println("No se ha encontrado la pelicula");
	}
}

public void entregar(String nombre, String comentario) {
	llenar();
	boolean encontrado = false;
	for (int i=0 ; i<peliculas.length && !encontrado; i++) {
		if(peliculas[i].getNombre().equalsIgnoreCase(nombre)) {
			System.out.println("Pelicula pertenece a la video tienda");
			System.out.println("Desea agregar observaciond el estado de esta");
			try {
				int opcion;
				Scanner sn =new Scanner(System.in);
				System.out.println("1. SI");
				System.out.println("2. NO");
				opcion = sn.nextInt();
				
				switch (opcion) {
				
				case 1: 
					System.out.println("Ingresa el comentario");
					comentario=sn.next();
					System.out.println("Gracias, hasta pronto");
					break;
				
				case 2:
					System.out.println("Gracias, hasta pronto");
					break;	
					
				default:
					System.out.println("solo numeros entre 1 y 2");
				}
			encontrado = true;
		} catch (InputMismatchException e) {
			System.out.println("debes insertar un numero");
		}
	}
	}
	if(!encontrado) {
		System.out.println("la pelicula no pertenece a la video tienda");
	}

}

}
