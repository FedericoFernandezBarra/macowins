package ar.com.dds.macowins.model;

public class Camisa extends Prenda {
	public Camisa(Negocio negocio, Origen origen){
		super(negocio, origen);
	}
	
	@Override
	protected double precioBase() {
		return 200;
	}
}
