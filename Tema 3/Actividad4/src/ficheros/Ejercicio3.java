package ficheros;

import java.util.Scanner;

public class Ejercicio3 {
	static Scanner keyboard=new Scanner(System.in);
	public static void main(String[] args) {
		/* Una cadena de ADN se representa como una secuencia circular de
		 * bases (adenina, timina, citosina y guanina) que es única para cada ser
		 * vivo, por ejemplo: 
		 */
	
		
		char v1 [] = {'a','t','g','c','g','t','a','t'};
		char v2 [] = {'a','t','t','t','g','c','g','t'};
		
		
		
		//System.out.println("Escribe la primera cadena en mayusculas");
		//Libreria.leerCadena(v1);
		
		//System.out.println("\nEscribe la segunda cadena en mayusculas");
		//Libreria.leerCadena(v2);
		
		
		
		Libreria.mostrarVector(v1);
		Libreria.mostrarVector(v2);
		
		Libreria.compararCadenas(v1,v2);

	}

}
