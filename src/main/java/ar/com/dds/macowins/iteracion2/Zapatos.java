package ar.com.dds.macowins.iteracion2;

public class Zapatos extends Prenda {
	private double talle;
	
	public Zapatos(Negocio negocio, Origen origen, Marca marca, double talle) {
		super(negocio, origen, marca);
		this.talle = talle;
	}

	@Override
	protected double precioBase() {
		return 400 + 5 * this.talle;
	}
}
