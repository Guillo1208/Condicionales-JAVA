package Punto_Tres;

import java.util.Scanner;

public class Punto_Tres {
	String nombre;
	String apellido;
	int edad;
	
	public void tres() {
		Scanner inf = new Scanner(System.in);
		System.out.println("Ingresa Tu Nombre ");
		nombre=inf.nextLine();
		//Scanner infdos = new Scanner(System.in);
		System.out.println("Ingresa tu Apellido");
		apellido=inf.nextLine();
		//Scanner inftres = new Scanner(System.in);
		System.out.println("Ingresa Tu edad ");
		edad=inf.nextInt();
		if (edad>=18) {
			System.out.println(nombre+" "+apellido+" Usted es mayor de edad, por lo tanto puede entrara a la fiesta");
		}
		else {
			System.out.println(nombre+" "+apellido+" Usted es meno de edad, por lo tanto, no puede entrar a la fiesta, por favor devuélvase a su casa.");
		}
				
	}
}
