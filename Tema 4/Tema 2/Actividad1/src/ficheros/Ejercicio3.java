package ficheros;

import java.util.Scanner;

public class Ejercicio3 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		
		/*
		 * Actividad 3
		 * Implementar una función que reciba como parámetro un número y
		 * retorne un valor lógico indicando si es positivo o negativo. El programa
		 * principal leer el numero por teclado y llama a la función. Muestra un
		 * mensaje en función del valor de retorno.
		 */
		
		System.out.println("Por favor introduzca un valor entero: ");
		int valor = keyboard.nextInt();
		
		boolean positivo = comp(valor);
		
		identificador(positivo);
			
	}
	/**
	 * Nos indica si es un numero positivo o negativo
	 * @param valor : entero
	 * @return boolean
	 */
	public static boolean comp (int valor) {
		
		boolean compa = false;
		
		if (valor >= 0) {
			
			compa = true;
			
		}
		return compa;
		
	}
	/**
	 * Escribe en pantalla si es un numero positivo o negativo
	 * @param valor : boolean
	 */
	public static void identificador (boolean valor) {
		
		if (valor == true) System.out.println("El numero es positivo");
		else System.out.println("El numero es negativo");
		
		
	}

}