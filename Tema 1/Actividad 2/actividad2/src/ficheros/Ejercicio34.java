package ficheros;

import java.util.Random;

public class Ejercicio34 {
	static Random rand = new Random();
	public static void main(String[] args) {
		/*Actividad 34
		 * Genera combinaciones al azar para una quiniela de futbol.
		 * Recordemos que son 15 resultados : 1, X y 2.
		 */
		
		int gen,cont,resul;
		
		cont = 0;
		gen = 0;
		
		
		while (cont < 15) {
			
			gen =  rand.nextInt(3); //un generador con 30 numeros, empieza por el 0 por lo que ponemos un 29
			
			if (gen == 0) {
				
				resul = 1;
				
				System.out.println("("+ cont + ") " + resul + " " ); //entre 0 y 9 sale un 1
			}else if (gen == 1) {
				
				resul = 2;
				
				System.out.println("("+ cont + ") " + resul + " " ); // entre 10 y 19 sale un 2
			}else {
				
				System.out.println("("+ cont + ") X "); // para el resto x
			}
			
			cont++;
			
		}System.out.println("FIN");

	}

}
