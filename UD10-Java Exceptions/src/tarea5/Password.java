package tarea5;

public class Password {
	
static final int LONGITUD = 8;
	
	//Atributos
	private int longitud;
	private String contraseña;
	
	//Constructor por defecto
	public Password() {
		this.longitud=LONGITUD;
		this.contraseña=generarPassword(LONGITUD);
	}
	
	//Getters/setters
	public int getLongitud() {
		return longitud;
	}
	
	//Constructor con longitud por parametro
	public Password(int longitud) {
		this.longitud=longitud;
		this.contraseña = generarPassword(longitud);
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	
	public String generarPassword(int longitud) {	//metodo de generacion de contraseña con longitud como parametro
		
		String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";	//cadena de caracteres posibles para construir contraseña
		String contraseña ="";
		
		for (int i = 0; i < longitud; i++) {	//bucle de generación de contraseña
			contraseña +=(caracteres.charAt((int)(Math.random() * caracteres.length()))); 	//usamos la funcion charAt que devuelve el indice de un caracter de la cadena
		}
		
		
		return contraseña;
	}
	
	public boolean esFuerte() {
		
		//Variables
		int numeros = 0;
		int mayusculas = 0;
		int minusculas = 0;
		
		for (int i=0;i<longitud;i++) {	//bucle recorriendo la contraseña
			
			if(contraseña.charAt(i) == contraseña.toUpperCase().charAt(i)) {
				mayusculas++;
			}
			
			if(contraseña.charAt(i) == contraseña.toLowerCase().charAt(i)) {
				minusculas++;
			}
			
			if(Character.isDigit(contraseña.charAt(i))) {
				numeros++;
			}
		}
		
		if (numeros > 5 && mayusculas > 2 && minusculas > 1)	//comprobamos que la contraseña sea fuerte
			return true;
		
		return false;
	}

	@Override
	public String toString() {
		return "Contraseña: " +contraseña+ " de longitud: " + longitud;
	}

}
