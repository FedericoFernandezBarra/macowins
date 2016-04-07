package ar.com.dds.macowins.model;

public class Saco extends Prenda {
	public Saco(Negocio negocio, Boolean importada){
		super(negocio, importada);
	}
	
	@Override
	public double precioBase() {
		return 300;
	}
}
