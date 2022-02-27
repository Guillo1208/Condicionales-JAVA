package Punto_Ocho;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Panaderia {
	
	Scanner sn = new Scanner(System.in);
	List<Pasteles> pasteles;
	List<String>nombre = new ArrayList<>();
	List<Integer>cantidades = new ArrayList<>();
	
	public Panaderia() {
		this.pasteles = new ArrayList<Pasteles>();
	}
	
	public void agregar(Pasteles p) {
		pasteles.add(p);
	}

	public void mostrar() {
		for(int i=0;i<pasteles.size();i++) {
				System.out.println(" SABOR : "+pasteles.get(i).getSabor()+" | PORCIONES : "+ pasteles.get(i).getCantidad() +" | DECORACION: "+pasteles.get(i).getDecoracion());
		}
	}

	public boolean validacion() {
		if(pasteles.isEmpty()) {
			System.out.println("********************************");
			System.out.println("NO HAY PASTELES EN EL INVENTARIO");
			System.out.println("********************************");
			return true;
		}
		return false;
	}

	public void buscar(String sabor) {
		int cant;
		for(int i=0;i<pasteles.size();i++) {
			if(pasteles.get(i).getSabor().equalsIgnoreCase(sabor)) {
				System.out.println("SABOR ENCONTRADO");
				System.out.println("INGRESA LA CANTIDAD DE PORCIONES QUE SUMARAS AL SABOR");
				cant=sn.nextInt();
				cant+=pasteles.get(i).getCantidad();
				pasteles.get(i).setCantidad(cant);
			}
		}
	}

	public void BuscarC(String sabor, int cantidad) {

		int cant;
		Boolean bandera=false;
		for(int i=0;i<pasteles.size();i++) {
			if(pasteles.get(i).getSabor().equalsIgnoreCase(sabor) && cantidad<pasteles.get(i).getCantidad()) {
				cant= pasteles.get(i).getCantidad() - cantidad ;
				pasteles.get(i).setCantidad(cant);
				bandera=true;
			}
		}
		if(bandera) {
			nombre.add(sabor);
			cantidades.add(cantidad);
		}
	}

	
	public void mostrarventas() {
		for(int i=0;i<nombre.size();i++) {
				System.out.println(" SABORES : "+nombre.get(i));
		}
		for(int i=0;i<cantidades.size();i++) {
			System.out.println(" CANTIDAD : "+cantidades.get(i));
	}
	}

	
	
	
}
	


