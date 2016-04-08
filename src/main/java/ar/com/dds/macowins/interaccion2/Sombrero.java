package ar.com.dds.macowins.interaccion2;

public class Sombrero extends Prenda {
	private double coeficienteDeMetrosexualidad;

	public Sombrero(Negocio negocio, Origen origen, Marca marca, double coeficienteDeMetrosexualidad) {
		super(negocio, origen, marca);
		this.coeficienteDeMetrosexualidad = coeficienteDeMetrosexualidad;
	}

	@Override
	protected double precioBase() {
		return 150 * (1 + this.coeficienteDeMetrosexualidad);
	}
}
