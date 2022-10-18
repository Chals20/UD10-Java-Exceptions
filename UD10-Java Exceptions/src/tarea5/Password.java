package tarea5;

public class Password {
	
static final int LONGITUD = 8;
	
	//Atributos
	private int longitud;
	private String contrase�a;
	
	//Constructor por defecto
	public Password() {
		this.longitud=LONGITUD;
		this.contrase�a=generarPassword(LONGITUD);
	}
	
	//Getters/setters
	public int getLongitud() {
		return longitud;
	}
	
	//Constructor con longitud por parametro
	public Password(int longitud) {
		this.longitud=longitud;
		this.contrase�a = generarPassword(longitud);
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	
	public String generarPassword(int longitud) {	//metodo de generacion de contrase�a con longitud como parametro
		
		String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";	//cadena de caracteres posibles para construir contrase�a
		String contrase�a ="";
		
		for (int i = 0; i < longitud; i++) {	//bucle de generaci�n de contrase�a
			contrase�a +=(caracteres.charAt((int)(Math.random() * caracteres.length()))); 	//usamos la funcion charAt que devuelve el indice de un caracter de la cadena
		}
		
		
		return contrase�a;
	}
	
	public boolean esFuerte() {
		
		//Variables
		int numeros = 0;
		int mayusculas = 0;
		int minusculas = 0;
		
		for (int i=0;i<longitud;i++) {	//bucle recorriendo la contrase�a
			
			if(contrase�a.charAt(i) == contrase�a.toUpperCase().charAt(i)) {
				mayusculas++;
			}
			
			if(contrase�a.charAt(i) == contrase�a.toLowerCase().charAt(i)) {
				minusculas++;
			}
			
			if(Character.isDigit(contrase�a.charAt(i))) {
				numeros++;
			}
		}
		
		if (numeros > 5 && mayusculas > 2 && minusculas > 1)	//comprobamos que la contrase�a sea fuerte
			return true;
		
		return false;
	}

	@Override
	public String toString() {
		return "Contrase�a: " +contrase�a+ " de longitud: " + longitud;
	}

}
