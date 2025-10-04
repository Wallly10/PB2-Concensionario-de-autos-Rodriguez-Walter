package ar.edu.unlam.pb2.dominio;

public class Alarma implements Accesorio{

	private Double precioFijo;

	public Alarma(Double precioFijo) {
		this.precioFijo = precioFijo;
	}



	@Override
	public Double calcularCosto(Vehiculo vehiculo) {
		Double total = precioFijo;
		if (vehiculo.esVeloz()) {
			total += 30000;
		}		
		return total;
	}

	
}
