package ficheros;

import java.util.Scanner;

public class Ejercicio1 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		
		// int v [] = {4,6,9,3,19,10,15,2,14,12};
		
		int v[] = Libreria.generaVector(100, 0, 30); //<--- Si quieres probar rapido esto te genera un vector de 100
		//de tamaño entre 0 y 30 
		Libreria.mostrarVector(v);
		Libreria.mostrarPuntosLuz(v);
		

	}

}
