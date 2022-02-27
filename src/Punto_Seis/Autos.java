package Punto_Seis;

public class Autos {
	private String placa;
	private String fecha_ingreso;
	private String observacion;
	private String fechasalida;
	private String repuestos;
	
	
	
	public Autos(String placa, String fecha_ingreso, String observacion, String fechasalida, String repuestos) {
		this.placa = placa;
		this.fecha_ingreso = fecha_ingreso;
		this.observacion = observacion;
		this.fechasalida = fechasalida;
		this.repuestos = repuestos;
	}
	
	public String getRepuestos() {
		return repuestos;
	}

	public void setRepuestos(String repuestos) {
		this.repuestos = repuestos;
	}

	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getFecha_ingreso() {
		return fecha_ingreso;
	}
	public void setFecha_ingreso(String fecha_ingreso) {
		this.fecha_ingreso = fecha_ingreso;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public String getFechasalida() {
		return fechasalida;
	}
	public void setFechasalida(String fechasalida) {
		this.fechasalida = fechasalida;
	}
	
	
	
	
	
	
	
	
	
}
