package ar.org.centro8.curso.actividad2.entities;

public class Auto extends Vehiculo {
	private int puertas;

	public Auto(String marca, String modelo, int puertas, double precio) {
		super(marca, modelo, precio);
		this.puertas = puertas;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	@Override
	public String toString() {
		return super.toString() + " // Puertas: " + puertas + " // Precio: $" + super.getFormatedPrecio();
	}

}
