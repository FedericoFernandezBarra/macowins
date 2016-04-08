package ar.com.dds.macowins.interaccion2;

public class Sarkany extends Marca {
	@Override
	public double coeficiente(double precioOriginal) {
		if(precioOriginal > 500)
			return 1.35;
		else
			return 1.1;
	}
}
