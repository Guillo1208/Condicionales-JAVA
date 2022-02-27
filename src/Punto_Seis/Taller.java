package Punto_Seis;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Taller {
	Scanner sn = new Scanner(System.in);
	List<Autos> autos;

	public Taller() {
		this.autos = new ArrayList<Autos>();
	}
	

	public void agregar(Autos A) {
		autos.add(A);
	}
	
	public boolean validacion() {
		if(autos.isEmpty()) {
			System.out.println("****************************************");
			System.out.println("EL TALLER NO TIENE REGISTRO DE VEHICULOS");
			System.out.println("****************************************");
			return true;
		}
		return false;
	}
	
	public void mostrar() {
		for(int i=0;i<autos.size();i++) {
				System.out.println(" PLACA : "+autos.get(i).getPlaca()+" | FECHA INGRESO : "+ autos.get(i).getFecha_ingreso() +" | DAÑO: "+autos.get(i).getObservacion()+" | FECHA SALIDA "+autos.get(i).getFechasalida()+" | REPUESTOS "+autos.get(i).getRepuestos());
		}
	}
	
	public void retirar(String p) {
		Boolean marcador=false;
		String fecha;
		String repuestos;
		for(int i=0;i<autos.size();i++) {
			if(autos.get(i).getPlaca().equalsIgnoreCase(p)){
				System.out.println("INGRESA LA FECHA DE SALIDA");
				fecha=sn.next();
				autos.get(i).setFechasalida(fecha);
				System.out.println("INGRESA LOS REPUESTOS NECESARIOS PARA LA REPARACION");
				repuestos=sn.next();
				autos.get(i).setRepuestos(repuestos);
				marcador=true;
			}
		}
		if(marcador) {
			System.out.println("VEHICULO RETIRADO EXITOSAMENTE");
		}else {
			System.out.println("VEHICULO NO ENCONTRADO EN EL TALLER");
		}
	}
	
	public void repuestos() {
		String aux;
		for(int i=0;i<autos.size();i++) {
			if(autos.get(i).getRepuestos() != "EN REPARACION") {
				System.out.println("* "+autos.get(i).getRepuestos());
			}
		}
	}
	
	
		
}
