package tarea3;

import excepcion.Excepcion;

public class mainApp {

	public static void main(String[] args) {

		NumeroRandom numero = new NumeroRandom();
		
		System.out.println("El número aleatorio es: " +numero.getNum());
		
		// Try-Catch en el que comprobamos paridad, lanzamos excepcion con codigo 0 si es par, 1 impar
		try {

			if (numero.getNum() % 2 == 0) {
				throw new Excepcion(0);
			} else {
				throw new Excepcion(1);
			}

		} catch (Excepcion e) {

			System.out.println(e.metodoParidad()); // Llamada metodo de la clase excepcion para respuesta por pantalla

		}
		
	}

}
