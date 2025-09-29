package ar.edu.unlam.pb2.primerparcial;

public class PrecioFinalConDescuentoPorcentaje implements EstrategiaPrecioFinal {

	//polimorfismo ya que hereda de la interfaz y calcula el precio como lo sabe hacer

	@Override
	public Double calcular(Vehiculo vehiculo) {
		
		Double total = (vehiculo.getPrecioBase() + vehiculo.precioFinaConAccesorios()) *0.9;
		return total;
	}

}
