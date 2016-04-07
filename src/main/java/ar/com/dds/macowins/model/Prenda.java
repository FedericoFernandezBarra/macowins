package ar.com.dds.macowins.model;

public abstract class Prenda {
	protected abstract double precioBase();
	private Negocio negocio;
	private Boolean importada;
	
	public Prenda(Negocio negocio, Boolean importada){
		this.negocio = negocio;
		this.importada = importada;
	}
	
	public double precioFinal(){
		return (precioBase() + negocio.getValorFijo()) * tasaDeImportacion();
	}

	public double tasaDeImportacion(){
		return importada? 1.3 : 1;
	}
}
