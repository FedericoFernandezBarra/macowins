package ar.com.dds.macowins.iteracion1;

public class Pantalon extends Prenda {
	public Pantalon(Negocio negocio, Origen origen){
		super(negocio, origen);
	}
	
	@Override
	protected double precioBase() {
		return 250;
	}
}
