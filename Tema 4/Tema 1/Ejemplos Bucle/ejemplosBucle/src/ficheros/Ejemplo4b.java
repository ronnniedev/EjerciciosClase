package ficheros;

import java.util.Scanner;

public class Ejemplo4b {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/*Leer una secuencia de numeros hasta introducir un 0 y sumarlos a medida que se leen
		 * parar cuando sea un numero par
		 */
		
		int suma = 0;
		int resto = 1;
		
		boolean  condicion = true;
		
		while (condicion == true) {
			
			System.out.println("Introduce un numero: ");
			int numero = keyboard.nextInt();
			    resto = numero % 2;
			    
			
			if (resto != 0) {
				suma = suma + numero;
				System.out.println("La suma actual es: " + suma);
			}
			else {
				condicion = false;
			}
			
		}
		System.out.println("FIN, la suma total es :" + suma);	
	}

}
