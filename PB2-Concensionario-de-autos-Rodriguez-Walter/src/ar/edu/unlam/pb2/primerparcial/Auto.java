package ar.edu.unlam.pb2.primerparcial;

public class Auto extends Vehiculo implements Accesorio{

	private Integer precioBase;
	private Integer cantidadDePuertas;
	private Double velocidadMaxima;
	private Integer superficie;

	public Auto(Integer precioBase, Integer cantidadDePuertas, Double velocidadMaxima, Integer superficie) {
		super(precioBase, cantidadDePuertas, velocidadMaxima, superficie);
		this.precioBase = precioBase;
		this.cantidadDePuertas = cantidadDePuertas;
		this.velocidadMaxima = velocidadMaxima;
		this.superficie = superficie;

	}

	public Integer getPrecioBase() {
		return precioBase;
	}

	public Integer getCantidadDePuertas() {
		return cantidadDePuertas;
	}

	public Double getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public Integer getSuperficie() {
		return superficie;
	}

	@Override
	public Double calcularCosto(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		return null;
	}


}
