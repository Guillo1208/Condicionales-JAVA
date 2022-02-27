package Punto_Siete;

import java.util.Scanner;

public class Calculos {
	private double peso;
	private double altura;
	private double IMC;
	
	Scanner dato = new Scanner(System.in);
	
public void menu() {
	System.out.println("Vamos a calcular el indice de masa corporal");
	System.out.println("Ingresa tu peso en Kg");
	peso=dato.nextDouble();
	System.out.println("Ingresa tu estatura en Mt");
	altura=dato.nextDouble();
	calculo(peso, altura);
	
}
	
public void calculo(double peso, double altura) {
	IMC=peso/(altura*altura);
	System.out.println("el IMC es : "+IMC);
	
	
	if (IMC < 18.5) {
		System.out.println("Tu peso es bajo");
	}
	if (IMC >= 18.5 && IMC <= 24.9) {
		System.out.println("Tu peso es normal");
	}
	if (IMC >= 25.0 && IMC <= 29.9) {
		System.out.println("Tu peso esta en sobre peso");
	}
	if (IMC >= 30.0) {
		System.out.println("Eres obeso");
	}
	
}
	


}
