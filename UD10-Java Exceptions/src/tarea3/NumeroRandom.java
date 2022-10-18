package tarea3;

import java.util.Random;

public class NumeroRandom {
	
	private int num;

	//Constructor + generador numero aleatorio
	public NumeroRandom() {

		Random r = new Random();
		this.num = r.nextInt(999);
		
	}

	//Getter
	public int getNum() {
		return num;
	}
	
	
}
