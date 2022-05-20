package ar.org.centro8.curso.actividad2.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import ar.org.centro8.curso.actividad2.entities.Auto;
import ar.org.centro8.curso.actividad2.entities.Moto;
import ar.org.centro8.curso.actividad2.entities.Vehiculo;

public class Main {
	public static void main(String[] args) {
		ejecucionDeProcesos();
	}

	private static void ejecucionDeProcesos() {
		// Espacio agregado para claridad al correrlo en la terminal
		System.out.println("\n");
		colocarVehiculos();
		ordenNatural();
		printSeparador();
		vehiculoMasCaro();
		vehiculoMasBarato();
		vehiculoConLetraY();
		printSeparador();
		vehiculosMasCaroAMasBarato();
		printSeparador();
		vehiculosPorOrdenNatural();
	}

	private static List<Vehiculo> listaDeVehiculos = new ArrayList<>();

	private static void colocarVehiculos() {
		listaDeVehiculos.add(new Auto("Peugeot", "206", 4, 200000));
		listaDeVehiculos.add(new Moto("Honda", "Titan", 125, 60000));
		listaDeVehiculos.add(new Auto("Peugeot", "208", 5, 250000));
		listaDeVehiculos.add(new Moto("Yamaha", "YBR", 160, 80500.50));
	}

	private static void printSeparador() {
		System.out.println("\n=============================\n\n");
	}

	private static void ordenNatural() {
		listaDeVehiculos.stream().forEach(v -> System.out.println(v.toString() + "\n"));
	}

	private static void vehiculoMasCaro() {
		double precioMaximo = listaDeVehiculos
				.stream()
				.max(Comparator
						.comparing(Vehiculo::getPrecio))
				.get()
				.getPrecio();
		listaDeVehiculos
				.stream()
				.filter(v -> v.getPrecio() == precioMaximo)
				.forEach(v -> System.out.println("Vehículo más caro: " + v.getMarca() + " " + v.getModelo() + "\n"));
	}

	private static void vehiculoMasBarato() {
		double min = listaDeVehiculos
				.stream()
				.min(Comparator
						.comparing(Vehiculo::getPrecio))
				.get()
				.getPrecio();
		listaDeVehiculos.stream()
				.filter(v -> v.getPrecio() == min)
				.forEach(v -> System.out.println("Vehículo más barato: " + v.getMarca() + " " + v.getModelo() + "\n"));
	}

	private static void vehiculoConLetraY() {
		listaDeVehiculos
				.stream()
				.filter(v -> v.getModelo().toLowerCase().contains("y"))
				.forEach(v -> System.out.println("Vehículo que contiene en el modelo la letra 'Y': " + v.getMarca()
						+ " " + v.getModelo() + " " + "$" + v.getFormatedPrecio() + "\n"));
	}

	private static void vehiculosMasCaroAMasBarato() {
		System.out.println("Vehículos ordenados por precio de mayor a menor:\n");
		listaDeVehiculos
				.stream()
				.sorted(Comparator
						.comparingDouble(Vehiculo::getPrecio)
						.reversed()
						.thenComparing(Vehiculo::getMarca))
				.forEach(v -> System.out.println(v.getMarca() + " " + v.getModelo() + "\n"));
	}

	private static void vehiculosPorOrdenNatural() {
		System.out.println("Vehículos ordenados por orden natural (por marca,modelo,precio):\n");
		listaDeVehiculos
				.stream()
				.sorted(Comparator
						.comparing(Vehiculo::getMarca)
						.thenComparing(Vehiculo::getModelo)
						.thenComparingDouble(Vehiculo::getPrecio))
				.forEach(v -> System.out.println(v.toString() + "\n"));
	}
}
