package Punto_Cuatro;

public class pelicula {
	private String nombre;
	private int cantida;
	
	public pelicula(String nombre, int cantida) {
	this.nombre = nombre;
	this.cantida = cantida;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCantida() {
		return cantida;
	}
	public void setCantida(int cantida) {
		this.cantida = cantida;
	}
	@Override
	public String toString() {
		return "Nombre pelicula = " + nombre + " , Numero disponibles = " + cantida ;
	}
	

}
