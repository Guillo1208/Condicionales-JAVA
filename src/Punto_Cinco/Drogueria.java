package Punto_Cinco;

public class Drogueria {
	private producto[] productos;
	
	public Drogueria() {
		this.productos = new producto[4];
	}
	public Drogueria(int tamaño) {
		this.productos = new producto[tamaño];
	}
	
	public void llenarArreglo() {
		productos[0]= new producto ("isodine", 3000.2 , "uso para heridas alcohol al 30%");
		productos[1]= new producto ("Dolex", 546.4 , "uso para dolor de cabeza");
		productos[2]= new producto ("loratadina", 334.34 , "uso para alergia, 50 Ml");
	}
	
	public void Mostrar() {
		llenarArreglo();
		for (int i=0; i<productos.length; i++) {
			System.out.println(productos[i]);
		}
	}
	
	public void Buscar(String nombre,Double cant) {
		boolean encontrado = false;
		for (int i=0 ; i<productos.length && !encontrado; i++) {
			if(productos[i].getNombre().equalsIgnoreCase(nombre)) {
				System.out.println("medicamento disponible");
				System.out.println("el total a pagar es : $"+(Double) (cant*productos[i].getPrecio()) );
				encontrado = true;
			}
		}
		if(!encontrado) {
			System.out.println("No hay ese medicamento disponible");
		}
	}
	
	public void BuscarPrecio(String nombre) {
		boolean encontrado = false;
		for (int i=0 ; i<productos.length && !encontrado; i++) {
			if(productos[i].getNombre().equalsIgnoreCase(nombre)) {
				System.out.println("medicamento disponible, el precio de este es $"+productos[i].getPrecio());
				encontrado = true;
			}
		}
		if(!encontrado) {
			System.out.println("medicamento no existe");
		}
		
	}
}
