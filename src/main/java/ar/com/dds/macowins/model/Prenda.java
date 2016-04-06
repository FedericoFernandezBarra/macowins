package ar.com.dds.macowins.model;

public abstract class Prenda {
	private double precioBase;

	public Prenda(double precioBase) {
		this.precioBase = precioBase;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	
	public double precioFinal(){
		return 0;
	}
}
