package ar.com.dds.macowins.model;

import java.util.Date;
import java.util.List;

public class Venta {
	private List<Prenda> prendasVendidas;
	private Date fecha;
	
	public Venta(Date fecha){
		this.fecha = fecha;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public void agregarPrenda(Prenda prenda){
		prendasVendidas.add(prenda);
	}
	
	public void sacarPrenda(Prenda prenda){
		prendasVendidas.remove(prenda);
	}
	
	public double ganancia(){
		return prendasVendidas.stream().mapToDouble(prenda -> prenda.precioFinal()).sum();
	}
}
