package Punto_Ocho;

public class Pasteles {

	private String sabor;
	private String decoracion;
	private int cantidad;
	
	public Pasteles(String sabor, String decoracion, int cantidad) {
		this.sabor = sabor;
		this.decoracion = decoracion;
		this.cantidad = cantidad;
	}
	
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public String getDecoracion() {
		return decoracion;
	}
	public void setDecoracion(String decoracion) {
		this.decoracion = decoracion;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
	
}
