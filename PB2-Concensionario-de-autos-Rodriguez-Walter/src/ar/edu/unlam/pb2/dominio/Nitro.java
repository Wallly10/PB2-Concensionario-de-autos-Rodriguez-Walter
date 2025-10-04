package ar.edu.unlam.pb2.dominio;

public class Nitro implements Accesorio{

	@Override
	public Double calcularCosto(Vehiculo vehiculo) {
		Double incrementaElPrecio;
		incrementaElPrecio = (double) (vehiculo.getPrecioBase() + 100000);			
		vehiculo.setVelocidadMaxima(150.0);
		return incrementaElPrecio;
	}	
	
}
