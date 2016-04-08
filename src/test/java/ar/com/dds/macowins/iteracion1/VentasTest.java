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
	Venta otraVentaDia1;
	Venta ventaDia2;
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
		otraVentaDia1 = new Venta(formatoDeFecha.parse("08/04/2016"));
		otraVentaDia1.agregarPrenda(jeanAzulGrande);
		ventaDia2 = new Venta(formatoDeFecha.parse("09/04/2016"));
		ventaDia2.agregarPrenda(sacoNegroMediano);
		tiendaDeRopa1.agregarVenta(ventaDia1);
		tiendaDeRopa1.agregarVenta(otraVentaDia1);
		tiendaDeRopa1.agregarVenta(ventaDia2);		
	}
	
	
	// ganacia = camisaMangaLarga + jeanAzulGrande + jeanAzulGrande + jeanAzulGrande + sacoNegroMediano
	// ganancia = 325 + 390 + 390 + 390 + 350
	// ganancia = 1845
	@Test
	  public void testearGananciaDeUnaVenta() {
		  assertEquals((Double)1845.00, (Double)ventaDia1.ganancia());
	  }
	
	// ganancia = ventaDia1 + otraVentaDia1
	// ganacia = camisaMangaLarga + jeanAzulGrande + jeanAzulGrande + jeanAzulGrande + sacoNegroMediano + jeanAzulGrande
	// ganancia = 325 + 390 + 390 + 390 + 350 + 390
	// ganancia = 2235
	@Test
	  public void testearGananciaDeUnDia() throws ParseException {
		  assertEquals((Double)2235.00, (Double)tiendaDeRopa1.gananciasDelDia(formatoDeFecha.parse("08/04/2016")));
	  }
}
