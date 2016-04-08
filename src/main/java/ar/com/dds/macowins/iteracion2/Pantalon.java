package ar.com.dds.macowins.iteracion2;

public class Pantalon extends Prenda {
	private double cm2DeTelaUsada;
	
	public Pantalon(Negocio negocio, Origen origen, Marca marca, double cm2DeTelaUsada){
		super(negocio, origen, marca);
		this.cm2DeTelaUsada = cm2DeTelaUsada;
	}
	
	@Override
	protected double precioBase() {
		return 250 + 1 * this.cm2DeTelaUsada;
	}
}
