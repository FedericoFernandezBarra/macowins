package ar.com.dds.macowins.model;

public abstract class Prenda {
	private Negocio negocio;
	private Origen origen;
	
	protected abstract double precioBase();
	
	public Prenda(Negocio negocio, Origen origen){
		this.negocio = negocio;
		this.origen = origen;
	}
	
	public double precioFinal(){
		return (this.precioBase() + this.negocio.getValorFijo()) * this.origen.tasaDeImportacion();
	}
}
