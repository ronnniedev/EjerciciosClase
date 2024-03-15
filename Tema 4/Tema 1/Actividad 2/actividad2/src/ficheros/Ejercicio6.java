package ficheros;

import java.util.Scanner;

public class Ejercicio6 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/*Actividad 6
		 * Calcula la raíz cuadrada de un numero que pediremos por teclado,
		 * teniendo la precaución de que el número no sea negativo; en este caso
		 * se debe informar de que la operación no es posible.
		 */
		
		double numero;

		System.out.println("Escribe el numero para hacer la raiz: "); 
		numero = keyboard.nextDouble();
		
		if (numero > 0) { //Si el numero es mayor que 0 podemos hacer el calculo-
			numero = Math.sqrt( numero );
			System.out.print("El resultado de la raiz es: ");
			System.out.printf("%.2f%n", numero);
			
		} else {
			System.err.println("No se puede imprimir el resultado ya que el valor es negativo o nulo");
		}
		
		

	}

}