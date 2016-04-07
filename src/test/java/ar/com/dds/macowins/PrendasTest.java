package ar.com.dds.macowins;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ar.com.dds.macowins.model.Camisa;
import ar.com.dds.macowins.model.Internacional;
import ar.com.dds.macowins.model.Nacional;
import ar.com.dds.macowins.model.Negocio;
import ar.com.dds.macowins.model.Pantalon;
import ar.com.dds.macowins.model.Saco;

public class PrendasTest {
	Negocio tiendaDeRopa1;
	Camisa camisaMangaLarga;
	Pantalon jeanAzulGrande;
	Saco sacoNegroMediano;
	Internacional china;
	Nacional argentina;


	@Before
	public void inicializar() {
		tiendaDeRopa1 = new Negocio(50);
		argentina = new Nacional();
		china = new Internacional();
		camisaMangaLarga = new Camisa(tiendaDeRopa1, china);
		jeanAzulGrande = new Pantalon(tiendaDeRopa1, china);
		sacoNegroMediano = new Saco(tiendaDeRopa1, argentina);
	}
	
	
	//Precio final = (base + negocio) * tasa
	//Precio final = (200 + 50) * 1,3
	//Precio final = 325
	@Test
	  public void testearCamisa() {
		  assertEquals((Double)325.00, (Double)camisaMangaLarga.precioFinal());
	  }
	

	//Precio final = (base + negocio) * tasa
	//Precio final = (250 + 50) * 1.3
	//Precio final = 390
	@Test
	  public void testearPantalon() {
		  assertEquals((Double)390.00, (Double)jeanAzulGrande.precioFinal());
	  }
	
	//Precio final = (base + negocio) * tasa
	//Precio final = (300+ 50) * 1
	//Precio final = 350
	@Test
	  public void testearSaco() {
		  assertEquals((Double)350.00, (Double)sacoNegroMediano.precioFinal());
	  }

}
