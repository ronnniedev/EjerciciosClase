package ficheros;

import java.util.Scanner;

public class EjemploBucle {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		
		int cont = 1 ;
		int numero;
		int suma = 0;
		
		while (cont <= 5) {
			System.out.println("Introduce un numero: ");
			numero = keyboard.nextInt();
			
			suma = numero + suma;
			cont++;
			System.out.println(" La suma actual es: " + suma);
		}
			System.out.println("La suma total es " + suma);
			
	}

}