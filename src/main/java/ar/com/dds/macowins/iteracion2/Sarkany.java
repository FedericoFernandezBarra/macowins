package ar.com.dds.macowins.iteracion2;

public class Sarkany implements Marca {
	@Override
	public double coeficiente(double precioOriginal) {
		if(precioOriginal > 500)
			return 1.35;
		else
			return 1.1;
	}
}
