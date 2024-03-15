package ficheros;

import java.util.Scanner;

public class Ejercicio1 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Introduce el numero del DNI: ");
		int dni = keyboard.nextInt();
		
		boolean comprobacion = Libreria.comprobarDni (dni); //lanzamos la funcion de comprobacion para determinar el boolean, que marcara si es correcto o no
		
		while (comprobacion == false) { // si es falso lanzamos mensaje de error y volvemos a lanzar la funcion tras pedir el dni
			
			System.out.println("ERROR numero no valido");
			System.out.println("Por favor introduza un valor de 8 digitos y positivo: ");
			dni = keyboard.nextInt();
			comprobacion = Libreria.comprobarDni (dni);
			
		}
		
		System.out.println("Introduce la letra de tu dni en minuscula : "); //introducimos la letra en minuscula
		char letra =keyboard.next().charAt(0);
		
		boolean dniValido = Libreria.dniValido(letra,dni); //comprobamos si la letra del dni y la que pusimos es la misma
		
		if (dniValido) System.out.println("El dni es valido");
		else System.out.println("El dni no es valido");
	}

}