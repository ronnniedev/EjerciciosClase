package ficheros;

import java.util.Scanner;

public class Ejercicio2 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		
		boolean valido = false;
		int year = 0;
		int month = 0;
		int day = 0;
		
		
		while (valido == false) {
			
			System.out.println("Por favor introduzca un año a partir de 1978, este incluido: ");
			year= keyboard.nextInt();
			boolean bisiesto = LibreriaEje2.anioBisiesto(year);
			
			if (bisiesto) System.out.println("Ten en cuenta que "+ year + " es bisiesto");
			else System.out.println("Ten en cuenta que " + year + " no es bisiesto");
				
			System.out.println("Por favor introduzca el mes");
			month = keyboard.nextInt();
			
			System.out.println("Introduzca el dia: ");
			day = keyboard.nextInt();
			
			valido = LibreriaEje2.validarFecha (year,month,day); // metemos los datos para comprobar si la fecha 
			// es correcta
			
			if (valido == false) System.out.println("ERROR\n fecha introducida no valida \n Por favor introduzca "
					+ "una nueva fecha \n -------------------------------");
			
			
		} int days = LibreriaEje2.calcularDias(year,month,day);	
		int weekDay = days%7;
		
		if (weekDay == 1) System.out.println("El " +  day + " del mes " + month + " de " + year + " es Domingo");
		else if (weekDay == 2) System.out.println("El " +  day + " del mes " + month + " de " + year + " es Lunes");
		else if (weekDay == 3) System.out.println("El " +  day + " del mes " + month + " de " + year + " es Martes");
		else if (weekDay == 4) System.out.println("El " +  day + " del mes " + month + " de " + year + " es Miercoles");
		else if (weekDay == 5) System.out.println("El " +  day + " del mes " + month + " de " + year + " es Jueves");
		else if (weekDay == 6) System.out.println("El " +  day + " del mes " + month + " de " + year + " es Viernes");
		else if (weekDay == 0) System.out.println("El " +  day + " del mes " + month + " de " + year + " es Sabado");
	}		

}
