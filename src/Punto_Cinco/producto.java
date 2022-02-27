package Punto_Cinco;

public class producto {
	String nombre;
	double precio;
	String composicion;
	
	public producto(String nombre, Double precio, String composicion) {
		this.nombre = nombre;
		this.precio = precio;
		this.composicion = composicion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(Float precio) {
		this.precio = precio;
	}
	public String getComposicion() {
		return composicion;
	}
	public void setComposicion(String composicion) {
		this.composicion = composicion;
	}
	@Override
	public String toString() {
		return "nombre= " + nombre + ", precio= $ " + precio + ", composicion=" + composicion ;
	}
	
}
