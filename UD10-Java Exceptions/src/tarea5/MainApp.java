package tarea5;

import java.util.Scanner;


public class MainApp {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("Indica cuantas contrase�as quieres crear:");	//pedimos al usuario el n� de contrase�as y su longitud
		int numeroContras = s.nextInt();
		Password[] contrase�as = new Password[numeroContras];				//creamos el array de contrase�as
			
		System.out.println("Indica la longitud de las contrase�as:");
		int longitud = s.nextInt();
		
		boolean[] sonFuertes = new boolean[numeroContras];					//creamos el array de booleanos para comprobar si son fuertes 
		
		for (int i = 0; i < contrase�as.length; i++) {						//bucle recorriendo array contrase�as
			
			contrase�as[i] = new Password(longitud);						//instanciamos contrase�a
			
			sonFuertes[i] = contrase�as[i].esFuerte();						//llamada metodo esFuerte
			
			System.out.println(contrase�as[i].getContrase�a()+" "+sonFuertes[i]);
			
		}
		
		s.close();
	}

}
