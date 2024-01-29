package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
	static Scanner keyboard=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Dime la dimension de memoria: ");
		int dim = keyboard.nextInt();
		
		Tienda tienda = new Tienda("Tienda Cuántica","Pepito Pérez",123456, dim);
		char comando = 'a';
		
		while (comando != 'o') {
			
			System.out.println("Bienvenido al sistema de almacenamiento de " + tienda.getNombre());
			System.out.println("\n Los comandos que puedes usar son los siguientes: ");
			System.out.println("\n-añadir: Añade una nueva marca y computador al almacen ");
			System.out.println("-b : Buscar perfiles");
			System.out.println("-e: elimina un ordenador del almacen");
			System.out.println("-v: visualiza los equipos almacenados");
			comando = keyboard.next().charAt(0);
			
			if (comando == 'a') {
				tienda.añadir();
			
			}else if(comando == 'b') {
				System.out.println("Que marca deseas buscar: ");
				String marca = keyboard.next();
				tienda.buscador(marca);
				
			}else if (comando == 'v') {
				tienda.visualizar();
			}else if (comando == 'e') {
				System.out.println("Que marca deseas eliminar: ");
				String paraEliminar = keyboard.next();
				
				tienda.eliminar(paraEliminar);
				
			}
			
		}
	}

}
