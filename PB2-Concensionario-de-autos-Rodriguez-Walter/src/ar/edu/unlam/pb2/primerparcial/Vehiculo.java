package ar.edu.unlam.pb2.primerparcial;

import java.util.HashSet;
import java.util.Set;

public abstract class Vehiculo {

	private Integer precioBase;
	private Integer cantidadDePuertas;
	private Double velocidadMaxima;
	private Integer superficie;
	private Set<Accesorio> accesorios = new HashSet<>();

	public Vehiculo(Integer precioBase, Integer cantidadDePuertas, Double velocidadMaxima, Integer superficie) {
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
	
	

	public void setVelocidadMaxima(Double velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public Boolean esDeportivo() {
		Boolean esDeportivo = false;
		if (this.cantidadDePuertas == 2 && this.velocidadMaxima >= 160 ) {
			esDeportivo = true;
		}
		
		return esDeportivo;
	}

	public Boolean esVeloz() {
		Boolean esVeloz = false;
		if (this.velocidadMaxima >= 140) {
			esVeloz = true;
		}
		return esVeloz;
	}

	public Set<Accesorio> getAccesorios() {
		return accesorios;
	}

	public void agregarAccesorio(Accesorio accesorio) {
		accesorios.add(accesorio);
	}

	public Double precioFinaConAccesorios() {
		double total = 0;
		for (Accesorio accesorio : accesorios) {
			total += accesorio.calcularCosto(this); 
		}
		return total;
	}

}
