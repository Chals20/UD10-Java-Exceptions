package excepcion;

public class Excepcion extends Exception{

	// Atributos
	private int codigoExcepcion;
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Constructores
		public Excepcion(int error) {
			super();
			this.codigoExcepcion = error;
		}

		public Excepcion() {
			super();
			System.out.println(getMessage());
		}

		// Impresion mensaje por pantalla
		@Override
		public String getMessage() {
			String mensaje = "Excepcion capturada con mensaje: Esto es un objeto Exception";
			return mensaje;
		}

		public String metodoParidad() {

			String mensaje = "";

			switch (codigoExcepcion) {
			
			case 0:
				
				mensaje = "Es par";
				break;
			case 1:
				mensaje = "Es impar";
				break;

			}
			
			return mensaje;
		}
}
