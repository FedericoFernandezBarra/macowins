package ar.com.dds.macowins.model;

public class Saco extends Prenda {
	public Saco(Negocio negocio, Origen origen){
		super(negocio, origen);
	}
	
	@Override
	public double precioBase() {
		return 300;
	}
}
