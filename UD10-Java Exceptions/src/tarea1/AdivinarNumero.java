package tarea1;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class AdivinarNumero {
	
	private int numero;
	
	public AdivinarNumero() {
		
		this.numero=generarNumero();
		
	}
	
	public int getNumero() {
		return numero;
	}

	private int generarNumero() {	//metodo para generar un random entre 1-500

		Random r = new Random();
		int num = r.nextInt(500);
		
		return num;
	}

	public void adivinarNumero() {

		Scanner s = new Scanner(System.in);
		int numIntentos = 0;				//inicializamos el numeor de intentos y el numero introducido por el usuario
		int num = 0;
		
		do {
			System.out.println("Adivina el numero (1-500):");
			
			try {						//bloque try-catch para controlar q el valor introducido sea numerico
					
				num = s.nextInt();
				
				if(num == getNumero()) {	//si acierta el numero, se le notifica al usuario cuantos intentos ha necesitado y sale del bucle
					numIntentos++;
					System.out.println("Felicidades, has encontrado el número correcto!\nLo has conseguido en " +numIntentos+ " intentos!");
					break;
				}else if(num < getNumero()){
					System.out.println("El numero que buscas es mayor a " +num);
					numIntentos++;
				}else {
					System.out.println("El numero que buscas es menor a " +num);
					numIntentos++;
				}
				
			} catch (InputMismatchException e) {	//catch con el tipo de Excepcion
				
				System.out.println("Por favor, introduce un número:");
				s.nextLine();		//volvemos a dar entrada por teclado al usuario
				numIntentos++;
				
			}
			
			
		}while(num != getNumero());
		
		
		s.close();
		
		
	}

	


}
