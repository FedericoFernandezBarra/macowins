package ar.com.dds.macowins.iteracion2;

import java.util.ArrayList;
import java.util.Date;
import java.util.stream.Stream;

public class Negocio {
	private double valorFijo;
	private ArrayList<Venta> ventas = new ArrayList<Venta>();
	
	public Negocio(double valorFijo) {
		this.valorFijo = valorFijo;
	}

	public double getValorFijo() {
		return valorFijo;
	}

	public void setValorFijo(double valorFijo) {
		this.valorFijo = valorFijo;
	}
	
	public void agregarVenta(Venta venta){
		ventas.add(venta);
	}
	
	public void sacarVenta(Venta venta){
		ventas.remove(venta);
	}
	
	
	public Stream<Venta> ventasDelDia(Date fecha){
		return ventas.stream().filter(v -> v.esDeFecha(fecha));
	}
	
	public double gananciasDelDia(Date fecha){
		return ventasDelDia(fecha).mapToDouble(v -> v.ganancia()).sum();
	}
}
