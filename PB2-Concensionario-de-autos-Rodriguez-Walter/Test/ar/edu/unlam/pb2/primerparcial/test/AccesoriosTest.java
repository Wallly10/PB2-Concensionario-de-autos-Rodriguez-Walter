package ar.edu.unlam.pb2.primerparcial.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.pb2.primerparcial.Accesorio;
import ar.edu.unlam.pb2.primerparcial.Alarma;
import ar.edu.unlam.pb2.primerparcial.Auto;
import ar.edu.unlam.pb2.primerparcial.Estereo;
import ar.edu.unlam.pb2.primerparcial.LevantaVidrios;
import ar.edu.unlam.pb2.primerparcial.Nitro;
import ar.edu.unlam.pb2.primerparcial.Pulido;

public class AccesoriosTest {

	@Test
	public void instaloElLevantavidrios() {
		// Preparo
		Auto auto = new Auto(5000000, 4, 170.0, 5);
		Accesorio accesorio = new LevantaVidrios(30000);
		Double valorEsperado = 120000.0;
		// Ejecuto
		Double valorObtenido = accesorio.calcularCosto(auto);
		// Contrastacion
		assertEquals(valorEsperado, valorObtenido);

	}

	@Test
	public void instaloElEstereo() {
		// Preparo
		Auto auto = new Auto(5000000, 4, 170.0, 5);
		Accesorio accesorio = new Estereo(15000, 20000);
		Double valorEsperado = 95000.0;
		// Ejecuto
		Double valorObtenido = accesorio.calcularCosto(auto);
		// Contrastacion
		assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	public void verificoElPulidoCuandoElAutoEsVeloz() {
		// Preparo
		Auto auto = new Auto(5000000, 4, 170.0, 4);
		Accesorio accesorio = new Pulido(25000.0);
		Double valorEsperado = 100000.0;
		// Ejecuto

		Double valorObtenido = accesorio.calcularCosto(auto);
		// Contrastacion
		assertEquals(valorEsperado, valorObtenido);

	}

	@Test
	public void verificoElPulidoCuandoNoEsVeloz() {
		// Preparo

		Auto auto = new Auto(5000000, 4, 140.0, 4);
		Accesorio accesorio = new Pulido(25000.0);
		Double valorEsperado = 100000.0;
		// Ejecuto

		Double valorObtenido = accesorio.calcularCosto(auto);
		// Contrastacion

		assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	public void agregoUnaAlarmaAlCoche() {
		// Preparo

		Auto auto = new Auto(5000000, 2, 160.0, 5);
		Accesorio alarma = new Alarma(20000.0);
		Double valorEsperado = 50000.0;
		// Ejecuto

		Double valorObtenido = alarma.calcularCosto(auto);
		// Contrastacion

		assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	public void instaloNitrogenoEnElCocheParaQueSeaVeloz() {
		// Preparo

		Auto auto = new Auto(5000000, 4, 100.0, 5);
		Accesorio nitro = new Nitro();
		Double valorEsperado = 5100000.0;
		// Ejecuto

		Double valorObtenido = nitro.calcularCosto(auto);
		// Contrastacion

		assertEquals(valorEsperado, valorObtenido);
		assertEquals(true, auto.esVeloz());

	}

}
