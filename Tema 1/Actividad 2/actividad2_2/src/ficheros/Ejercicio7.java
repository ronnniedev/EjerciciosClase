package ficheros;

import java.util.Scanner;

public class Ejercicio7 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/*Ejercicio 7 (if-else)
		 * Escriba un programa que pida el año actual y un año cualquiera y que
		 * escriba cuántos años han pasado desde ese año o cuántos años
		 * faltan para llegar a ese año.
		 */
		
		int actualYear,anyYear,resul;
		
		System.out.println("¿En que año estamos?");
		actualYear = keyboard.nextInt();

		System.out.println("Introduce un año cualquiera");
		anyYear = keyboard.nextInt();
		
		if (actualYear < anyYear) {
			
			resul = anyYear - actualYear;
			System.out.println("Faltan " + resul + " años hasta " + anyYear );
			
		}else {
			
			resul = actualYear - anyYear;
			System.out.println("Desde" + resul + " han pasado " + anyYear );
			
		}
		
		
	}

}
