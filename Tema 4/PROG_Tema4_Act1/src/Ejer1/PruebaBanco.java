package Ejer1;

public class PruebaBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta c1=new Cuenta("pepe",100.0);
		Cuenta c2=new Cuenta("paco",200.0);
		Cuenta c3=new Cuenta("juan",300.0);
		Cuenta c4=new Cuenta("lolo",400.0);
		
		Banco banco=new Banco();
		banco.addCuenta(c1, 0);
		banco.addCuenta(c2, 1);
		banco.addCuenta(c3, 2);
		banco.addCuenta(c4, 3);
		
		banco.mostrarCuentas();
	}

}