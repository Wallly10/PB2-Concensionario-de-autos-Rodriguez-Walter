package ar.edu.unlam.pb2.dominio;

public interface Accesorio {
	// Con esta interfaz puedo definir el contrato de como se va a comportar
	// accesorio y a quienens heredan y asi de esta forma se cumple el polimorfismo
	// ya que los accesorios como levantavidrios estereo y demas van a calcular como
	// lo saben hacer
	Double calcularCosto(Vehiculo vehiculo);
}
