package ar.edu.unlam.pb2.primerparcial;

public class Pulido implements Accesorio {

	private Double precioBase;

	public Pulido(Double precioBase) {
		this.precioBase = precioBase;
	}

	@Override
	public Double calcularCosto(Vehiculo vehiculo) {
		Double costo = precioBase * vehiculo.getSuperficie();
		
		if (vehiculo.esVeloz()== true) {
			costo += 5000;
		}
		if (costo > 100000) {
			costo = 100000.0;
		}
		return costo;

	}

}
