package ficheros;

import java.util.Scanner;

public class Entrega2 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		
		int day,month,year;
		boolean bisiesto;
		
		bisiesto = false;
		
	    System.out.println("Por favor introduzca de manera numerica los siguientes datos, el formato de los meses sera"
	    		+ " en 1-2-3 etc");
		
		System.out.println("¿Que dia es?");
		day = keyboard.nextInt();
		
		day++;
	    
		System.out.println("¿Que mes es?");
	    month = keyboard.nextInt();
	    
	    System.out.println("¿Que año es?");
	    year = keyboard.nextInt();
	    
	    
	    
	    if (((year%4==0) && (year%100!=0)) || (year%400==0)) {
			
	    	bisiesto = true;
	    	
		}
	    
	    
	    if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 ) {
			
	    	if (day == 32) {
				
	    		day = 1;
	    		month++;
	    		
	    		if (month == 13) {
	    			
	    			month = 1;
	    			year++;	
	    			
				}
	    		
	    		
			}
	    	
		}else if (month == 02) {
			
			if (bisiesto && day == 30) {
				
				day = 1;
				month++;
				
			}else if (day == 29 && bisiesto == false ){
				day = 1;
				month++;
				
			}
			
		}if (month == 4 || month == 6 || month == 9 || month == 11) {// 30
			
			if (day == 31) {
				
				day = 1;
				month++;
				
			}
			
			
		}System.out.println(" La siguiente fecha es "+ day + "-" + month + "-"+year);
	    
	    
	    	
	    
	    
	    
	}

}
