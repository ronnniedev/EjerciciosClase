package ficheros;

import java.util.Scanner;

public class Ejercicio2 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/* Ejercicio 2 (operaciones básicas)
		 * Escriba un programa que pida una cantidad de segundos y que escriba
		 * cuántos minutos y segundos son.
		 */
		
		int minutos,segundos,memsegundos;
		
		System.out.println("Convertidor de segundos a minutos");
		
		System.out.print("Escriba una cantidad de segundos: ");
		segundos = keyboard.nextInt();
		
		memsegundos = segundos;
		
		
		minutos = segundos / 60; //al ser entero sale sin decimales
		segundos = segundos%60; // calculamos el resto del programa
		
		System.out.println( memsegundos + " segundos son " + minutos + " minutos y " + segundos + " segundos" );
	}

}
