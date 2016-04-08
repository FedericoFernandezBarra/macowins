package ar.com.dds.macowins.iteracion2;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Before;
import org.junit.Test;

import ar.com.dds.macowins.iteracion2.Armani;
import ar.com.dds.macowins.iteracion2.Camisa;
import ar.com.dds.macowins.iteracion2.Internacional;
import ar.com.dds.macowins.iteracion2.Nacional;
import ar.com.dds.macowins.iteracion2.Negocio;
import ar.com.dds.macowins.iteracion2.Pantalon;
import ar.com.dds.macowins.iteracion2.Saco;
import ar.com.dds.macowins.iteracion2.Sarkany;
import ar.com.dds.macowins.iteracion2.Sombrero;
import ar.com.dds.macowins.iteracion2.Venta;
import ar.com.dds.macowins.iteracion2.Zapatos;

public class VentasTest {
	Venta ventaDia1;
	Venta otraVentaDia1;
	Venta ventaDia2;
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
	DateFormat formatoDeFecha;


	@Before
	public void inicializar() throws ParseException {
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
		formatoDeFecha = new SimpleDateFormat("dd/mm/yyyy");
		ventaDia1 = new Venta(formatoDeFecha.parse("08/04/2016"));
		ventaDia1.agregarPrenda(camisaMangaLarga);
		ventaDia1.agregarPrenda(jeanAzulGrande);
		ventaDia1.agregarPrenda(sacoNegroMediano);
		ventaDia1.agregarPrenda(fedora);
		ventaDia1.agregarPrenda(mocasines);
		ventaDia1.agregarPrenda(fedora);
		ventaDia1.sacarPrenda(fedora);
		otraVentaDia1 = new Venta(formatoDeFecha.parse("08/04/2016"));
		otraVentaDia1.agregarPrenda(camisaMangaLarga);
		ventaDia2 = new Venta(formatoDeFecha.parse("09/04/2016"));
		ventaDia2.agregarPrenda(sacoNegroMediano);
		tiendaDeRopa1.agregarVenta(ventaDia1);
		tiendaDeRopa1.agregarVenta(otraVentaDia1);
		tiendaDeRopa1.agregarVenta(ventaDia2);	
	}
	
	
	// ganacia = camisaMangaLarga + jeanAzulGrande + sacoNegroMediano + fedora + mocasines
	// ganancia = 536.25 + 756.1125 +  418.00000000000006 + 1458.6 + 904.5000000000001
	// ganancia = 4073.4625
	@Test
	  public void testearGananciaDeUnaVenta() {
		  assertEquals((Double)4073.4625, (Double)ventaDia1.ganancia());
	  }
	
	
	// ganancia = ventaDia1 + otraVentaDia1
	// ganacia = camisaMangaLarga + jeanAzulGrande + jeanAzulGrande + jeanAzulGrande + sacoNegroMediano + camisaMangaLarga
	// ganancia = 536.25 + 756.1125 +  418.00000000000006 + 1458.6 + 904.5000000000001 + 536.25
	// ganancia = 4609.7125
	@Test
	  public void testearGananciaDeUnDia() throws ParseException {
		  assertEquals((Double)4609.7125, (Double)tiendaDeRopa1.gananciasDelDia(formatoDeFecha.parse("08/04/2016")));
	  }
}
