package tarea4;

public class Calculos {
	
	private double op1;
	private double op2;
	
	//Constructor
	public Calculos(double op1, double op2) {
		this.op1 = op1;
		this.op2 = op2;
	}
	
	//Getters	
	public double getOp1() {
		return op1;
	}



	public double getOp2() {
		return op2;
	}



	// Metodo de suma
	public double sumar() {

		double resultado = 0;

		resultado = op1 + op2;

		return resultado;
	}

	// Metodo de resta
	public double restar() {
		
		double resultado = 0;

		resultado = op1 - op2;

		return resultado;
	}

	// Metodo de multiplicacion
	public double multiplicar() {
		
		double resultado = 0;

		resultado = op1 * op2;

		return resultado;
	}

	// Metodo de division
	public double dividir() {
		
		double resultado = 0;

		resultado = op1 / op2;

		return resultado;
	}

	// Metodo para calcular la potencia del primer operando elevado al segundo
	public double potencia() {
		
		double resultado = 0;

		resultado = Math.pow(op1, op2);

		return resultado;
	}

	// Metodo para calcular la raiz cuadrada del primer operando
	public double raizCuadrada() {
		
		double resultado = 0;

		resultado = Math.sqrt(op1);

		return resultado;
	}

	// Metodo para calcular la raiz cubica del primer operando
	public double raizCubica() {
		
		double resultado = 0;

		resultado = Math.cbrt(op1);

		return resultado;
	}

}
