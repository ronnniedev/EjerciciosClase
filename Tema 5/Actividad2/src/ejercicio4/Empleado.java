package ejercicio4;

import java.util.Objects;

public class Empleado extends Persona{
	
	protected double sueldo;

	public Empleado(String nombre, int edad, double sueldo) {
		super(nombre, edad);
		this.sueldo = sueldo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		
		return nombre.compareTo(other.nombre)==0;
	}

	@Override
	public String toString() {
		return "Empleado [sueldo=" + sueldo + ", nombre=" + nombre + ", edad=" + edad + "]\n";
	}
	
	
}