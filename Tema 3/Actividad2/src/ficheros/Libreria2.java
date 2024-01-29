package ficheros;

import java.util.Scanner;

public class Libreria2 {
	static Scanner keyboard = new Scanner(System.in);
	
	public static int [][] crearMatriz() {
		
		System.out.println("Escribe los lados que tiene la matriz cuadrada: ");
		int lados = keyboard.nextInt();
		
		int m [][] = new int [lados][lados];
		
		for (int i = 0; i < m.length ; i++) {
			for (int j = 0; j< m[0].length; j++) {
				m [i][j] = i+j;
			}
			
		}
		
		return m;
	}
	
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
	
	public static void trianguloSuperior (int m[][]) {
		
	int comp = 1;
		
		for (int i = 0; i < m.length ; i++) {
			for (int j = 0; j < m[0].length; j++) {
				if (j >= comp) {
					System.out.print(m[i][j] + " ");
				}else System.out.print("  ");
				
			}
			comp++;
			System.out.println();
			
			
		}
		
		
		
	}
	
	public static void trianguloInferior (int m [][]) {
		
		int comp = 0;
		
		
		for (int i = 0; i < m.length ; i++) {
			for (int j = 0 ; j < m[0].length; j++) {
				
				if (j < comp) {
					System.out.print(m[i][j] + " ");
				}else System.out.print("  ");
				
			}
			
			System.out.println();
			
			comp++;
		}
		
		
		
	}
	
	public static boolean esSimetrica (int m [][]){
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				if (m[i][j]!= m[j][i]) return false;
				
			}
			System.out.println();
		}
		
		return true;
	}

}
