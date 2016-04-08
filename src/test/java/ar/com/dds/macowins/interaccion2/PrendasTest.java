package ar.com.dds.macowins.interaccion2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ar.com.dds.macowins.interaccion2.Armani;
import ar.com.dds.macowins.interaccion2.Camisa;
import ar.com.dds.macowins.interaccion2.Internacional;
import ar.com.dds.macowins.interaccion2.Nacional;
import ar.com.dds.macowins.interaccion2.Negocio;
import ar.com.dds.macowins.interaccion2.Pantalon;
import ar.com.dds.macowins.interaccion2.Saco;
import ar.com.dds.macowins.interaccion2.Sarkany;
import ar.com.dds.macowins.interaccion2.Sombrero;
import ar.com.dds.macowins.interaccion2.Zapatos;


public class PrendasTest {
	Negocio tiendaDeRopa1;
	Camisa camisaMangaLarga;
	Pantalon jeanAzulGrande;
	Saco sacoNegroMediano;
	Sombrero fedora;
	Zapatos mocasines;
	Internacional china;
	Nacional argentina;
	Sarkany sarkanyDeArgentina;
	Armani armaniDeChina;


	@Before
	public void inicializar() {
		tiendaDeRopa1 = new Negocio(50);
		argentina = new Nacional();
		china = new Internacional();
		sarkanyDeArgentina = new Sarkany();
		armaniDeChina = new Armani();
			
		camisaMangaLarga = new Camisa(tiendaDeRopa1, china, armaniDeChina);
		jeanAzulGrande = new Pantalon(tiendaDeRopa1, china, armaniDeChina, 52.5);
		sacoNegroMediano = new Saco(tiendaDeRopa1, argentina, sarkanyDeArgentina, 3);
		fedora = new Sombrero(tiendaDeRopa1, china, armaniDeChina, 3.2);
		mocasines = new Zapatos(tiendaDeRopa1, argentina, sarkanyDeArgentina, 44);
	}
	
	
	//Precio final = (base + negocio) * tasa * coeficienteDeMarca
	//Precio final = (200 + 50) * 1.3 * 1.65
	//Precio final = 536.25
	@Test
	  public void testearCamisa() {
		  assertEquals((Double)536.25, (Double)camisaMangaLarga.precioFinal());
	  }
	

	//Precio final = (base + 1 cm2DeTelaUsados + negocio) * tasa * coeficienteDeMarca
	//Precio final = (250 + 52.5 + 50) * 1.3 * 1.65
	//Precio final = 756.1125
	@Test
	  public void testearPantalon() {
		  assertEquals((Double)756.1125, (Double)jeanAzulGrande.precioFinal());
	  }
	
	//Precio final = (base + 1 cm2DeTelaUsados + negocio) * tasa * coeficienteDeMarca
	//Precio final = (300 + 10 * 3 + 50) * 1 * 1.10
	//Precio final = 418.00000000000006 <---- double apesta en varios lenguajes de programacion
	// EJEMPLO
	//	double d = 0;
	//	for (int i = 1; i <= 10; i++) {
	//	    d += 0.1;
	//	}
	//	System.out.println(d); 
	// da 0.9999999999999999 en vez de 1 (Mejor usar BigDecimal, pero ya es tarde)
	@Test
	  public void testearSaco() {
		  assertEquals((Double)418.00000000000006, (Double)sacoNegroMediano.precioFinal());
	  }

	//Precio final = (base * (1 + coeficienteDeMetrosexualidad) + negocio) * tasa * coeficienteDeMarca
	//Precio final = (150 * (1 + 3.2)) + 50) * 1.3 * 1.65
	//Precio final = 1458.6
	@Test
	  public void testearSombrero() {
		  assertEquals((Double)1458.6, (Double)fedora.precioFinal());
	  }
	
	//Precio final = (base + (5 * talle) + negocio) * tasa * coeficienteDeMarca
	//Precio final = (400 + 5 * 44 + 50) * 1 * 1.35
	//Precio final = 904.5000000000001 <---- FUUUUUUUUUUUUU
	@Test
	  public void testearZapatos() {
		  assertEquals((Double)904.5000000000001, (Double)mocasines.precioFinal());
	  }
}
