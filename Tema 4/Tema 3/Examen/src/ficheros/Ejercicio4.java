package ficheros;

import java.util.Scanner;

public class Ejercicio4 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		
		int tablero [][]=Libreria.generarTablero();
		Libreria.mostrarTablero(tablero);
		System.out.println("----------------------------------------");
		Libreria.colocarBarcoFila(tablero, 1, 2, 3);
		Libreria.colocarBarcoFila(tablero, 2, 0, 2);
		Libreria.colocarBarcoFila(tablero, 0, 0, 4);
		Libreria.colocarBarcoFila(tablero, 1, 1, 3); // false por barco
		Libreria.colocarBarcoFila(tablero, 2, 2, 4); // false por coordenadas
		Libreria.colocarBarcoColumna(tablero, 3, 2, 3);
		Libreria.colocarBarcoColumna(tablero, 4, 3, 2);
		Libreria.colocarBarcoColumna(tablero, 1, 2, 2);
		Libreria.colocarBarcoColumna(tablero, 0, 3, 3);
		Libreria.colocarBarcoColumna(tablero, 1, 3, 2);
		
	
		
	}

}