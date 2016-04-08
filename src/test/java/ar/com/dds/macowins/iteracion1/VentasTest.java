package ar.com.dds.macowins.iteracion1;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Before;
import org.junit.Test;

import ar.com.dds.macowins.iteracion1.Camisa;
import ar.com.dds.macowins.iteracion1.Internacional;
import ar.com.dds.macowins.iteracion1.Nacional;
import ar.com.dds.macowins.iteracion1.Negocio;
import ar.com.dds.macowins.iteracion1.Pantalon;
import ar.com.dds.macowins.iteracion1.Saco;
import ar.com.dds.macowins.iteracion1.Venta;

public class VentasTest {
	Venta ventaDia1;
	Negocio tiendaDeRopa1;
	Camisa camisaMangaLarga;
	Pantalon jeanAzulGrande;
	Saco sacoNegroMediano;
	Internacional china;
	Nacional argentina;
	DateFormat formatoDeFecha;


	@Before
	public void inicializar() throws ParseException {
		tiendaDeRopa1 = new Negocio(50);
		argentina = new Nacional();
		china = new Internacional();
		camisaMangaLarga = new Camisa(tiendaDeRopa1, china);
		jeanAzulGrande = new Pantalon(tiendaDeRopa1, china);
		sacoNegroMediano = new Saco(tiendaDeRopa1, argentina);
		formatoDeFecha = new SimpleDateFormat("dd/mm/yyyy");
		ventaDia1 = new Venta(formatoDeFecha.parse("08/04/2016"));
		ventaDia1.agregarPrenda(camisaMangaLarga);
		ventaDia1.agregarPrenda(jeanAzulGrande);
		ventaDia1.agregarPrenda(jeanAzulGrande);
		ventaDia1.agregarPrenda(jeanAzulGrande);
		ventaDia1.agregarPrenda(sacoNegroMediano);
	}
	
	
	// ganacia = camisaMangaLarga + jeanAzulGrande + jeanAzulGrande + jeanAzulGrande + sacoNegroMediano
	// ganancia = 325 + 390 + 390 + 390 + 350
	// ganancia = 1845
	@Test
	  public void testearCamisa() {
		  assertEquals((Double)1845.00, (Double)ventaDia1.ganancia());
	  }
}
