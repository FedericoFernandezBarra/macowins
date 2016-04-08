package ar.com.dds.macowins.iteracion2;

public class Camisa extends Prenda {
	public Camisa(Negocio negocio, Origen origen, Marca marca){
		super(negocio, origen, marca);
	}
	
	@Override
	protected double precioBase() {
		return 200;
	}
}
