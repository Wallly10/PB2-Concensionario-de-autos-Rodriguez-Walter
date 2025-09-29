package ar.edu.unlam.pb2.primerparcial;

public class LevantaVidrios implements Accesorio {

	private Integer precioPorPuerta;

	public LevantaVidrios(Integer precioPorPuerta) {
		this.precioPorPuerta = precioPorPuerta;
	}
	
	
	public Integer getPrecioPorPuerta() {
		return precioPorPuerta;
	}


	@Override
	public Double calcularCosto(Vehiculo vehiculo) {
		Double total = 0.0;
		total = (double) (vehiculo.getCantidadDePuertas() * precioPorPuerta);
		return total;
	}

}
