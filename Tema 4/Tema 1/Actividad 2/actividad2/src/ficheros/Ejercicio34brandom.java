package ficheros;

public class Ejercicio34brandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int gen,cont,resul;
		
		cont = 0;
		gen = 0;
		
		
		while (cont < 15) {
			
			gen = (int) (Math.random ()*3) + 1; // imprime en decimal y le suma 1 para que no pueda salir 0
			
			System.out.println(gen);
			if (gen == 1) {
				
				resul = 1;
				
				System.out.println("("+ cont + ") " + resul + " " ); //entre 0 y 9 sale un 1
			}else if (gen == 2) {
				
				resul = 2;
				
				System.out.println("("+ cont + ") " + resul + " " ); // entre 10 y 19 sale un 2
			}else {
				
				System.out.println("("+ cont + ") X "); // para el resto x
			}
			
			cont++;
			
		}System.out.println("FIN");
	}

}