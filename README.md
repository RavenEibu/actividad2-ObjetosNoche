# Actividad 2 - Diseño de Clases, Colecciones, API Stream - Obligatoria

Ejercicio Práctico

Imaginemos una concesionaria de autos y motos.

Crear un programa cuyo punto de entrada sea un main en donde, al ejecutarse, se visualiza lo siguiente por consola y se termina la ejecución:

```text
Marca: Peugeot // Modelo: 206 // Puertas: 4 // Precio: $200.000,00

Marca: Honda // Modelo: Titan // Cilindrada: 125c // Precio: $60.000,00

Marca: Peugeot // Modelo: 208 // Puertas: 5 // Precio: $250.000,00

Marca: Yamaha // Modelo: YBR // Cilindrada: 160c // Precio: $80.500,50


=============================


Vehículo más caro: Peugeot 208

Vehículo más barato: Honda Titan

Vehículo que contiene en el modelo la letra ‘Y’: Yamaha YBR $80.500,50


=============================


Vehículos ordenados por precio de mayor a menor:

Peugeot 208

Peugeot 206

Yamaha YBR

Honda Titan


=============================


Vehículos ordenados por orden natural (por marca,modelo,precio):

Marca: Honda // Modelo: Titan // Cilindrada: 125c // Precio: $60.000,00

Marca: Peugeot // Modelo: 206 // Puertas: 4 // Precio: $200.000,00

Marca: Peugeot // Modelo: 208 // Puertas: 5 // Precio: $250.000,00

Marca: Yamaha // Modelo: YBR // Cilindrada: 160c // Precio: $80.500,50
```

La solución debe cumplir con los siguientes requisitos:

- Diseñar una solución orientada a objetos, creando por lo menos una clase abstracta.

- La salida es por consola y exactamente como se requiere.

- Sobrescribir el método toString().

- Usar solamente las clases provistas por Java 8.

- Cargar la lista de autos en un único método. No hay ingreso por pantalla de ningún tipo.

- El algoritmo usado para la impresión no tiene que depender de la cantidad, modelo o tipo de autos

- El entregable deberá ser la URL de un repositorio Git público para que podamos descargar directamente.
