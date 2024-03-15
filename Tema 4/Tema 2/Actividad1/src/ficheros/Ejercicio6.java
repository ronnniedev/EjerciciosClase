package ficheros;

import java.util.Scanner;

public class Ejercicio6 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/* Actividad 6
		 * Determinar, con un programa modular, si un número real pedido por
		 * teclado tiene decimales o no.
		 */
		
		System.out.println("Introduzca un numero con o sin decimales : ");
		double num = keyboard.nextDouble();
		
		comprobador (num);

	}
	/**
	 * Determina si el numero introducido tiene numeros decimales o no y los imprime en pantalla
	 * @param num : real
	 */
	public static void comprobador (double num) {
		
		if (num%1 == 0) System.out.println("El numero no tiene decimales ");
		else System.out.println("El numero tiene decimales");
	}

}