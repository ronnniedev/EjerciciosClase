package ficheros;

import java.util.Scanner;

public class Ejercicio2 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/* Actividad 2
		 * Diseña un programa modular que calcule el área y la circunferencia de
		 * un circulo cuyo radio se debe preguntar al usuario.
		 */
		System.out.println("¿Cual es el radio del circulo?");
		double radio = keyboard.nextDouble();
		
		calcularPerimetro(radio);
		calcularArea(radio);
		
	}
	/**
	 * Calcula el area del circulo
	 * @param area : entero
	 */
	public static void calcularArea (double radio) {
		
		double area = Math.PI * Math.pow(radio, 2);
		System.out.printf("El area del circulo es %.2f \n",area);
		
		
	}
	/**
	 * calcula el perimetro
	 * @param perimetro : entero
	 */
	public static void calcularPerimetro (double radio) {
		
		double perimetro = 2 * Math.PI * radio;
		System.out.printf("El perimetro de un circulo es  %.2f \n",perimetro);
		
	}
}
