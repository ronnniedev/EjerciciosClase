package ficheros;


public class Ejercicio3 {

	public static void main(String[] args) {
		/* Actividad 3
		 * Leer las dimensiones de una matriz de enteros por teclado, y rellenarla
		 * con valores aleatorios entre 1 y 10
		 * Nota: para generar valores aleatorios entre 1 y 10 Math.random()*10+1
		 */
		
		
		int v [] = new int [10];
		
		for (int i = 0; i < v.length; i++) {
			v[i] =(int) (Math.random()*10+1); 
			
		}
		
		Libreria.MostrarValores(v);
		
		
	}

}
