package ficheros;

import java.util.Scanner;

public class Cuenta {
	static Scanner keyboard=new Scanner(System.in);
	private String titular;
	private double cantidad;
	
	
	public String getTitular() {
		return titular;
	}
	/** metodo set de titular
	 * @param titular
	 * @return String
	 */
	public void setTitular(String titular) {
		this.titular = titular;
	}
	/** metodo get del atributo cantidad
	 * @return int
	 */
	public double getCantidad() {
		return cantidad;
	}
	
	/** metodo set de atributo cantidad cantidad
	 * @param cantidad
	 * @return real
	 */
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	/** Constructor con dos parametros
	 * @param titular
	 * @param cantidad
	 */
	public Cuenta(String titular, double cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}
	/** 
	 * Metodo toString de la clase Ejercicio1Clase, devuelve la info.
	 */
	public String toString() {
		return "Titular :" + titular + "\ncantidad: " + cantidad;
	}
	
	public void ingresar () {
		
		
		
	}
	
}