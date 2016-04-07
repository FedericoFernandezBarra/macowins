package ar.com.dds.macowins.model;

public class Pantalon extends Prenda {
	public Pantalon(Negocio negocio, Boolean importada){
		super(negocio, importada);
	}
	
	@Override
	protected double precioBase() {
		return 250;
	}
}
