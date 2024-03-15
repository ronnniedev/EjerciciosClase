package ejercicio3;

public class Password {

	private int longitud;
	private String contraseña;
	
	/*
	 * constructor por defecto
	 */
	public Password() {
		this.longitud = 8;
		generarPassword();
	}

	/*
	 * constructor con el parametro longitud
	 * @param longitud entero
	 */
	public Password(int longitud) {
		this.longitud = longitud;
		generarPassword();
		
	}
	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", contraseña=" + contraseña + "]";
	}

	/*
	 * Genera una contraseña de longitud especificada
	 */
	public void generarPassword () {
		this.contraseña = "";
		char letra = 'A';
		
		String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		
		for (int i = 0; i < longitud; i++) {
			
			letra = caracteres.charAt(Libreria.generaNumeros(0, caracteres.length()-1));
			
			this.contraseña = this.contraseña + letra;
		}
		
	}
	/*
	 * Comprueba si la contraseña introducida es fuerte.
	 * @param String : contraseña
	 * @return boolean
	 */
	public boolean esFuerte (String contraseña) {
		
		char letra = 'a';
		int contDigitos = 0;
		int contMinusculas= 0;
		int contMayusculas= 0;
		
		for (int i = 0; i < contraseña.length(); i++) {
			
			letra = contraseña.charAt(i);
			
			if (Character.isDigit(letra)) contDigitos++;
			else if (Character.isLowerCase(letra)) contMinusculas++;
			else if (Character.isUpperCase(letra)) contMayusculas++;
			
			
		}
		
		if (contDigitos > 5 && contMinusculas > 1 && contMayusculas > 2) return true;
		return false;
		
	}

	/** Metodo get para longitud de la clase password
	 */
	public int getLongitud() {
		return longitud;
	}
	/** Metodo set para longitud de la clase password
	 * @param longitud
	 */
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	/** Metodo get para contraseña de la clase password
	 */
	public String getContraseña() {
		return contraseña;
	}

	
	
	
		

}