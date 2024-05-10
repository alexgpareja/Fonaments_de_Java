import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int userNum = pedirInt("Dime el numero que quieres comprobar si es primo");
		boolean numPrimo = comprobarNumPrimo(userNum);
		
		while (numPrimo==false) {

			userNum = pedirInt("Dime el numero que quieres comprobar si es primo");
			numPrimo = comprobarNumPrimo(userNum);
		}
		
		imprimirResultado(numPrimo, userNum);

	}
	
	
	static int pedirInt(String texto) {
		
		Scanner input = new Scanner(System.in);
		System.out.println(texto);
		int n1 = input.nextInt();
		return n1;	
	}

	static boolean comprobarNumPrimo(int userNum) {
		
		boolean numPrimo = false;
		
		int i=2;
		for (numPrimo = true ; i<userNum; i++) {
			if (userNum %i == 0) {
				numPrimo = false;}
			
			
		}
		
		return numPrimo;
	}
	
	static void imprimirResultado(boolean numPrimo, int userNum) {
		
		System.out.println("el numero "+ userNum + " es primo.");
		
	}


}
