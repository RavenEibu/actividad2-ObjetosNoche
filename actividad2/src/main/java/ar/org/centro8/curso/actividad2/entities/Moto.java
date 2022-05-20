package ar.org.centro8.curso.actividad2.entities;

public class Moto extends Vehiculo{
	private int cilindrada;

	public Moto(String marca, String modelo, int cilindrada, double precio) {
		super(marca, modelo, precio);
		this.cilindrada = cilindrada;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public String toString() {
		return super.toString() + " // Cilindrada: " + cilindrada + "c // Precio: $" + super.getFormatedPrecio();
	}

}
