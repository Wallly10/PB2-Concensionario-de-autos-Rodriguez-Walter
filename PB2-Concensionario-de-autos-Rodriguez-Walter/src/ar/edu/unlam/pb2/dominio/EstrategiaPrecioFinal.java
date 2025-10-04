package ar.edu.unlam.pb2.dominio;

public interface EstrategiaPrecioFinal {
	// planteo el contrato de que todos los vehiculos van a calcular el precio final
	// si van a tener descuento o no
	Double calcular(Vehiculo vehiculo);

}
