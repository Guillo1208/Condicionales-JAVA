package Punto_Diez;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	List<Cliente> clientes;
	
	public Banco() {
		this.clientes=new ArrayList<Cliente>();
	}
	
	public void ingresarcliente(Cliente c) {
		clientes.add(c);
	}
	
	public void mostrar() {
		if(clientes.isEmpty()) {
			System.out.println("******************************");
			System.out.println("EL BANCO AUN NO TIENE CLIENTES");
			System.out.println("******************************");
		}else {
			System.out.println("lOS CLIENTES DEL BANCO SON");
			for(int i=0;i<clientes.size();i++) {
				System.out.println(clientes.get(i));
			}
		}
	}
	
	public void ingresar(int cc,Double ingreso) {
		double valor;
		for(int i=0;i<clientes.size();i++) {
			if(cc==clientes.get(i).getCedula()) {
				System.out.println("AL CLIENTE "+clientes.get(i).getNombre()+" SE LE AGREGARA A SU CUENTA EL VALOR DE $"+ingreso);
				ingreso += clientes.get(i).getSaldo();
				clientes.get(i).setSaldo(ingreso);
			}
		}
	}
	
	public void retirar(int cc,Double retiro){
		double valor;

		for(int i=0;i<clientes.size();i++) {
			if(cc==clientes.get(i).getCedula()) {
				if(retiro>clientes.get(i).getSaldo()) {
					System.out.println("NO CUENTAS CON EL SALDO SUFICIENTE PARA EL RETIRO");
				}else {	
					retiro -= clientes.get(i).getSaldo();
					retiro=(retiro*-1);
					clientes.get(i).setSaldo(retiro);
					System.out.println("EL NUEVO SALDO DE LA CUENTA ES $ "+clientes.get(i).getSaldo());
					}
				}
			}
		}
		
	
	public boolean validacion() {
		if(clientes.isEmpty()) {
			System.out.println("******************************");
			System.out.println("EL BANCO AUN NO TIENE CLIENTES");
			System.out.println("******************************");
			return true;
		}
		return false;
	}
	
	public void consultarsaldo(int cc) {
		for(int i=0;i<clientes.size();i++) {
			if(cc==clientes.get(i).getCedula()) {
					System.out.println("EL SALDO DE "+clientes.get(i).getNombre()+" es $ "+clientes.get(i).getSaldo());
			}
		}
	}
	
	
}
