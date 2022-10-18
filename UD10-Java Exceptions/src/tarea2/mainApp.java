package tarea2;

import excepcion.Excepcion;

public class mainApp {

	public static void main(String[] args) {

		try {
			System.out.println("Mensaje mostrado por pantalla");
			throw new Excepcion();
		}catch (Excepcion e) {
		}
		System.out.println("Programa terminado");

	}

}
