package ficheros;

import java.util.Scanner;

public class ejercicio_02 {

	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		
	/*Diseñar un algoritmo que calcule el numero de 
	 * mensualidades necesarias para que una persona 
	 * devuelva el prestamos que adquirió en la compra 
	 * de un producto, teniendo en cuenta que cada 
	 * cuanta será el doble de la anterior y además el 
	 * importe íntegro a devolver será incrementado en 
	 * un 5%.
	 * El programa debe informar del importe final y el 
	 * número de cuantías. También deberá mostrar el 
	 * importe de cada cuantía
	 * */

		int prestamo;
		int prestamofinal;
		int cuota;
		int cuotainicial;
//		int parcela;
		int cont;
		
//		parcela = 0;
		cont = 1;
		//suma = 0;
		
		System.out.println("Valor del préstamo: ");
		prestamo = teclado.nextInt();
		System.out.println("Numero de cuotas: ");
		cuota = teclado.nextInt();
		int porcentaje = prestamo/100*5;
		prestamofinal = prestamo + porcentaje;
		cuotainicial = prestamofinal/cuota;
		
		System.out.println("El importe final será: "+prestamofinal);
		System.out.println("El valor de la primera parcela, del prestamo dividido en "+cuota+" "
				+ "veces, será de "+cuotainicial);
		
		while (cont<cuota && cuotainicial<prestamofinal){
			cuotainicial = cuotainicial*2;
			cont ++;
		//	cuotainicial = cuotainicial%cuota;
		//	parcela = parcela + cuotainicial;
			
			System.out.println("El valor de la parcela,"+cont+" será de "+cuotainicial);
			if (cuotainicial>prestamofinal) {
				
				
			}
		}
		
		//System.out.println(+cuotainicial);
		//int parcelacons = 2 * parcelainicial;
		//while ( parcelacons <= )

		
	 

		
	}

}
