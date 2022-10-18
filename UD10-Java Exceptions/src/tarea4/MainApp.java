package tarea4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		try {
			// Recogida de datos por parte del usuario
			System.out.println("Indique el primer valor:");
			double op1 = s.nextDouble();
			System.out.println("Indique el segundo valor:");
			double op2 = s.nextDouble();
			
			// Creación de la clase Operaciones
			Calculos calculo = new Calculos(op1, op2);
			
			// Salida de datos con los métodos
			System.out.println("Suma: "+calculo.sumar());
			System.out.println("Resta: "+calculo.restar());
			System.out.println("Multiplicacion: "+calculo.multiplicar());
			System.out.println("Division: "+calculo.dividir());
			System.out.println("Potencia: "+calculo.potencia());
			System.out.println("Raiz Cuadrada de " +calculo.getOp1()+ " : "+calculo.raizCuadrada());
			System.out.println("Raiz Cúbica de " +calculo.getOp1()+ " : "+calculo.raizCubica());
			
			// Control de Excepciones
		}catch(InputMismatchException e) {
			System.out.println("InputMismatchException");
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException");
		}
		
		s.close();
	}

}
