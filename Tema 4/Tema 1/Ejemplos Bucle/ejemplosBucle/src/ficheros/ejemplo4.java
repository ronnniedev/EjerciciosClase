package ficheros;

import java.util.Scanner;

public class ejemplo4 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		//Leer una secuencia de numeros hasta introducir un 0 y sumarlos a medida que se leen
		
		int suma = 0;
		int numero = 1;
		
		while (numero != 0) {
			
			System.out.println("Introduce un numero: ");
			numero = keyboard.nextInt();
			suma = numero + suma;
			
			System.out.println("La suma actual es: " + suma);
			
		}
		
		System.out.println("La suma de los valores introducidos es: " + suma);
		

	}

}
