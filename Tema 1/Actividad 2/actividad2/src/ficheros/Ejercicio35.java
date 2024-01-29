package ficheros;

import java.util.Random;

public class Ejercicio35 {
	static Random rand = new Random();
	public static void main(String[] args) {
		/*Actividad 35
		 * Reutiliza el ejercicio anterior: Genera una apuesta al azar y unos
		 * resultados también al azar; después indica cuantos aciertos se han
		 * producido.
		 */
		int gen,genDos,cont,resul,aciertos;
		
		cont = 1;
		gen = 0;
		aciertos = 0;
		
		
		while (cont < 16) {
			
			gen =  rand.nextInt(3); //un generador con 30 numeros, empieza por el 0 por lo que ponemos un 29
			genDos = rand.nextInt(3);
			
			if (gen == 0) {
				
				resul = 1;
				
				System.out.print(cont + " (P) "+ resul + " "); //entre 0 y 9 sale un 1
			}else if (gen == 1) {
				
				resul = 2;
				
				System.out.print(cont + " (P) " + resul + " "); // entre 10 y 19 sale un 2
			}else {
				
				System.out.print( cont +" (P) X "); // para el resto x
			}
			if (genDos == 0) {
				
				resul = 1;
				
				System.out.println(" "  + resul + " "); //entre 0 y 9 sale un 1
			}else if (genDos == 1) {
				
				resul = 2;
				
				System.out.println(" " + resul + " "); // entre 10 y 19 sale un 2
			}else {
				
				System.out.println(" X "); // para el resto x
			}
			if (gen == genDos) {
				
				aciertos++; // sumamos a aciertos
				
			}
			
			cont++;
			
		}System.out.println("FIN con " + aciertos + " aciertos");

	}

}