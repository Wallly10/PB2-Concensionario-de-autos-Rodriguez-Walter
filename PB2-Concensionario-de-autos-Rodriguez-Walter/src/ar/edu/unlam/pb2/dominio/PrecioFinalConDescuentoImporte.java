package ar.edu.unlam.pb2.dominio;

public class PrecioFinalConDescuentoImporte implements EstrategiaPrecioFinal {
	//polimorfismo ya que hereda de la interfaz y calcula el precio como lo sabe hacer

	@Override
	public Double calcular(Vehiculo vehiculo) {
		
		Double total = (vehiculo.getPrecioBase() + vehiculo.precioFinaConAccesorios()) - 200000.0;
		return total;
	}

}
