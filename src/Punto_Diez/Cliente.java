package Punto_Diez;

public class Cliente {
private String nombre;
private int cedula;
private double saldo;

public Cliente(String nombre, int cedula, double saldo) {
	super();
	this.nombre = nombre;
	this.cedula = cedula;
	this.saldo = saldo;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getCedula() {
	return cedula;
}
public void setCedula(int cedula) {
	this.cedula = cedula;
}
public double getSaldo() {
	return saldo;
}
public void setSaldo(double saldo) {
	this.saldo = saldo;
}
@Override
public String toString() {
	return "NOMBRE = " + nombre + "| CEDULA = " + cedula + "| saldo = $ " + saldo ;
}






}
