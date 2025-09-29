package ar.edu.unlam.pb2.primerparcial;

public class Estereo implements Accesorio{

	private Integer precioPorInstalacion;
	private Integer precioPorParlante;	
	
	
	
	public Estereo(Integer precioPorInstalacion, Integer precioPorParlante) {
		this.precioPorInstalacion = precioPorInstalacion;
		this.precioPorParlante = precioPorParlante;
	}

	public Integer getPrecioPorInstalacion() {
		return precioPorInstalacion;
	}

	public Integer getPrecioPorParlante() {
		return precioPorParlante;
	}



	@Override
	public Double calcularCosto(Vehiculo vehiculo) {
		Double total = 0.0;
		total = (double) (precioPorParlante*vehiculo.getCantidadDePuertas()) + precioPorInstalacion;
		return total;
	}

}
