package tarea1;

public class mainApp {

	public static void main(String[] args) {

		AdivinarNumero numeroRandom = new AdivinarNumero();
		
		numeroRandom.adivinarNumero();
		
		System.out.println(numeroRandom.getNumero());

	}

}
