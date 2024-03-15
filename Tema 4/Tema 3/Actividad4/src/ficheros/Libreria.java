package ficheros;

import java.util.Scanner;

public class Libreria {
	static Scanner keyboard=new Scanner(System.in);
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
	public static void mostrarVector(char v []) {
		
		for (int i = 0; i < v.length; i++) {
			
			System.out.println("[" + i + "] = " + v[i]);
			
			
		}
	
	}
	
	public static int [] insertaValor (int v[],int valor, int pos) {
		
		if (pos >= v.length || pos < 0) {
			System.out.println("Error el valor se sale de rango");
		}else {
			
		
			for (int i = (v.length-1); i >= 0 ;i--) {
			
					if (i < pos) {
					}else if (i == pos) v[i] = valor;
					else v[i] = v[i-1];
			
			}
		}
		
		return v;
		
	}
	/**
	 * Genera una matrix de enteros a partir de las dimensiones de la misma , su minimo y maximo.
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
	 * Dibujo un cuadro de matriz esteticamente 
	 * @param m : matriz de enteros
	 */
	public static void mostrarMatrizV2(int [][]m) {
		
		System.out.print("|   |");
		
			for (int j = 0; j < m[0].length; j++) {
			
				System.out.print(j + " |");
			}
			System.out.println();
		
			for (int i = 0; i < m.length; i++) {
			
			
				System.out.print("| " + i + " |");
			
				for (int j = 0; j < m[0].length; j++) {
				if (m[i][j] < 10 && m[i][j] >= 0) System.out.print(""+m[i][j]+ " |");
				else if (m[i][j] < 0) System.out.print(""+m[i][j]+ "|");
				else System.out.print(""+m[i][j]+ "|");
				
				}
				System.out.println();
				
			}
			
		}
	/**
	 * Muestra los promedios dentro de una tabla de notas 
	 * @param m : matriz de enteros
	 */
	public static void mostrarPromedios(int [][]m) {
		double min = Integer.MAX_VALUE;
		double max = Integer.MIN_VALUE;
		int posMax = -1;
		int posMin = -1;
		
		for (int i = 0; i <m.length;i++) {
			
			double media = mediaFila(m, i);
			if (media > max) {
				max = media;
				posMax = i;
			}
			if (media < min) {
				min = media;
				posMin = i;
			}
			
		}
		
		System.out.printf("\nEl alumno con mayor media es el " + posMax + " con un promedio de %.2f \n",max);
		System.out.printf("El alumno con menor media es el " + posMin + " con un promedio de %.2f \n",min);
		
		
	}
	/**
	 * Realiza las medias de una fila
	 * @param m : matriz de enteros
	 * @param alumno entero
	 */
	public static double mediaFila (int [][] m ,int alumno) {
		double media = 0;
		double suma = 0;
		
		for (int j = 0; j < m[0].length; j++) {
			
			suma = suma + m[alumno][j];
			
		}
		
		media = suma/m[0].length;
		return media;
	}
	
	/**
	 * Muestra las peores notas de cada asignatura y remarca su alumno
	 * @param m : matriz de enteros
	 */
	public static void mostrarMenor (int [][]m) {
			
		for (int j = 0; j <m[0].length;j++) {
				
			int min = minColumna (m,j);
			int posMin = posMinColumna(m,j);
				
			System.out.println("En la asignatura " + j + " la menor nota es la del alumno " + posMin + " siendo esta "
					+ " de " + min);
		}
		
		
	}
	/**
	 * Muestra el minimo de cada columna
	 * @param m : matriz de enteros
	 * @param j entero
	 */	
	public static int minColumna (int [][]m, int j) {
		int min = Integer.MAX_VALUE;
			
			
		for (int i = 0; i < m.length; i++) {
				
			if (m[i][j] < min) min = m[i][j];	
				
		}
			
		return min;
	}
	/**
	 * Muestra la posicion del minimo de cada columna
	 * @param m : matriz de enteros
	 * @param j entero
	 */	
	public static int posMinColumna (int [][]m, int j) {
		int min = Integer.MAX_VALUE;
		int posMin = 0;
			
			
		for (int i = 0; i < m.length; i++) {
				
			if (m[i][j] < min) {
				min = m[i][j];
				posMin = i;
				
			}		
				
		}
			
		return posMin;
	}
	/**
	 * Calcula la mayor nota de una columna
	 * @param m : matriz de enteros
	 * @param asignatura entero
	 */	
	public static void mayorNota (int [][]m , int asignatura) {
		
		int max = Integer.MIN_VALUE;
		int posMax = 0;
		
		for (int i = 0; i < m.length; i++) {
				
			if (m[i][asignatura] > max) {
				max = m[i][asignatura];
				posMax = i;
			
			}	
			
			
				
		}
		System.out.println("La mayor nota de la asignatura " + asignatura + " es la del alumno " + posMax + " siendo"
				+ " esta un " + max);
			
	}
	/**
	 * Calcula la media de una columna
	 * @param m : matriz de enteros
	 * @param asignatura entero
	 */	
	public static void mediaColumna (int [][] m ,int asignatura) {
		double media = 0;
		double suma = 0;
		
		for (int i = 0; i < m.length; i++) {
			
			suma = suma + m[i][asignatura];
			
		}
		
		media = suma/m.length;
		
		System.out.printf("La media de la asignatura " + asignatura + " es de %.2f",media);
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
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		
	}
	/**
	 * Comprueba si las sumas de todas las filas y diagonales son iguales en una matriz
	 * @param m : matriz de enteros
	 * @return boolean
	 */	
	public static boolean esMagica (int [][]m) {
		
		int constante = sumaFila(m,1);
		
		for (int i = 0; i < m.length-1; i++) {
			
			if (sumaFila(m,i) != sumaFila(m,(i+1)) || sumaFila(m,i) != constante) return false; 
			
		}
		
		for (int j = 0; j < m[0].length-1; j++) {
			
			if (sumaColumna(m,j) != sumaColumna(m,(j+1)) || sumaColumna(m,j) != constante) return false; 
			
		}
		
		if (diagonalPrincipal(m) !=  diagonalSecundaria(m) || diagonalPrincipal(m) != constante) return false;
	
		
		return true;
	}
	/**
	 * Suma una fila introducida previamente
	 * @param m : matriz de enteros
	 * @param i entero
	 * @return suma
	 */	
	public static int sumaFila (int [][]m , int i) {
		
		int suma = 0;
		
		for (int j = 0; j < m[0].length; j++) {
			
			suma = suma + m[i][j];
		}
		return suma;	
	}
	/**
	 * Suma una columna introducida previamente
	 * @param m : matriz de enteros
	 * @param j entero
	 * @return suma
	 */	
	public static int sumaColumna (int [][]m , int j) {
		int suma = 0;
		
		for (int i = 0; i < m.length; i++) {
			
			suma = suma + m[i][j];
			
		}
		
		return suma;
	}
	/**
	 * Suma la diagonal principal de una matriz
	 * @param m : matriz de entero
	 * @return suma
	 */	
	public static int diagonalPrincipal (int m[][]) {
		int suma = 0;
		int j = -1;
		
		for (int i = 0; i < m.length; i++) {
			
			j++;
			suma = suma + m[i][j];
			
		}
		
		
		return suma;
	}
	/**
	 * Suma la diagonal secundaria de una matriz
	 * @param m : matriz de entero
	 * @return suma
	 */	
	public static int diagonalSecundaria (int m[][]) {
		int suma = 0;
		int j = m[0].length;
		
		for (int i = 0; i < m.length; i++) {
			
			j--;
			suma = suma + m[i][j];
			
		}
		
		
		return suma;
	}
	
	public static void secuencia (int v[]) {
		
		int cont = 0;
		int mostrar = 0;
		int mostrarPosicion = -1;
		boolean primero = true;
		int posicion = -1;

		
		for (int i = 0; i < v.length; i++) {
			
			
			if (i < v.length-1) { //protege al archivo para que no desborde
				if (v[i] < v[i+1]) {
					if (primero) {
						primero = false;
						posicion = i;
						cont=+2;
					}else cont++;
				}else{
						cont = 0;
						primero = true;
				}
				}
				
			if (cont > mostrar) {
				
				mostrar = cont;
				mostrarPosicion = posicion;
			}
			
			}
		
		System.out.println("La secuencia mas larga es empieza en la coordenada " + mostrarPosicion + " y tiene una "
				+ "longitud de " + mostrar);
		
			
		}
	
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
	
	public static void leerCadena(char[] v) {
		
		for (int i = 0; i < v.length; i++) {
			System.out.println("Introduce la posicion [" + i + "]:");
			v[i] = keyboard.next().charAt(0);
		}
		
	}
	/**
	 * Comparamos cadenas de caracteres y decimos si son similares :3
	 * @param v1 vector de caracteres
	 * @param v2 vector de caracteres
	 */
	public static void compararCadenas (char[] v1,char[] v2) {
		
		int cont = 0;
		
		for (int i = 0; i < v1.length; i++) {
			
			for (int j = 0; j < v2.length; j++) {
				if(v1[i] == v2[j]) {
					cont = 0;
					int k = j;
					int l = i;
					for (int cont2 = 0; cont2 < 8; cont2++) {
						
						if(v1[l] == v2[k])cont++;
						k++;
						l++;
						if (k == v1.length) k = 0;
						if (l == v2.length) l = 0;
					}	
				}
				if (cont == v1.length) { 
					System.out.println("La cadena es similar");
					return;
				}
			}
			
		}
		
		System.out.println("La cadena no es igual");
		
		
		
	}
	
	public static void insertarBarco(int m[][], int i , int j , int tamBarco) {
		if (j+tamBarco > m[0].length-1) {
			System.out.println("No se puede meter el barco dentro de estas coordenadas");
			return;
		}else for (int k = j; k < m[0].length; k++) {
			
			if (m[i][k]== 1) {
				System.out.println("Ya hay un barco en esas coordenadas");
				return;
			}
		}for (int k = j; k < m[0].length; k++) {
			m[i][k] = 1;
			
		}
		return;
		
	}

}
