package ar.com.dds.macowins.interaccion2;

public abstract class Prenda {
	private Negocio negocio;
	private Origen origen;
	private Marca marca;

	protected abstract double precioBase();

	public Prenda(Negocio negocio, Origen origen, Marca marca) {
		this.negocio = negocio;
		this.origen = origen;
		this.marca = marca;
	}
	
	public double precioOriginal() {
		return (this.precioBase() + this.negocio.getValorFijo()) * this.origen.tasaDeImportacion();
	}

	public double precioFinal() {
		return this.precioOriginal() * this.marca.coeficiente(this.precioOriginal());
	}
}
