package ar.com.dds.macowins.iteracion2;

public class Saco extends Prenda {
	private int cantidadDeBotones;
	
	public Saco(Negocio negocio, Origen origen, Marca marca, int cantidadDeBotones){
		super(negocio, origen, marca);
		this.cantidadDeBotones = cantidadDeBotones;
	}
	
	@Override
	public double precioBase() {
		return 300 + 10 * this.cantidadDeBotones;
	}
}
