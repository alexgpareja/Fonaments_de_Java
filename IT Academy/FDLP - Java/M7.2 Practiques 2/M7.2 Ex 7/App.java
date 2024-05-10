import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Calcula si el año es bisiesto");
		int userYear = pedirInt("Introduce un año");
		evaluaBisiesto(userYear);
		imprimirResultado(evaluaBisiesto(userYear), userYear);
		
		
	}

	
	static int pedirInt(String texto) {
		
		Scanner input = new Scanner(System.in);
		System.out.println(texto);
		int n1 = input.nextInt();
		return n1;	
	}
	
	
	static boolean evaluaBisiesto(int userYear) {
		
		boolean esBisiesto = false;
		
		if ((userYear % 4 == 0 && userYear % 100 != 0) || userYear % 400 == 0) {
			
			esBisiesto = true;
		}
		
		else { esBisiesto = false;
		}
		
		return esBisiesto;
	
	}
	
	static void imprimirResultado(boolean esBisiesto, int userYear) {
		
		if (esBisiesto == true) {
			System.out.println(userYear + " es un año bisiesto");
		
		}
		
		else {System.out.println(userYear + " no es un año bisiesto");}
	}
	
}
