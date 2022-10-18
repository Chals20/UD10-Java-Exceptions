package tarea5;

import java.util.Scanner;


public class MainApp {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("Indica cuantas contraseñas quieres crear:");	//pedimos al usuario el nº de contraseñas y su longitud
		int numeroContras = s.nextInt();
		Password[] contraseñas = new Password[numeroContras];				//creamos el array de contraseñas
			
		System.out.println("Indica la longitud de las contraseñas:");
		int longitud = s.nextInt();
		
		boolean[] sonFuertes = new boolean[numeroContras];					//creamos el array de booleanos para comprobar si son fuertes 
		
		for (int i = 0; i < contraseñas.length; i++) {						//bucle recorriendo array contraseñas
			
			contraseñas[i] = new Password(longitud);						//instanciamos contraseña
			
			sonFuertes[i] = contraseñas[i].esFuerte();						//llamada metodo esFuerte
			
			System.out.println(contraseñas[i].getContraseña()+" "+sonFuertes[i]);
			
		}
		
		s.close();
	}

}
