package ar.com.dds.macowins.iteracion2;

import java.util.ArrayList;
import java.util.Date;

public class Venta {
	private ArrayList<Prenda> prendasVendidas = new ArrayList<Prenda>();
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
