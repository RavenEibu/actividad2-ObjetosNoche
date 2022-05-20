package ar.org.centro8.curso.actividad2.entities;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public abstract class Vehiculo {
	private String marca;
	private String modelo;
	private double precio;

	public Vehiculo(String marca, String modelo, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPrecio() {
		return precio;
	}

	public String getFormatedPrecio(){
		// Defining the format to get ###.###.##0,00
		DecimalFormatSymbols otrosSimbolos = new DecimalFormatSymbols(Locale.ITALY);
		otrosSimbolos.setDecimalSeparator(',');
		otrosSimbolos.setGroupingSeparator('.');
		// Setting the format of the number to be displayed.
		DecimalFormat df = new DecimalFormat("###,###,##0.00", otrosSimbolos);
		return df.format(precio);
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Marca: " + marca + " // Modelo: " + modelo;
	}
}
