package ar.edu.unlam.pb2.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.pb2.dominio.Auto;

public class VehiculoTest {

	@Test
	public void creamosUnVehiculoParaVerificarQueLosDatosSonCorrectos() {
		//Preparo
		Auto auto = new Auto(5000000, 4, 170.0, 5);
		//Contrasto y ejecuto 2 en 1
		assertEquals(Integer.valueOf(5000000), auto.getPrecioBase());
		assertEquals(Integer.valueOf(4), auto.getCantidadDePuertas());
		assertEquals(Double.valueOf(170.0), auto.getVelocidadMaxima());
		assertEquals(Integer.valueOf(5), auto.getSuperficie());
	}

	@Test
	public void creamosUnVehiculoQueEsDeportivoYVeloz() {
		//Preparo
		Auto auto = new Auto(5000000, 2, 160.0, 5);
		//Ejecuto
		Boolean esDeportivo = auto.esDeportivo();
		Boolean esVeloz = auto.esVeloz();
		//Contratacion

		assertTrue(esDeportivo);
		assertTrue(esVeloz);
	}

	@Test
	public void creamosUnVehiculoQueNoEsDeportivoPeroEsVeloz() {
		//Preparo
		Auto auto = new Auto(5000000, 4, 170.0, 5);
		//Ejecuto

		Boolean esDeportivo = auto.esDeportivo();
		Boolean esVeloz = auto.esVeloz();
		//Contratacion

		assertFalse(esDeportivo);
		assertTrue(esVeloz);

	}

	@Test
	public void creamosUnVehiculoQueTieneDosPuertasPeroNoEsVelozPorLoTantoNoEsConsideradoDeportivo() {
		//Preparo
		Auto auto = new Auto(5000000, 2, 130.0, 5);
		//Ejecuto

		Boolean esDeportivo = auto.esDeportivo();
		Boolean esVeloz = auto.esVeloz();
		//Contratacion
		assertFalse(esDeportivo);
		assertFalse(esVeloz);

	}

}
