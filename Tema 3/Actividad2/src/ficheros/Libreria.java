package ficheros;
import java.util.Scanner;

public class Libreria {
	static Scanner keyboard = new Scanner(System.in);
		
	/**
	 * Lee las dimensiones de la matriz y escribe los valores introducidos por el usuario en la misma.
	 * @param m matriz enteros
	 */
	public static void leerMatriz(int m[][]) {
			
			for(int i = 0; i <m.length;i++) { //recorre la columna
				for(int j = 0; j <m[0].length;j++) { //recorre la fila
					System.out.println("["+i+","+j+"]");
					m[i][j]=keyboard.nextInt();
				}	
		}
			
	}
	/**
	 * Imprime la matriz previamente escrita en forma de cuadrado
	 * @param m matriz de enteros
	 */
	public static void mostrarMatriz (int m[][]) {
			
		for(int i = 0; i <m.length;i++) {
			for(int j = 0; j <m[0].length;j++) {
				System.out.print(m[i][j] + " ");
			}	
			System.out.println();
		}
			
	}
	/**
	 * Suma las filas de la fila y imprime sus resultados
	 * @param m matriz de enteros
	 */
	public static void sumaFilas (int m[][]) {
		
		for(int i = 0; i <m.length;i++) {
			int suma = 0;
			
			for (int j = 0; j<m[0].length;j++) {//para leer columnas
				suma = suma + m[i][j];
			}
			System.out.println("suma fila ["+i+"] "+suma);
		}
		
		
	}
	/**
	 * Suma los valores de la columna y imprime sus resultados
	 * @param m matriz de enteros
	 */
	public static void sumaColumnas (int m[][]) {
		
		for(int j = 0; j <m[0].length;j++) {
			int suma = 0;
			
			for (int i = 0; i<m.length;i++) {
				suma = suma + m[i][j]; //la primera coordenada es decir la j lee en vertical y la segunda en horizontal
			}
			System.out.println("suma columna ["+j+"] "+suma);
		}
		
	}
	/**
	 * intercambia las filas entre las columnas
	 * @param m matriz de enteros
	 * @return matriz de enteros
	 */
	public static int[][] intercambiar (int m [][]) {
		int filas = m.length;
		int columnas = m[0].length;
		int retorno [][] = new int [columnas][filas]; //esta al reves por si la matriz es asimetrica
		
		
		for(int j = 0; j <m[0].length;j++) {
			for (int i = 0; i<m.length;i++) {
				retorno [j][i] = m[i][j]; //la primera coordenada es decir la j lee en vertical y 
				// la segunda en horizontal
			}
		}
		
		return retorno;
	}
	/**
	 * Analiza si la matriz es selectiva
	 * @param m matriz de enteros
	 * @return boolean
	 */
	public static boolean esSelectiva (int m [][]) {
		
		int j = 0;
		
		if (m.length != m[0].length) {
			System.out.println("No es selectiva");
			return false;
			
		}else { for(int i = 0; i <m.length;i++) {
			
			if (m[i][j] != 1) {
				System.out.println("No es selectiva");
				return false;
				
			}
			j++;
		}
		j = m.length-1;
		for (int i = 0; i < m.length; i++) {
			
			if (m[i][j] != 1) {
				System.out.println("No es selectiva");
				return false;
			}
			
			j--;
		}
		
		}
		
		System.out.println("Es selectiva");
		return true;
	}
	/**
	 * Analiza si la matriz tiene un punto silla
	 * @param m matriz de enteros
	 * @return boolean
	 */
	public static boolean tienePuntoSilla (int m [][]) {
		
		for(int i = 0; i <m.length;i++) {
			int max= maxFila(m , i);
			for(int j = 0; j <m[0].length;j++) {
				int min = minColumna (m , j);
				
				if (max == min) {
					
					System.out.println("La matriz tiene un punto silla en la coordenada [" + i + "] [" + j + "] con" + 
					" valor de " + max);
					
					return true;
				}
				
			}	
		}
		return false;
	}
	/**
	 * Analiza el maximo de una fila de la matriz previamente introducida
	 * @param m matriz de enteros
	 * @param i : entero
	 * @return boolean
	 */
	public static int maxFila (int m[][], int i) {
		
		int max = m [i][0];
		for (int j = 0; j < m[0].length; j++) {
			
			if (max < m[i][j]) max = m [i][j];
			
		}
		return max;
	}
	/**
	 * Analiza el minimo de una columnade la matriz previamente introducida
	 * @param m matriz de enteros
	 * @param j : entero
	 * @return boolean
	 */
		public static int minColumna (int m[][], int j) {
		
		int min = m [0][j];
		for (int i = 0; i < m.length; i++) {
			
			if (min > m[i][j]) min = m [i][j];
			
		}
		System.out.println("min columna [" + j + "] = " + min);
		return min;
	}
		
		public static int [][] generarMatrizInt (int filas , int columnas ,int min, int max) {
			
			int m [][] = new int [filas] [columnas];
			
			for (int i = 0; i < m.length ; i++) {
				for (int j = 0; j < m[0].length; j++) {
					m [i][j] = (int) ((Math.random()*max)+min);
					
				}
			}	
			return m;	
		}
		
		public static void reloj (int [][] m) {
			
			boolean ciclo = true;
			int limSup = m[0].length-1;
			int limInf = 0;
			
			for (int i = 0; i < m.length ; i++) {
				if (limSup < limInf) {
					ciclo = false;
				}
				for (int j = 0; j < m[0].length; j++) {
					if (ciclo) {
						if (j >= limInf && j <= limSup) {
							System.out.print(m[i][j]+ " ");
						}else {
							System.out.print("  ");
						}
					}else {
						if (j <= limInf && j >= limSup) {
							System.out.print(m[i][j]+ " ");
						
					}else {
						System.out.print("  ");
					}
					
				}
				
			}
				System.out.println();
				limSup--;
				limInf++;
		}
	}
		
		public static void mostrarRelojArena(int [][] m) {
			
			//triangulo superior
			for (int i = 0; i < m.length/2; i++) {
				for (int j = 0; j < i; j++) {
					System.out.print("  ");
				}
				for (int j = i; j < m[0].length-i; j++) {
					System.out.print(m[i][j] + " ");
				}
				System.out.println();
			}
			//triangulo inferior 
			for (int i = (m.length/2)+1; i < m.length; i++) {
				// espacios 
				for (int j = 0; j < (m.length-i-1); j++) {
					System.out.print(m[i][j] + " ");
				}
				System.out.println();
			}
			
		}
		
		
}
