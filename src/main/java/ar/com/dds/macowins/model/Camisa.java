package ar.com.dds.macowins.model;

public class Camisa extends Prenda {
	public Camisa(Negocio negocio, Boolean importada){
		super(negocio, importada);
	}
	
	@Override
	protected double precioBase() {
		return 200;
	}
}
