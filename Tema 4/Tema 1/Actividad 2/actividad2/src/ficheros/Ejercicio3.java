package ficheros;

import java.util.Scanner;

public class Ejercicio3 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		/* Actividad 3
		 * Calcular el área y la circunferencia de un circulo cuyo radio se debe
         * preguntar al usuario
		 * 
		 */
		
		double area;
		double circunferencia;
		
		
		System.out.println("Escribe el radio del circulo:");
		double radio = keyboard.nextDouble();
		
		if (radio >= 0) {
			area = Math.PI * (Math.pow(radio, 2)); //llamamos a la libreria Math.Pi
			circunferencia = Math.PI * 2 * radio;
			
			System.out.print("El area del  circulo es: " );
			System.out.printf("%.2f%n", area); // formateo el texto para que aparezca con dos decimales 
			System.out.print("La circunferencia del circulo es : ");
			System.out.printf("%.2f%n", circunferencia);
			
		}else {
			System.err.println("El valor introducido no es valido ");
		}
		
		
		
		/* Queria que salieran dos decimas para hacerlo un poco mas estetetico, System.out.printf representa el formateo
		 * en el que esta el valor de la media, el 2f representa el numero de decimas que quiero representar.
		 * Fuente: https://stackoverflow.com/questions/65596761/how-to-always-keep-2-decimal-places-in-java
		 */
		
		
	}

}