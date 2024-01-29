package ejercicio4;

import java.util.Scanner;

public class Tienda {
	static Scanner keyboard=new Scanner(System.in);
	private String nombre;
	private String propietario;
	private int identificadorTributario;
	private int dim;
	private Computadoras v[];
	
	
	public Tienda(String nombre, String propietario, int identificadorTributario, int dim) {
		this.nombre = nombre;
		this.propietario = propietario;
		this.identificadorTributario = identificadorTributario;
		this.v = new Computadoras[dim];
	}
	/**
	 * Añade entradas
	 * @param marca
	 */
	public void añadir () {
		
		System.out.println("Selecciona un perfil que añadir [1-" + 5 + "]");
		int num = keyboard.nextInt();
		
		while (num <= 0 || num > 5) {
			
			System.out.println("Perfil fuera de rango, introduzca de nuevo:");
			num = keyboard.nextInt();
			
		}
		
		System.out.println("Introduzca la marca del equipo:");
		String marca = keyboard.next();
		
		System.out.println("Introduzca la memoria del equipo:");
		int memoria = keyboard.nextInt();
		
		System.out.println("Introduzca el sistema operativo del equipo:");
		String iso = keyboard.next();
		
		System.out.println("Introduzca el precio del equipo: ");
		int precio = keyboard.nextInt();
	
		Computadoras carrito = new Computadoras(marca,memoria,iso,precio);
		
		this.v[num-1] = carrito;
		
		System.out.print(" Perfil " + num + " "+ v[num-1].toString());		
	}
	
	public void visualizar () {
		
		for (int i = 0; i < v.length; i++) {
			
			if (v[i] == null) {
				System.out.println("Perfil " + (i+1) + " no existe");
			}else {
				System.out.println("Perfil (" + (i+1) +") " + v[i].toString());
			}
			
		}
	}
	/**
	 * Elimina una entrada tras meter una marca en el sistema
	 * @param marca
	 */
	public void eliminar (String marca) {
		
		if (buscadorChivato(marca) != -1) {
			System.out.println("Procediendo a eliminacion......");
			System.out.println("Procediendo a eliminacion.....");
			System.out.println("Procediendo a eliminacion....");
			System.out.println("Procediendo a eliminacion...");
			System.out.println("Procediendo a eliminacion..");
			System.out.println("Procediendo a eliminacion.");
			System.out.println("Procediendo a eliminacion");
			System.out.println("!POP!");
			
			v[buscadorChivato(marca)] = null;
		}else {
			System.out.println("No se han encontrado objetivos a eliminar");
		}
		
	}
	/**
	 * Busca una entrada a traves de su marca
	 * @param marca
	 */
	public void buscador(String marca) {
		String comparador;
		
		
		for (int i = 0; i < v.length; i++) {
			
			if (v[i] != null && v[i].getMarca().length() == marca.length()) {
				comparador = v[i].getMarca();
				int cont = comparador.length();
				
				for (int j = 0; j < comparador.length(); j++) {
					
					if (comparador.charAt(j) == marca.charAt(j)) {
						cont--;
					}
					if (cont == 0) {
						System.out.println("Perfil encontrado en " + (i+1) + "Informacion:");
						System.out.println(v[i].toString());
						return;
					}
				}
				
					
			} 
			
			
		}
		
		
		System.out.println("No se han encontrado resultados");
		
		
	}
	/**
	 * Busca una entrada a traves de su marca y devuelve el valor de i
	 * @param marca
	 * @return i : entero
	 */
	public int buscadorChivato(String marca) {
		String comparador;
		
		
		for (int i = 0; i < v.length; i++) {
			
			if (v[i] != null && v[i].getMarca().length() == marca.length()) {
				comparador = v[i].getMarca();
				int cont = comparador.length();
				
				for (int j = 0; j < comparador.length(); j++) {
					
					if (comparador.charAt(j) == marca.charAt(j)) {
						cont--;
					}
					if (cont == 0) {
						return i;
					}
				}
				
					
			} 
			
			
		}
		
		return -1;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public int getIdentificadorTributario() {
		return identificadorTributario;
	}

	public void setIdentificadorTributario(int identificadorTributario) {
		this.identificadorTributario = identificadorTributario;
	}

	public int getDim() {
		return dim;
	}

	public void setDim(int dim) {
		this.dim = dim;
	}
	
	
	
	
}
