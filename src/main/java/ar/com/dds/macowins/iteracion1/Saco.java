package ar.com.dds.macowins.iteracion1;

public class Saco extends Prenda {
	public Saco(Negocio negocio, Origen origen){
		super(negocio, origen);
	}
	
	@Override
	public double precioBase() {
		return 300;
	}
}
