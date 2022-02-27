package Punto_Uno;

import java.util.Scanner;

public class Punto_Uno {
	int Edad;
	
	public void Uno() {
		Scanner inf = new Scanner(System.in);
		System.out.println("Ingrese Su edad actual");
		Edad=inf.nextInt();
		if (Edad>=18) {
			System.out.println("Usted es mayor de edad");
		}
	}
}
