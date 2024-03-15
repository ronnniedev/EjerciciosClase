package ejercicio2;

public class Libreria {
	
	/** genera un numero entre el max y min especificado
	 * @param min : entero
	 * @param max : entero
	 * @return entero
	 */
	public static int generaNumeros (int min,int max) {
	
		max+= 1;
		return (int) (Math.random()*max)+min;
		
	}
	/** genera un numero entre el max y min especificado
	 * @param num : entero
	 */
	public static void lectorDePeso(int num) {
		
		if (num == 0) System.out.println("Te encuentras dentro de tu peso saludable");
		else if (num == 1) System.out.println("Tienes sobrepeso");
		else System.out.println("Estas por debajo de tu peso saludable");
		
	}
	
	public static void comprobarEdad(String nombre ,boolean mayoria) {
		
		
		if (mayoria) System.out.println(nombre + " es mayor de edad"); 
		else System.out.println(nombre + " no es mayor de edad");
		
		
	}

}