package ficheros;

import java.util.Scanner;

public class Ejercicio1 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/* Actividad 1
		 * Realiza un programa modular que calcule la superficie y el perímetro
		 * de un cuadrado cuyo lado pediremos por teclado.
		 */
		System.out.println("Lado : ");
		int lado = keyboard.nextInt();
		
		calcularArea(lado);
		cpc(lado);
		System.out.println("Perimetro : "+ cpc(lado));
		
	}
	/**
	 * Calcula el area del cuadrado
	 * @param lado : entero
	 */
	public static void calcularArea(int lado) {
		int area = lado*lado;
		System.out.println("El area es " + area );
	}
	/**
	 * calcula el perimetro
	 * @param lado : entero
	 * @return entero
	 */
	public static int cpc (int lado) {
		int perimetro = lado*4;
		return perimetro;
		
	}
}