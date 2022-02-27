package Punto_Dos;

import java.util.Scanner;

public class Punto_Dos {
	int edad;
	
	public void dos() {
		Scanner inf = new Scanner(System.in);
		System.out.println("Ingrese Su edad actual");
		edad=inf.nextInt();
		if (edad<18) {
			System.out.println("Usted es un niño(a)");
		}
		
	}
}
