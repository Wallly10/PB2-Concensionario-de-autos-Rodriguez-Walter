package ar.edu.unlam.pb2.primerparcial.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.pb2.primerparcial.Alarma;
import ar.edu.unlam.pb2.primerparcial.Auto;
import ar.edu.unlam.pb2.primerparcial.Estereo;
import ar.edu.unlam.pb2.primerparcial.EstrategiaPrecioFinal;
import ar.edu.unlam.pb2.primerparcial.LevantaVidrios;
import ar.edu.unlam.pb2.primerparcial.PrecioFinal;
import ar.edu.unlam.pb2.primerparcial.PrecioFinalConDescuentoImporte;
import ar.edu.unlam.pb2.primerparcial.PrecioFinalConDescuentoPorcentaje;
import ar.edu.unlam.pb2.primerparcial.Pulido;

public class DiferentesTiposDePreciosFinalTest {

	@Test
	public void preciosFinalesConLosAccesoriosSinDescuentos() {
		//Preparacion
		Auto auto = new Auto(5000000, 4, 170.0, 4);
		Estereo estereo = new Estereo(15000, 20000);
		Pulido pulido = new Pulido(100000.0);
		LevantaVidrios levantaVidrios = new LevantaVidrios(30000);

		auto.agregarAccesorio(estereo);
		auto.agregarAccesorio(pulido);
		auto.agregarAccesorio(levantaVidrios);
		//Ejecuto

		EstrategiaPrecioFinal precioFinal = new PrecioFinal();
		Double valorEsperado = 5315000.0;
		Double valorObtenido = precioFinal.calcular(auto);
		//Contratacion

		assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	public void precioFinalConDescuentoDel10Porciento() {
		//Preparacion

		Auto auto = new Auto(5000000, 4, 170.0, 4);

		Estereo estereo = new Estereo(15000, 20000);
		Pulido pulido = new Pulido(100000.0);
		LevantaVidrios levantaVidrios = new LevantaVidrios(30000);

		auto.agregarAccesorio(estereo);
		auto.agregarAccesorio(pulido);
		auto.agregarAccesorio(levantaVidrios);
		//Ejecuto

		EstrategiaPrecioFinal precioFinal = new PrecioFinalConDescuentoPorcentaje();
		Double valorEsperado = 4783500.0;
		Double valorObtenido = precioFinal.calcular(auto);
		//Contratacion

		assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	public void precioFinalConDescuentoImporteMeTieneQueDescontar200000() {
		//Preparacion

		Auto auto = new Auto(5000000, 4, 170.0, 4);

		Estereo estereo = new Estereo(15000, 20000);
		Pulido pulido = new Pulido(100000.0);
		LevantaVidrios levantaVidrios = new LevantaVidrios(30000);
		Alarma alarma = new Alarma(20000.0);
		//Ejecuto
		auto.agregarAccesorio(estereo);
		auto.agregarAccesorio(pulido);
		auto.agregarAccesorio(levantaVidrios);
		auto.agregarAccesorio(alarma);

		EstrategiaPrecioFinal precioFinal = new PrecioFinalConDescuentoImporte();
		Double valorEsperado = 5165000.0;
		Double valorObtenido = precioFinal.calcular(auto);
		//Contratacion

		assertEquals(valorEsperado, valorObtenido);
	}

}
