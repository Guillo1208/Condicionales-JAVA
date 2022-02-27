package Punto_Nueve;

public class Calculos {
	
	public void rectangulo(int base, int altura) {
		int area;
		area=base*altura;
		System.out.println(" AREA DEL RECTANGULO = "+area ); 
	}
	public void triangulo(int base, int altura) {
		int area;
		area=(base*altura)/2;
		System.out.println(" AREA DEL TRIANGULO = "+area ); 
	}
	public void trapecio(int base_a, int base_b, int altura){
		int area;
		area=((base_a+base_b)*altura)/2;
		System.out.println(" AREA DEL TRAPECIO = "+area ); 
	}
	
}
