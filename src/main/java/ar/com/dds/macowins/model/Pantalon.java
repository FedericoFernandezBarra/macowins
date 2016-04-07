package ar.com.dds.macowins.model;

public class Pantalon extends Prenda {
	public Pantalon(Negocio negocio, Origen origen){
		super(negocio, origen);
	}
	
	@Override
	protected double precioBase() {
		return 250;
	}
}
