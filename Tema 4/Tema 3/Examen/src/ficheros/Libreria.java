package ficheros;

import java.util.Scanner;

public class Libreria {
	static Scanner keyboard = new Scanner(System.in);
	
	/**
	 * funcion que lee los valores de un vector por teclado
	 * @param v vector enteros
	 */
	public static void leerVector(int v[]) {
		for (int i=0;i<v.length;i++) {
			System.out.println("["+i+"]");
			v[i]=keyboard.nextInt();
		}
	}
	
	/**
	 * genera un vector con parametros aleatorios entre un min y un max
	 * @param tam entero
	 * @param min entero
	 * @param max entero
	 */
	public static int[] generaVector(int tam ,int min, int max) {
		
		int v [] = new int [tam];
		
		for (int i = 0; i < v.length; i++) {
			v[i] = (int) ((Math.random()*max)+min);
		}
		
		return v;
	}
	/**
	 * muestra el contenido del vector
	 * @param v : vector de enteros
	 */
	public static void mostrarVector(int v []) {
		
		for (int i = 0; i < v.length; i++) {
			
			System.out.println("[" + i + "] = " + v[i]);
			
			
		}
	
	}
	/** 
	 * Muestra el contenido de una matriz
	 * @param m : matriz de enteros
	 * 
	 */
	public static void mostrarMatriz (int [][] m) {
		
		System.out.println("------------->MostrarMatriz<-------------\n");
		
		for (int i = 0; i < m.length ; i++) {
			
			for (int j = 0; j < m[0].length ; j++) {
				if (m[i][j] >= 10) {
					System.out.print(m[i][j] + "  ");
				}else System.out.print(" " + m[i][j] + "  ");
				
			}
			System.out.println();
		}
		System.out.println();
		
		
	}
	/**
	 * Genera una matriz de enteros a partir de las dimensiones de la misma , su minimo y maximo.
	 * @param filas entero
	 * @param columnas entero
	 * @param min entero
	 * @param max entero
	 * @return matriz de enteros
	 */
	public static int [][] generarMatrizInt (int filas , int columnas ,int min, int max) {
		
		int m [][] = new int [filas] [columnas];
		
		for (int i = 0; i < m.length ; i++) {
			for (int j = 0; j < m[0].length; j++) {
				m [i][j] = (int) ((Math.random()*(max+1))+min);
			}
			
		}	
		return m;	
	}
	/**
	 * Muestra los puntos de luz dentro de un vector de enteros
	 * @param vector de enteros
	 */
	public static void mostrarPuntosLuz(int v[]) {
		
		System.out.println();
		for (int i = 0; i < v.length; i++) {
			
			if (i%2 == 0 && v[i]%3 == 0 && v[i]%2 != 0) System.out.println("Punto de luz en [" + i + "] =" + v[i]);
			
		}	
	
	}
	/**
	 * Calcula la primeroa derivada de una matriz siendo esta la media de sus filas por un ctes
	 * @param matriz  matriz de enteros
	 * @param ctes  vector de enteros
	 * @return vector de enteros
	 */
	public static int[] calcularPrimeraDerivada(int matriz[][],int ctes[]) {
		int resul [] = new int [matriz.length];
	
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.println(matriz [i][j]+"* "+ ctes[i] + "=");
				resul [i] = matriz[i][j]*ctes[i]; 
				}
			
		}
		int suma = 0;
		for (int i = 0; i < resul.length; i++) {
			suma = suma + resul[i];
		}
		return resul;
		
	}
	/**
	 * Calcula la media de una fila
	 * @param matriz : matriz de enteros
	 * @param i  entero
	 * @return entero
	 */
	public static int media (int matriz[][],int i) {
		int suma = 0;
		
		
		for (int j = 0; j < matriz[0].length; j++) {
			
			suma = suma + matriz[i][j];
			
		}
		
		return suma / matriz[0].length;
		
	}
	/**
	 * Dibujo un cuadro de matriz esteticamente 
	 * @param m : matriz de enteros
	 */
	public static void mostrarTablero(int [][]m) {
		
		System.out.print("|  |");
		
			for (int j = 0; j < m[0].length; j++) {
			
				System.out.print("j" +j + "|");
			}
			System.out.println();
		
			for (int i = 0; i < m.length; i++) {
			
			
				System.out.print("|i" + i + "|");
			
				for (int j = 0; j < m[0].length; j++) {
				if (m[i][j] < 10 && m[i][j] >= 0) System.out.print(""+m[i][j]+ " |");
				else if (m[i][j] < 0) System.out.print(""+m[i][j]+ "|");
				else System.out.print(""+m[i][j]+ "|");
				
				}
				System.out.println();
				
			}
			
		}
	/**
	 * Generar Tablero
	 * @return matriz de enteros
	 */
	public static int[][] generarTablero (){
		
		System.out.println("De que dimension va a ser el tablero:");
		int dim = keyboard.nextInt();
		
		
		int m[][] = new int [dim][dim];
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				m[i][j] = 0;
			}
		}
		
		return m;
		
	}
	/**
	 * Calcula la media de una fila
	 * @param tablero matriz de enteros
	 * @param fila entero
	 * @param columna entero
	 * @param tam entero
	 */
	public static void colocarBarcoFila (int [][] tablero, int fila,int columna,int tam) {
		if (fila+tam > tablero[0].length) {
			System.out.println("No se puede meter el barco dentro de estas coordenadas");
			return;
		}else for (int k = columna; k < tablero[0].length; k++) {
			
			if (tablero[fila][k]== 1) {
				System.out.println("Ya hay un barco en esas coordenadas");
				return;
			}
		}for (int k = columna; k < tablero[0].length; k++) {
			if (tam > 0) {
				tablero[fila][k] = 1;
				tam--;
			}
			
		}
		Libreria.mostrarTablero(tablero);
		return;
		
	}
	/**
	 * Calcula la media de una fila
	 * @param tablero matriz de enteros
	 * @param i entero
	 * @param j entero
	 * @param tam entero
	 */
	public static void colocarBarcoColumna (int [][] tablero, int j,int i,int tam) {
		if (i+tam > tablero[0].length) {
			System.out.println("No se puede meter el barco dentro de estas coordenadas");
			return;
		}else for (int k = i; k < tablero[0].length; k++) {
			System.out.println(tablero[i][k] + " + " + i + " "+ k);
			
			
			if (tablero[k][j]== 1) {
				System.out.println("Ya hay un barco en esas coordenadas");
				return;
			}
		}
		for (int fila = i; fila < tablero.length; fila++) {
			if (tam > 0) {
				tablero[fila][j] = 1;
				tam--;
			}
		
		}
		Libreria.mostrarTablero(tablero);
		return;
		
		
	}
	
	
}